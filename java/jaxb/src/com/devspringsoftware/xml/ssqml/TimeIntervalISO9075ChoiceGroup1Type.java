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
 * <p>Java class for TimeInterval_ISO9075ChoiceGroup1Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimeInterval_ISO9075ChoiceGroup1Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}HoursValue"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}Colon" minOccurs="0"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}MinutesValue" minOccurs="0"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}Colon2" minOccurs="0"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}SecondsValue" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeInterval_ISO9075ChoiceGroup1Type", propOrder = {
    "hoursValue",
    "colon",
    "minutesValue",
    "colon2",
    "secondsValue"
})
public class TimeIntervalISO9075ChoiceGroup1Type {

    @XmlElement(name = "HoursValue", required = true)
    protected String hoursValue;
    @XmlElement(name = "Colon")
    protected String colon;
    @XmlElement(name = "MinutesValue")
    protected String minutesValue;
    @XmlElement(name = "Colon2")
    protected String colon2;
    @XmlElement(name = "SecondsValue")
    protected SecondsValueType secondsValue;

    /**
     * Gets the value of the hoursValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoursValue() {
        return hoursValue;
    }

    /**
     * Sets the value of the hoursValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoursValue(String value) {
        this.hoursValue = value;
    }

    /**
     * Gets the value of the colon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColon() {
        return colon;
    }

    /**
     * Sets the value of the colon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColon(String value) {
        this.colon = value;
    }

    /**
     * Gets the value of the minutesValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinutesValue() {
        return minutesValue;
    }

    /**
     * Sets the value of the minutesValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinutesValue(String value) {
        this.minutesValue = value;
    }

    /**
     * Gets the value of the colon2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColon2() {
        return colon2;
    }

    /**
     * Sets the value of the colon2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColon2(String value) {
        this.colon2 = value;
    }

    /**
     * Gets the value of the secondsValue property.
     * 
     * @return
     *     possible object is
     *     {@link SecondsValueType }
     *     
     */
    public SecondsValueType getSecondsValue() {
        return secondsValue;
    }

    /**
     * Sets the value of the secondsValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecondsValueType }
     *     
     */
    public void setSecondsValue(SecondsValueType value) {
        this.secondsValue = value;
    }

}
