package com.example.properties.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class PropertiesService {
    private final PropertiesRepository propertiesRepository;

    @Autowired
    public PropertiesService(PropertiesRepository propertiesRepository){
        this.propertiesRepository = propertiesRepository;
    }

    public List<Properties> getProperties(){
        return propertiesRepository.findAll();
    }

    public void addProperty(Properties properties){
        Optional<Properties> propertiesOptional =
                propertiesRepository.findPropertyByName((properties.getPropertyName()));

        if(propertiesOptional.isPresent()){
            throw new IllegalStateException("Property is already listed");
        }
        propertiesRepository.save(properties);
    }

    public void deleteProperty(Long propertyId){
        boolean isExisting = propertiesRepository.existsById(propertyId);
        if(!isExisting){
            throw new IllegalStateException(
                    "Property with id " + propertyId + " does not exist."
            );
        }
        propertiesRepository.deleteById(propertyId);
    }
}
