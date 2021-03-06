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
 * <p>Java class for SetTransactionStatementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SetTransactionStatementType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}SetStaticString"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}LocalStaticString" minOccurs="0"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}TransactionCharacteristics"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetTransactionStatementType", propOrder = {
    "setStaticString",
    "localStaticString",
    "transactionCharacteristics"
})
public class SetTransactionStatementType {

    @XmlElement(name = "SetStaticString", required = true)
    protected SetStaticStringType setStaticString;
    @XmlElement(name = "LocalStaticString")
    protected LocalStaticStringType localStaticString;
    @XmlElementRef(name = "TransactionCharacteristics", namespace = "http://www.devspringsoftware.com", type = JAXBElement.class)
    protected JAXBElement<TransactionCharacteristicsType> transactionCharacteristics;

    /**
     * Gets the value of the setStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link SetStaticStringType }
     *     
     */
    public SetStaticStringType getSetStaticString() {
        return setStaticString;
    }

    /**
     * Sets the value of the setStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link SetStaticStringType }
     *     
     */
    public void setSetStaticString(SetStaticStringType value) {
        this.setStaticString = value;
    }

    /**
     * Gets the value of the localStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link LocalStaticStringType }
     *     
     */
    public LocalStaticStringType getLocalStaticString() {
        return localStaticString;
    }

    /**
     * Sets the value of the localStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalStaticStringType }
     *     
     */
    public void setLocalStaticString(LocalStaticStringType value) {
        this.localStaticString = value;
    }

    /**
     * Gets the value of the transactionCharacteristics property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link TransactionCharacteristicsType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TransactionCharacteristicsType }{@code >}
     *     
     */
    public JAXBElement<TransactionCharacteristicsType> getTransactionCharacteristics() {
        return transactionCharacteristics;
    }

    /**
     * Sets the value of the transactionCharacteristics property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link TransactionCharacteristicsType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TransactionCharacteristicsType }{@code >}
     *     
     */
    public void setTransactionCharacteristics(JAXBElement<TransactionCharacteristicsType> value) {
        this.transactionCharacteristics = value;
    }

}
