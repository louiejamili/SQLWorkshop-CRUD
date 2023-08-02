package com.example.properties.Properties;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/properties")
public class PropertiesController {
    private final PropertiesService propertiesService;

    @Autowired

    public PropertiesController(PropertiesService propertiesService){
        this.propertiesService = propertiesService;
    }

    @GetMapping
    public List<Properties> getProperties(){
        return propertiesService.getProperties();
    }

    @PostMapping
    public void addProperty(@RequestBody Properties properties){
        propertiesService.addProperty(properties);
    }

    @DeleteMapping(path = "{propertyId}")
    public void deleteProperty(@PathVariable("propertyId") Long propertyId){
        propertiesService.deleteProperty(propertyId);
    }
}
