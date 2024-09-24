//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.09.24 at 02:20:02 PM PDT 
//


package _int.iho.s100.se._5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The root element of the permit file.
 * 
 * <p>Java class for PermitType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PermitType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="header" type="{http://www.iho.int/s100/se/5.0}PermitHeaderType"/&gt;
 *         &lt;element name="products" type="{http://www.iho.int/s100/se/5.0}ProductsPermitType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PermitType", propOrder = {
    "header",
    "products"
})
public class PermitType {

    @XmlElement(required = true)
    protected PermitHeaderType header;
    @XmlElement(required = true)
    protected ProductsPermitType products;

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link PermitHeaderType }
     *     
     */
    public PermitHeaderType getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link PermitHeaderType }
     *     
     */
    public void setHeader(PermitHeaderType value) {
        this.header = value;
    }

    /**
     * Gets the value of the products property.
     * 
     * @return
     *     possible object is
     *     {@link ProductsPermitType }
     *     
     */
    public ProductsPermitType getProducts() {
        return products;
    }

    /**
     * Sets the value of the products property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductsPermitType }
     *     
     */
    public void setProducts(ProductsPermitType value) {
        this.products = value;
    }

}