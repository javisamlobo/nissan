package com.iesam.NissanSL.domain.usecase;

import com.iesam.NissanSL.data.PartDataStore;
import com.iesam.NissanSL.domain.models.Part;

public class UpdatePartUseCase {
    private PartDataStore partDataStore;
    public UpdatePartUseCase(PartDataStore partDataStore){
        this.partDataStore = partDataStore;
    }
    public void execute(Part part){
        partDataStore.updateParts(part);
    }
}
