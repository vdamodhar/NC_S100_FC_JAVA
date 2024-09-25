//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.7 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.09.25 at 04:23:30 PM PDT 
//


package _int.iho.s100presentation._5;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import _int.iho.s100symboldefinition._5.AreaFillReference;
import _int.iho.s100symboldefinition._5.ColorFill;
import _int.iho.s100symboldefinition._5.HatchFill;
import _int.iho.s100symboldefinition._5.PixmapFill;
import _int.iho.s100symboldefinition._5.SymbolFill;


/**
 * A drawing instruction for an area. It can be used
 * 			for drawing line styles, area fills, or area texts. The
 * 			used path must be closed
 * 
 * <p>Java class for AugmentedArea complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AugmentedArea"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.iho.int/S100Presentation/5.2}AugmentedPath"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.iho.int/S100SymbolDefinition/5.2}AreaFillGroup" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AugmentedArea", propOrder = {
    "colorFill",
    "areaFillReference",
    "pixmapFill",
    "symbolFill",
    "hatchFill"
})
public class AugmentedArea
    extends AugmentedPath
{

    protected ColorFill colorFill;
    protected AreaFillReference areaFillReference;
    protected PixmapFill pixmapFill;
    protected SymbolFill symbolFill;
    protected HatchFill hatchFill;

    /**
     * Gets the value of the colorFill property.
     * 
     * @return
     *     possible object is
     *     {@link ColorFill }
     *     
     */
    public ColorFill getColorFill() {
        return colorFill;
    }

    /**
     * Sets the value of the colorFill property.
     * 
     * @param value
     *     allowed object is
     *     {@link ColorFill }
     *     
     */
    public void setColorFill(ColorFill value) {
        this.colorFill = value;
    }

    /**
     * Gets the value of the areaFillReference property.
     * 
     * @return
     *     possible object is
     *     {@link AreaFillReference }
     *     
     */
    public AreaFillReference getAreaFillReference() {
        return areaFillReference;
    }

    /**
     * Sets the value of the areaFillReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link AreaFillReference }
     *     
     */
    public void setAreaFillReference(AreaFillReference value) {
        this.areaFillReference = value;
    }

    /**
     * Gets the value of the pixmapFill property.
     * 
     * @return
     *     possible object is
     *     {@link PixmapFill }
     *     
     */
    public PixmapFill getPixmapFill() {
        return pixmapFill;
    }

    /**
     * Sets the value of the pixmapFill property.
     * 
     * @param value
     *     allowed object is
     *     {@link PixmapFill }
     *     
     */
    public void setPixmapFill(PixmapFill value) {
        this.pixmapFill = value;
    }

    /**
     * Gets the value of the symbolFill property.
     * 
     * @return
     *     possible object is
     *     {@link SymbolFill }
     *     
     */
    public SymbolFill getSymbolFill() {
        return symbolFill;
    }

    /**
     * Sets the value of the symbolFill property.
     * 
     * @param value
     *     allowed object is
     *     {@link SymbolFill }
     *     
     */
    public void setSymbolFill(SymbolFill value) {
        this.symbolFill = value;
    }

    /**
     * Gets the value of the hatchFill property.
     * 
     * @return
     *     possible object is
     *     {@link HatchFill }
     *     
     */
    public HatchFill getHatchFill() {
        return hatchFill;
    }

    /**
     * Sets the value of the hatchFill property.
     * 
     * @param value
     *     allowed object is
     *     {@link HatchFill }
     *     
     */
    public void setHatchFill(HatchFill value) {
        this.hatchFill = value;
    }

}