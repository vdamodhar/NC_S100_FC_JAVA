//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.09.24 at 02:21:01 PM PDT 
//


package _int.iho.s100.se._5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * Property type for S100_SE_DigitalSignatureReference
 * 
 * <p>Java class for S100_SE_DigitalSignatureReference_PropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="S100_SE_DigitalSignatureReference_PropertyType"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.iho.int/s100/se/5.2&gt;S100_SE_DigitalSignatureReference"&gt;
 *       &lt;attribute ref="{http://standards.iso.org/iso/19115/-3/gco/1.0}nilReason"/&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "S100_SE_DigitalSignatureReference_PropertyType", propOrder = {
    "value"
})
public class S100SEDigitalSignatureReferencePropertyType {

    @XmlValue
    protected S100SEDigitalSignatureReference value;
    @XmlAttribute(name = "nilReason", namespace = "http://standards.iso.org/iso/19115/-3/gco/1.0")
    protected List<String> nilReason;

    /**
     * Only DSA is currently used in implementations of S-100 for file based transfer of data to ECDIS. Other values are included for interoperability with other implementations by external standards. See clause 15-8.4
     * 
     * @return
     *     possible object is
     *     {@link S100SEDigitalSignatureReference }
     *     
     */
    public S100SEDigitalSignatureReference getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link S100SEDigitalSignatureReference }
     *     
     */
    public void setValue(S100SEDigitalSignatureReference value) {
        this.value = value;
    }

    /**
     * Gets the value of the nilReason property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nilReason property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNilReason().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNilReason() {
        if (nilReason == null) {
            nilReason = new ArrayList<String>();
        }
        return this.nilReason;
    }

}