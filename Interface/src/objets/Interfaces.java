/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objets;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Simon
 */
@Entity
@Table(name = "interfaces")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Interfaces.findAll", query = "SELECT i FROM Interfaces i"),
    @NamedQuery(name = "Interfaces.findByIdintefaces", query = "SELECT i FROM Interfaces i WHERE i.idintefaces = :idintefaces"),
    @NamedQuery(name = "Interfaces.findByNom", query = "SELECT i FROM Interfaces i WHERE i.nom = :nom"),
    @NamedQuery(name = "Interfaces.findByAdressemac", query = "SELECT i FROM Interfaces i WHERE i.adressemac = :adressemac"),
    @NamedQuery(name = "Interfaces.findByEtatinterface", query = "SELECT i FROM Interfaces i WHERE i.etatinterface = :etatinterface")})
public class Interfaces implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idintefaces")
    private Integer idintefaces;
    @Column(name = "nom")
    private String nom;
    @Column(name = "adressemac")
    private String adressemac;
    @Column(name = "etatinterface")
    private Boolean etatinterface;
    @JoinColumn(name = "idappareil", referencedColumnName = "idappareils")
    @ManyToOne
    private Appareils idappareil;

    public Interfaces() {
    }

    public Interfaces(Integer idintefaces) {
        this.idintefaces = idintefaces;
    }

    public Integer getIdintefaces() {
        return idintefaces;
    }

    public void setIdintefaces(Integer idintefaces) {
        this.idintefaces = idintefaces;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdressemac() {
        return adressemac;
    }

    public void setAdressemac(String adressemac) {
        this.adressemac = adressemac;
    }

    public Boolean getEtatinterface() {
        return etatinterface;
    }

    public void setEtatinterface(Boolean etatinterface) {
        this.etatinterface = etatinterface;
    }

    public Appareils getIdappareil() {
        return idappareil;
    }

    public void setIdappareil(Appareils idappareil) {
        this.idappareil = idappareil;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idintefaces != null ? idintefaces.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Interfaces)) {
            return false;
        }
        Interfaces other = (Interfaces) object;
        if ((this.idintefaces == null && other.idintefaces != null) || (this.idintefaces != null && !this.idintefaces.equals(other.idintefaces))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "objet.Interfaces[ idintefaces=" + idintefaces + " ]";
    }
    
}
