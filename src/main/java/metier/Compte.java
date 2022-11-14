package metier;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlTransient;

import java.util.Date;
@XmlRootElement(name = "compte")
@XmlAccessorType(XmlAccessType.FIELD)//les annotationsJAXB doit etre placé sur les attributs et non pas les getters
public class Compte {
    private int code;
    private double solde;
    @XmlTransient//ignorer cette partier dans la serialisation xml
    private Date dateCreation;

    public Compte() {
    }
    public Compte( int code, double solde,Date dateCreation) {
        this.code=code;
        this.solde=solde;
        this.dateCreation=dateCreation;
    }
    public double getSolde() {
        return solde;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
