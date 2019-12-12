package com.emergon.entities;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "salesman")
public class Salesman implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer scode;
    @Column(name = "sname")
    private String sname;
    private String scity;
    private Double scomm;

    public Salesman() {
    }

    public Integer getScode() {
        return scode;
    }

    public void setScode(Integer scode) {
        this.scode = scode;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getScity() {
        return scity;
    }

    public void setScity(String scity) {
        this.scity = scity;
    }

    public Double getScomm() {
        return scomm;
    }

    public void setScomm(Double scomm) {
        this.scomm = scomm;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.scode);
        hash = 83 * hash + Objects.hashCode(this.sname);
        hash = 83 * hash + Objects.hashCode(this.scity);
        hash = 83 * hash + Objects.hashCode(this.scomm);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Salesman other = (Salesman) obj;
        if (!Objects.equals(this.sname, other.sname)) {
            return false;
        }
        if (!Objects.equals(this.scity, other.scity)) {
            return false;
        }
        if (!Objects.equals(this.scode, other.scode)) {
            return false;
        }
        if (!Objects.equals(this.scomm, other.scomm)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Salesman{" + "scode=" + scode + ", sname=" + sname + ", scity=" + scity + ", scomm=" + scomm + '}';
    }
    
}
