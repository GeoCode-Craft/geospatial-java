package com.brianpondi.gis.entity;

import com.vividsolutions.jts.geom.Geometry;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Transient;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Getter
@Setter
@Entity(name = "nairobi_sub_counties")
public class NairobiSubCounty implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private Integer id;
    @Transient
    private Geometry geom;
    private String name;

}
