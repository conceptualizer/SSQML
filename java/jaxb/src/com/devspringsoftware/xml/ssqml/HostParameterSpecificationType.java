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
 * <p>Java class for HostParameterSpecificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HostParameterSpecificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}HostParameterName"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}IndicatorParameter" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostParameterSpecificationType", propOrder = {
    "hostParameterName",
    "indicatorParameter"
})
public class HostParameterSpecificationType {

    @XmlElement(name = "HostParameterName", required = true)
    protected HostParameterNameType hostParameterName;
    @XmlElement(name = "IndicatorParameter")
    protected IndicatorParameterType indicatorParameter;

    /**
     * Gets the value of the hostParameterName property.
     * 
     * @return
     *     possible object is
     *     {@link HostParameterNameType }
     *     
     */
    public HostParameterNameType getHostParameterName() {
        return hostParameterName;
    }

    /**
     * Sets the value of the hostParameterName property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostParameterNameType }
     *     
     */
    public void setHostParameterName(HostParameterNameType value) {
        this.hostParameterName = value;
    }

    /**
     * Gets the value of the indicatorParameter property.
     * 
     * @return
     *     possible object is
     *     {@link IndicatorParameterType }
     *     
     */
    public IndicatorParameterType getIndicatorParameter() {
        return indicatorParameter;
    }

    /**
     * Sets the value of the indicatorParameter property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndicatorParameterType }
     *     
     */
    public void setIndicatorParameter(IndicatorParameterType value) {
        this.indicatorParameter = value;
    }

}
