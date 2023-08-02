package com.example.properties.Properties;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PropertiesRepository
            extends JpaRepository<Properties, Long> {

    @Query("SELECT p FROM Properties p WHERE p.propertyName =?1")
        Optional<Properties> findPropertyByName(String propertyName);
    }

