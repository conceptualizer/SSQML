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
 * <p>Java class for XmlTypeModifier_ISO9075ChoiceGroup1Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XmlTypeModifier_ISO9075ChoiceGroup1Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}XmlUntypedOrAny" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element ref="{http://www.devspringsoftware.com}DocumentStaticString"/>
 *           &lt;element ref="{http://www.devspringsoftware.com}ContentStaticString"/>
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
@XmlType(name = "XmlTypeModifier_ISO9075ChoiceGroup1Type", propOrder = {
    "xmlUntypedOrAny",
    "documentStaticStringOrContentStaticString"
})
public class XmlTypeModifierISO9075ChoiceGroup1Type {

    @XmlElement(name = "XmlUntypedOrAny")
    protected XmlUntypedOrAnyType xmlUntypedOrAny;
    @XmlElements({
        @XmlElement(name = "DocumentStaticString", type = DocumentStaticStringType.class),
        @XmlElement(name = "ContentStaticString", type = ContentStaticStringType.class)
    })
    protected Object documentStaticStringOrContentStaticString;

    /**
     * Gets the value of the xmlUntypedOrAny property.
     * 
     * @return
     *     possible object is
     *     {@link XmlUntypedOrAnyType }
     *     
     */
    public XmlUntypedOrAnyType getXmlUntypedOrAny() {
        return xmlUntypedOrAny;
    }

    /**
     * Sets the value of the xmlUntypedOrAny property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlUntypedOrAnyType }
     *     
     */
    public void setXmlUntypedOrAny(XmlUntypedOrAnyType value) {
        this.xmlUntypedOrAny = value;
    }

    /**
     * Gets the value of the documentStaticStringOrContentStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentStaticStringType }
     *     {@link ContentStaticStringType }
     *     
     */
    public Object getDocumentStaticStringOrContentStaticString() {
        return documentStaticStringOrContentStaticString;
    }

    /**
     * Sets the value of the documentStaticStringOrContentStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentStaticStringType }
     *     {@link ContentStaticStringType }
     *     
     */
    public void setDocumentStaticStringOrContentStaticString(Object value) {
        this.documentStaticStringOrContentStaticString = value;
    }

}