/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horseracing;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author lammer
 */
@Entity
@Table(name = "configuracao", catalog = "cavaloloko", schema = "")
@NamedQueries({
    @NamedQuery(name = "Configuracao.findAll", query = "SELECT c FROM Configuracao c"),
    @NamedQuery(name = "Configuracao.findById", query = "SELECT c FROM Configuracao c WHERE c.id = :id"),
    @NamedQuery(name = "Configuracao.findByMargem", query = "SELECT c FROM Configuracao c WHERE c.margem = :margem")})
public class Configuracao implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "margem")
    private int margem;

    public Configuracao() {
    }

    public Configuracao(Integer id) {
        this.id = id;
    }

    public Configuracao(Integer id, int margem) {
        this.id = id;
        this.margem = margem;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public int getMargem() {
        return margem;
    }

    public void setMargem(int margem) {
        int oldMargem = this.margem;
        this.margem = margem;
        changeSupport.firePropertyChange("margem", oldMargem, margem);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Configuracao)) {
            return false;
        }
        Configuracao other = (Configuracao) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "horseracing.Configuracao[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
