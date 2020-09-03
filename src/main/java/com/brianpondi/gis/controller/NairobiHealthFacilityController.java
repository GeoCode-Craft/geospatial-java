package com.brianpondi.gis.controller;

import com.brianpondi.gis.entity.NairobiHealthFacility;
import com.brianpondi.gis.service.NairobiHealthFacilityService;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
                e.printStackTrace();
            }
            return null;
        }

    }
