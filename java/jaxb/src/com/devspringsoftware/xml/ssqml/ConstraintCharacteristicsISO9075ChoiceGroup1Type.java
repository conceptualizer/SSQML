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
 * <p>Java class for ConstraintCharacteristics_ISO9075ChoiceGroup1Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConstraintCharacteristics_ISO9075ChoiceGroup1Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}ConstraintCheckTime"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}ConstraintCharacteristics_ISO9075ChoiceGroup3" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConstraintCharacteristics_ISO9075ChoiceGroup1Type", propOrder = {
    "constraintCheckTime",
    "constraintCharacteristicsISO9075ChoiceGroup3"
})
public class ConstraintCharacteristicsISO9075ChoiceGroup1Type {

    @XmlElement(name = "ConstraintCheckTime", required = true)
    protected ConstraintCheckTimeType constraintCheckTime;
    @XmlElement(name = "ConstraintCharacteristics_ISO9075ChoiceGroup3")
    protected ConstraintCharacteristicsISO9075ChoiceGroup3Type constraintCharacteristicsISO9075ChoiceGroup3;

    /**
     * Gets the value of the constraintCheckTime property.
     * 
     * @return
     *     possible object is
     *     {@link ConstraintCheckTimeType }
     *     
     */
    public ConstraintCheckTimeType getConstraintCheckTime() {
        return constraintCheckTime;
    }

    /**
     * Sets the value of the constraintCheckTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConstraintCheckTimeType }
     *     
     */
    public void setConstraintCheckTime(ConstraintCheckTimeType value) {
        this.constraintCheckTime = value;
    }

    /**
     * Gets the value of the constraintCharacteristicsISO9075ChoiceGroup3 property.
     * 
     * @return
     *     possible object is
     *     {@link ConstraintCharacteristicsISO9075ChoiceGroup3Type }
     *     
     */
    public ConstraintCharacteristicsISO9075ChoiceGroup3Type getConstraintCharacteristicsISO9075ChoiceGroup3() {
        return constraintCharacteristicsISO9075ChoiceGroup3;
    }

    /**
     * Sets the value of the constraintCharacteristicsISO9075ChoiceGroup3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConstraintCharacteristicsISO9075ChoiceGroup3Type }
     *     
     */
    public void setConstraintCharacteristicsISO9075ChoiceGroup3(ConstraintCharacteristicsISO9075ChoiceGroup3Type value) {
        this.constraintCharacteristicsISO9075ChoiceGroup3 = value;
    }

}