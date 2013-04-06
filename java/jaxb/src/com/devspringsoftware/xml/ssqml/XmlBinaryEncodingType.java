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
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XmlBinaryEncodingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XmlBinaryEncodingType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}XmlbinaryStaticString"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}UsingStaticString" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element ref="{http://www.devspringsoftware.com}Base64StaticString"/>
 *           &lt;element ref="{http://www.devspringsoftware.com}HexStaticString"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XmlBinaryEncodingType", propOrder = {
    "xmlbinaryStaticString",
    "usingStaticString",
    "base64StaticStringOrHexStaticString"
})
public class XmlBinaryEncodingType {

    @XmlElement(name = "XmlbinaryStaticString", required = true)
    protected XmlbinaryStaticStringType xmlbinaryStaticString;
    @XmlElement(name = "UsingStaticString")
    protected UsingStaticStringType usingStaticString;
    @XmlElements({
        @XmlElement(name = "Base64StaticString", type = Base64StaticStringType.class),
        @XmlElement(name = "HexStaticString", type = HexStaticStringType.class)
    })
    protected Object base64StaticStringOrHexStaticString;

    /**
     * Gets the value of the xmlbinaryStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link XmlbinaryStaticStringType }
     *     
     */
    public XmlbinaryStaticStringType getXmlbinaryStaticString() {
        return xmlbinaryStaticString;
    }

    /**
     * Sets the value of the xmlbinaryStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlbinaryStaticStringType }
     *     
     */
    public void setXmlbinaryStaticString(XmlbinaryStaticStringType value) {
        this.xmlbinaryStaticString = value;
    }

    /**
     * Gets the value of the usingStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link UsingStaticStringType }
     *     
     */
    public UsingStaticStringType getUsingStaticString() {
        return usingStaticString;
    }

    /**
     * Sets the value of the usingStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link UsingStaticStringType }
     *     
     */
    public void setUsingStaticString(UsingStaticStringType value) {
        this.usingStaticString = value;
    }

    /**
     * Gets the value of the base64StaticStringOrHexStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link Base64StaticStringType }
     *     {@link HexStaticStringType }
     *     
     */
    public Object getBase64StaticStringOrHexStaticString() {
        return base64StaticStringOrHexStaticString;
    }

    /**
     * Sets the value of the base64StaticStringOrHexStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link Base64StaticStringType }
     *     {@link HexStaticStringType }
     *     
     */
    public void setBase64StaticStringOrHexStaticString(Object value) {
        this.base64StaticStringOrHexStaticString = value;
    }

}
