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
 * <p>Java class for SetClause_ISO9075ChoiceGroup1Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SetClause_ISO9075ChoiceGroup1Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}SetTarget"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}EqualsOperator"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}UpdateSource"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetClause_ISO9075ChoiceGroup1Type", propOrder = {
    "setTarget",
    "equalsOperator",
    "updateSource"
})
public class SetClauseISO9075ChoiceGroup1Type {

    @XmlElement(name = "SetTarget", required = true)
    protected SetTargetType setTarget;
    @XmlElement(name = "EqualsOperator", required = true)
    protected String equalsOperator;
    @XmlElement(name = "UpdateSource", required = true)
    protected UpdateSourceType updateSource;

    /**
     * Gets the value of the setTarget property.
     * 
     * @return
     *     possible object is
     *     {@link SetTargetType }
     *     
     */
    public SetTargetType getSetTarget() {
        return setTarget;
    }

    /**
     * Sets the value of the setTarget property.
     * 
     * @param value
     *     allowed object is
     *     {@link SetTargetType }
     *     
     */
    public void setSetTarget(SetTargetType value) {
        this.setTarget = value;
    }

    /**
     * Gets the value of the equalsOperator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEqualsOperator() {
        return equalsOperator;
    }

    /**
     * Sets the value of the equalsOperator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEqualsOperator(String value) {
        this.equalsOperator = value;
    }

    /**
     * Gets the value of the updateSource property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateSourceType }
     *     
     */
    public UpdateSourceType getUpdateSource() {
        return updateSource;
    }

    /**
     * Sets the value of the updateSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateSourceType }
     *     
     */
    public void setUpdateSource(UpdateSourceType value) {
        this.updateSource = value;
    }

}