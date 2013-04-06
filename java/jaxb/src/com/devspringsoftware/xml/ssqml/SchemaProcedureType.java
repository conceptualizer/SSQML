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
 * <p>Java class for SchemaProcedureType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SchemaProcedureType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}CreateStaticString"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}SqlInvokedProcedure"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SchemaProcedureType", propOrder = {
    "createStaticString",
    "sqlInvokedProcedure"
})
public class SchemaProcedureType {

    @XmlElement(name = "CreateStaticString", required = true)
    protected CreateStaticStringType createStaticString;
    @XmlElement(name = "SqlInvokedProcedure", required = true)
    protected SqlInvokedProcedureType sqlInvokedProcedure;

    /**
     * Gets the value of the createStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link CreateStaticStringType }
     *     
     */
    public CreateStaticStringType getCreateStaticString() {
        return createStaticString;
    }

    /**
     * Sets the value of the createStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateStaticStringType }
     *     
     */
    public void setCreateStaticString(CreateStaticStringType value) {
        this.createStaticString = value;
    }

    /**
     * Gets the value of the sqlInvokedProcedure property.
     * 
     * @return
     *     possible object is
     *     {@link SqlInvokedProcedureType }
     *     
     */
    public SqlInvokedProcedureType getSqlInvokedProcedure() {
        return sqlInvokedProcedure;
    }

    /**
     * Sets the value of the sqlInvokedProcedure property.
     * 
     * @param value
     *     allowed object is
     *     {@link SqlInvokedProcedureType }
     *     
     */
    public void setSqlInvokedProcedure(SqlInvokedProcedureType value) {
        this.sqlInvokedProcedure = value;
    }

}