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
 * <p>Java class for DynamicResultSetsCharacteristicType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DynamicResultSetsCharacteristicType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}DynamicResultSetsStaticString"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}MaximumDynamicResultSets"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DynamicResultSetsCharacteristicType", propOrder = {
    "dynamicResultSetsStaticString",
    "maximumDynamicResultSets"
})
public class DynamicResultSetsCharacteristicType {

    @XmlElement(name = "DynamicResultSetsStaticString", required = true)
    protected DynamicResultSetsStaticStringType dynamicResultSetsStaticString;
    @XmlElement(name = "MaximumDynamicResultSets", required = true)
    protected String maximumDynamicResultSets;

    /**
     * Gets the value of the dynamicResultSetsStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link DynamicResultSetsStaticStringType }
     *     
     */
    public DynamicResultSetsStaticStringType getDynamicResultSetsStaticString() {
        return dynamicResultSetsStaticString;
    }

    /**
     * Sets the value of the dynamicResultSetsStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link DynamicResultSetsStaticStringType }
     *     
     */
    public void setDynamicResultSetsStaticString(DynamicResultSetsStaticStringType value) {
        this.dynamicResultSetsStaticString = value;
    }

    /**
     * Gets the value of the maximumDynamicResultSets property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumDynamicResultSets() {
        return maximumDynamicResultSets;
    }

    /**
     * Sets the value of the maximumDynamicResultSets property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumDynamicResultSets(String value) {
        this.maximumDynamicResultSets = value;
    }

}