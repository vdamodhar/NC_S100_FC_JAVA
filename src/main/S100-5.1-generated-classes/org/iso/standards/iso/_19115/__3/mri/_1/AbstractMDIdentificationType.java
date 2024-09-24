//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.09.24 at 01:44:06 PM PDT 
//


package org.iso.standards.iso._19115.__3.mri._1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.iso.standards.iso._19115.__3.gco._1.CharacterStringPropertyType;
import org.iso.standards.iso._19115.__3.gco._1.TMPeriodDurationPropertyType;
import org.iso.standards.iso._19115.__3.mcc._1.AbstractCitationPropertyType;
import org.iso.standards.iso._19115.__3.mcc._1.AbstractConstraintsPropertyType;
import org.iso.standards.iso._19115.__3.mcc._1.AbstractExtentPropertyType;
import org.iso.standards.iso._19115.__3.mcc._1.AbstractFormatPropertyType;
import org.iso.standards.iso._19115.__3.mcc._1.AbstractMaintenanceInformationPropertyType;
import org.iso.standards.iso._19115.__3.mcc._1.AbstractResourceDescriptionType;
import org.iso.standards.iso._19115.__3.mcc._1.AbstractResponsibilityPropertyType;
import org.iso.standards.iso._19115.__3.mcc._1.MDBrowseGraphicPropertyType;
import org.iso.standards.iso._19115.__3.mcc._1.MDIdentifierPropertyType;
import org.iso.standards.iso._19115.__3.mcc._1.MDProgressCodePropertyType;
import org.iso.standards.iso._19115.__3.mcc._1.MDSpatialRepresentationTypeCodePropertyType;


/**
 * <p>Java class for AbstractMD_Identification_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AbstractMD_Identification_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://standards.iso.org/iso/19115/-3/mcc/1.0}Abstract_ResourceDescription_Type"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="citation" type="{http://standards.iso.org/iso/19115/-3/mcc/1.0}Abstract_Citation_PropertyType"/&gt;
 *         &lt;element name="abstract" type="{http://standards.iso.org/iso/19115/-3/gco/1.0}CharacterString_PropertyType"/&gt;
 *         &lt;element name="purpose" type="{http://standards.iso.org/iso/19115/-3/gco/1.0}CharacterString_PropertyType" minOccurs="0"/&gt;
 *         &lt;element name="credit" type="{http://standards.iso.org/iso/19115/-3/gco/1.0}CharacterString_PropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://standards.iso.org/iso/19115/-3/mcc/1.0}MD_ProgressCode_PropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="pointOfContact" type="{http://standards.iso.org/iso/19115/-3/mcc/1.0}Abstract_Responsibility_PropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="spatialRepresentationType" type="{http://standards.iso.org/iso/19115/-3/mcc/1.0}MD_SpatialRepresentationTypeCode_PropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="spatialResolution" type="{http://standards.iso.org/iso/19115/-3/mri/1.0}MD_Resolution_PropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="temporalResolution" type="{http://standards.iso.org/iso/19115/-3/gco/1.0}TM_PeriodDuration_PropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="topicCategory" type="{http://standards.iso.org/iso/19115/-3/mri/1.0}MD_TopicCategoryCode_PropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="extent" type="{http://standards.iso.org/iso/19115/-3/mcc/1.0}Abstract_Extent_PropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="additionalDocumentation" type="{http://standards.iso.org/iso/19115/-3/mcc/1.0}Abstract_Citation_PropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="processingLevel" type="{http://standards.iso.org/iso/19115/-3/mcc/1.0}MD_Identifier_PropertyType" minOccurs="0"/&gt;
 *         &lt;element name="resourceMaintenance" type="{http://standards.iso.org/iso/19115/-3/mcc/1.0}Abstract_MaintenanceInformation_PropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="graphicOverview" type="{http://standards.iso.org/iso/19115/-3/mcc/1.0}MD_BrowseGraphic_PropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="resourceFormat" type="{http://standards.iso.org/iso/19115/-3/mcc/1.0}Abstract_Format_PropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="descriptiveKeywords" type="{http://standards.iso.org/iso/19115/-3/mri/1.0}MD_Keywords_PropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="resourceSpecificUsage" type="{http://standards.iso.org/iso/19115/-3/mri/1.0}MD_Usage_PropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="resourceConstraints" type="{http://standards.iso.org/iso/19115/-3/mcc/1.0}Abstract_Constraints_PropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="associatedResource" type="{http://standards.iso.org/iso/19115/-3/mri/1.0}MD_AssociatedResource_PropertyType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbstractMD_Identification_Type", propOrder = {
    "citation",
    "_abstract",
    "purpose",
    "credit",
    "status",
    "pointOfContact",
    "spatialRepresentationType",
    "spatialResolution",
    "temporalResolution",
    "topicCategory",
    "extent",
    "additionalDocumentation",
    "processingLevel",
    "resourceMaintenance",
    "graphicOverview",
    "resourceFormat",
    "descriptiveKeywords",
    "resourceSpecificUsage",
    "resourceConstraints",
    "associatedResource"
})
@XmlSeeAlso({
    MDDataIdentificationType.class
})
public abstract class AbstractMDIdentificationType
    extends AbstractResourceDescriptionType
{

    @XmlElement(required = true)
    protected AbstractCitationPropertyType citation;
    @XmlElement(name = "abstract", required = true)
    protected CharacterStringPropertyType _abstract;
    protected CharacterStringPropertyType purpose;
    protected List<CharacterStringPropertyType> credit;
    protected List<MDProgressCodePropertyType> status;
    protected List<AbstractResponsibilityPropertyType> pointOfContact;
    protected List<MDSpatialRepresentationTypeCodePropertyType> spatialRepresentationType;
    protected List<MDResolutionPropertyType> spatialResolution;
    protected List<TMPeriodDurationPropertyType> temporalResolution;
    protected List<MDTopicCategoryCodePropertyType> topicCategory;
    protected List<AbstractExtentPropertyType> extent;
    protected List<AbstractCitationPropertyType> additionalDocumentation;
    protected MDIdentifierPropertyType processingLevel;
    protected List<AbstractMaintenanceInformationPropertyType> resourceMaintenance;
    protected List<MDBrowseGraphicPropertyType> graphicOverview;
    protected List<AbstractFormatPropertyType> resourceFormat;
    protected List<MDKeywordsPropertyType> descriptiveKeywords;
    protected List<MDUsagePropertyType> resourceSpecificUsage;
    protected List<AbstractConstraintsPropertyType> resourceConstraints;
    protected List<MDAssociatedResourcePropertyType> associatedResource;

    /**
     * Gets the value of the citation property.
     * 
     * @return
     *     possible object is
     *     {@link AbstractCitationPropertyType }
     *     
     */
    public AbstractCitationPropertyType getCitation() {
        return citation;
    }

    /**
     * Sets the value of the citation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AbstractCitationPropertyType }
     *     
     */
    public void setCitation(AbstractCitationPropertyType value) {
        this.citation = value;
    }

    /**
     * Gets the value of the abstract property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getAbstract() {
        return _abstract;
    }

    /**
     * Sets the value of the abstract property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setAbstract(CharacterStringPropertyType value) {
        this._abstract = value;
    }

    /**
     * Gets the value of the purpose property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getPurpose() {
        return purpose;
    }

    /**
     * Sets the value of the purpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setPurpose(CharacterStringPropertyType value) {
        this.purpose = value;
    }

    /**
     * Gets the value of the credit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the credit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCredit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CharacterStringPropertyType }
     * 
     * 
     */
    public List<CharacterStringPropertyType> getCredit() {
        if (credit == null) {
            credit = new ArrayList<CharacterStringPropertyType>();
        }
        return this.credit;
    }

    /**
     * Gets the value of the status property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the status property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDProgressCodePropertyType }
     * 
     * 
     */
    public List<MDProgressCodePropertyType> getStatus() {
        if (status == null) {
            status = new ArrayList<MDProgressCodePropertyType>();
        }
        return this.status;
    }

    /**
     * Gets the value of the pointOfContact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pointOfContact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPointOfContact().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbstractResponsibilityPropertyType }
     * 
     * 
     */
    public List<AbstractResponsibilityPropertyType> getPointOfContact() {
        if (pointOfContact == null) {
            pointOfContact = new ArrayList<AbstractResponsibilityPropertyType>();
        }
        return this.pointOfContact;
    }

    /**
     * Gets the value of the spatialRepresentationType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the spatialRepresentationType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpatialRepresentationType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDSpatialRepresentationTypeCodePropertyType }
     * 
     * 
     */
    public List<MDSpatialRepresentationTypeCodePropertyType> getSpatialRepresentationType() {
        if (spatialRepresentationType == null) {
            spatialRepresentationType = new ArrayList<MDSpatialRepresentationTypeCodePropertyType>();
        }
        return this.spatialRepresentationType;
    }

    /**
     * Gets the value of the spatialResolution property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the spatialResolution property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpatialResolution().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDResolutionPropertyType }
     * 
     * 
     */
    public List<MDResolutionPropertyType> getSpatialResolution() {
        if (spatialResolution == null) {
            spatialResolution = new ArrayList<MDResolutionPropertyType>();
        }
        return this.spatialResolution;
    }

    /**
     * Gets the value of the temporalResolution property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the temporalResolution property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTemporalResolution().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TMPeriodDurationPropertyType }
     * 
     * 
     */
    public List<TMPeriodDurationPropertyType> getTemporalResolution() {
        if (temporalResolution == null) {
            temporalResolution = new ArrayList<TMPeriodDurationPropertyType>();
        }
        return this.temporalResolution;
    }

    /**
     * Gets the value of the topicCategory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the topicCategory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTopicCategory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDTopicCategoryCodePropertyType }
     * 
     * 
     */
    public List<MDTopicCategoryCodePropertyType> getTopicCategory() {
        if (topicCategory == null) {
            topicCategory = new ArrayList<MDTopicCategoryCodePropertyType>();
        }
        return this.topicCategory;
    }

    /**
     * Gets the value of the extent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbstractExtentPropertyType }
     * 
     * 
     */
    public List<AbstractExtentPropertyType> getExtent() {
        if (extent == null) {
            extent = new ArrayList<AbstractExtentPropertyType>();
        }
        return this.extent;
    }

    /**
     * Gets the value of the additionalDocumentation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalDocumentation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalDocumentation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbstractCitationPropertyType }
     * 
     * 
     */
    public List<AbstractCitationPropertyType> getAdditionalDocumentation() {
        if (additionalDocumentation == null) {
            additionalDocumentation = new ArrayList<AbstractCitationPropertyType>();
        }
        return this.additionalDocumentation;
    }

    /**
     * Gets the value of the processingLevel property.
     * 
     * @return
     *     possible object is
     *     {@link MDIdentifierPropertyType }
     *     
     */
    public MDIdentifierPropertyType getProcessingLevel() {
        return processingLevel;
    }

    /**
     * Sets the value of the processingLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link MDIdentifierPropertyType }
     *     
     */
    public void setProcessingLevel(MDIdentifierPropertyType value) {
        this.processingLevel = value;
    }

    /**
     * Gets the value of the resourceMaintenance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resourceMaintenance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResourceMaintenance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbstractMaintenanceInformationPropertyType }
     * 
     * 
     */
    public List<AbstractMaintenanceInformationPropertyType> getResourceMaintenance() {
        if (resourceMaintenance == null) {
            resourceMaintenance = new ArrayList<AbstractMaintenanceInformationPropertyType>();
        }
        return this.resourceMaintenance;
    }

    /**
     * Gets the value of the graphicOverview property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the graphicOverview property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGraphicOverview().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDBrowseGraphicPropertyType }
     * 
     * 
     */
    public List<MDBrowseGraphicPropertyType> getGraphicOverview() {
        if (graphicOverview == null) {
            graphicOverview = new ArrayList<MDBrowseGraphicPropertyType>();
        }
        return this.graphicOverview;
    }

    /**
     * Gets the value of the resourceFormat property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resourceFormat property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResourceFormat().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbstractFormatPropertyType }
     * 
     * 
     */
    public List<AbstractFormatPropertyType> getResourceFormat() {
        if (resourceFormat == null) {
            resourceFormat = new ArrayList<AbstractFormatPropertyType>();
        }
        return this.resourceFormat;
    }

    /**
     * Gets the value of the descriptiveKeywords property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the descriptiveKeywords property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescriptiveKeywords().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDKeywordsPropertyType }
     * 
     * 
     */
    public List<MDKeywordsPropertyType> getDescriptiveKeywords() {
        if (descriptiveKeywords == null) {
            descriptiveKeywords = new ArrayList<MDKeywordsPropertyType>();
        }
        return this.descriptiveKeywords;
    }

    /**
     * Gets the value of the resourceSpecificUsage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resourceSpecificUsage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResourceSpecificUsage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDUsagePropertyType }
     * 
     * 
     */
    public List<MDUsagePropertyType> getResourceSpecificUsage() {
        if (resourceSpecificUsage == null) {
            resourceSpecificUsage = new ArrayList<MDUsagePropertyType>();
        }
        return this.resourceSpecificUsage;
    }

    /**
     * Gets the value of the resourceConstraints property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resourceConstraints property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResourceConstraints().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AbstractConstraintsPropertyType }
     * 
     * 
     */
    public List<AbstractConstraintsPropertyType> getResourceConstraints() {
        if (resourceConstraints == null) {
            resourceConstraints = new ArrayList<AbstractConstraintsPropertyType>();
        }
        return this.resourceConstraints;
    }

    /**
     * Gets the value of the associatedResource property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the associatedResource property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssociatedResource().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MDAssociatedResourcePropertyType }
     * 
     * 
     */
    public List<MDAssociatedResourcePropertyType> getAssociatedResource() {
        if (associatedResource == null) {
            associatedResource = new ArrayList<MDAssociatedResourcePropertyType>();
        }
        return this.associatedResource;
    }

}