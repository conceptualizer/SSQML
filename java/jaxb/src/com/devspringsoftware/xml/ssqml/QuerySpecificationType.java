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
 * <p>Java class for QuerySpecificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuerySpecificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}SelectStaticString"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}SetQuantifier" minOccurs="0"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}SelectList"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}TableExpression"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuerySpecificationType", propOrder = {
    "selectStaticString",
    "setQuantifier",
    "selectList",
    "tableExpression"
})
public class QuerySpecificationType {

    @XmlElement(name = "SelectStaticString", required = true)
    protected SelectStaticStringType selectStaticString;
    @XmlElement(name = "SetQuantifier")
    protected SetQuantifierType setQuantifier;
    @XmlElement(name = "SelectList", required = true)
    protected SelectListType selectList;
    @XmlElement(name = "TableExpression", required = true)
    protected TableExpressionType tableExpression;

    /**
     * Gets the value of the selectStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link SelectStaticStringType }
     *     
     */
    public SelectStaticStringType getSelectStaticString() {
        return selectStaticString;
    }

    /**
     * Sets the value of the selectStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link SelectStaticStringType }
     *     
     */
    public void setSelectStaticString(SelectStaticStringType value) {
        this.selectStaticString = value;
    }

    /**
     * Gets the value of the setQuantifier property.
     * 
     * @return
     *     possible object is
     *     {@link SetQuantifierType }
     *     
     */
    public SetQuantifierType getSetQuantifier() {
        return setQuantifier;
    }

    /**
     * Sets the value of the setQuantifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link SetQuantifierType }
     *     
     */
    public void setSetQuantifier(SetQuantifierType value) {
        this.setQuantifier = value;
    }

    /**
     * Gets the value of the selectList property.
     * 
     * @return
     *     possible object is
     *     {@link SelectListType }
     *     
     */
    public SelectListType getSelectList() {
        return selectList;
    }

    /**
     * Sets the value of the selectList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SelectListType }
     *     
     */
    public void setSelectList(SelectListType value) {
        this.selectList = value;
    }

    /**
     * Gets the value of the tableExpression property.
     * 
     * @return
     *     possible object is
     *     {@link TableExpressionType }
     *     
     */
    public TableExpressionType getTableExpression() {
        return tableExpression;
    }

    /**
     * Sets the value of the tableExpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link TableExpressionType }
     *     
     */
    public void setTableExpression(TableExpressionType value) {
        this.tableExpression = value;
    }

}
