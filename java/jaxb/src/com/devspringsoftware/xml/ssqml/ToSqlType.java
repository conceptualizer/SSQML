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
 * <p>Java class for ToSqlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ToSqlType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}ToSqlWithStaticString"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}ToSqlFunction"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ToSqlType", propOrder = {
    "toSqlWithStaticString",
    "toSqlFunction"
})
public class ToSqlType {

    @XmlElement(name = "ToSqlWithStaticString", required = true)
    protected ToSqlWithStaticStringType toSqlWithStaticString;
    @XmlElement(name = "ToSqlFunction", required = true)
    protected SpecificRoutineDesignatorType toSqlFunction;

    /**
     * Gets the value of the toSqlWithStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link ToSqlWithStaticStringType }
     *     
     */
    public ToSqlWithStaticStringType getToSqlWithStaticString() {
        return toSqlWithStaticString;
    }

    /**
     * Sets the value of the toSqlWithStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link ToSqlWithStaticStringType }
     *     
     */
    public void setToSqlWithStaticString(ToSqlWithStaticStringType value) {
        this.toSqlWithStaticString = value;
    }

    /**
     * Gets the value of the toSqlFunction property.
     * 
     * @return
     *     possible object is
     *     {@link SpecificRoutineDesignatorType }
     *     
     */
    public SpecificRoutineDesignatorType getToSqlFunction() {
        return toSqlFunction;
    }

    /**
     * Sets the value of the toSqlFunction property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecificRoutineDesignatorType }
     *     
     */
    public void setToSqlFunction(SpecificRoutineDesignatorType value) {
        this.toSqlFunction = value;
    }

}
