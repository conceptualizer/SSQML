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
 * <p>Java class for NationalCharacterStringType_ISO9075ChoiceGroup4Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NationalCharacterStringType_ISO9075ChoiceGroup4Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}NationalCharacterVaryingStaticString"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}LeftParen"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}Length"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}RightParen"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NationalCharacterStringType_ISO9075ChoiceGroup4Type", propOrder = {
    "nationalCharacterVaryingStaticString",
    "leftParen",
    "length",
    "rightParen"
})
public class NationalCharacterStringTypeISO9075ChoiceGroup4Type {

    @XmlElement(name = "NationalCharacterVaryingStaticString", required = true)
    protected NationalCharacterVaryingStaticStringType nationalCharacterVaryingStaticString;
    @XmlElement(name = "LeftParen", required = true)
    protected String leftParen;
    @XmlElement(name = "Length", required = true)
    protected String length;
    @XmlElement(name = "RightParen", required = true)
    protected String rightParen;

    /**
     * Gets the value of the nationalCharacterVaryingStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link NationalCharacterVaryingStaticStringType }
     *     
     */
    public NationalCharacterVaryingStaticStringType getNationalCharacterVaryingStaticString() {
        return nationalCharacterVaryingStaticString;
    }

    /**
     * Sets the value of the nationalCharacterVaryingStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link NationalCharacterVaryingStaticStringType }
     *     
     */
    public void setNationalCharacterVaryingStaticString(NationalCharacterVaryingStaticStringType value) {
        this.nationalCharacterVaryingStaticString = value;
    }

    /**
     * Gets the value of the leftParen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeftParen() {
        return leftParen;
    }

    /**
     * Sets the value of the leftParen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeftParen(String value) {
        this.leftParen = value;
    }

    /**
     * Gets the value of the length property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLength() {
        return length;
    }

    /**
     * Sets the value of the length property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLength(String value) {
        this.length = value;
    }

    /**
     * Gets the value of the rightParen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRightParen() {
        return rightParen;
    }

    /**
     * Sets the value of the rightParen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRightParen(String value) {
        this.rightParen = value;
    }

}