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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "tickets", catalog = "cavaloloko", schema = "")
@NamedQueries({
    @NamedQuery(name = "Tickets.findAll", query = "SELECT t FROM Tickets t"),
    @NamedQuery(name = "Tickets.findById", query = "SELECT t FROM Tickets t WHERE t.id = :id"),
    @NamedQuery(name = "Tickets.findByPtCvUm", query = "SELECT t FROM Tickets t WHERE t.ptCvUm = :ptCvUm"),
    @NamedQuery(name = "Tickets.findByPtCvDois", query = "SELECT t FROM Tickets t WHERE t.ptCvDois = :ptCvDois"),
    @NamedQuery(name = "Tickets.findByPtCvTres", query = "SELECT t FROM Tickets t WHERE t.ptCvTres = :ptCvTres"),
    @NamedQuery(name = "Tickets.findByPtCvQuatro", query = "SELECT t FROM Tickets t WHERE t.ptCvQuatro = :ptCvQuatro"),
    @NamedQuery(name = "Tickets.findByPtCvSinco", query = "SELECT t FROM Tickets t WHERE t.ptCvSinco = :ptCvSinco"),
    @NamedQuery(name = "Tickets.findByPtCvSeis", query = "SELECT t FROM Tickets t WHERE t.ptCvSeis = :ptCvSeis"),
    @NamedQuery(name = "Tickets.findByPtCvSete", query = "SELECT t FROM Tickets t WHERE t.ptCvSete = :ptCvSete"),
    @NamedQuery(name = "Tickets.findByPtCvOito", query = "SELECT t FROM Tickets t WHERE t.ptCvOito = :ptCvOito"),
    @NamedQuery(name = "Tickets.findByPtCvNove", query = "SELECT t FROM Tickets t WHERE t.ptCvNove = :ptCvNove"),
    @NamedQuery(name = "Tickets.findByPtCvDez", query = "SELECT t FROM Tickets t WHERE t.ptCvDez = :ptCvDez")})
public class Tickets implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "pt_cv_um")
    private Integer ptCvUm;
    @Column(name = "pt_cv_dois")
    private Integer ptCvDois;
    @Column(name = "pt_cv_tres")
    private Integer ptCvTres;
    @Column(name = "pt_cv_quatro")
    private Integer ptCvQuatro;
    @Column(name = "pt_cv_sinco")
    private Integer ptCvSinco;
    @Column(name = "pt_cv_seis")
    private Integer ptCvSeis;
    @Column(name = "pt_cv_sete")
    private Integer ptCvSete;
    @Column(name = "pt_cv_oito")
    private Integer ptCvOito;
    @Column(name = "pt_cv_nove")
    private Integer ptCvNove;
    @Column(name = "pt_cv_dez")
    private Integer ptCvDez;

    public Tickets() {
    }

    public Tickets(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public Integer getPtCvUm() {
        return ptCvUm;
    }

    public void setPtCvUm(Integer ptCvUm) {
        Integer oldPtCvUm = this.ptCvUm;
        this.ptCvUm = ptCvUm;
        changeSupport.firePropertyChange("ptCvUm", oldPtCvUm, ptCvUm);
    }

    public Integer getPtCvDois() {
        return ptCvDois;
    }

    public void setPtCvDois(Integer ptCvDois) {
        Integer oldPtCvDois = this.ptCvDois;
        this.ptCvDois = ptCvDois;
        changeSupport.firePropertyChange("ptCvDois", oldPtCvDois, ptCvDois);
    }

    public Integer getPtCvTres() {
        return ptCvTres;
    }

    public void setPtCvTres(Integer ptCvTres) {
        Integer oldPtCvTres = this.ptCvTres;
        this.ptCvTres = ptCvTres;
        changeSupport.firePropertyChange("ptCvTres", oldPtCvTres, ptCvTres);
    }

    public Integer getPtCvQuatro() {
        return ptCvQuatro;
    }

    public void setPtCvQuatro(Integer ptCvQuatro) {
        Integer oldPtCvQuatro = this.ptCvQuatro;
        this.ptCvQuatro = ptCvQuatro;
        changeSupport.firePropertyChange("ptCvQuatro", oldPtCvQuatro, ptCvQuatro);
    }

    public Integer getPtCvSinco() {
        return ptCvSinco;
    }

    public void setPtCvSinco(Integer ptCvSinco) {
        Integer oldPtCvSinco = this.ptCvSinco;
        this.ptCvSinco = ptCvSinco;
        changeSupport.firePropertyChange("ptCvSinco", oldPtCvSinco, ptCvSinco);
    }

    public Integer getPtCvSeis() {
        return ptCvSeis;
    }

    public void setPtCvSeis(Integer ptCvSeis) {
        Integer oldPtCvSeis = this.ptCvSeis;
        this.ptCvSeis = ptCvSeis;
        changeSupport.firePropertyChange("ptCvSeis", oldPtCvSeis, ptCvSeis);
    }

    public Integer getPtCvSete() {
        return ptCvSete;
    }

    public void setPtCvSete(Integer ptCvSete) {
        Integer oldPtCvSete = this.ptCvSete;
        this.ptCvSete = ptCvSete;
        changeSupport.firePropertyChange("ptCvSete", oldPtCvSete, ptCvSete);
    }

    public Integer getPtCvOito() {
        return ptCvOito;
    }

    public void setPtCvOito(Integer ptCvOito) {
        Integer oldPtCvOito = this.ptCvOito;
        this.ptCvOito = ptCvOito;
        changeSupport.firePropertyChange("ptCvOito", oldPtCvOito, ptCvOito);
    }

    public Integer getPtCvNove() {
        return ptCvNove;
    }

    public void setPtCvNove(Integer ptCvNove) {
        Integer oldPtCvNove = this.ptCvNove;
        this.ptCvNove = ptCvNove;
        changeSupport.firePropertyChange("ptCvNove", oldPtCvNove, ptCvNove);
    }

    public Integer getPtCvDez() {
        return ptCvDez;
    }

    public void setPtCvDez(Integer ptCvDez) {
        Integer oldPtCvDez = this.ptCvDez;
        this.ptCvDez = ptCvDez;
        changeSupport.firePropertyChange("ptCvDez", oldPtCvDez, ptCvDez);
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
        if (!(object instanceof Tickets)) {
            return false;
        }
        Tickets other = (Tickets) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "horseracing.Tickets[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
