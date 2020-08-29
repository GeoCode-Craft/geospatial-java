package com.brianpondi.gis.service;

import com.brianpondi.gis.entity.NairobiSubCounty;
import com.brianpondi.gis.repository.NairobiSubCountyRepository;
import com.vividsolutions.jts.geom.Geometry;
import com.vividsolutions.jts.geom.GeometryFactory;
import com.vividsolutions.jts.io.ParseException;
import com.vividsolutions.jts.io.WKTReader;
import javassist.NotFoundException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service
public class NairobiSubCountyServiceImp implements NairobiSubCountyService {

    private static GeometryFactory geometryFactory = new GeometryFactory();
    private static WKTReader wktReader = new WKTReader(geometryFactory);

    @Autowired
    NairobiSubCountyRepository nairobiSubCountyRepository;

    private static Geometry fromWkt(String wkt) {
        try {
            return wktReader.read(wkt);
        } catch (ParseException e) {
            System.out.println("Converting from WKT to Geometry failure");
        }
        return null;
    }

    public List<NairobiSubCounty> findAll() {
        return (List<NairobiSubCounty>) nairobiSubCountyRepository.findAll();
    }

    public NairobiSubCounty findById(int id) throws NotFoundException {
        return nairobiSubCountyRepository.findById(id).orElseThrow(
                () -> new NotFoundException("Sub County not found with ID: " + id)
        );
    }

//    public NairobiSubCounty create(String name, String wkt) {
//        NairobiSubCounty nairobiSubCounty = NairobiSubCounty.Geometry()
//                .name(name)
//                .geometry(fromWkt(wkt))
//                .build();
//
//        nairobiSubCountyRepository.save(nairobiSubCounty);
//        return nairobiSubCounty;
//    }

    public void deleteById(int id) {
        nairobiSubCountyRepository.deleteById(id);
    }

}
