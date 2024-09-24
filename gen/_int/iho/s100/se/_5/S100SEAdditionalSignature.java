//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.09.24 at 01:32:05 PM PDT 
//


package _int.iho.s100.se._5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Elements of this type can be used within the dataset discovery metadata elements of an exchanges set catalogue.
 * 
 * <p>Java class for S100_SE_AdditionalSignature complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="S100_SE_AdditionalSignature">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="signatureOnSignature" type="{http://www.iho.int/s100/se/5.2}S100_SE_SignatureOnSignature"/>
 *         &lt;element name="signatureOnData" type="{http://www.iho.int/s100/se/5.2}S100_SE_SignatureOnData"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "S100_SE_AdditionalSignature", propOrder = {
    "signatureOnSignature",
    "signatureOnData"
})
public class S100SEAdditionalSignature {

    protected S100SESignatureOnSignature signatureOnSignature;
    protected S100SESignatureOnData signatureOnData;

    /**
     * Gets the value of the signatureOnSignature property.
     * 
     * @return
     *     possible object is
     *     {@link S100SESignatureOnSignature }
     *     
     */
    public S100SESignatureOnSignature getSignatureOnSignature() {
        return signatureOnSignature;
    }

    /**
     * Sets the value of the signatureOnSignature property.
     * 
     * @param value
     *     allowed object is
     *     {@link S100SESignatureOnSignature }
     *     
     */
    public void setSignatureOnSignature(S100SESignatureOnSignature value) {
        this.signatureOnSignature = value;
    }

    /**
     * Gets the value of the signatureOnData property.
     * 
     * @return
     *     possible object is
     *     {@link S100SESignatureOnData }
     *     
     */
    public S100SESignatureOnData getSignatureOnData() {
        return signatureOnData;
    }

    /**
     * Sets the value of the signatureOnData property.
     * 
     * @param value
     *     allowed object is
     *     {@link S100SESignatureOnData }
     *     
     */
    public void setSignatureOnData(S100SESignatureOnData value) {
        this.signatureOnData = value;
    }

}