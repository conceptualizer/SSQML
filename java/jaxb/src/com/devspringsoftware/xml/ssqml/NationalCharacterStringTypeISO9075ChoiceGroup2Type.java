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
 * <p>Java class for NationalCharacterStringType_ISO9075ChoiceGroup2Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NationalCharacterStringType_ISO9075ChoiceGroup2Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}NationalCharStaticString"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}LeftParen" minOccurs="0"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}Length" minOccurs="0"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}RightParen" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NationalCharacterStringType_ISO9075ChoiceGroup2Type", propOrder = {
    "nationalCharStaticString",
    "leftParen",
    "length",
    "rightParen"
})
public class NationalCharacterStringTypeISO9075ChoiceGroup2Type {

    @XmlElement(name = "NationalCharStaticString", required = true)
    protected NationalCharStaticStringType nationalCharStaticString;
    @XmlElement(name = "LeftParen")
    protected String leftParen;
    @XmlElement(name = "Length")
    protected String length;
    @XmlElement(name = "RightParen")
    protected String rightParen;

    /**
     * Gets the value of the nationalCharStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link NationalCharStaticStringType }
     *     
     */
    public NationalCharStaticStringType getNationalCharStaticString() {
        return nationalCharStaticString;
    }

    /**
     * Sets the value of the nationalCharStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link NationalCharStaticStringType }
     *     
     */
    public void setNationalCharStaticString(NationalCharStaticStringType value) {
        this.nationalCharStaticString = value;
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
