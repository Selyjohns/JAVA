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
@Table(name = "os")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Os.findAll", query = "SELECT o FROM Os o"),
    @NamedQuery(name = "Os.findByIdos", query = "SELECT o FROM Os o WHERE o.idos = :idos"),
    @NamedQuery(name = "Os.findByNom", query = "SELECT o FROM Os o WHERE o.nom = :nom"),
    @NamedQuery(name = "Os.findByVersion", query = "SELECT o FROM Os o WHERE o.version = :version")})
public class Os implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idos")
    private Integer idos;
    @Column(name = "nom")
    private String nom;
    @Column(name = "version")
    private String version;
    @OneToMany(mappedBy = "idos")
    private Collection<Appareils> appareilsCollection;

    public Os() {
    }

    public Os(Integer idos) {
        this.idos = idos;
    }

    public Integer getIdos() {
        return idos;
    }

    public void setIdos(Integer idos) {
        this.idos = idos;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
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
        hash += (idos != null ? idos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Os)) {
            return false;
        }
        Os other = (Os) object;
        if ((this.idos == null && other.idos != null) || (this.idos != null && !this.idos.equals(other.idos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "objet.Os[ idos=" + idos + " ]";
    }
    
}
