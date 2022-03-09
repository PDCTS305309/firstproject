package com.learn.data;

import java.util.Objects;

public class Bike {
    private String name;
    private String model;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bike bike = (Bike) o;
        return Objects.equals(name, bike.name) && Objects.equals(model, bike.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, model);
    }
}
