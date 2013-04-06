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
 * <p>Java class for SampleClauseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SampleClauseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}TablesampleStaticString"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}SampleMethod"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}LeftParen"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}SamplePercentage"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}RightParen"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}RepeatableClause" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SampleClauseType", propOrder = {
    "tablesampleStaticString",
    "sampleMethod",
    "leftParen",
    "samplePercentage",
    "rightParen",
    "repeatableClause"
})
public class SampleClauseType {

    @XmlElement(name = "TablesampleStaticString", required = true)
    protected TablesampleStaticStringType tablesampleStaticString;
    @XmlElement(name = "SampleMethod", required = true)
    protected SampleMethodType sampleMethod;
    @XmlElement(name = "LeftParen", required = true)
    protected String leftParen;
    @XmlElement(name = "SamplePercentage", required = true)
    protected NumericValueExpressionType samplePercentage;
    @XmlElement(name = "RightParen", required = true)
    protected String rightParen;
    @XmlElement(name = "RepeatableClause")
    protected RepeatableClauseType repeatableClause;

    /**
     * Gets the value of the tablesampleStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link TablesampleStaticStringType }
     *     
     */
    public TablesampleStaticStringType getTablesampleStaticString() {
        return tablesampleStaticString;
    }

    /**
     * Sets the value of the tablesampleStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link TablesampleStaticStringType }
     *     
     */
    public void setTablesampleStaticString(TablesampleStaticStringType value) {
        this.tablesampleStaticString = value;
    }

    /**
     * Gets the value of the sampleMethod property.
     * 
     * @return
     *     possible object is
     *     {@link SampleMethodType }
     *     
     */
    public SampleMethodType getSampleMethod() {
        return sampleMethod;
    }

    /**
     * Sets the value of the sampleMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link SampleMethodType }
     *     
     */
    public void setSampleMethod(SampleMethodType value) {
        this.sampleMethod = value;
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
     * Gets the value of the samplePercentage property.
     * 
     * @return
     *     possible object is
     *     {@link NumericValueExpressionType }
     *     
     */
    public NumericValueExpressionType getSamplePercentage() {
        return samplePercentage;
    }

    /**
     * Sets the value of the samplePercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link NumericValueExpressionType }
     *     
     */
    public void setSamplePercentage(NumericValueExpressionType value) {
        this.samplePercentage = value;
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
     * Gets the value of the repeatableClause property.
     * 
     * @return
     *     possible object is
     *     {@link RepeatableClauseType }
     *     
     */
    public RepeatableClauseType getRepeatableClause() {
        return repeatableClause;
    }

    /**
     * Sets the value of the repeatableClause property.
     * 
     * @param value
     *     allowed object is
     *     {@link RepeatableClauseType }
     *     
     */
    public void setRepeatableClause(RepeatableClauseType value) {
        this.repeatableClause = value;
    }

}