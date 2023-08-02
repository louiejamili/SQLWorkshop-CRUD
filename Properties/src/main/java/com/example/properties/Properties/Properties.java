package com.example.properties.Properties;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table
public class Properties {

    @Id
    @SequenceGenerator(
            name = "properties_sequence",
            sequenceName = "properties_sequence",
            allocationSize = 1
    )

    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "properties_sequence"
    )

    private Long id;
    private String propertyName;
    private String propertyType;
    private String location;
    private LocalDate dateAcquired;
    private boolean isOccupied;

    public Properties() {
    }

    public Properties(Long id, String propertyName, String propertyType, String location,
                      LocalDate dateAcquired, boolean isOccupied) {
        this.id = id;
        this.propertyName = propertyName;
        this.propertyType = propertyType;
        this.location = location;
        this.dateAcquired = dateAcquired;
        this.isOccupied = isOccupied;
    }

    public Properties(String propertyName,
                      String propertyType,
                      String location,
                      LocalDate dateAcquired,
                      boolean isOccupied) {
        this.propertyName = propertyName;
        this.propertyType = propertyType;
        this.location = location;
        this.dateAcquired = dateAcquired;
        this.isOccupied = isOccupied;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    public String getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public LocalDate getDateAcquired() {
        return dateAcquired;
    }

    public void setDateAcquired(LocalDate dateAcquired) {
        this.dateAcquired = dateAcquired;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    @Override
    public String toString() {
        return "Properties{" +
                "id=" + id +
                ", propertyName='" + propertyName + '\'' +
                ", propertyType='" + propertyType + '\'' +
                ", location='" + location + '\'' +
                ", dateAcquired=" + dateAcquired +
                ", isOccupied=" + isOccupied +
                '}';
    }
}
