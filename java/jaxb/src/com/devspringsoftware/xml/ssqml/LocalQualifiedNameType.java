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
 * <p>Java class for LocalQualifiedNameType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocalQualifiedNameType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}LocalQualifier" minOccurs="0"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}Period" minOccurs="0"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}QualifiedIdentifier"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocalQualifiedNameType", propOrder = {
    "localQualifier",
    "period",
    "qualifiedIdentifier"
})
public class LocalQualifiedNameType {

    @XmlElement(name = "LocalQualifier")
    protected ModuleStaticStringType localQualifier;
    @XmlElement(name = "Period")
    protected String period;
    @XmlElement(name = "QualifiedIdentifier", required = true)
    protected ActualIdentifierType qualifiedIdentifier;

    /**
     * Gets the value of the localQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link ModuleStaticStringType }
     *     
     */
    public ModuleStaticStringType getLocalQualifier() {
        return localQualifier;
    }

    /**
     * Sets the value of the localQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModuleStaticStringType }
     *     
     */
    public void setLocalQualifier(ModuleStaticStringType value) {
        this.localQualifier = value;
    }

    /**
     * Gets the value of the period property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeriod() {
        return period;
    }

    /**
     * Sets the value of the period property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeriod(String value) {
        this.period = value;
    }

    /**
     * Gets the value of the qualifiedIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link ActualIdentifierType }
     *     
     */
    public ActualIdentifierType getQualifiedIdentifier() {
        return qualifiedIdentifier;
    }

    /**
     * Sets the value of the qualifiedIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActualIdentifierType }
     *     
     */
    public void setQualifiedIdentifier(ActualIdentifierType value) {
        this.qualifiedIdentifier = value;
    }

}
