package com.iesam.NissanSL.data;

import com.iesam.NissanSL.domain.models.Chassis;

import java.util.List;
import java.util.TreeMap;

public class MemChassisDataStore implements ChasisDataStore{
    private TreeMap<String, Chassis> dataStore = new TreeMap<>();

    @Override
    public void saveChasis(Chassis chassis) {
        dataStore.put(chassis.getRackCode(), chassis);
    }

    @Override
    public List<Chassis> getAllChassis() {
        return dataStore.values().stream().toList();
    }
}
