//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.03 at 08:58:47 PM EDT 
//


package com.devspringsoftware.xml.ssqml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LargeObjectLength_ISO9075ChoiceGroup2Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LargeObjectLength_ISO9075ChoiceGroup2Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}LargeObjectLengthToken"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}CharLengthUnits" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LargeObjectLength_ISO9075ChoiceGroup2Type", propOrder = {
    "largeObjectLengthToken",
    "charLengthUnits"
})
public class LargeObjectLengthISO9075ChoiceGroup2Type {

    @XmlElement(name = "LargeObjectLengthToken", required = true)
    protected LargeObjectLengthTokenType largeObjectLengthToken;
    @XmlElement(name = "CharLengthUnits")
    protected CharLengthUnitsType charLengthUnits;

    /**
     * Gets the value of the largeObjectLengthToken property.
     * 
     * @return
     *     possible object is
     *     {@link LargeObjectLengthTokenType }
     *     
     */
    public LargeObjectLengthTokenType getLargeObjectLengthToken() {
        return largeObjectLengthToken;
    }

    /**
     * Sets the value of the largeObjectLengthToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link LargeObjectLengthTokenType }
     *     
     */
    public void setLargeObjectLengthToken(LargeObjectLengthTokenType value) {
        this.largeObjectLengthToken = value;
    }

    /**
     * Gets the value of the charLengthUnits property.
     * 
     * @return
     *     possible object is
     *     {@link CharLengthUnitsType }
     *     
     */
    public CharLengthUnitsType getCharLengthUnits() {
        return charLengthUnits;
    }

    /**
     * Sets the value of the charLengthUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharLengthUnitsType }
     *     
     */
    public void setCharLengthUnits(CharLengthUnitsType value) {
        this.charLengthUnits = value;
    }

}
