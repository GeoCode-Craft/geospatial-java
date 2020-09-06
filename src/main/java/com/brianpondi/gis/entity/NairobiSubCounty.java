package com.brianpondi.gis.entity;

import lombok.Getter;
import lombok.Setter;
import org.locationtech.jts.geom.MultiPolygon;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "nairobi_sub_counties")
public class NairobiSubCounty implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private Integer id;

    @Column(name="name")
    private String name;

    @Column(name="geom")
    private MultiPolygon geom;
}
