//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.09.25 at 04:27:16 PM PDT 
//


package org.iso.standards.iso._19115.__3.gex._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.iso.standards.iso._19115.__3.gco._1.AbstractObjectType;
import org.iso.standards.iso._19115.__3.gco._1.RealPropertyType;
import org.iso.standards.iso._19115.__3.gmw._1.SCCRSPropertyType;
import org.iso.standards.iso._19115.__3.mcc._1.AbstractReferenceSystemPropertyType;


/**
 * <p>Java class for EX_VerticalExtent_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EX_VerticalExtent_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://standards.iso.org/iso/19115/-3/gco/1.0}AbstractObject_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="minimumValue" type="{http://standards.iso.org/iso/19115/-3/gco/1.0}Real_PropertyType"/&gt;
 *         &lt;element name="maximumValue" type="{http://standards.iso.org/iso/19115/-3/gco/1.0}Real_PropertyType"/&gt;
 *         &lt;element name="verticalCRSId" type="{http://standards.iso.org/iso/19115/-3/mcc/1.0}Abstract_ReferenceSystem_PropertyType" minOccurs="0"/&gt;
 *         &lt;element name="verticalCRS" type="{http://standards.iso.org/iso/19115/-3/gmw/1.0}SC_CRS_PropertyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EX_VerticalExtent_Type", propOrder = {
    "minimumValue",
    "maximumValue",
    "verticalCRSId",
    "verticalCRS"
})
public class EXVerticalExtentType
    extends AbstractObjectType
{

    @XmlElement(required = true)
    protected RealPropertyType minimumValue;
    @XmlElement(required = true)
    protected RealPropertyType maximumValue;
    protected AbstractReferenceSystemPropertyType verticalCRSId;
    protected SCCRSPropertyType verticalCRS;

    /**
     * Gets the value of the minimumValue property.
     * 
     * @return
     *     possible object is
     *     {@link RealPropertyType }
     *     
     */
    public RealPropertyType getMinimumValue() {
        return minimumValue;
    }

    /**
     * Sets the value of the minimumValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link RealPropertyType }
     *     
     */
    public void setMinimumValue(RealPropertyType value) {
        this.minimumValue = value;
    }

    /**
     * Gets the value of the maximumValue property.
     * 
     * @return
     *     possible object is
     *     {@link RealPropertyType }
     *     
     */
    public RealPropertyType getMaximumValue() {
        return maximumValue;
    }

    /**
     * Sets the value of the maximumValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link RealPropertyType }
     *     
     */
    public void setMaximumValue(RealPropertyType value) {
        this.maximumValue = value;
    }

    /**
     * Gets the value of the verticalCRSId property.
     * 
     * @return
     *     possible object is
     *     {@link AbstractReferenceSystemPropertyType }
     *     
     */
    public AbstractReferenceSystemPropertyType getVerticalCRSId() {
        return verticalCRSId;
    }

    /**
     * Sets the value of the verticalCRSId property.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractReferenceSystemPropertyType }
     *     
     */
    public void setVerticalCRSId(AbstractReferenceSystemPropertyType value) {
        this.verticalCRSId = value;
    }

    /**
     * Gets the value of the verticalCRS property.
     * 
     * @return
     *     possible object is
     *     {@link SCCRSPropertyType }
     *     
     */
    public SCCRSPropertyType getVerticalCRS() {
        return verticalCRS;
    }

    /**
     * Sets the value of the verticalCRS property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCCRSPropertyType }
     *     
     */
    public void setVerticalCRS(SCCRSPropertyType value) {
        this.verticalCRS = value;
    }

}