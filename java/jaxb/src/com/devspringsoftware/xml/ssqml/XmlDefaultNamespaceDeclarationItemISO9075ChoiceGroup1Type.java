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
 * <p>Java class for XmlDefaultNamespaceDeclarationItem_ISO9075ChoiceGroup1Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XmlDefaultNamespaceDeclarationItem_ISO9075ChoiceGroup1Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}DefaultStaticString"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}XmlNamespaceUri"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XmlDefaultNamespaceDeclarationItem_ISO9075ChoiceGroup1Type", propOrder = {
    "defaultStaticString",
    "xmlNamespaceUri"
})
public class XmlDefaultNamespaceDeclarationItemISO9075ChoiceGroup1Type {

    @XmlElement(name = "DefaultStaticString", required = true)
    protected DefaultStaticStringType defaultStaticString;
    @XmlElement(name = "XmlNamespaceUri", required = true)
    protected CharacterStringLiteralType xmlNamespaceUri;

    /**
     * Gets the value of the defaultStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link DefaultStaticStringType }
     *     
     */
    public DefaultStaticStringType getDefaultStaticString() {
        return defaultStaticString;
    }

    /**
     * Sets the value of the defaultStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link DefaultStaticStringType }
     *     
     */
    public void setDefaultStaticString(DefaultStaticStringType value) {
        this.defaultStaticString = value;
    }

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

}
