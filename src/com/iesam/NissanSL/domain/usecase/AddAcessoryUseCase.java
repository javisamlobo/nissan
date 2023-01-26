package com.iesam.NissanSL.domain.usecase;

public class AddAcessoryUseCase {
    private AcessoryDataStore acessoryDataStore;
    public AddAcessoryUseCase(AddAcessoryDataStore acessoryDataStore){
        this acessoryDataStore = acessoryDataStore;
    }
    public void execute()
}
