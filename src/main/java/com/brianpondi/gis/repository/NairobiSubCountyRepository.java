package com.brianpondi.gis.repository;

import com.brianpondi.gis.entity.NairobiSubCounty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NairobiSubCountyRepository extends JpaRepository<NairobiSubCounty, Integer> {
}
