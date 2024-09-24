//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.09.24 at 01:32:05 PM PDT 
//


package _int.iho.s100.xc._5;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for S100_SupportFileRevisionStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="S100_SupportFileRevisionStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="new"/>
 *     &lt;enumeration value="replacement"/>
 *     &lt;enumeration value="deletion"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "S100_SupportFileRevisionStatus")
@XmlEnum
public enum S100SupportFileRevisionStatus {


    /**
     * A file which is new
     * 
     */
    @XmlEnumValue("new")
    NEW("new"),

    /**
     * A file which replaces an existing file
     * 
     */
    @XmlEnumValue("replacement")
    REPLACEMENT("replacement"),

    /**
     * Deletes an existing file
     * 
     */
    @XmlEnumValue("deletion")
    DELETION("deletion");
    private final String value;

    S100SupportFileRevisionStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static S100SupportFileRevisionStatus fromValue(String v) {
        for (S100SupportFileRevisionStatus c: S100SupportFileRevisionStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}