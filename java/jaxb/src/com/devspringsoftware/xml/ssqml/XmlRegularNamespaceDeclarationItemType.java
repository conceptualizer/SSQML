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
 * <p>Java class for XmlRegularNamespaceDeclarationItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XmlRegularNamespaceDeclarationItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}XmlNamespaceUri"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}AsStaticString"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}XmlNamespacePrefix"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XmlRegularNamespaceDeclarationItemType", propOrder = {
    "xmlNamespaceUri",
    "asStaticString",
    "xmlNamespacePrefix"
})
public class XmlRegularNamespaceDeclarationItemType {

    @XmlElement(name = "XmlNamespaceUri", required = true)
    protected CharacterStringLiteralType xmlNamespaceUri;
    @XmlElement(name = "AsStaticString", required = true)
    protected AsStaticStringType asStaticString;
    @XmlElement(name = "XmlNamespacePrefix", required = true)
    protected ActualIdentifierType xmlNamespacePrefix;

    /**
     * Gets the value of the xmlNamespaceUri property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringLiteralType }
     *     
     */
    public CharacterStringLiteralType getXmlNamespaceUri() {
        return xmlNamespaceUri;
    }

    /**
     * Sets the value of the xmlNamespaceUri property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringLiteralType }
     *     
     */
    public void setXmlNamespaceUri(CharacterStringLiteralType value) {
        this.xmlNamespaceUri = value;
    }

    /**
     * Gets the value of the asStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link AsStaticStringType }
     *     
     */
    public AsStaticStringType getAsStaticString() {
        return asStaticString;
    }

    /**
     * Sets the value of the asStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link AsStaticStringType }
     *     
     */
    public void setAsStaticString(AsStaticStringType value) {
        this.asStaticString = value;
    }

    /**
     * Gets the value of the xmlNamespacePrefix property.
     * 
     * @return
     *     possible object is
     *     {@link ActualIdentifierType }
     *     
     */
    public ActualIdentifierType getXmlNamespacePrefix() {
        return xmlNamespacePrefix;
    }

    /**
     * Sets the value of the xmlNamespacePrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActualIdentifierType }
     *     
     */
    public void setXmlNamespacePrefix(ActualIdentifierType value) {
        this.xmlNamespacePrefix = value;
    }

}
