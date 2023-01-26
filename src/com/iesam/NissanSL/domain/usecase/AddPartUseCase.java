package com.iesam.NissanSL.domain.usecase;
import com.iesam.NissanSL.data.*;
import com.iesam.NissanSL.domain.models.Part;

public class AddPartUseCase {
    private PartDataStore partDataStore;
    public AddPartUseCase(PartDataStore partDataStore){
        this.partDataStore = partDataStore;
    }
    public void execute(Part part){
        partDataStore.saveParts(part);
    }
}
