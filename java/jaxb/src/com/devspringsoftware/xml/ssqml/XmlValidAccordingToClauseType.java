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
 * <p>Java class for XmlValidAccordingToClauseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XmlValidAccordingToClauseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}AccordingToXmlschemaStaticString"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}XmlValidAccordingToWhat"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}XmlValidElementClause" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XmlValidAccordingToClauseType", propOrder = {
    "accordingToXmlschemaStaticString",
    "xmlValidAccordingToWhat",
    "xmlValidElementClause"
})
public class XmlValidAccordingToClauseType {

    @XmlElement(name = "AccordingToXmlschemaStaticString", required = true)
    protected AccordingToXmlschemaStaticStringType accordingToXmlschemaStaticString;
    @XmlElement(name = "XmlValidAccordingToWhat", required = true)
    protected XmlValidAccordingToWhatType xmlValidAccordingToWhat;
    @XmlElement(name = "XmlValidElementClause")
    protected XmlValidElementClauseType xmlValidElementClause;

    /**
     * Gets the value of the accordingToXmlschemaStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link AccordingToXmlschemaStaticStringType }
     *     
     */
    public AccordingToXmlschemaStaticStringType getAccordingToXmlschemaStaticString() {
        return accordingToXmlschemaStaticString;
    }

    /**
     * Sets the value of the accordingToXmlschemaStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccordingToXmlschemaStaticStringType }
     *     
     */
    public void setAccordingToXmlschemaStaticString(AccordingToXmlschemaStaticStringType value) {
        this.accordingToXmlschemaStaticString = value;
    }

    /**
     * Gets the value of the xmlValidAccordingToWhat property.
     * 
     * @return
     *     possible object is
     *     {@link XmlValidAccordingToWhatType }
     *     
     */
    public XmlValidAccordingToWhatType getXmlValidAccordingToWhat() {
        return xmlValidAccordingToWhat;
    }

    /**
     * Sets the value of the xmlValidAccordingToWhat property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlValidAccordingToWhatType }
     *     
     */
    public void setXmlValidAccordingToWhat(XmlValidAccordingToWhatType value) {
        this.xmlValidAccordingToWhat = value;
    }

    /**
     * Gets the value of the xmlValidElementClause property.
     * 
     * @return
     *     possible object is
     *     {@link XmlValidElementClauseType }
     *     
     */
    public XmlValidElementClauseType getXmlValidElementClause() {
        return xmlValidElementClause;
    }

    /**
     * Sets the value of the xmlValidElementClause property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlValidElementClauseType }
     *     
     */
    public void setXmlValidElementClause(XmlValidElementClauseType value) {
        this.xmlValidElementClause = value;
    }

}
