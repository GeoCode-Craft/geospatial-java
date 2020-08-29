package com.brianpondi.gis.controller;

import com.brianpondi.gis.entity.NairobiSubCounty;
import com.brianpondi.gis.service.NairobiSubCountyService;
import javassist.NotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/nairobisubcounty")
public class NairobiSubCountyController {

    @Autowired
    NairobiSubCountyService nairobiSubCountyService;

    @GetMapping
    public List<NairobiSubCounty> findAll() {
        return nairobiSubCountyService.findAll();
    }

    @GetMapping(path = "/{id}")
    public NairobiSubCounty findById(@PathVariable("id") int id) {
        try {
            return nairobiSubCountyService.findById(id);
        } catch (NotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    @DeleteMapping(path = "/{id}")
    public void deleteById(@PathVariable("id") int id) {
        nairobiSubCountyService.deleteById(id);
    }

//    @PostMapping(path = "/{name}")
//    public NairobiSubCounty create(@PathVariable("name") String name,
//                           @RequestBody String wkt) {
//        return nairobiSubCountyService.create(name, wkt);
//    }

}

