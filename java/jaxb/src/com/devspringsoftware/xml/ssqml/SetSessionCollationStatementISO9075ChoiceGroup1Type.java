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
 * <p>Java class for SetSessionCollationStatement_ISO9075ChoiceGroup1Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SetSessionCollationStatement_ISO9075ChoiceGroup1Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}SetCollationStaticString"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}CollationSpecification"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}ForStaticString" minOccurs="0"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}CharacterSetSpecificationList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetSessionCollationStatement_ISO9075ChoiceGroup1Type", propOrder = {
    "setCollationStaticString",
    "collationSpecification",
    "forStaticString",
    "characterSetSpecificationList"
})
public class SetSessionCollationStatementISO9075ChoiceGroup1Type {

    @XmlElement(name = "SetCollationStaticString", required = true)
    protected SetCollationStaticStringType setCollationStaticString;
    @XmlElement(name = "CollationSpecification", required = true)
    protected ValueSpecificationType collationSpecification;
    @XmlElement(name = "ForStaticString")
    protected ForStaticStringType forStaticString;
    @XmlElement(name = "CharacterSetSpecificationList")
    protected CharacterSetSpecificationListType characterSetSpecificationList;

    /**
     * Gets the value of the setCollationStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link SetCollationStaticStringType }
     *     
     */
    public SetCollationStaticStringType getSetCollationStaticString() {
        return setCollationStaticString;
    }

    /**
     * Sets the value of the setCollationStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link SetCollationStaticStringType }
     *     
     */
    public void setSetCollationStaticString(SetCollationStaticStringType value) {
        this.setCollationStaticString = value;
    }

    /**
     * Gets the value of the collationSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link ValueSpecificationType }
     *     
     */
    public ValueSpecificationType getCollationSpecification() {
        return collationSpecification;
    }

    /**
     * Sets the value of the collationSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueSpecificationType }
     *     
     */
    public void setCollationSpecification(ValueSpecificationType value) {
        this.collationSpecification = value;
    }

    /**
     * Gets the value of the forStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link ForStaticStringType }
     *     
     */
    public ForStaticStringType getForStaticString() {
        return forStaticString;
    }

    /**
     * Sets the value of the forStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForStaticStringType }
     *     
     */
    public void setForStaticString(ForStaticStringType value) {
        this.forStaticString = value;
    }

    /**
     * Gets the value of the characterSetSpecificationList property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterSetSpecificationListType }
     *     
     */
    public CharacterSetSpecificationListType getCharacterSetSpecificationList() {
        return characterSetSpecificationList;
    }

    /**
     * Sets the value of the characterSetSpecificationList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterSetSpecificationListType }
     *     
     */
    public void setCharacterSetSpecificationList(CharacterSetSpecificationListType value) {
        this.characterSetSpecificationList = value;
    }

}