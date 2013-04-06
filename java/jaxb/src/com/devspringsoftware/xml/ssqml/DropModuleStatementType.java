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
 * <p>Java class for DropModuleStatementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DropModuleStatementType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}DropModuleStaticString"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}SqlServerModuleName"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}DropBehavior"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DropModuleStatementType", propOrder = {
    "dropModuleStaticString",
    "sqlServerModuleName",
    "dropBehavior"
})
public class DropModuleStatementType {

    @XmlElement(name = "DropModuleStaticString", required = true)
    protected DropModuleStaticStringType dropModuleStaticString;
    @XmlElement(name = "SqlServerModuleName", required = true)
    protected SchemaQualifiedNameType sqlServerModuleName;
    @XmlElement(name = "DropBehavior", required = true)
    protected DropBehaviorType dropBehavior;

    /**
     * Gets the value of the dropModuleStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link DropModuleStaticStringType }
     *     
     */
    public DropModuleStaticStringType getDropModuleStaticString() {
        return dropModuleStaticString;
    }

    /**
     * Sets the value of the dropModuleStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link DropModuleStaticStringType }
     *     
     */
    public void setDropModuleStaticString(DropModuleStaticStringType value) {
        this.dropModuleStaticString = value;
    }

    /**
     * Gets the value of the sqlServerModuleName property.
     * 
     * @return
     *     possible object is
     *     {@link SchemaQualifiedNameType }
     *     
     */
    public SchemaQualifiedNameType getSqlServerModuleName() {
        return sqlServerModuleName;
    }

    /**
     * Sets the value of the sqlServerModuleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link SchemaQualifiedNameType }
     *     
     */
    public void setSqlServerModuleName(SchemaQualifiedNameType value) {
        this.sqlServerModuleName = value;
    }

    /**
     * Gets the value of the dropBehavior property.
     * 
     * @return
     *     possible object is
     *     {@link DropBehaviorType }
     *     
     */
    public DropBehaviorType getDropBehavior() {
        return dropBehavior;
    }

    /**
     * Sets the value of the dropBehavior property.
     * 
     * @param value
     *     allowed object is
     *     {@link DropBehaviorType }
     *     
     */
    public void setDropBehavior(DropBehaviorType value) {
        this.dropBehavior = value;
    }

}
