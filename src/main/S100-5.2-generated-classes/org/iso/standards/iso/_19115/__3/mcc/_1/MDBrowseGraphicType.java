//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.09.24 at 02:21:01 PM PDT 
//


package org.iso.standards.iso._19115.__3.mcc._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.iso.standards.iso._19115.__3.gco._1.AbstractObjectType;
import org.iso.standards.iso._19115.__3.gco._1.CharacterStringPropertyType;


/**
 * <p>Java class for MD_BrowseGraphic_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MD_BrowseGraphic_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://standards.iso.org/iso/19115/-3/gco/1.0}AbstractObject_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="fileName" type="{http://standards.iso.org/iso/19115/-3/gco/1.0}CharacterString_PropertyType"/&gt;
 *         &lt;element name="fileDescription" type="{http://standards.iso.org/iso/19115/-3/gco/1.0}CharacterString_PropertyType" minOccurs="0"/&gt;
 *         &lt;element name="fileType" type="{http://standards.iso.org/iso/19115/-3/gco/1.0}CharacterString_PropertyType" minOccurs="0"/&gt;
 *         &lt;element name="imageConstraints" type="{http://standards.iso.org/iso/19115/-3/mcc/1.0}Abstract_Constraints_PropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="linkage" type="{http://standards.iso.org/iso/19115/-3/mcc/1.0}Abstract_OnlineResource_PropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MD_BrowseGraphic_Type", propOrder = {
    "fileName",
    "fileDescription",
    "fileType",
    "imageConstraints",
    "linkage"
})
public class MDBrowseGraphicType
    extends AbstractObjectType
{

    @XmlElement(required = true)
    protected CharacterStringPropertyType fileName;
    protected CharacterStringPropertyType fileDescription;
    protected CharacterStringPropertyType fileType;
    protected List<AbstractConstraintsPropertyType> imageConstraints;
    protected List<AbstractOnlineResourcePropertyType> linkage;

    /**
     * Gets the value of the fileName property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getFileName() {
        return fileName;
    }

    /**
     * Sets the value of the fileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setFileName(CharacterStringPropertyType value) {
        this.fileName = value;
    }

    /**
     * Gets the value of the fileDescription property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getFileDescription() {
        return fileDescription;
    }

    /**
     * Sets the value of the fileDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setFileDescription(CharacterStringPropertyType value) {
        this.fileDescription = value;
    }

    /**
     * Gets the value of the fileType property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getFileType() {
        return fileType;
    }

    /**
     * Sets the value of the fileType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setFileType(CharacterStringPropertyType value) {
        this.fileType = value;
    }

    /**
     * Gets the value of the imageConstraints property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the imageConstraints property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImageConstraints().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbstractConstraintsPropertyType }
     * 
     * 
     */
    public List<AbstractConstraintsPropertyType> getImageConstraints() {
        if (imageConstraints == null) {
            imageConstraints = new ArrayList<AbstractConstraintsPropertyType>();
        }
        return this.imageConstraints;
    }

    /**
     * Gets the value of the linkage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the linkage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLinkage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbstractOnlineResourcePropertyType }
     * 
     * 
     */
    public List<AbstractOnlineResourcePropertyType> getLinkage() {
        if (linkage == null) {
            linkage = new ArrayList<AbstractOnlineResourcePropertyType>();
        }
        return this.linkage;
    }

}