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
 * Pattern fill where the pattern is defined by repeated symbols
 * 
 * <p>Java class for SymbolFill complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SymbolFill"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.iho.int/S100SymbolDefinition/5.2}PatternFill"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="symbol" type="{http://www.iho.int/S100SymbolDefinition/5.2}Symbol"/&gt;
 *         &lt;element name="v1" type="{http://www.iho.int/S100SymbolDefinition/5.2}Vector"/&gt;
 *         &lt;element name="v2" type="{http://www.iho.int/S100SymbolDefinition/5.2}Vector"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="clipSymbols" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SymbolFill", propOrder = {
    "symbol",
    "v1",
    "v2"
})
public class SymbolFill
    extends PatternFill
{

    @XmlElement(required = true)
    protected Symbol symbol;
    @XmlElement(required = true)
    protected Vector v1;
    @XmlElement(required = true)
    protected Vector v2;
    @XmlAttribute(name = "clipSymbols")
    protected Boolean clipSymbols;

    /**
     * Gets the value of the symbol property.
     * 
     * @return
     *     possible object is
     *     {@link Symbol }
     *     
     */
    public Symbol getSymbol() {
        return symbol;
    }

    /**
     * Sets the value of the symbol property.
     * 
     * @param value
     *     allowed object is
     *     {@link Symbol }
     *     
     */
    public void setSymbol(Symbol value) {
        this.symbol = value;
    }

    /**
     * Gets the value of the v1 property.
     * 
     * @return
     *     possible object is
     *     {@link Vector }
     *     
     */
    public Vector getV1() {
        return v1;
    }

    /**
     * Sets the value of the v1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Vector }
     *     
     */
    public void setV1(Vector value) {
        this.v1 = value;
    }

    /**
     * Gets the value of the v2 property.
     * 
     * @return
     *     possible object is
     *     {@link Vector }
     *     
     */
    public Vector getV2() {
        return v2;
    }

    /**
     * Sets the value of the v2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Vector }
     *     
     */
    public void setV2(Vector value) {
        this.v2 = value;
    }

    /**
     * Gets the value of the clipSymbols property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isClipSymbols() {
        if (clipSymbols == null) {
            return true;
        } else {
            return clipSymbols;
        }
    }

    /**
     * Sets the value of the clipSymbols property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setClipSymbols(Boolean value) {
        this.clipSymbols = value;
    }

}