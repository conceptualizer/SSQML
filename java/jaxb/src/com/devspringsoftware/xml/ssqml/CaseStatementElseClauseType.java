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
 * <p>Java class for CaseStatementElseClauseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CaseStatementElseClauseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}ElseStaticString"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}SqlStatementList"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CaseStatementElseClauseType", propOrder = {
    "elseStaticString",
    "sqlStatementList"
})
public class CaseStatementElseClauseType {

    @XmlElement(name = "ElseStaticString", required = true)
    protected ElseStaticStringType elseStaticString;
    @XmlElement(name = "SqlStatementList", required = true)
    protected SqlStatementListType sqlStatementList;

    /**
     * Gets the value of the elseStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link ElseStaticStringType }
     *     
     */
    public ElseStaticStringType getElseStaticString() {
        return elseStaticString;
    }

    /**
     * Sets the value of the elseStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElseStaticStringType }
     *     
     */
    public void setElseStaticString(ElseStaticStringType value) {
        this.elseStaticString = value;
    }

    /**
     * Gets the value of the sqlStatementList property.
     * 
     * @return
     *     possible object is
     *     {@link SqlStatementListType }
     *     
     */
    public SqlStatementListType getSqlStatementList() {
        return sqlStatementList;
    }

    /**
     * Sets the value of the sqlStatementList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SqlStatementListType }
     *     
     */
    public void setSqlStatementList(SqlStatementListType value) {
        this.sqlStatementList = value;
    }

}
