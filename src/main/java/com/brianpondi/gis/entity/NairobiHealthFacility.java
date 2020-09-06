package com.brianpondi.gis.entity;

import lombok.Getter;
import lombok.Setter;
import org.locationtech.jts.geom.Point;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "nairobi_health_facilities")
public class NairobiHealthFacility implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "name")
    private String name;


    @Column(name = "geom")
    private Point geom;

}
