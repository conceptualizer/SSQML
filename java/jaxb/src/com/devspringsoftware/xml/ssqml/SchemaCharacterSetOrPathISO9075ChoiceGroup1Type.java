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
 * <p>Java class for SchemaCharacterSetOrPath_ISO9075ChoiceGroup1Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SchemaCharacterSetOrPath_ISO9075ChoiceGroup1Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}SchemaCharacterSetSpecification2"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}SchemaPathSpecification2"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SchemaCharacterSetOrPath_ISO9075ChoiceGroup1Type", propOrder = {
    "schemaCharacterSetSpecification2",
    "schemaPathSpecification2"
})
public class SchemaCharacterSetOrPathISO9075ChoiceGroup1Type {

    @XmlElement(name = "SchemaCharacterSetSpecification2", required = true)
    protected SchemaCharacterSetSpecificationType schemaCharacterSetSpecification2;
    @XmlElement(name = "SchemaPathSpecification2", required = true)
    protected PathSpecificationType schemaPathSpecification2;

    /**
     * Gets the value of the schemaCharacterSetSpecification2 property.
     * 
     * @return
     *     possible object is
     *     {@link SchemaCharacterSetSpecificationType }
     *     
     */
    public SchemaCharacterSetSpecificationType getSchemaCharacterSetSpecification2() {
        return schemaCharacterSetSpecification2;
    }

    /**
     * Sets the value of the schemaCharacterSetSpecification2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link SchemaCharacterSetSpecificationType }
     *     
     */
    public void setSchemaCharacterSetSpecification2(SchemaCharacterSetSpecificationType value) {
        this.schemaCharacterSetSpecification2 = value;
    }

    /**
     * Gets the value of the schemaPathSpecification2 property.
     * 
     * @return
     *     possible object is
     *     {@link PathSpecificationType }
     *     
     */
    public PathSpecificationType getSchemaPathSpecification2() {
        return schemaPathSpecification2;
    }

    /**
     * Sets the value of the schemaPathSpecification2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link PathSpecificationType }
     *     
     */
    public void setSchemaPathSpecification2(PathSpecificationType value) {
        this.schemaPathSpecification2 = value;
    }

}
