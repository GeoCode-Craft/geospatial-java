package com.brianpondi.gis.entity;

import com.bedatadriven.jackson.datatype.jts.serialization.GeometryDeserializer;
import com.bedatadriven.jackson.datatype.jts.serialization.GeometrySerializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.vividsolutions.jts.geom.Point;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Getter
@Setter
@Entity(name = "nairobi_health_facilities")
public class NairobiHealthFacility implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    @JsonSerialize(using = GeometrySerializer.class)
    @JsonDeserialize(contentUsing = GeometryDeserializer.class)
    private Point geom;

}
