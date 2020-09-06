package com.brianpondi.gis.service.Impl;

import com.brianpondi.gis.entity.NairobiSubCounty;
import com.brianpondi.gis.repository.NairobiSubCountyRepository;
import com.brianpondi.gis.service.NairobiSubCountyService;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NairobiSubCountyServiceImp implements NairobiSubCountyService {

    @Autowired
    NairobiSubCountyRepository nairobiSubCountyRepository;

    public List<NairobiSubCounty> findAll() {
        return  nairobiSubCountyRepository.findAll();
    }

    public NairobiSubCounty findById(int id) throws NotFoundException {
        return nairobiSubCountyRepository.findById(id).orElseThrow(
                () -> new NotFoundException("Sub County not found with ID: " + id)
        );
    }

    public void deleteById(int id) {
        nairobiSubCountyRepository.deleteById(id);
    }

}
