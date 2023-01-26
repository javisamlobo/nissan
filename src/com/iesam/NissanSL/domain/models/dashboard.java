package com.iesam.NissanSL.domain.models;

public class dashboard implements Part {

    private String cod;

    private String model;

    private Integer units;

    @Override
    public String getCod() {
        return cod;
    }

    @Override
    public void setCod(String cod) {
        this.cod = cod;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public void setModel(String model) {
        this.model = model;
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
