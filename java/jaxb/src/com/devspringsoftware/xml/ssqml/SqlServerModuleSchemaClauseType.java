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
 * <p>Java class for SqlServerModuleSchemaClauseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SqlServerModuleSchemaClauseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}SchemaStaticString"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}DefaultSchemaName"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SqlServerModuleSchemaClauseType", propOrder = {
    "schemaStaticString",
    "defaultSchemaName"
})
public class SqlServerModuleSchemaClauseType {

    @XmlElement(name = "SchemaStaticString", required = true)
    protected SchemaStaticStringType schemaStaticString;
    @XmlElement(name = "DefaultSchemaName", required = true)
    protected SchemaNameType defaultSchemaName;

    /**
     * Gets the value of the schemaStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link SchemaStaticStringType }
     *     
     */
    public SchemaStaticStringType getSchemaStaticString() {
        return schemaStaticString;
    }

    /**
     * Sets the value of the schemaStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link SchemaStaticStringType }
     *     
     */
    public void setSchemaStaticString(SchemaStaticStringType value) {
        this.schemaStaticString = value;
    }

    /**
     * Gets the value of the defaultSchemaName property.
     * 
     * @return
     *     possible object is
     *     {@link SchemaNameType }
     *     
     */
    public SchemaNameType getDefaultSchemaName() {
        return defaultSchemaName;
    }

    /**
     * Sets the value of the defaultSchemaName property.
     * 
     * @param value
     *     allowed object is
     *     {@link SchemaNameType }
     *     
     */
    public void setDefaultSchemaName(SchemaNameType value) {
        this.defaultSchemaName = value;
    }

}
