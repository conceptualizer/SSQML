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
 * <p>Java class for SingleDatetimeField_ISO9075ChoiceGroup2Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SingleDatetimeField_ISO9075ChoiceGroup2Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}SecondStaticString"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}LeftParen" minOccurs="0"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}IntervalLeadingFieldPrecision" minOccurs="0"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}Comma" minOccurs="0"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}IntervalFractionalSecondsPrecision" minOccurs="0"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}RightParen"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SingleDatetimeField_ISO9075ChoiceGroup2Type", propOrder = {
    "secondStaticString",
    "leftParen",
    "intervalLeadingFieldPrecision",
    "comma",
    "intervalFractionalSecondsPrecision",
    "rightParen"
})
public class SingleDatetimeFieldISO9075ChoiceGroup2Type {

    @XmlElement(name = "SecondStaticString", required = true)
    protected SecondStaticStringType secondStaticString;
    @XmlElement(name = "LeftParen")
    protected String leftParen;
    @XmlElement(name = "IntervalLeadingFieldPrecision")
    protected IntervalLeadingFieldPrecisionType intervalLeadingFieldPrecision;
    @XmlElement(name = "Comma")
    protected String comma;
    @XmlElement(name = "IntervalFractionalSecondsPrecision")
    protected IntervalFractionalSecondsPrecisionType intervalFractionalSecondsPrecision;
    @XmlElement(name = "RightParen", required = true)
    protected String rightParen;

    /**
     * Gets the value of the secondStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link SecondStaticStringType }
     *     
     */
    public SecondStaticStringType getSecondStaticString() {
        return secondStaticString;
    }

    /**
     * Sets the value of the secondStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecondStaticStringType }
     *     
     */
    public void setSecondStaticString(SecondStaticStringType value) {
        this.secondStaticString = value;
    }

    /**
     * Gets the value of the leftParen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeftParen() {
        return leftParen;
    }

    /**
     * Sets the value of the leftParen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeftParen(String value) {
        this.leftParen = value;
    }

    /**
     * Gets the value of the intervalLeadingFieldPrecision property.
     * 
     * @return
     *     possible object is
     *     {@link IntervalLeadingFieldPrecisionType }
     *     
     */
    public IntervalLeadingFieldPrecisionType getIntervalLeadingFieldPrecision() {
        return intervalLeadingFieldPrecision;
    }

    /**
     * Sets the value of the intervalLeadingFieldPrecision property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntervalLeadingFieldPrecisionType }
     *     
     */
    public void setIntervalLeadingFieldPrecision(IntervalLeadingFieldPrecisionType value) {
        this.intervalLeadingFieldPrecision = value;
    }

    /**
     * Gets the value of the comma property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComma() {
        return comma;
    }

    /**
     * Sets the value of the comma property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComma(String value) {
        this.comma = value;
    }

    /**
     * Gets the value of the intervalFractionalSecondsPrecision property.
     * 
     * @return
     *     possible object is
     *     {@link IntervalFractionalSecondsPrecisionType }
     *     
     */
    public IntervalFractionalSecondsPrecisionType getIntervalFractionalSecondsPrecision() {
        return intervalFractionalSecondsPrecision;
    }

    /**
     * Sets the value of the intervalFractionalSecondsPrecision property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntervalFractionalSecondsPrecisionType }
     *     
     */
    public void setIntervalFractionalSecondsPrecision(IntervalFractionalSecondsPrecisionType value) {
        this.intervalFractionalSecondsPrecision = value;
    }

    /**
     * Gets the value of the rightParen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRightParen() {
        return rightParen;
    }

    /**
     * Sets the value of the rightParen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRightParen(String value) {
        this.rightParen = value;
    }

}
