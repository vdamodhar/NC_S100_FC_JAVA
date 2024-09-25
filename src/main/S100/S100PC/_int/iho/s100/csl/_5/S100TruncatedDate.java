//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.09.25 at 04:23:30 PM PDT 
//


package _int.iho.s100.csl._5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * built in date types from W3C XML schema, implementing S-100 truncated date
 * 
 * <p>Java class for S100_TruncatedDate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="S100_TruncatedDate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="gDay" type="{http://www.w3.org/2001/XMLSchema}gDay"/&gt;
 *         &lt;element name="gMonth" type="{http://www.w3.org/2001/XMLSchema}gMonth"/&gt;
 *         &lt;element name="gYear" type="{http://www.w3.org/2001/XMLSchema}gYear"/&gt;
 *         &lt;element name="gMonthDay" type="{http://www.w3.org/2001/XMLSchema}gMonthDay"/&gt;
 *         &lt;element name="gYearMonth" type="{http://www.w3.org/2001/XMLSchema}gYearMonth"/&gt;
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "S100_TruncatedDate", propOrder = {
    "gDay",
    "gMonth",
    "gYear",
    "gMonthDay",
    "gYearMonth",
    "date"
})
public class S100TruncatedDate {

    @XmlSchemaType(name = "gDay")
    protected XMLGregorianCalendar gDay;
    @XmlSchemaType(name = "gMonth")
    protected XMLGregorianCalendar gMonth;
    @XmlSchemaType(name = "gYear")
    protected XMLGregorianCalendar gYear;
    @XmlSchemaType(name = "gMonthDay")
    protected XMLGregorianCalendar gMonthDay;
    @XmlSchemaType(name = "gYearMonth")
    protected XMLGregorianCalendar gYearMonth;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar date;

    /**
     * Gets the value of the gDay property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGDay() {
        return gDay;
    }

    /**
     * Sets the value of the gDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGDay(XMLGregorianCalendar value) {
        this.gDay = value;
    }

    /**
     * Gets the value of the gMonth property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGMonth() {
        return gMonth;
    }

    /**
     * Sets the value of the gMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGMonth(XMLGregorianCalendar value) {
        this.gMonth = value;
    }

    /**
     * Gets the value of the gYear property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGYear() {
        return gYear;
    }

    /**
     * Sets the value of the gYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGYear(XMLGregorianCalendar value) {
        this.gYear = value;
    }

    /**
     * Gets the value of the gMonthDay property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGMonthDay() {
        return gMonthDay;
    }

    /**
     * Sets the value of the gMonthDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGMonthDay(XMLGregorianCalendar value) {
        this.gMonthDay = value;
    }

    /**
     * Gets the value of the gYearMonth property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGYearMonth() {
        return gYearMonth;
    }

    /**
     * Sets the value of the gYearMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGYearMonth(XMLGregorianCalendar value) {
        this.gYearMonth = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

}