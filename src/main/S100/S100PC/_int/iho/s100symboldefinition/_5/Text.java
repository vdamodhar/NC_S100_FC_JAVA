//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.09.25 at 04:23:30 PM PDT 
//


package _int.iho.s100symboldefinition._5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * The abstract base class of graphic elements for depicting text. The text is composed of elements
 * 
 * <p>Java class for Text complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Text"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="element" type="{http://www.iho.int/S100SymbolDefinition/5.2}TextElement" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="horizontalAlignment" type="{http://www.iho.int/S100SymbolDefinition/5.2}HorizontalAlignment" default="Start" /&gt;
 *       &lt;attribute name="verticalAlignment" type="{http://www.iho.int/S100SymbolDefinition/5.2}VerticalAlignment" default="Bottom" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Text", propOrder = {
    "element"
})
@XmlSeeAlso({
    TextPoint.class,
    TextLine.class
})
public abstract class Text {

    @XmlElement(required = true)
    protected List<TextElement> element;
    @XmlAttribute(name = "horizontalAlignment")
    protected HorizontalAlignment horizontalAlignment;
    @XmlAttribute(name = "verticalAlignment")
    protected VerticalAlignment verticalAlignment;

    /**
     * Gets the value of the element property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the element property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TextElement }
     * 
     * 
     */
    public List<TextElement> getElement() {
        if (element == null) {
            element = new ArrayList<TextElement>();
        }
        return this.element;
    }

    /**
     * Gets the value of the horizontalAlignment property.
     * 
     * @return
     *     possible object is
     *     {@link HorizontalAlignment }
     *     
     */
    public HorizontalAlignment getHorizontalAlignment() {
        if (horizontalAlignment == null) {
            return HorizontalAlignment.START;
        } else {
            return horizontalAlignment;
        }
    }

    /**
     * Sets the value of the horizontalAlignment property.
     * 
     * @param value
     *     allowed object is
     *     {@link HorizontalAlignment }
     *     
     */
    public void setHorizontalAlignment(HorizontalAlignment value) {
        this.horizontalAlignment = value;
    }

    /**
     * Gets the value of the verticalAlignment property.
     * 
     * @return
     *     possible object is
     *     {@link VerticalAlignment }
     *     
     */
    public VerticalAlignment getVerticalAlignment() {
        if (verticalAlignment == null) {
            return VerticalAlignment.BOTTOM;
        } else {
            return verticalAlignment;
        }
    }

    /**
     * Sets the value of the verticalAlignment property.
     * 
     * @param value
     *     allowed object is
     *     {@link VerticalAlignment }
     *     
     */
    public void setVerticalAlignment(VerticalAlignment value) {
        this.verticalAlignment = value;
    }

}