package com.ProductProo.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlTransient;

/**
 * Created by amino on 2017-07-07
 */

@Entity
@Table(name="Authority")
public class Authority implements GrantedAuthority {

    @Id
    @Column(name="idAut")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idAut;

    @Column(name="name")
    String name;

    @Override
    public String getAuthority() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @JsonIgnore
    @XmlTransient
    public String getName() {
        return name;
    }

    @JsonIgnore
    @XmlTransient
    public Long getId() {
        return idAut;
    }

    public void setId(Long id) {
        this.idAut = id;
    }


    @Override
    public String toString() {
        return "Authority{" +
                "id=" + idAut +
                ", name='" + name + '\'' +
                '}';
    }
}
