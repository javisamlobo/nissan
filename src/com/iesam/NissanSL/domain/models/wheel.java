package com.iesam.NissanSL.domain.models;

public class wheel implements Part {

    private String cod;

    private String brand;

    private String model;

    private String diameter;

    private Integer units;

    @Override
    public String getCod() {
        return cod;
    }

    @Override
    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public void setModel(String model) {
        this.model = model;
    }

    public String getDiameter() {
        return diameter;
    }

    public void setDiameter(String diameter) {
        this.diameter = diameter;
    }

    @Override
    public Integer getUnits() {
        return units;
    }

    @Override
    public void setUnits(Integer units) {
        this.units = units;
    }
}
