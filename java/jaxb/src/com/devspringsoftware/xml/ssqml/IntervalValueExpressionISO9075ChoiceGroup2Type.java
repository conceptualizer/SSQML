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
 * <p>Java class for IntervalValueExpression_ISO9075ChoiceGroup2Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IntervalValueExpression_ISO9075ChoiceGroup2Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}LeftParen"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}DatetimeValueExpression"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}MinusSign"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}DatetimeTerm"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}RightParen"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}IntervalQualifier"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntervalValueExpression_ISO9075ChoiceGroup2Type", propOrder = {
    "leftParen",
    "datetimeValueExpression",
    "minusSign",
    "datetimeTerm",
    "rightParen",
    "intervalQualifier"
})
public class IntervalValueExpressionISO9075ChoiceGroup2Type {

    @XmlElement(name = "LeftParen", required = true)
    protected String leftParen;
    @XmlElement(name = "DatetimeValueExpression", required = true)
    protected DatetimeValueExpressionType datetimeValueExpression;
    @XmlElement(name = "MinusSign", required = true)
    protected String minusSign;
    @XmlElement(name = "DatetimeTerm", required = true)
    protected DatetimeFactorType datetimeTerm;
    @XmlElement(name = "RightParen", required = true)
    protected String rightParen;
    @XmlElement(name = "IntervalQualifier", required = true)
    protected IntervalQualifierType intervalQualifier;

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
     * Gets the value of the datetimeValueExpression property.
     * 
     * @return
     *     possible object is
     *     {@link DatetimeValueExpressionType }
     *     
     */
    public DatetimeValueExpressionType getDatetimeValueExpression() {
        return datetimeValueExpression;
    }

    /**
     * Sets the value of the datetimeValueExpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatetimeValueExpressionType }
     *     
     */
    public void setDatetimeValueExpression(DatetimeValueExpressionType value) {
        this.datetimeValueExpression = value;
    }

    /**
     * Gets the value of the minusSign property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinusSign() {
        return minusSign;
    }

    /**
     * Sets the value of the minusSign property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinusSign(String value) {
        this.minusSign = value;
    }

    /**
     * Gets the value of the datetimeTerm property.
     * 
     * @return
     *     possible object is
     *     {@link DatetimeFactorType }
     *     
     */
    public DatetimeFactorType getDatetimeTerm() {
        return datetimeTerm;
    }

    /**
     * Sets the value of the datetimeTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatetimeFactorType }
     *     
     */
    public void setDatetimeTerm(DatetimeFactorType value) {
        this.datetimeTerm = value;
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

    /**
     * Gets the value of the intervalQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link IntervalQualifierType }
     *     
     */
    public IntervalQualifierType getIntervalQualifier() {
        return intervalQualifier;
    }

    /**
     * Sets the value of the intervalQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntervalQualifierType }
     *     
     */
    public void setIntervalQualifier(IntervalQualifierType value) {
        this.intervalQualifier = value;
    }

}
