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
 * <p>Java class for OldOrNewValuesAlias_ISO9075ChoiceGroup1Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OldOrNewValuesAlias_ISO9075ChoiceGroup1Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}OldStaticString"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}RowStaticString" minOccurs="0"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}AsStaticString" minOccurs="0"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}OldValuesCorrelationName"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OldOrNewValuesAlias_ISO9075ChoiceGroup1Type", propOrder = {
    "oldStaticString",
    "rowStaticString",
    "asStaticString",
    "oldValuesCorrelationName"
})
public class OldOrNewValuesAliasISO9075ChoiceGroup1Type {

    @XmlElement(name = "OldStaticString", required = true)
    protected OldStaticStringType oldStaticString;
    @XmlElement(name = "RowStaticString")
    protected RowStaticStringType rowStaticString;
    @XmlElement(name = "AsStaticString")
    protected AsStaticStringType asStaticString;
    @XmlElement(name = "OldValuesCorrelationName", required = true)
    protected ActualIdentifierType oldValuesCorrelationName;

    /**
     * Gets the value of the oldStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link OldStaticStringType }
     *     
     */
    public OldStaticStringType getOldStaticString() {
        return oldStaticString;
    }

    /**
     * Sets the value of the oldStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link OldStaticStringType }
     *     
     */
    public void setOldStaticString(OldStaticStringType value) {
        this.oldStaticString = value;
    }

    /**
     * Gets the value of the rowStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link RowStaticStringType }
     *     
     */
    public RowStaticStringType getRowStaticString() {
        return rowStaticString;
    }

    /**
     * Sets the value of the rowStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link RowStaticStringType }
     *     
     */
    public void setRowStaticString(RowStaticStringType value) {
        this.rowStaticString = value;
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
     * Gets the value of the oldValuesCorrelationName property.
     * 
     * @return
     *     possible object is
     *     {@link ActualIdentifierType }
     *     
     */
    public ActualIdentifierType getOldValuesCorrelationName() {
        return oldValuesCorrelationName;
    }

    /**
     * Sets the value of the oldValuesCorrelationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActualIdentifierType }
     *     
     */
    public void setOldValuesCorrelationName(ActualIdentifierType value) {
        this.oldValuesCorrelationName = value;
    }

}
