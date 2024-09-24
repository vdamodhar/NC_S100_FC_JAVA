//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.09.24 at 02:21:01 PM PDT 
//


package _int.iho.s100.xc._5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.iso.standards.iso._19115.__3.gco._1.CharacterStringPropertyType;


/**
 * Contact details of the issuer of this exchange catalogue
 * 
 * <p>Java class for S100_CataloguePointofContact complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="S100_CataloguePointofContact"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="organization" type="{http://standards.iso.org/iso/19115/-3/gco/1.0}CharacterString_PropertyType"/&gt;
 *         &lt;element name="phone" type="{http://www.iho.int/s100/xc/5.2}S100_Phone_Type" minOccurs="0"/&gt;
 *         &lt;element name="address" type="{http://www.iho.int/s100/xc/5.2}S100_Address_Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "S100_CataloguePointofContact", propOrder = {
    "organization",
    "phone",
    "address"
})
public class S100CataloguePointofContact {

    @XmlElement(required = true)
    protected CharacterStringPropertyType organization;
    protected S100PhoneType phone;
    protected S100AddressType address;

    /**
     * Gets the value of the organization property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getOrganization() {
        return organization;
    }

    /**
     * Sets the value of the organization property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setOrganization(CharacterStringPropertyType value) {
        this.organization = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link S100PhoneType }
     *     
     */
    public S100PhoneType getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link S100PhoneType }
     *     
     */
    public void setPhone(S100PhoneType value) {
        this.phone = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link S100AddressType }
     *     
     */
    public S100AddressType getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link S100AddressType }
     *     
     */
    public void setAddress(S100AddressType value) {
        this.address = value;
    }

}