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
 * <p>Java class for IntervalTypeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IntervalTypeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}IntervalStaticString"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}IntervalQualifier"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntervalTypeType", propOrder = {
    "intervalStaticString",
    "intervalQualifier"
})
public class IntervalTypeType {

    @XmlElement(name = "IntervalStaticString", required = true)
    protected IntervalStaticStringType intervalStaticString;
    @XmlElement(name = "IntervalQualifier", required = true)
    protected IntervalQualifierType intervalQualifier;

    /**
     * Gets the value of the intervalStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link IntervalStaticStringType }
     *     
     */
    public IntervalStaticStringType getIntervalStaticString() {
        return intervalStaticString;
    }

    /**
     * Sets the value of the intervalStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntervalStaticStringType }
     *     
     */
    public void setIntervalStaticString(IntervalStaticStringType value) {
        this.intervalStaticString = value;
    }

    /**
     * Gets the value of the intervalQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link IntervalQualifierType }
     *     
     */
    public IntervalQualifierType getIntervalQualifier() {
        return intervalQualifier;
    }

    /**
     * Sets the value of the intervalQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntervalQualifierType }
     *     
     */
    public void setIntervalQualifier(IntervalQualifierType value) {
        this.intervalQualifier = value;
    }

}
