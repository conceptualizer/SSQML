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
 * <p>Java class for XmlValidSchemaLocationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XmlValidSchemaLocationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}LocationStaticString"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}XmlValidSchemaLocationUri"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XmlValidSchemaLocationType", propOrder = {
    "locationStaticString",
    "xmlValidSchemaLocationUri"
})
public class XmlValidSchemaLocationType {

    @XmlElement(name = "LocationStaticString", required = true)
    protected LocationStaticStringType locationStaticString;
    @XmlElement(name = "XmlValidSchemaLocationUri", required = true)
    protected CharacterStringLiteralType xmlValidSchemaLocationUri;

    /**
     * Gets the value of the locationStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link LocationStaticStringType }
     *     
     */
    public LocationStaticStringType getLocationStaticString() {
        return locationStaticString;
    }

    /**
     * Sets the value of the locationStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationStaticStringType }
     *     
     */
    public void setLocationStaticString(LocationStaticStringType value) {
        this.locationStaticString = value;
    }

    /**
     * Gets the value of the xmlValidSchemaLocationUri property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringLiteralType }
     *     
     */
    public CharacterStringLiteralType getXmlValidSchemaLocationUri() {
        return xmlValidSchemaLocationUri;
    }

    /**
     * Sets the value of the xmlValidSchemaLocationUri property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringLiteralType }
     *     
     */
    public void setXmlValidSchemaLocationUri(CharacterStringLiteralType value) {
        this.xmlValidSchemaLocationUri = value;
    }

}
