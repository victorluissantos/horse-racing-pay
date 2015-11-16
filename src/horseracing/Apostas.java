/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horseracing;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author lammer
 */
@Entity
@Table(name = "apostas", catalog = "cavaloloko", schema = "")
@NamedQueries({
    @NamedQuery(name = "Apostas.findAll", query = "SELECT a FROM Apostas a"),
    @NamedQuery(name = "Apostas.findById", query = "SELECT a FROM Apostas a WHERE a.id = :id"),
    @NamedQuery(name = "Apostas.findByWinCavUm", query = "SELECT a FROM Apostas a WHERE a.winCavUm = :winCavUm"),
    @NamedQuery(name = "Apostas.findByWinCavDois", query = "SELECT a FROM Apostas a WHERE a.winCavDois = :winCavDois"),
    @NamedQuery(name = "Apostas.findByWinCavTres", query = "SELECT a FROM Apostas a WHERE a.winCavTres = :winCavTres"),
    @NamedQuery(name = "Apostas.findByWinCavQuatro", query = "SELECT a FROM Apostas a WHERE a.winCavQuatro = :winCavQuatro"),
    @NamedQuery(name = "Apostas.findByWinCavSinco", query = "SELECT a FROM Apostas a WHERE a.winCavSinco = :winCavSinco"),
    @NamedQuery(name = "Apostas.findByWinCavSeis", query = "SELECT a FROM Apostas a WHERE a.winCavSeis = :winCavSeis"),
    @NamedQuery(name = "Apostas.findByWinCavSete", query = "SELECT a FROM Apostas a WHERE a.winCavSete = :winCavSete"),
    @NamedQuery(name = "Apostas.findByWinCavOito", query = "SELECT a FROM Apostas a WHERE a.winCavOito = :winCavOito"),
    @NamedQuery(name = "Apostas.findByWinCavNove", query = "SELECT a FROM Apostas a WHERE a.winCavNove = :winCavNove"),
    @NamedQuery(name = "Apostas.findByWinCavDex", query = "SELECT a FROM Apostas a WHERE a.winCavDex = :winCavDex"),
    @NamedQuery(name = "Apostas.findByCavWin", query = "SELECT a FROM Apostas a WHERE a.cavWin = :cavWin"),
    @NamedQuery(name = "Apostas.findByDtAposta", query = "SELECT a FROM Apostas a WHERE a.dtAposta = :dtAposta")})
public class Apostas implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "win_cav_um")
    private Integer winCavUm;
    @Column(name = "win_cav_dois")
    private Integer winCavDois;
    @Column(name = "win_cav_tres")
    private Integer winCavTres;
    @Column(name = "win_cav_quatro")
    private Integer winCavQuatro;
    @Column(name = "win_cav_sinco")
    private Integer winCavSinco;
    @Column(name = "win_cav_seis")
    private Integer winCavSeis;
    @Column(name = "win_cav_sete")
    private Integer winCavSete;
    @Column(name = "win_cav_oito")
    private Integer winCavOito;
    @Column(name = "win_cav_nove")
    private Integer winCavNove;
    @Column(name = "win_cav_dex")
    private Integer winCavDex;
    @Column(name = "cav_win")
    private String cavWin;
    @Basic(optional = false)
    @Column(name = "dt_aposta")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtAposta;

    public Apostas() {
    }

    public Apostas(Integer id) {
        this.id = id;
    }

    public Apostas(Integer id, Date dtAposta) {
        this.id = id;
        this.dtAposta = dtAposta;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public Integer getWinCavUm() {
        return winCavUm;
    }

    public void setWinCavUm(Integer winCavUm) {
        Integer oldWinCavUm = this.winCavUm;
        this.winCavUm = winCavUm;
        changeSupport.firePropertyChange("winCavUm", oldWinCavUm, winCavUm);
    }

    public Integer getWinCavDois() {
        return winCavDois;
    }

    public void setWinCavDois(Integer winCavDois) {
        Integer oldWinCavDois = this.winCavDois;
        this.winCavDois = winCavDois;
        changeSupport.firePropertyChange("winCavDois", oldWinCavDois, winCavDois);
    }

    public Integer getWinCavTres() {
        return winCavTres;
    }

    public void setWinCavTres(Integer winCavTres) {
        Integer oldWinCavTres = this.winCavTres;
        this.winCavTres = winCavTres;
        changeSupport.firePropertyChange("winCavTres", oldWinCavTres, winCavTres);
    }

    public Integer getWinCavQuatro() {
        return winCavQuatro;
    }

    public void setWinCavQuatro(Integer winCavQuatro) {
        Integer oldWinCavQuatro = this.winCavQuatro;
        this.winCavQuatro = winCavQuatro;
        changeSupport.firePropertyChange("winCavQuatro", oldWinCavQuatro, winCavQuatro);
    }

    public Integer getWinCavSinco() {
        return winCavSinco;
    }

    public void setWinCavSinco(Integer winCavSinco) {
        Integer oldWinCavSinco = this.winCavSinco;
        this.winCavSinco = winCavSinco;
        changeSupport.firePropertyChange("winCavSinco", oldWinCavSinco, winCavSinco);
    }

    public Integer getWinCavSeis() {
        return winCavSeis;
    }

    public void setWinCavSeis(Integer winCavSeis) {
        Integer oldWinCavSeis = this.winCavSeis;
        this.winCavSeis = winCavSeis;
        changeSupport.firePropertyChange("winCavSeis", oldWinCavSeis, winCavSeis);
    }

    public Integer getWinCavSete() {
        return winCavSete;
    }

    public void setWinCavSete(Integer winCavSete) {
        Integer oldWinCavSete = this.winCavSete;
        this.winCavSete = winCavSete;
        changeSupport.firePropertyChange("winCavSete", oldWinCavSete, winCavSete);
    }

    public Integer getWinCavOito() {
        return winCavOito;
    }

    public void setWinCavOito(Integer winCavOito) {
        Integer oldWinCavOito = this.winCavOito;
        this.winCavOito = winCavOito;
        changeSupport.firePropertyChange("winCavOito", oldWinCavOito, winCavOito);
    }

    public Integer getWinCavNove() {
        return winCavNove;
    }

    public void setWinCavNove(Integer winCavNove) {
        Integer oldWinCavNove = this.winCavNove;
        this.winCavNove = winCavNove;
        changeSupport.firePropertyChange("winCavNove", oldWinCavNove, winCavNove);
    }

    public Integer getWinCavDex() {
        return winCavDex;
    }

    public void setWinCavDex(Integer winCavDex) {
        Integer oldWinCavDex = this.winCavDex;
        this.winCavDex = winCavDex;
        changeSupport.firePropertyChange("winCavDex", oldWinCavDex, winCavDex);
    }

    public String getCavWin() {
        return cavWin;
    }

    public void setCavWin(String cavWin) {
        String oldCavWin = this.cavWin;
        this.cavWin = cavWin;
        changeSupport.firePropertyChange("cavWin", oldCavWin, cavWin);
    }

    public Date getDtAposta() {
        return dtAposta;
    }

    public void setDtAposta(Date dtAposta) {
        Date oldDtAposta = this.dtAposta;
        this.dtAposta = dtAposta;
        changeSupport.firePropertyChange("dtAposta", oldDtAposta, dtAposta);
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
        if (!(object instanceof Apostas)) {
            return false;
        }
        Apostas other = (Apostas) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "horseracing.Apostas[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
