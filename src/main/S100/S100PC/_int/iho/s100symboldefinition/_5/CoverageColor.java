//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.09.25 at 04:23:30 PM PDT 
//


package _int.iho.s100symboldefinition._5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A class to fill a Coverage with colour
 * 
 * <p>Java class for CoverageColor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CoverageColor"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="startColor" type="{http://www.iho.int/S100SymbolDefinition/5.2}Color"/&gt;
 *         &lt;element name="endColor" type="{http://www.iho.int/S100SymbolDefinition/5.2}Color" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="penWidth" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CoverageColor", propOrder = {
    "startColor",
    "endColor"
})
public class CoverageColor {

    @XmlElement(required = true)
    protected Color startColor;
    protected Color endColor;
    @XmlAttribute(name = "penWidth")
    protected Double penWidth;

    /**
     * Gets the value of the startColor property.
     * 
     * @return
     *     possible object is
     *     {@link Color }
     *     
     */
    public Color getStartColor() {
        return startColor;
    }

    /**
     * Sets the value of the startColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Color }
     *     
     */
    public void setStartColor(Color value) {
        this.startColor = value;
    }

    /**
     * Gets the value of the endColor property.
     * 
     * @return
     *     possible object is
     *     {@link Color }
     *     
     */
    public Color getEndColor() {
        return endColor;
    }

    /**
     * Sets the value of the endColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link Color }
     *     
     */
    public void setEndColor(Color value) {
        this.endColor = value;
    }

    /**
     * Gets the value of the penWidth property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getPenWidth() {
        return penWidth;
    }

    /**
     * Sets the value of the penWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setPenWidth(Double value) {
        this.penWidth = value;
    }

}