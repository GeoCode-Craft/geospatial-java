package com.brianpondi.gis.service.Impl;

import com.brianpondi.gis.entity.NairobiHealthFacility;
import com.brianpondi.gis.repository.NairobiHealthFacilityRepository;
import com.brianpondi.gis.service.NairobiHealthFacilityService;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NairobiHealthFacilityServiceImp implements NairobiHealthFacilityService {

    @Autowired
    private NairobiHealthFacilityRepository nairobiHealthFacilityRepository;

    public List<NairobiHealthFacility> findAll() {
        return  nairobiHealthFacilityRepository.findAll();
    }

    public NairobiHealthFacility findById(int id) throws NotFoundException {
        return nairobiHealthFacilityRepository.findById(id).orElseThrow(
                () -> new NotFoundException("Sub County not found with ID: " + id)
        );
    }

    @Override
    public List<NairobiHealthFacility> findAllHospitalsWithinSubCounty(int subCountyId) {
        return nairobiHealthFacilityRepository.findAllHospitalsWithinSubCounty(subCountyId);
    }

    @Override
    public List<NairobiHealthFacility> findAllHospitalsByDistanceFromUser(Double userLongitude, Double userLatitude) {
        return nairobiHealthFacilityRepository.findAllHospitalsByDistanceFromUser(userLongitude,userLatitude);
    }
    public void deleteById(int id) {
        nairobiHealthFacilityRepository.deleteById(id);
    }

}
