//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.09.25 at 04:25:20 PM PDT 
//


package _int.iho.s100.se._5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * File creation date, the name of the Data Server and the format version
 * 
 * <p>Java class for PermitHeaderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PermitHeaderType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="issueDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="dataServerName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="dataServerIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="userpermit" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PermitHeaderType", propOrder = {
    "issueDate",
    "dataServerName",
    "dataServerIdentifier",
    "version",
    "userpermit"
})
public class PermitHeaderType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar issueDate;
    @XmlElement(required = true)
    protected String dataServerName;
    @XmlElement(required = true)
    protected String dataServerIdentifier;
    @XmlElement(required = true)
    protected String version;
    @XmlElement(required = true)
    protected String userpermit;

    /**
     * Gets the value of the issueDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIssueDate() {
        return issueDate;
    }

    /**
     * Sets the value of the issueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIssueDate(XMLGregorianCalendar value) {
        this.issueDate = value;
    }

    /**
     * Gets the value of the dataServerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataServerName() {
        return dataServerName;
    }

    /**
     * Sets the value of the dataServerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataServerName(String value) {
        this.dataServerName = value;
    }

    /**
     * Gets the value of the dataServerIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataServerIdentifier() {
        return dataServerIdentifier;
    }

    /**
     * Sets the value of the dataServerIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataServerIdentifier(String value) {
        this.dataServerIdentifier = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the userpermit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserpermit() {
        return userpermit;
    }

    /**
     * Sets the value of the userpermit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserpermit(String value) {
        this.userpermit = value;
    }

}