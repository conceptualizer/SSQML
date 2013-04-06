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
 * <p>Java class for AlterTableStatementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlterTableStatementType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}AlterTableStaticString"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}TableName"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}AlterTableAction"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlterTableStatementType", propOrder = {
    "alterTableStaticString",
    "tableName",
    "alterTableAction"
})
public class AlterTableStatementType {

    @XmlElement(name = "AlterTableStaticString", required = true)
    protected AlterTableStaticStringType alterTableStaticString;
    @XmlElementRef(name = "TableName", namespace = "http://www.devspringsoftware.com", type = JAXBElement.class)
    protected JAXBElement<LocalOrSchemaQualifiedNameType> tableName;
    @XmlElement(name = "AlterTableAction", required = true)
    protected AlterTableActionType alterTableAction;

    /**
     * Gets the value of the alterTableStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link AlterTableStaticStringType }
     *     
     */
    public AlterTableStaticStringType getAlterTableStaticString() {
        return alterTableStaticString;
    }

    /**
     * Sets the value of the alterTableStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlterTableStaticStringType }
     *     
     */
    public void setAlterTableStaticString(AlterTableStaticStringType value) {
        this.alterTableStaticString = value;
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
     * Gets the value of the alterTableAction property.
     * 
     * @return
     *     possible object is
     *     {@link AlterTableActionType }
     *     
     */
    public AlterTableActionType getAlterTableAction() {
        return alterTableAction;
    }

    /**
     * Sets the value of the alterTableAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlterTableActionType }
     *     
     */
    public void setAlterTableAction(AlterTableActionType value) {
        this.alterTableAction = value;
    }

}