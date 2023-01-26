package com.iesam.NissanSL.domain.usecase;

import com.iesam.NissanSL.data.ChasisDataStore;
import com.iesam.NissanSL.domain.models.Chassis;

public class AddChassisUseCase {
    private ChasisDataStore chasisDataStore;
    public AddChassisUseCase(ChasisDataStore chasisDataStore){
        this.chasisDataStore = chasisDataStore;
    }
    public void execute(Chassis chassis){
        chasisDataStore.saveChasis(chassis);
    }
}
