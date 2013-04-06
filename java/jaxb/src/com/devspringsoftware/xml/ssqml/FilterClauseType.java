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
 * <p>Java class for FilterClauseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FilterClauseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}FilterStaticString"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}LeftParen"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}WhereStaticString"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}SearchCondition"/>
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
@XmlType(name = "FilterClauseType", propOrder = {
    "filterStaticString",
    "leftParen",
    "whereStaticString",
    "searchCondition",
    "rightParen"
})
public class FilterClauseType {

    @XmlElement(name = "FilterStaticString", required = true)
    protected FilterStaticStringType filterStaticString;
    @XmlElement(name = "LeftParen", required = true)
    protected String leftParen;
    @XmlElement(name = "WhereStaticString", required = true)
    protected WhereStaticStringType whereStaticString;
    @XmlElement(name = "SearchCondition", required = true)
    protected BooleanValueExpressionType searchCondition;
    @XmlElement(name = "RightParen", required = true)
    protected String rightParen;

    /**
     * Gets the value of the filterStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link FilterStaticStringType }
     *     
     */
    public FilterStaticStringType getFilterStaticString() {
        return filterStaticString;
    }

    /**
     * Sets the value of the filterStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterStaticStringType }
     *     
     */
    public void setFilterStaticString(FilterStaticStringType value) {
        this.filterStaticString = value;
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
     * Gets the value of the whereStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link WhereStaticStringType }
     *     
     */
    public WhereStaticStringType getWhereStaticString() {
        return whereStaticString;
    }

    /**
     * Sets the value of the whereStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link WhereStaticStringType }
     *     
     */
    public void setWhereStaticString(WhereStaticStringType value) {
        this.whereStaticString = value;
    }

    /**
     * Gets the value of the searchCondition property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanValueExpressionType }
     *     
     */
    public BooleanValueExpressionType getSearchCondition() {
        return searchCondition;
    }

    /**
     * Sets the value of the searchCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanValueExpressionType }
     *     
     */
    public void setSearchCondition(BooleanValueExpressionType value) {
        this.searchCondition = value;
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