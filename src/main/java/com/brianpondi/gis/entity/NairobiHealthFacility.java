package com.brianpondi.gis.entity;

import org.postgis.Geometry;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Getter
@Setter
@Entity(name = "nairobi_health_facilities")

public class NairobiHealthFacility implements Serializable {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;
    @Column(name = "geom")
    private Geometry geom;
    @Column(name = "name")
    private String name;
    @Column(name = "contact")
    private String contact;

}
