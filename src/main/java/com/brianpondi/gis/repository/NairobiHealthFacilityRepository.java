package com.brianpondi.gis.repository;

import com.brianpondi.gis.entity.NairobiHealthFacility;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NairobiHealthFacilityRepository extends CrudRepository<NairobiHealthFacility, Integer> {
//    @Query("select facility from NairobiHealthFacility facility where within(facility.geom, ?1) = true")
//    List<NairobiHealthFacility> findWithin(Geometry filter);
//        @Query(value = "SELECT nhf FROM NairobiHealthFacility nhf WHERE within(nhf.geom, :bounds) = true AND se.title LIKE :filter")
//        List<NairobiHealthFacility> findAllWithin(@Param("bounds") Geometry bounds, @Param("filter") String titleFilter);
}
