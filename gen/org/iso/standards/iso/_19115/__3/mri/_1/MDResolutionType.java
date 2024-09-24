//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.09.24 at 01:32:05 PM PDT 
//


package org.iso.standards.iso._19115.__3.mri._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.iso.standards.iso._19115.__3.gco._1.AnglePropertyType;
import org.iso.standards.iso._19115.__3.gco._1.CharacterStringPropertyType;
import org.iso.standards.iso._19115.__3.gco._1.DistancePropertyType;
import org.iso.standards.iso._19115.__3.mcc._1.AbstractSpatialResolutionType;


/**
 * <p>Java class for MD_Resolution_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MD_Resolution_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://standards.iso.org/iso/19115/-3/mcc/1.0}Abstract_SpatialResolution_Type">
 *       &lt;choice>
 *         &lt;element name="equivalentScale" type="{http://standards.iso.org/iso/19115/-3/mri/1.0}MD_RepresentativeFraction_PropertyType"/>
 *         &lt;element name="distance" type="{http://standards.iso.org/iso/19115/-3/gco/1.0}Distance_PropertyType"/>
 *         &lt;element name="vertical" type="{http://standards.iso.org/iso/19115/-3/gco/1.0}Distance_PropertyType"/>
 *         &lt;element name="angularDistance" type="{http://standards.iso.org/iso/19115/-3/gco/1.0}Angle_PropertyType"/>
 *         &lt;element name="levelOfDetail" type="{http://standards.iso.org/iso/19115/-3/gco/1.0}CharacterString_PropertyType"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MD_Resolution_Type", propOrder = {
    "equivalentScale",
    "distance",
    "vertical",
    "angularDistance",
    "levelOfDetail"
})
public class MDResolutionType
    extends AbstractSpatialResolutionType
{

    protected MDRepresentativeFractionPropertyType equivalentScale;
    protected DistancePropertyType distance;
    protected DistancePropertyType vertical;
    protected AnglePropertyType angularDistance;
    protected CharacterStringPropertyType levelOfDetail;

    /**
     * Gets the value of the equivalentScale property.
     * 
     * @return
     *     possible object is
     *     {@link MDRepresentativeFractionPropertyType }
     *     
     */
    public MDRepresentativeFractionPropertyType getEquivalentScale() {
        return equivalentScale;
    }

    /**
     * Sets the value of the equivalentScale property.
     * 
     * @param value
     *     allowed object is
     *     {@link MDRepresentativeFractionPropertyType }
     *     
     */
    public void setEquivalentScale(MDRepresentativeFractionPropertyType value) {
        this.equivalentScale = value;
    }

    /**
     * Gets the value of the distance property.
     * 
     * @return
     *     possible object is
     *     {@link DistancePropertyType }
     *     
     */
    public DistancePropertyType getDistance() {
        return distance;
    }

    /**
     * Sets the value of the distance property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistancePropertyType }
     *     
     */
    public void setDistance(DistancePropertyType value) {
        this.distance = value;
    }

    /**
     * Gets the value of the vertical property.
     * 
     * @return
     *     possible object is
     *     {@link DistancePropertyType }
     *     
     */
    public DistancePropertyType getVertical() {
        return vertical;
    }

    /**
     * Sets the value of the vertical property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistancePropertyType }
     *     
     */
    public void setVertical(DistancePropertyType value) {
        this.vertical = value;
    }

    /**
     * Gets the value of the angularDistance property.
     * 
     * @return
     *     possible object is
     *     {@link AnglePropertyType }
     *     
     */
    public AnglePropertyType getAngularDistance() {
        return angularDistance;
    }

    /**
     * Sets the value of the angularDistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnglePropertyType }
     *     
     */
    public void setAngularDistance(AnglePropertyType value) {
        this.angularDistance = value;
    }

    /**
     * Gets the value of the levelOfDetail property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getLevelOfDetail() {
        return levelOfDetail;
    }

    /**
     * Sets the value of the levelOfDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setLevelOfDetail(CharacterStringPropertyType value) {
        this.levelOfDetail = value;
    }

}