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
@Table(name = "locaux")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Locaux.findAll", query = "SELECT l FROM Locaux l"),
    @NamedQuery(name = "Locaux.findByIdlocal", query = "SELECT l FROM Locaux l WHERE l.idlocal = :idlocal"),
    @NamedQuery(name = "Locaux.findByNom", query = "SELECT l FROM Locaux l WHERE l.nom = :nom"),
    @NamedQuery(name = "Locaux.findByDescription", query = "SELECT l FROM Locaux l WHERE l.description = :description"),
    @NamedQuery(name = "Locaux.findByLieu", query = "SELECT l FROM Locaux l WHERE l.lieu = :lieu")})
public class Locaux implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idlocal")
    private Integer idlocal;
    @Column(name = "nom")
    private String nom;
    @Column(name = "description")
    private String description;
    @Column(name = "lieu")
    private String lieu;
    @OneToMany(mappedBy = "idlocal")
    private Collection<Salles> sallesCollection;

    public Locaux() {
    }

    public Locaux(Integer idlocal) {
        this.idlocal = idlocal;
    }

    public Integer getIdlocal() {
        return idlocal;
    }

    public void setIdlocal(Integer idlocal) {
        this.idlocal = idlocal;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    @XmlTransient
    public Collection<Salles> getSallesCollection() {
        return sallesCollection;
    }

    public void setSallesCollection(Collection<Salles> sallesCollection) {
        this.sallesCollection = sallesCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idlocal != null ? idlocal.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Locaux)) {
            return false;
        }
        Locaux other = (Locaux) object;
        if ((this.idlocal == null && other.idlocal != null) || (this.idlocal != null && !this.idlocal.equals(other.idlocal))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "objet.Locaux[ idlocal=" + idlocal + " ]";
    }
    
}
