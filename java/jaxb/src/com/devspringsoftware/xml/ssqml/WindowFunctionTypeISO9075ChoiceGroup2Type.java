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
 * <p>Java class for WindowFunctionType_ISO9075ChoiceGroup2Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WindowFunctionType_ISO9075ChoiceGroup2Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}Row_numberStaticString"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}LeftParenRightParen"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WindowFunctionType_ISO9075ChoiceGroup2Type", propOrder = {
    "rowNumberStaticString",
    "leftParenRightParen"
})
public class WindowFunctionTypeISO9075ChoiceGroup2Type {

    @XmlElement(name = "Row_numberStaticString", required = true)
    protected RowNumberStaticStringType rowNumberStaticString;
    @XmlElement(name = "LeftParenRightParen", required = true)
    protected String leftParenRightParen;

    /**
     * Gets the value of the rowNumberStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link RowNumberStaticStringType }
     *     
     */
    public RowNumberStaticStringType getRowNumberStaticString() {
        return rowNumberStaticString;
    }

    /**
     * Sets the value of the rowNumberStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link RowNumberStaticStringType }
     *     
     */
    public void setRowNumberStaticString(RowNumberStaticStringType value) {
        this.rowNumberStaticString = value;
    }

    /**
     * Gets the value of the leftParenRightParen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeftParenRightParen() {
        return leftParenRightParen;
    }

    /**
     * Sets the value of the leftParenRightParen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeftParenRightParen(String value) {
        this.leftParenRightParen = value;
    }

}