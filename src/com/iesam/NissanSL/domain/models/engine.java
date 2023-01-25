package com.iesam.NissanSL.domain.models;

public class engine implements part {

    private String cod;

    private String model;

    private String cubicCapacity;

    private String hp;

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

    public String getCubicCapacity() {
        return cubicCapacity;
    }

    public void setCubicCapacity(String cubicCapacity) {
        this.cubicCapacity = cubicCapacity;
    }

    public String getHp() {
        return hp;
    }

    public void setHp(String hp) {
        this.hp = hp;
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
