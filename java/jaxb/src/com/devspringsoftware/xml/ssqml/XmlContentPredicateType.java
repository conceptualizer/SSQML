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
 * <p>Java class for XmlContentPredicateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XmlContentPredicateType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}XmlValueExpression"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}IsStaticString"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}NotStaticString" minOccurs="0"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}XmlUntypedOrAny" minOccurs="0"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}ContentStaticString"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XmlContentPredicateType", propOrder = {
    "xmlValueExpression",
    "isStaticString",
    "notStaticString",
    "xmlUntypedOrAny",
    "contentStaticString"
})
public class XmlContentPredicateType {

    @XmlElement(name = "XmlValueExpression", required = true)
    protected XmlPrimaryType xmlValueExpression;
    @XmlElement(name = "IsStaticString", required = true)
    protected IsStaticStringType isStaticString;
    @XmlElement(name = "NotStaticString")
    protected NotStaticStringType notStaticString;
    @XmlElement(name = "XmlUntypedOrAny")
    protected XmlUntypedOrAnyType xmlUntypedOrAny;
    @XmlElement(name = "ContentStaticString", required = true)
    protected ContentStaticStringType contentStaticString;

    /**
     * Gets the value of the xmlValueExpression property.
     * 
     * @return
     *     possible object is
     *     {@link XmlPrimaryType }
     *     
     */
    public XmlPrimaryType getXmlValueExpression() {
        return xmlValueExpression;
    }

    /**
     * Sets the value of the xmlValueExpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlPrimaryType }
     *     
     */
    public void setXmlValueExpression(XmlPrimaryType value) {
        this.xmlValueExpression = value;
    }

    /**
     * Gets the value of the isStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link IsStaticStringType }
     *     
     */
    public IsStaticStringType getIsStaticString() {
        return isStaticString;
    }

    /**
     * Sets the value of the isStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link IsStaticStringType }
     *     
     */
    public void setIsStaticString(IsStaticStringType value) {
        this.isStaticString = value;
    }

    /**
     * Gets the value of the notStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link NotStaticStringType }
     *     
     */
    public NotStaticStringType getNotStaticString() {
        return notStaticString;
    }

    /**
     * Sets the value of the notStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotStaticStringType }
     *     
     */
    public void setNotStaticString(NotStaticStringType value) {
        this.notStaticString = value;
    }

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
     * Gets the value of the contentStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link ContentStaticStringType }
     *     
     */
    public ContentStaticStringType getContentStaticString() {
        return contentStaticString;
    }

    /**
     * Sets the value of the contentStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentStaticStringType }
     *     
     */
    public void setContentStaticString(ContentStaticStringType value) {
        this.contentStaticString = value;
    }

}
