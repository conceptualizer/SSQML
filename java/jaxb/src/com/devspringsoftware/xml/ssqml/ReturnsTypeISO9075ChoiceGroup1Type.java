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
 * <p>Java class for ReturnsType_ISO9075ChoiceGroup1Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReturnsType_ISO9075ChoiceGroup1Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}ReturnsDataType"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}ResultCast" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReturnsType_ISO9075ChoiceGroup1Type", propOrder = {
    "returnsDataType",
    "resultCast"
})
public class ReturnsTypeISO9075ChoiceGroup1Type {

    @XmlElement(name = "ReturnsDataType", required = true)
    protected ReturnsDataTypeType returnsDataType;
    @XmlElement(name = "ResultCast")
    protected ResultCastType resultCast;

    /**
     * Gets the value of the returnsDataType property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnsDataTypeType }
     *     
     */
    public ReturnsDataTypeType getReturnsDataType() {
        return returnsDataType;
    }

    /**
     * Sets the value of the returnsDataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnsDataTypeType }
     *     
     */
    public void setReturnsDataType(ReturnsDataTypeType value) {
        this.returnsDataType = value;
    }

    /**
     * Gets the value of the resultCast property.
     * 
     * @return
     *     possible object is
     *     {@link ResultCastType }
     *     
     */
    public ResultCastType getResultCast() {
        return resultCast;
    }

    /**
     * Sets the value of the resultCast property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultCastType }
     *     
     */
    public void setResultCast(ResultCastType value) {
        this.resultCast = value;
    }

}
