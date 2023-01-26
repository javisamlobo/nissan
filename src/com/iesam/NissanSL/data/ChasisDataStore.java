package com.iesam.NissanSL.data;

import com.iesam.NissanSL.domain.models.Chassis;

import java.util.List;

public interface ChasisDataStore {
    void saveChasis(Chassis chassis);
    List<Chassis> getAllChassis();
}
