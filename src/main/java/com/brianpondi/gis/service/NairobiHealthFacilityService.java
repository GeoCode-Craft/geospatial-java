package com.brianpondi.gis.service;

import com.brianpondi.gis.entity.NairobiHealthFacility;
import javassist.NotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface NairobiHealthFacilityService {
    List<NairobiHealthFacility> findAll();
    NairobiHealthFacility findById(int id) throws NotFoundException;
    void deleteById(int id);
}
