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
 * <p>Java class for DynamicFetchStatement_ISO9075ChoiceGroup1Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DynamicFetchStatement_ISO9075ChoiceGroup1Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}FetchOrientation" minOccurs="0"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}FromStaticString"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DynamicFetchStatement_ISO9075ChoiceGroup1Type", propOrder = {
    "fetchOrientation",
    "fromStaticString"
})
public class DynamicFetchStatementISO9075ChoiceGroup1Type {

    @XmlElement(name = "FetchOrientation")
    protected FetchOrientationType fetchOrientation;
    @XmlElement(name = "FromStaticString", required = true)
    protected FromStaticStringType fromStaticString;

    /**
     * Gets the value of the fetchOrientation property.
     * 
     * @return
     *     possible object is
     *     {@link FetchOrientationType }
     *     
     */
    public FetchOrientationType getFetchOrientation() {
        return fetchOrientation;
    }

    /**
     * Sets the value of the fetchOrientation property.
     * 
     * @param value
     *     allowed object is
     *     {@link FetchOrientationType }
     *     
     */
    public void setFetchOrientation(FetchOrientationType value) {
        this.fetchOrientation = value;
    }

    /**
     * Gets the value of the fromStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link FromStaticStringType }
     *     
     */
    public FromStaticStringType getFromStaticString() {
        return fromStaticString;
    }

    /**
     * Sets the value of the fromStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link FromStaticStringType }
     *     
     */
    public void setFromStaticString(FromStaticStringType value) {
        this.fromStaticString = value;
    }

}
