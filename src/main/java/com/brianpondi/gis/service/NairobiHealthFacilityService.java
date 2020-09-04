package com.brianpondi.gis.service;

import com.brianpondi.gis.entity.NairobiHealthFacility;
import javassist.NotFoundException;

import java.util.List;


public interface NairobiHealthFacilityService {
    List<NairobiHealthFacility> findAll();
    NairobiHealthFacility findById(int id) throws NotFoundException;
    void deleteById(int id);
//    NairobiHealthFacility findWithinSubCounty(String name);
}
