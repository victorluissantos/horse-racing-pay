/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horseracing;

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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author lammer
 */
@Entity
@Table(name = "ticketofaposta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ticketofaposta.findAll", query = "SELECT t FROM Ticketofaposta t"),
    @NamedQuery(name = "Ticketofaposta.findById", query = "SELECT t FROM Ticketofaposta t WHERE t.id = :id"),
    @NamedQuery(name = "Ticketofaposta.findByTicketId", query = "SELECT t FROM Ticketofaposta t WHERE t.ticketId = :ticketId"),
    @NamedQuery(name = "Ticketofaposta.findByApostaId", query = "SELECT t FROM Ticketofaposta t WHERE t.apostaId = :apostaId")})
public class Ticketofaposta implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "ticket_id")
    private int ticketId;
    @Basic(optional = false)
    @Column(name = "aposta_id")
    private int apostaId;

    public Ticketofaposta() {
    }

    public Ticketofaposta(Integer id) {
        this.id = id;
    }

    public Ticketofaposta(Integer id, int ticketId, int apostaId) {
        this.id = id;
        this.ticketId = ticketId;
        this.apostaId = apostaId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public int getApostaId() {
        return apostaId;
    }

    public void setApostaId(int apostaId) {
        this.apostaId = apostaId;
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
        if (!(object instanceof Ticketofaposta)) {
            return false;
        }
        Ticketofaposta other = (Ticketofaposta) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "horseracing.Ticketofaposta[ id=" + id + " ]";
    }
    
}
