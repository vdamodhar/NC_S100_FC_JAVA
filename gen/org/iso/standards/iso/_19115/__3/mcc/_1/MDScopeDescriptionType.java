//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.09.24 at 01:32:05 PM PDT 
//


package org.iso.standards.iso._19115.__3.mcc._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.iso.standards.iso._19115.__3.gco._1.AbstractObjectType;
import org.iso.standards.iso._19115.__3.gco._1.CharacterStringPropertyType;


/**
 * <p>Java class for MD_ScopeDescription_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MD_ScopeDescription_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://standards.iso.org/iso/19115/-3/gco/1.0}AbstractObject_Type">
 *       &lt;choice>
 *         &lt;element name="attributes" type="{http://standards.iso.org/iso/19115/-3/gco/1.0}CharacterString_PropertyType"/>
 *         &lt;element name="features" type="{http://standards.iso.org/iso/19115/-3/gco/1.0}CharacterString_PropertyType"/>
 *         &lt;element name="featureInstances" type="{http://standards.iso.org/iso/19115/-3/gco/1.0}CharacterString_PropertyType"/>
 *         &lt;element name="attributeInstances" type="{http://standards.iso.org/iso/19115/-3/gco/1.0}CharacterString_PropertyType"/>
 *         &lt;element name="dataset" type="{http://standards.iso.org/iso/19115/-3/gco/1.0}CharacterString_PropertyType"/>
 *         &lt;element name="other" type="{http://standards.iso.org/iso/19115/-3/gco/1.0}CharacterString_PropertyType"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MD_ScopeDescription_Type", propOrder = {
    "attributes",
    "features",
    "featureInstances",
    "attributeInstances",
    "dataset",
    "other"
})
public class MDScopeDescriptionType
    extends AbstractObjectType
{

    protected CharacterStringPropertyType attributes;
    protected CharacterStringPropertyType features;
    protected CharacterStringPropertyType featureInstances;
    protected CharacterStringPropertyType attributeInstances;
    protected CharacterStringPropertyType dataset;
    protected CharacterStringPropertyType other;

    /**
     * Gets the value of the attributes property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getAttributes() {
        return attributes;
    }

    /**
     * Sets the value of the attributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setAttributes(CharacterStringPropertyType value) {
        this.attributes = value;
    }

    /**
     * Gets the value of the features property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getFeatures() {
        return features;
    }

    /**
     * Sets the value of the features property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setFeatures(CharacterStringPropertyType value) {
        this.features = value;
    }

    /**
     * Gets the value of the featureInstances property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getFeatureInstances() {
        return featureInstances;
    }

    /**
     * Sets the value of the featureInstances property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setFeatureInstances(CharacterStringPropertyType value) {
        this.featureInstances = value;
    }

    /**
     * Gets the value of the attributeInstances property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getAttributeInstances() {
        return attributeInstances;
    }

    /**
     * Sets the value of the attributeInstances property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setAttributeInstances(CharacterStringPropertyType value) {
        this.attributeInstances = value;
    }

    /**
     * Gets the value of the dataset property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getDataset() {
        return dataset;
    }

    /**
     * Sets the value of the dataset property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setDataset(CharacterStringPropertyType value) {
        this.dataset = value;
    }

    /**
     * Gets the value of the other property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getOther() {
        return other;
    }

    /**
     * Sets the value of the other property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setOther(CharacterStringPropertyType value) {
        this.other = value;
    }

}