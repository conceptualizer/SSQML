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
 * <p>Java class for SetSessionCollationStatement_ISO9075ChoiceGroup2Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SetSessionCollationStatement_ISO9075ChoiceGroup2Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}SetNoCollationStaticString"/>
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
@XmlType(name = "SetSessionCollationStatement_ISO9075ChoiceGroup2Type", propOrder = {
    "setNoCollationStaticString",
    "forStaticString",
    "characterSetSpecificationList"
})
public class SetSessionCollationStatementISO9075ChoiceGroup2Type {

    @XmlElement(name = "SetNoCollationStaticString", required = true)
    protected SetNoCollationStaticStringType setNoCollationStaticString;
    @XmlElement(name = "ForStaticString")
    protected ForStaticStringType forStaticString;
    @XmlElement(name = "CharacterSetSpecificationList")
    protected CharacterSetSpecificationListType characterSetSpecificationList;

    /**
     * Gets the value of the setNoCollationStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link SetNoCollationStaticStringType }
     *     
     */
    public SetNoCollationStaticStringType getSetNoCollationStaticString() {
        return setNoCollationStaticString;
    }

    /**
     * Sets the value of the setNoCollationStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link SetNoCollationStaticStringType }
     *     
     */
    public void setSetNoCollationStaticString(SetNoCollationStaticStringType value) {
        this.setNoCollationStaticString = value;
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
