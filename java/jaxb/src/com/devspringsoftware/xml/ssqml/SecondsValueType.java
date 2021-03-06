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
 * <p>Java class for SecondsValueType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SecondsValueType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}SecondsIntegerValue"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}Period" minOccurs="0"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}SecondsFraction" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecondsValueType", propOrder = {
    "secondsIntegerValue",
    "period",
    "secondsFraction"
})
public class SecondsValueType {

    @XmlElement(name = "SecondsIntegerValue", required = true)
    protected String secondsIntegerValue;
    @XmlElement(name = "Period")
    protected String period;
    @XmlElement(name = "SecondsFraction")
    protected String secondsFraction;

    /**
     * Gets the value of the secondsIntegerValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondsIntegerValue() {
        return secondsIntegerValue;
    }

    /**
     * Sets the value of the secondsIntegerValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondsIntegerValue(String value) {
        this.secondsIntegerValue = value;
    }

    /**
     * Gets the value of the period property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeriod() {
        return period;
    }

    /**
     * Sets the value of the period property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeriod(String value) {
        this.period = value;
    }

    /**
     * Gets the value of the secondsFraction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondsFraction() {
        return secondsFraction;
    }

    /**
     * Sets the value of the secondsFraction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondsFraction(String value) {
        this.secondsFraction = value;
    }

}
