//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.09.25 at 04:22:14 PM PDT 
//


package _int.iho.s100fc._5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for S100_FC_InformationAssociations complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="S100_FC_InformationAssociations"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="S100_FC_InformationAssociation" type="{http://www.iho.int/S100FC/5.2}S100_FC_InformationAssociation" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "S100_FC_InformationAssociations", propOrder = {
    "s100FCInformationAssociation"
})
public class S100FCInformationAssociations {

    @XmlElement(name = "S100_FC_InformationAssociation", required = true)
    protected List<S100FCInformationAssociation> s100FCInformationAssociation;

    /**
     * Gets the value of the s100FCInformationAssociation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the s100FCInformationAssociation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getS100FCInformationAssociation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link S100FCInformationAssociation }
     * 
     * 
     */
    public List<S100FCInformationAssociation> getS100FCInformationAssociation() {
        if (s100FCInformationAssociation == null) {
            s100FCInformationAssociation = new ArrayList<S100FCInformationAssociation>();
        }
        return this.s100FCInformationAssociation;
    }

}