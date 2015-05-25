/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objets;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Simon
 */
@Entity
@Table(name = "appareils")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Appareils.findAll", query = "SELECT a FROM Appareils a"),
    @NamedQuery(name = "Appareils.findByIdappareils", query = "SELECT a FROM Appareils a WHERE a.idappareils = :idappareils"),
    @NamedQuery(name = "Appareils.findByNom", query = "SELECT a FROM Appareils a WHERE a.nom = :nom")})
public class Appareils implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idappareils")
    private Integer idappareils;
    @Column(name = "nom")
    private String nom;
    @OneToMany(mappedBy = "idappareil")
    private Collection<Interfaces> interfacesCollection;
    @JoinColumn(name = "idsalle", referencedColumnName = "idsalle")
    @ManyToOne
    private Salles idsalle;
    @JoinColumn(name = "idos", referencedColumnName = "idos")
    @ManyToOne
    private Os idos;

    public Appareils() {
    }

    public Appareils(Integer idappareils) {
        this.idappareils = idappareils;
    }

    public Integer getIdappareils() {
        return idappareils;
    }

    public void setIdappareils(Integer idappareils) {
        this.idappareils = idappareils;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @XmlTransient
    public Collection<Interfaces> getInterfacesCollection() {
        return interfacesCollection;
    }

    public void setInterfacesCollection(Collection<Interfaces> interfacesCollection) {
        this.interfacesCollection = interfacesCollection;
    }

    public Salles getIdsalle() {
        return idsalle;
    }

    public void setIdsalle(Salles idsalle) {
        this.idsalle = idsalle;
    }

    public Os getIdos() {
        return idos;
    }

    public void setIdos(Os idos) {
        this.idos = idos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idappareils != null ? idappareils.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Appareils)) {
            return false;
        }
        Appareils other = (Appareils) object;
        if ((this.idappareils == null && other.idappareils != null) || (this.idappareils != null && !this.idappareils.equals(other.idappareils))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "objet.Appareils[ idappareils=" + idappareils + " ]";
    }
    
}
