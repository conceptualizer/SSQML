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
 * <p>Java class for UpdateStatementPositionedType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UpdateStatementPositionedType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}UpdateStaticString"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}WithStaticString" minOccurs="0"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}XmlLexicallyScopedOptions" minOccurs="0"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}TargetTable"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}SetStaticString"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}SetClauseList"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}WhereCurrentOfStaticString"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}CursorName"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateStatementPositionedType", propOrder = {
    "updateStaticString",
    "withStaticString",
    "xmlLexicallyScopedOptions",
    "targetTable",
    "setStaticString",
    "setClauseList",
    "whereCurrentOfStaticString",
    "cursorName"
})
public class UpdateStatementPositionedType {

    @XmlElement(name = "UpdateStaticString", required = true)
    protected UpdateStaticStringType updateStaticString;
    @XmlElement(name = "WithStaticString")
    protected WithStaticStringType withStaticString;
    @XmlElement(name = "XmlLexicallyScopedOptions")
    protected XmlLexicallyScopedOptionsType xmlLexicallyScopedOptions;
    @XmlElement(name = "TargetTable", required = true)
    protected TargetTableType targetTable;
    @XmlElement(name = "SetStaticString", required = true)
    protected SetStaticStringType setStaticString;
    @XmlElement(name = "SetClauseList", required = true)
    protected SetClauseListType setClauseList;
    @XmlElement(name = "WhereCurrentOfStaticString", required = true)
    protected WhereCurrentOfStaticStringType whereCurrentOfStaticString;
    @XmlElement(name = "CursorName", required = true)
    protected LocalQualifiedNameType cursorName;

    /**
     * Gets the value of the updateStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link UpdateStaticStringType }
     *     
     */
    public UpdateStaticStringType getUpdateStaticString() {
        return updateStaticString;
    }

    /**
     * Sets the value of the updateStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link UpdateStaticStringType }
     *     
     */
    public void setUpdateStaticString(UpdateStaticStringType value) {
        this.updateStaticString = value;
    }

    /**
     * Gets the value of the withStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link WithStaticStringType }
     *     
     */
    public WithStaticStringType getWithStaticString() {
        return withStaticString;
    }

    /**
     * Sets the value of the withStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link WithStaticStringType }
     *     
     */
    public void setWithStaticString(WithStaticStringType value) {
        this.withStaticString = value;
    }

    /**
     * Gets the value of the xmlLexicallyScopedOptions property.
     * 
     * @return
     *     possible object is
     *     {@link XmlLexicallyScopedOptionsType }
     *     
     */
    public XmlLexicallyScopedOptionsType getXmlLexicallyScopedOptions() {
        return xmlLexicallyScopedOptions;
    }

    /**
     * Sets the value of the xmlLexicallyScopedOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlLexicallyScopedOptionsType }
     *     
     */
    public void setXmlLexicallyScopedOptions(XmlLexicallyScopedOptionsType value) {
        this.xmlLexicallyScopedOptions = value;
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
     * Gets the value of the setStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link SetStaticStringType }
     *     
     */
    public SetStaticStringType getSetStaticString() {
        return setStaticString;
    }

    /**
     * Sets the value of the setStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link SetStaticStringType }
     *     
     */
    public void setSetStaticString(SetStaticStringType value) {
        this.setStaticString = value;
    }

    /**
     * Gets the value of the setClauseList property.
     * 
     * @return
     *     possible object is
     *     {@link SetClauseListType }
     *     
     */
    public SetClauseListType getSetClauseList() {
        return setClauseList;
    }

    /**
     * Sets the value of the setClauseList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SetClauseListType }
     *     
     */
    public void setSetClauseList(SetClauseListType value) {
        this.setClauseList = value;
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
     * Gets the value of the cursorName property.
     * 
     * @return
     *     possible object is
     *     {@link LocalQualifiedNameType }
     *     
     */
    public LocalQualifiedNameType getCursorName() {
        return cursorName;
    }

    /**
     * Sets the value of the cursorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalQualifiedNameType }
     *     
     */
    public void setCursorName(LocalQualifiedNameType value) {
        this.cursorName = value;
    }

}
