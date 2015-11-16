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
@Table(name = "banco", catalog = "cavaloloko", schema = "")
@NamedQueries({
    @NamedQuery(name = "Banco.findAll", query = "SELECT b FROM Banco b"),
    @NamedQuery(name = "Banco.findById", query = "SELECT b FROM Banco b WHERE b.id = :id"),
    @NamedQuery(name = "Banco.findByCvUm", query = "SELECT b FROM Banco b WHERE b.cvUm = :cvUm"),
    @NamedQuery(name = "Banco.findByCvDois", query = "SELECT b FROM Banco b WHERE b.cvDois = :cvDois"),
    @NamedQuery(name = "Banco.findByCvTres", query = "SELECT b FROM Banco b WHERE b.cvTres = :cvTres"),
    @NamedQuery(name = "Banco.findByCvQuatro", query = "SELECT b FROM Banco b WHERE b.cvQuatro = :cvQuatro"),
    @NamedQuery(name = "Banco.findByCvSinco", query = "SELECT b FROM Banco b WHERE b.cvSinco = :cvSinco"),
    @NamedQuery(name = "Banco.findByCvSeis", query = "SELECT b FROM Banco b WHERE b.cvSeis = :cvSeis"),
    @NamedQuery(name = "Banco.findByCvSete", query = "SELECT b FROM Banco b WHERE b.cvSete = :cvSete"),
    @NamedQuery(name = "Banco.findByCvOito", query = "SELECT b FROM Banco b WHERE b.cvOito = :cvOito"),
    @NamedQuery(name = "Banco.findByCvNove", query = "SELECT b FROM Banco b WHERE b.cvNove = :cvNove"),
    @NamedQuery(name = "Banco.findByCvDez", query = "SELECT b FROM Banco b WHERE b.cvDez = :cvDez")})
public class Banco implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "cv_um")
    private int cvUm;
    @Basic(optional = false)
    @Column(name = "cv_dois")
    private int cvDois;
    @Basic(optional = false)
    @Column(name = "cv_tres")
    private int cvTres;
    @Basic(optional = false)
    @Column(name = "cv_quatro")
    private int cvQuatro;
    @Basic(optional = false)
    @Column(name = "cv_sinco")
    private int cvSinco;
    @Basic(optional = false)
    @Column(name = "cv_seis")
    private int cvSeis;
    @Basic(optional = false)
    @Column(name = "cv_sete")
    private int cvSete;
    @Basic(optional = false)
    @Column(name = "cv_oito")
    private int cvOito;
    @Basic(optional = false)
    @Column(name = "cv_nove")
    private int cvNove;
    @Basic(optional = false)
    @Column(name = "cv_dez")
    private int cvDez;

    public Banco() {
    }

    public Banco(Integer id) {
        this.id = id;
    }

    public Banco(Integer id, int cvUm, int cvDois, int cvTres, int cvQuatro, int cvSinco, int cvSeis, int cvSete, int cvOito, int cvNove, int cvDez) {
        this.id = id;
        this.cvUm = cvUm;
        this.cvDois = cvDois;
        this.cvTres = cvTres;
        this.cvQuatro = cvQuatro;
        this.cvSinco = cvSinco;
        this.cvSeis = cvSeis;
        this.cvSete = cvSete;
        this.cvOito = cvOito;
        this.cvNove = cvNove;
        this.cvDez = cvDez;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public int getCvUm() {
        return cvUm;
    }

    public void setCvUm(int cvUm) {
        int oldCvUm = this.cvUm;
        this.cvUm = cvUm;
        changeSupport.firePropertyChange("cvUm", oldCvUm, cvUm);
    }

    public int getCvDois() {
        return cvDois;
    }

    public void setCvDois(int cvDois) {
        int oldCvDois = this.cvDois;
        this.cvDois = cvDois;
        changeSupport.firePropertyChange("cvDois", oldCvDois, cvDois);
    }

    public int getCvTres() {
        return cvTres;
    }

    public void setCvTres(int cvTres) {
        int oldCvTres = this.cvTres;
        this.cvTres = cvTres;
        changeSupport.firePropertyChange("cvTres", oldCvTres, cvTres);
    }

    public int getCvQuatro() {
        return cvQuatro;
    }

    public void setCvQuatro(int cvQuatro) {
        int oldCvQuatro = this.cvQuatro;
        this.cvQuatro = cvQuatro;
        changeSupport.firePropertyChange("cvQuatro", oldCvQuatro, cvQuatro);
    }

    public int getCvSinco() {
        return cvSinco;
    }

    public void setCvSinco(int cvSinco) {
        int oldCvSinco = this.cvSinco;
        this.cvSinco = cvSinco;
        changeSupport.firePropertyChange("cvSinco", oldCvSinco, cvSinco);
    }

    public int getCvSeis() {
        return cvSeis;
    }

    public void setCvSeis(int cvSeis) {
        int oldCvSeis = this.cvSeis;
        this.cvSeis = cvSeis;
        changeSupport.firePropertyChange("cvSeis", oldCvSeis, cvSeis);
    }

    public int getCvSete() {
        return cvSete;
    }

    public void setCvSete(int cvSete) {
        int oldCvSete = this.cvSete;
        this.cvSete = cvSete;
        changeSupport.firePropertyChange("cvSete", oldCvSete, cvSete);
    }

    public int getCvOito() {
        return cvOito;
    }

    public void setCvOito(int cvOito) {
        int oldCvOito = this.cvOito;
        this.cvOito = cvOito;
        changeSupport.firePropertyChange("cvOito", oldCvOito, cvOito);
    }

    public int getCvNove() {
        return cvNove;
    }

    public void setCvNove(int cvNove) {
        int oldCvNove = this.cvNove;
        this.cvNove = cvNove;
        changeSupport.firePropertyChange("cvNove", oldCvNove, cvNove);
    }

    public int getCvDez() {
        return cvDez;
    }

    public void setCvDez(int cvDez) {
        int oldCvDez = this.cvDez;
        this.cvDez = cvDez;
        changeSupport.firePropertyChange("cvDez", oldCvDez, cvDez);
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
        if (!(object instanceof Banco)) {
            return false;
        }
        Banco other = (Banco) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "horseracing.Banco[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
