package com.iesam.NissanSL.domain.models;

import java.util.ArrayList;
import java.util.List;

public class chassis {

    private String rackCode;
    private String model;
    private String brand;
    private List<Part> Parts = new ArrayList<>();

    public String getRackCode() {
        return rackCode;
    }

    public void setRackCode(String rackCode) {
        this.rackCode = rackCode;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public List<Part> getParts() {
        return Parts;
    }

    public void addPart (Part part) {
        this.Parts.add(part);
    }
}
