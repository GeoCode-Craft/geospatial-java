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

    @GetMapping(path = "/")
    public NairobiHealthFacility findById(@RequestParam("id") int id) {
        try {
            return nairobiHealthFacilityService.findById(id);
        } catch (NotFoundException e) {
            return null;
        }
    }

    @GetMapping(path = "/hospitalswithinsubcounty")
    public List<NairobiHealthFacility> findAllHospitalsWithinSubCounty(@RequestParam("id") int id) {
        return nairobiHealthFacilityService.findAllHospitalsWithinSubCounty(id);
    }

    @GetMapping(path = "/nearbyhealthfacilities") 
    public List<NairobiHealthFacility> findAllHospitalsByDistanceFromUser(@RequestParam("userlocation") List<Double> userLocation) {
        //this extraction can also be implemented in return method
        double userLongitude = userLocation.get(0);
        double userLatitude = userLocation.get(1);

        return nairobiHealthFacilityService.findAllHospitalsByDistanceFromUser(userLongitude, userLatitude);
    }

    @DeleteMapping(path = "/")
    public void deleteById(@RequestParam("id") int id) {
        nairobiHealthFacilityService.deleteById(id);
    }
}
