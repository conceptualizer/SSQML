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
 * <p>Java class for ExponentialFunctionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExponentialFunctionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}ExpStaticString"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}LeftParen"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}NumericValueExpression"/>
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
@XmlType(name = "ExponentialFunctionType", propOrder = {
    "expStaticString",
    "leftParen",
    "numericValueExpression",
    "rightParen"
})
public class ExponentialFunctionType {

    @XmlElement(name = "ExpStaticString", required = true)
    protected ExpStaticStringType expStaticString;
    @XmlElement(name = "LeftParen", required = true)
    protected String leftParen;
    @XmlElementRef(name = "NumericValueExpression", namespace = "http://www.devspringsoftware.com", type = JAXBElement.class)
    protected JAXBElement<NumericValueExpressionType> numericValueExpression;
    @XmlElement(name = "RightParen", required = true)
    protected String rightParen;

    /**
     * Gets the value of the expStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link ExpStaticStringType }
     *     
     */
    public ExpStaticStringType getExpStaticString() {
        return expStaticString;
    }

    /**
     * Sets the value of the expStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpStaticStringType }
     *     
     */
    public void setExpStaticString(ExpStaticStringType value) {
        this.expStaticString = value;
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
     * Gets the value of the numericValueExpression property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link NumericValueExpressionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NumericValueExpressionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NumericValueExpressionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NumericValueExpressionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NumericValueExpressionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NumericValueExpressionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NumericValueExpressionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NumericValueExpressionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NumericValueExpressionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NumericValueExpressionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NumericValueExpressionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NumericValueExpressionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NumericValueExpressionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NumericValueExpressionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NumericValueExpressionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NumericValueExpressionType }{@code >}
     *     
     */
    public JAXBElement<NumericValueExpressionType> getNumericValueExpression() {
        return numericValueExpression;
    }

    /**
     * Sets the value of the numericValueExpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link NumericValueExpressionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NumericValueExpressionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NumericValueExpressionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NumericValueExpressionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NumericValueExpressionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NumericValueExpressionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NumericValueExpressionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NumericValueExpressionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NumericValueExpressionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NumericValueExpressionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NumericValueExpressionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NumericValueExpressionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NumericValueExpressionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NumericValueExpressionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NumericValueExpressionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NumericValueExpressionType }{@code >}
     *     
     */
    public void setNumericValueExpression(JAXBElement<NumericValueExpressionType> value) {
        this.numericValueExpression = value;
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
