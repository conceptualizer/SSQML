//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.03 at 08:58:47 PM EDT 
//


package com.devspringsoftware.xml.ssqml;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DropViewStatementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DropViewStatementType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}DropViewStaticString"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}TableName"/>
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
@XmlType(name = "DropViewStatementType", propOrder = {
    "dropViewStaticString",
    "tableName",
    "dropBehavior"
})
public class DropViewStatementType {

    @XmlElement(name = "DropViewStaticString", required = true)
    protected DropViewStaticStringType dropViewStaticString;
    @XmlElementRef(name = "TableName", namespace = "http://www.devspringsoftware.com", type = JAXBElement.class)
    protected JAXBElement<LocalOrSchemaQualifiedNameType> tableName;
    @XmlElement(name = "DropBehavior", required = true)
    protected DropBehaviorType dropBehavior;

    /**
     * Gets the value of the dropViewStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link DropViewStaticStringType }
     *     
     */
    public DropViewStaticStringType getDropViewStaticString() {
        return dropViewStaticString;
    }

    /**
     * Sets the value of the dropViewStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link DropViewStaticStringType }
     *     
     */
    public void setDropViewStaticString(DropViewStaticStringType value) {
        this.dropViewStaticString = value;
    }

    /**
     * Gets the value of the tableName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LocalOrSchemaQualifiedNameType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LocalOrSchemaQualifiedNameType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LocalOrSchemaQualifiedNameType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LocalOrSchemaQualifiedNameType }{@code >}
     *     
     */
    public JAXBElement<LocalOrSchemaQualifiedNameType> getTableName() {
        return tableName;
    }

    /**
     * Sets the value of the tableName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LocalOrSchemaQualifiedNameType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LocalOrSchemaQualifiedNameType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LocalOrSchemaQualifiedNameType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LocalOrSchemaQualifiedNameType }{@code >}
     *     
     */
    public void setTableName(JAXBElement<LocalOrSchemaQualifiedNameType> value) {
        this.tableName = value;
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
