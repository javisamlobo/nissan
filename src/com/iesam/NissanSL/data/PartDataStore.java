package com.iesam.NissanSL.data;

import com.iesam.NissanSL.domain.models.Part;

public interface PartDataStore {
    void saveParts(Part part);
    void getParts(Part part);
    void updateParts(Part part);

}
