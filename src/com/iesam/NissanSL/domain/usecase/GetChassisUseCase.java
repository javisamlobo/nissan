package com.iesam.NissanSL.domain.usecase;

import com.iesam.NissanSL.data.ChasisDataStore;
import com.iesam.NissanSL.domain.models.Chassis;

import java.util.List;

public class GetChassisUseCase {
    private ChasisDataStore chasisDataStore;
    public GetChassisUseCase(ChasisDataStore chasisDataStore){
        this.chasisDataStore = chasisDataStore;
    }
    public List<Chassis> execute(){
        return chasisDataStore.getAllChassis();
    }
}
