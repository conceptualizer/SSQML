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
 * <p>Java class for ArrayValueConstructorByQueryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayValueConstructorByQueryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}ArrayStaticString"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}LeftParen"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}QueryExpression"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}OrderByClause" minOccurs="0"/>
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
@XmlType(name = "ArrayValueConstructorByQueryType", propOrder = {
    "arrayStaticString",
    "leftParen",
    "queryExpression",
    "orderByClause",
    "rightParen"
})
public class ArrayValueConstructorByQueryType {

    @XmlElement(name = "ArrayStaticString", required = true)
    protected ArrayStaticStringType arrayStaticString;
    @XmlElement(name = "LeftParen", required = true)
    protected String leftParen;
    @XmlElement(name = "QueryExpression", required = true)
    protected QueryExpressionType queryExpression;
    @XmlElement(name = "OrderByClause")
    protected OrderByClauseType orderByClause;
    @XmlElement(name = "RightParen", required = true)
    protected String rightParen;

    /**
     * Gets the value of the arrayStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayStaticStringType }
     *     
     */
    public ArrayStaticStringType getArrayStaticString() {
        return arrayStaticString;
    }

    /**
     * Sets the value of the arrayStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayStaticStringType }
     *     
     */
    public void setArrayStaticString(ArrayStaticStringType value) {
        this.arrayStaticString = value;
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
     * Gets the value of the queryExpression property.
     * 
     * @return
     *     possible object is
     *     {@link QueryExpressionType }
     *     
     */
    public QueryExpressionType getQueryExpression() {
        return queryExpression;
    }

    /**
     * Sets the value of the queryExpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link QueryExpressionType }
     *     
     */
    public void setQueryExpression(QueryExpressionType value) {
        this.queryExpression = value;
    }

    /**
     * Gets the value of the orderByClause property.
     * 
     * @return
     *     possible object is
     *     {@link OrderByClauseType }
     *     
     */
    public OrderByClauseType getOrderByClause() {
        return orderByClause;
    }

    /**
     * Sets the value of the orderByClause property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderByClauseType }
     *     
     */
    public void setOrderByClause(OrderByClauseType value) {
        this.orderByClause = value;
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
