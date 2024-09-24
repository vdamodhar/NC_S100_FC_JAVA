//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.09.24 at 01:32:05 PM PDT 
//


package _int.iho.s100.se._5;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DataStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DataStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="unencrypted"/>
 *     &lt;enumeration value="compressed"/>
 *     &lt;enumeration value="encrypted"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DataStatus")
@XmlEnum
public enum DataStatus {


    /**
     * The data is unencrypted and uncompressed
     * 
     */
    @XmlEnumValue("unencrypted")
    UNENCRYPTED("unencrypted"),

    /**
     * The data is compressed only
     * 
     */
    @XmlEnumValue("compressed")
    COMPRESSED("compressed"),

    /**
     * The data is compressed and encrypted
     * 
     */
    @XmlEnumValue("encrypted")
    ENCRYPTED("encrypted");
    private final String value;

    DataStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DataStatus fromValue(String v) {
        for (DataStatus c: DataStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}