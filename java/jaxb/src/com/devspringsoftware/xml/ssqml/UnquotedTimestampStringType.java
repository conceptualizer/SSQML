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
 * <p>Java class for UnquotedTimestampStringType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnquotedTimestampStringType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}UnquotedDateString"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}Space"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}UnquotedTimeString"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnquotedTimestampStringType", propOrder = {
    "unquotedDateString",
    "space",
    "unquotedTimeString"
})
public class UnquotedTimestampStringType {

    @XmlElement(name = "UnquotedDateString", required = true)
    protected DateValueType unquotedDateString;
    @XmlElement(name = "Space", required = true)
    protected String space;
    @XmlElement(name = "UnquotedTimeString", required = true)
    protected UnquotedTimeStringType unquotedTimeString;

    /**
     * Gets the value of the unquotedDateString property.
     * 
     * @return
     *     possible object is
     *     {@link DateValueType }
     *     
     */
    public DateValueType getUnquotedDateString() {
        return unquotedDateString;
    }

    /**
     * Sets the value of the unquotedDateString property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateValueType }
     *     
     */
    public void setUnquotedDateString(DateValueType value) {
        this.unquotedDateString = value;
    }

    /**
     * Gets the value of the space property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpace() {
        return space;
    }

    /**
     * Sets the value of the space property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpace(String value) {
        this.space = value;
    }

    /**
     * Gets the value of the unquotedTimeString property.
     * 
     * @return
     *     possible object is
     *     {@link UnquotedTimeStringType }
     *     
     */
    public UnquotedTimeStringType getUnquotedTimeString() {
        return unquotedTimeString;
    }

    /**
     * Sets the value of the unquotedTimeString property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnquotedTimeStringType }
     *     
     */
    public void setUnquotedTimeString(UnquotedTimeStringType value) {
        this.unquotedTimeString = value;
    }

}