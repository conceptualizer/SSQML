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
 * <p>Java class for FromSqlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FromSqlType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}FromSqlWithStaticString"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}FromSqlFunction"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FromSqlType", propOrder = {
    "fromSqlWithStaticString",
    "fromSqlFunction"
})
public class FromSqlType {

    @XmlElement(name = "FromSqlWithStaticString", required = true)
    protected FromSqlWithStaticStringType fromSqlWithStaticString;
    @XmlElement(name = "FromSqlFunction", required = true)
    protected SpecificRoutineDesignatorType fromSqlFunction;

    /**
     * Gets the value of the fromSqlWithStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link FromSqlWithStaticStringType }
     *     
     */
    public FromSqlWithStaticStringType getFromSqlWithStaticString() {
        return fromSqlWithStaticString;
    }

    /**
     * Sets the value of the fromSqlWithStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link FromSqlWithStaticStringType }
     *     
     */
    public void setFromSqlWithStaticString(FromSqlWithStaticStringType value) {
        this.fromSqlWithStaticString = value;
    }

    /**
     * Gets the value of the fromSqlFunction property.
     * 
     * @return
     *     possible object is
     *     {@link SpecificRoutineDesignatorType }
     *     
     */
    public SpecificRoutineDesignatorType getFromSqlFunction() {
        return fromSqlFunction;
    }

    /**
     * Sets the value of the fromSqlFunction property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecificRoutineDesignatorType }
     *     
     */
    public void setFromSqlFunction(SpecificRoutineDesignatorType value) {
        this.fromSqlFunction = value;
    }

}