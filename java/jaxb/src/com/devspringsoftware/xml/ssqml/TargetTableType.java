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
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TargetTableType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TargetTableType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.devspringsoftware.com}TableName"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}TargetTable_ISO9075ChoiceGroup1"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TargetTableType", propOrder = {
    "tableNameOrTargetTableISO9075ChoiceGroup1"
})
public class TargetTableType {

    @XmlElementRefs({
        @XmlElementRef(name = "TargetTable_ISO9075ChoiceGroup1", namespace = "http://www.devspringsoftware.com", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TableName", namespace = "http://www.devspringsoftware.com", type = JAXBElement.class, required = false)
    })
    protected JAXBElement<?> tableNameOrTargetTableISO9075ChoiceGroup1;

    /**
     * Gets the value of the tableNameOrTargetTableISO9075ChoiceGroup1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LocalOrSchemaQualifiedNameType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LocalOrSchemaQualifiedNameType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TargetTableISO9075ChoiceGroup1Type }{@code >}
     *     {@link JAXBElement }{@code <}{@link LocalOrSchemaQualifiedNameType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LocalOrSchemaQualifiedNameType }{@code >}
     *     
     */
    public JAXBElement<?> getTableNameOrTargetTableISO9075ChoiceGroup1() {
        return tableNameOrTargetTableISO9075ChoiceGroup1;
    }

    /**
     * Sets the value of the tableNameOrTargetTableISO9075ChoiceGroup1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LocalOrSchemaQualifiedNameType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LocalOrSchemaQualifiedNameType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TargetTableISO9075ChoiceGroup1Type }{@code >}
     *     {@link JAXBElement }{@code <}{@link LocalOrSchemaQualifiedNameType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LocalOrSchemaQualifiedNameType }{@code >}
     *     
     */
    public void setTableNameOrTargetTableISO9075ChoiceGroup1(JAXBElement<?> value) {
        this.tableNameOrTargetTableISO9075ChoiceGroup1 = value;
    }

}
