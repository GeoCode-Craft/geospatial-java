package com.brianpondi.gis.controller;

import com.brianpondi.gis.entity.NairobiHealthFacility;
import com.brianpondi.gis.service.NairobiHealthFacilityService;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/nairobihealthfacilities")
public class NairobiHealthFacilityController {

    @Autowired
    private NairobiHealthFacilityService nairobiHealthFacilityService;

    @GetMapping
    public List<NairobiHealthFacility> findAll() {
        return nairobiHealthFacilityService.findAll();
    }

    @GetMapping(path = "/{id}")
    public NairobiHealthFacility findById(@PathVariable("id") int id) {
        try {
            return nairobiHealthFacilityService.findById(id);
        } catch (NotFoundException e) {
            return null;
        }
    }

    @GetMapping(path = "/findwithinsubcounty/{id}")
    public List<NairobiHealthFacility> findAllHospitalsWithinSubCounty(@PathVariable("id") int id) {
        return nairobiHealthFacilityService.findAllHospitalsWithinSubCounty(id);
    }

    @GetMapping(path = "/nearesthealthfacilities/{userLongitude}/{userLatitude}")
    public List<NairobiHealthFacility> findAllHospitalsByDistanceFromUser(@PathVariable("userLongitude") double userLongitude,
                                                                          @PathVariable("userLatitude") double userLatitude) {
        return nairobiHealthFacilityService.findAllHospitalsByDistanceFromUser(userLongitude, userLatitude);
    }

    @DeleteMapping(path = "/{id}")
    public void deleteById(@PathVariable("id") int id) {
        nairobiHealthFacilityService.deleteById(id);
    }


}
