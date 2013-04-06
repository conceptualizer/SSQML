//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.03 at 08:58:47 PM EDT 
//


package com.devspringsoftware.xml.ssqml;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RoutineNameType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoutineNameType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}SchemaName" minOccurs="0"/>
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
@XmlType(name = "RoutineNameType", propOrder = {
    "schemaName",
    "period",
    "qualifiedIdentifier"
})
public class RoutineNameType {

    @XmlElementRef(name = "SchemaName", namespace = "http://www.devspringsoftware.com", type = JAXBElement.class, required = false)
    protected JAXBElement<SchemaNameType> schemaName;
    @XmlElement(name = "Period")
    protected String period;
    @XmlElement(name = "QualifiedIdentifier", required = true)
    protected ActualIdentifierType qualifiedIdentifier;

    /**
     * Gets the value of the schemaName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SchemaNameType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SchemaNameType }{@code >}
     *     
     */
    public JAXBElement<SchemaNameType> getSchemaName() {
        return schemaName;
    }

    /**
     * Sets the value of the schemaName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SchemaNameType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SchemaNameType }{@code >}
     *     
     */
    public void setSchemaName(JAXBElement<SchemaNameType> value) {
        this.schemaName = value;
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
