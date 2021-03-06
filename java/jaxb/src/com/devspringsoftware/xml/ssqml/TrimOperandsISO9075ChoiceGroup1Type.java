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
 * <p>Java class for TrimOperands_ISO9075ChoiceGroup1Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrimOperands_ISO9075ChoiceGroup1Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}TrimSpecification" minOccurs="0"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}TrimCharacter" minOccurs="0"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}FromStaticString"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrimOperands_ISO9075ChoiceGroup1Type", propOrder = {
    "trimSpecification",
    "trimCharacter",
    "fromStaticString"
})
public class TrimOperandsISO9075ChoiceGroup1Type {

    @XmlElement(name = "TrimSpecification")
    protected TrimSpecificationType trimSpecification;
    @XmlElement(name = "TrimCharacter")
    protected CharacterValueExpressionType trimCharacter;
    @XmlElement(name = "FromStaticString", required = true)
    protected FromStaticStringType fromStaticString;

    /**
     * Gets the value of the trimSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link TrimSpecificationType }
     *     
     */
    public TrimSpecificationType getTrimSpecification() {
        return trimSpecification;
    }

    /**
     * Sets the value of the trimSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrimSpecificationType }
     *     
     */
    public void setTrimSpecification(TrimSpecificationType value) {
        this.trimSpecification = value;
    }

    /**
     * Gets the value of the trimCharacter property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterValueExpressionType }
     *     
     */
    public CharacterValueExpressionType getTrimCharacter() {
        return trimCharacter;
    }

    /**
     * Sets the value of the trimCharacter property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterValueExpressionType }
     *     
     */
    public void setTrimCharacter(CharacterValueExpressionType value) {
        this.trimCharacter = value;
    }

    /**
     * Gets the value of the fromStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link FromStaticStringType }
     *     
     */
    public FromStaticStringType getFromStaticString() {
        return fromStaticString;
    }

    /**
     * Sets the value of the fromStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link FromStaticStringType }
     *     
     */
    public void setFromStaticString(FromStaticStringType value) {
        this.fromStaticString = value;
    }

}
