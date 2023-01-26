package com.iesam.NissanSL.domain.usecase;

import com.iesam.NissanSL.data.PartDataStore;
import com.iesam.NissanSL.domain.models.Part;

public class GetPartUseCase {
    private PartDataStore partDataStore;
    public GetPartUseCase(PartDataStore partDataStore){
        this.partDataStore = partDataStore;
    }
    public void execute(Part part){
        partDataStore.getParts(part);
    }
}
