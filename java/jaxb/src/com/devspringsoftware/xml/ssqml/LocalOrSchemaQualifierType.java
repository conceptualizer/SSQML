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
 * <p>Java class for LocalOrSchemaQualifierType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocalOrSchemaQualifierType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.devspringsoftware.com}SchemaName"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}ModuleStaticString"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocalOrSchemaQualifierType", propOrder = {
    "schemaNameOrModuleStaticString"
})
public class LocalOrSchemaQualifierType {

    @XmlElementRefs({
        @XmlElementRef(name = "SchemaName", namespace = "http://www.devspringsoftware.com", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ModuleStaticString", namespace = "http://www.devspringsoftware.com", type = JAXBElement.class, required = false)
    })
    protected JAXBElement<?> schemaNameOrModuleStaticString;

    /**
     * Gets the value of the schemaNameOrModuleStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link SchemaNameType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SchemaNameType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ModuleStaticStringType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ModuleStaticStringType }{@code >}
     *     
     */
    public JAXBElement<?> getSchemaNameOrModuleStaticString() {
        return schemaNameOrModuleStaticString;
    }

    /**
     * Sets the value of the schemaNameOrModuleStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link SchemaNameType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SchemaNameType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ModuleStaticStringType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ModuleStaticStringType }{@code >}
     *     
     */
    public void setSchemaNameOrModuleStaticString(JAXBElement<?> value) {
        this.schemaNameOrModuleStaticString = value;
    }

}
