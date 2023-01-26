package com.iesam.NissanSL.data;
import com.iesam.NissanSL.domain.models.Part;

import java.util.TreeMap;

public class MemPartDataStore implements PartDataStore{

    private TreeMap<String, Part> dataStore = new TreeMap<>();

    @Override
    public void saveParts(Part part) {
        dataStore.put(part.getCod(), part);
    }

    @Override
    public void getParts(Part part) {
        dataStore.get(part.getCod());
    }

    @Override
    public void updateParts(Part part) {
        dataStore.replace(part.getCod(), part);
    }
}
