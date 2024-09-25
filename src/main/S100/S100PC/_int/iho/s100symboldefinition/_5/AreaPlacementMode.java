//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.09.25 at 04:23:30 PM PDT 
//


package _int.iho.s100symboldefinition._5;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AreaPlacementMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="AreaPlacementMode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="VisibleParts"/&gt;
 *     &lt;enumeration value="Geographic"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AreaPlacementMode")
@XmlEnum
public enum AreaPlacementMode {


    /**
     * The symbol has to be placed at a representative position in each visible part of the surface
     * 
     */
    @XmlEnumValue("VisibleParts")
    VISIBLE_PARTS("VisibleParts"),

    /**
     * The symbol has to be placed at a representative position of the geographic object
     * 
     */
    @XmlEnumValue("Geographic")
    GEOGRAPHIC("Geographic");
    private final String value;

    AreaPlacementMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AreaPlacementMode fromValue(String v) {
        for (AreaPlacementMode c: AreaPlacementMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}