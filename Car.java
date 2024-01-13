package com.bitsandbinaries;

public class Car implements Vehicle{

    @Override
    public String vehicleType() {
        return "Car";
    }

    @Override
    public Integer numberOfWheels() {
        return 4;
    }
}
