package com.brianpondi.gis.repository;

import com.brianpondi.gis.entity.NairobiSubCounty;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NairobiSubCountyRepository extends CrudRepository<NairobiSubCounty, Integer> {
}
