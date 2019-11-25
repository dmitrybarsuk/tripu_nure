package models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Car {
    private String modelName;
    private double price;
    private double mileage;
    private double engineVolume;
}
