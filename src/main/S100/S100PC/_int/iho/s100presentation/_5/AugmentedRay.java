//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.09.25 at 04:23:30 PM PDT 
//


package _int.iho.s100presentation._5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import _int.iho.s100symboldefinition._5.CRSType;


/**
 * A drawing instruction that defines a line from the position of a point feature to another position. The position is defined by the direction and the length attributes. It can be used for drawing line styles or line texts
 * 
 * <p>Java class for AugmentedRay complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AugmentedRay"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.iho.int/S100Presentation/5.2}AugmentedLineOrArea"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="rotationCRS" type="{http://www.iho.int/S100SymbolDefinition/5.2}CRSType" minOccurs="0"/&gt;
 *         &lt;element name="direction" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="length" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AugmentedRay", propOrder = {
    "rotationCRS",
    "direction",
    "length"
})
public class AugmentedRay
    extends AugmentedLineOrArea
{

    @XmlSchemaType(name = "string")
    protected CRSType rotationCRS;
    protected double direction;
    protected double length;

    /**
     * Gets the value of the rotationCRS property.
     * 
     * @return
     *     possible object is
     *     {@link CRSType }
     *     
     */
    public CRSType getRotationCRS() {
        return rotationCRS;
    }

    /**
     * Sets the value of the rotationCRS property.
     * 
     * @param value
     *     allowed object is
     *     {@link CRSType }
     *     
     */
    public void setRotationCRS(CRSType value) {
        this.rotationCRS = value;
    }

    /**
     * Gets the value of the direction property.
     * 
     */
    public double getDirection() {
        return direction;
    }

    /**
     * Sets the value of the direction property.
     * 
     */
    public void setDirection(double value) {
        this.direction = value;
    }

    /**
     * Gets the value of the length property.
     * 
     */
    public double getLength() {
        return length;
    }

    /**
     * Sets the value of the length property.
     * 
     */
    public void setLength(double value) {
        this.length = value;
    }

}