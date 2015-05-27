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
@Table(name = "salles")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Salles.findAll", query = "SELECT s FROM Salles s"),
    @NamedQuery(name = "Salles.findByIdsalle", query = "SELECT s FROM Salles s WHERE s.idsalle = :idsalle"),
    @NamedQuery(name = "Salles.findByNom", query = "SELECT s FROM Salles s WHERE s.nom = :nom"),
    @NamedQuery(name = "Salles.findByDescription", query = "SELECT s FROM Salles s WHERE s.description = :description")})
public class Salles implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idsalle")
    private Integer idsalle;
    @Column(name = "nom")
    private String nom;
    @Column(name = "description")
    private String description;
    @JoinColumn(name = "idlocal", referencedColumnName = "idlocal")
    @ManyToOne
    private Locaux idlocal;
    @OneToMany(mappedBy = "idsalle")
    private Collection<Appareils> appareilsCollection;

    public Salles() {
    }

    public Salles(Integer idsalle) {
        this.idsalle = idsalle;
    }

    public Integer getIdsalle() {
        return idsalle;
    }

    public void setIdsalle(Integer idsalle) {
        this.idsalle = idsalle;
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

    public Locaux getIdlocal() {
        return idlocal;
    }

    public void setIdlocal(Locaux idlocal) {
        this.idlocal = idlocal;
    }

    @XmlTransient
    public Collection<Appareils> getAppareilsCollection() {
        return appareilsCollection;
    }

    public void setAppareilsCollection(Collection<Appareils> appareilsCollection) {
        this.appareilsCollection = appareilsCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idsalle != null ? idsalle.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Salles)) {
            return false;
        }
        Salles other = (Salles) object;
        if ((this.idsalle == null && other.idsalle != null) || (this.idsalle != null && !this.idsalle.equals(other.idsalle))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "objet.Salles[ idsalle=" + idsalle + " ]";
    }
    
}
