package com.brianpondi.gis.controller;

import com.brianpondi.gis.entity.NairobiSubCounty;
import com.brianpondi.gis.service.NairobiSubCountyService;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/nairobisubcounties")
public class NairobiSubCountyController {

    @Autowired
    private NairobiSubCountyService nairobiSubCountyService;

    @GetMapping
    public List<NairobiSubCounty> findAll() {
        return nairobiSubCountyService.findAll();
    }

    @GetMapping(path = "/{id}")
    public NairobiSubCounty findById(@PathVariable("id") int id) throws NotFoundException {
        return nairobiSubCountyService.findById(id);
    }

    @DeleteMapping(path = "/{id}")
    public void deleteById(@PathVariable("id") int id) {
        nairobiSubCountyService.deleteById(id);
    }

}

