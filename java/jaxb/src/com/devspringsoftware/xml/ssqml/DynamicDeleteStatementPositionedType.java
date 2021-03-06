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
 * <p>Java class for DynamicDeleteStatementPositionedType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DynamicDeleteStatementPositionedType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}DeleteFromStaticString"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}TargetTable"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}WhereCurrentOfStaticString"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}DynamicCursorName"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DynamicDeleteStatementPositionedType", propOrder = {
    "deleteFromStaticString",
    "targetTable",
    "whereCurrentOfStaticString",
    "dynamicCursorName"
})
public class DynamicDeleteStatementPositionedType {

    @XmlElement(name = "DeleteFromStaticString", required = true)
    protected DeleteFromStaticStringType deleteFromStaticString;
    @XmlElement(name = "TargetTable", required = true)
    protected TargetTableType targetTable;
    @XmlElement(name = "WhereCurrentOfStaticString", required = true)
    protected WhereCurrentOfStaticStringType whereCurrentOfStaticString;
    @XmlElement(name = "DynamicCursorName", required = true)
    protected DynamicCursorNameType dynamicCursorName;

    /**
     * Gets the value of the deleteFromStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link DeleteFromStaticStringType }
     *     
     */
    public DeleteFromStaticStringType getDeleteFromStaticString() {
        return deleteFromStaticString;
    }

    /**
     * Sets the value of the deleteFromStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeleteFromStaticStringType }
     *     
     */
    public void setDeleteFromStaticString(DeleteFromStaticStringType value) {
        this.deleteFromStaticString = value;
    }

    /**
     * Gets the value of the targetTable property.
     * 
     * @return
     *     possible object is
     *     {@link TargetTableType }
     *     
     */
    public TargetTableType getTargetTable() {
        return targetTable;
    }

    /**
     * Sets the value of the targetTable property.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetTableType }
     *     
     */
    public void setTargetTable(TargetTableType value) {
        this.targetTable = value;
    }

    /**
     * Gets the value of the whereCurrentOfStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link WhereCurrentOfStaticStringType }
     *     
     */
    public WhereCurrentOfStaticStringType getWhereCurrentOfStaticString() {
        return whereCurrentOfStaticString;
    }

    /**
     * Sets the value of the whereCurrentOfStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link WhereCurrentOfStaticStringType }
     *     
     */
    public void setWhereCurrentOfStaticString(WhereCurrentOfStaticStringType value) {
        this.whereCurrentOfStaticString = value;
    }

    /**
     * Gets the value of the dynamicCursorName property.
     * 
     * @return
     *     possible object is
     *     {@link DynamicCursorNameType }
     *     
     */
    public DynamicCursorNameType getDynamicCursorName() {
        return dynamicCursorName;
    }

    /**
     * Sets the value of the dynamicCursorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link DynamicCursorNameType }
     *     
     */
    public void setDynamicCursorName(DynamicCursorNameType value) {
        this.dynamicCursorName = value;
    }

}
