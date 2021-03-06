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
 * <p>Java class for SchemaElementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SchemaElementType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.devspringsoftware.com}TableDefinition"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}ViewDefinition"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}DomainDefinition"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}CharacterSetDefinition"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}CollationDefinition"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}TransliterationDefinition"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}AssertionDefinition"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}TriggerDefinition"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}UserDefinedTypeDefinition"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}UserDefinedCastDefinition"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}UserDefinedOrderingDefinition"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}TransformDefinition"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}SchemaRoutine"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}SequenceGeneratorDefinition"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}GrantStatement"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}RoleDefinition"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}SqlServerModuleDefinition"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SchemaElementType", propOrder = {
    "tableDefinitionOrViewDefinitionOrDomainDefinition"
})
public class SchemaElementType {

    @XmlElementRefs({
        @XmlElementRef(name = "AssertionDefinition", namespace = "http://www.devspringsoftware.com", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TriggerDefinition", namespace = "http://www.devspringsoftware.com", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "UserDefinedTypeDefinition", namespace = "http://www.devspringsoftware.com", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CollationDefinition", namespace = "http://www.devspringsoftware.com", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SqlServerModuleDefinition", namespace = "http://www.devspringsoftware.com", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "GrantStatement", namespace = "http://www.devspringsoftware.com", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ViewDefinition", namespace = "http://www.devspringsoftware.com", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "UserDefinedCastDefinition", namespace = "http://www.devspringsoftware.com", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SequenceGeneratorDefinition", namespace = "http://www.devspringsoftware.com", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "DomainDefinition", namespace = "http://www.devspringsoftware.com", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "RoleDefinition", namespace = "http://www.devspringsoftware.com", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SchemaRoutine", namespace = "http://www.devspringsoftware.com", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "CharacterSetDefinition", namespace = "http://www.devspringsoftware.com", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TransliterationDefinition", namespace = "http://www.devspringsoftware.com", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TableDefinition", namespace = "http://www.devspringsoftware.com", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "UserDefinedOrderingDefinition", namespace = "http://www.devspringsoftware.com", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TransformDefinition", namespace = "http://www.devspringsoftware.com", type = JAXBElement.class, required = false)
    })
    protected JAXBElement<?> tableDefinitionOrViewDefinitionOrDomainDefinition;

    /**
     * Gets the value of the tableDefinitionOrViewDefinitionOrDomainDefinition property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UserDefinedTypeDefinitionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TriggerDefinitionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AssertionDefinitionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CollationDefinitionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SqlServerModuleDefinitionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ViewDefinitionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GrantStatementType }{@code >}
     *     {@link JAXBElement }{@code <}{@link UserDefinedCastDefinitionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SequenceGeneratorDefinitionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DomainDefinitionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CharacterSetDefinitionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SchemaRoutineType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RoleDefinitionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TransliterationDefinitionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SchemaRoutineType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TransformDefinitionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link UserDefinedOrderingDefinitionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TableDefinitionType }{@code >}
     *     
     */
    public JAXBElement<?> getTableDefinitionOrViewDefinitionOrDomainDefinition() {
        return tableDefinitionOrViewDefinitionOrDomainDefinition;
    }

    /**
     * Sets the value of the tableDefinitionOrViewDefinitionOrDomainDefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UserDefinedTypeDefinitionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TriggerDefinitionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AssertionDefinitionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CollationDefinitionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SqlServerModuleDefinitionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ViewDefinitionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link GrantStatementType }{@code >}
     *     {@link JAXBElement }{@code <}{@link UserDefinedCastDefinitionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SequenceGeneratorDefinitionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DomainDefinitionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CharacterSetDefinitionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SchemaRoutineType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RoleDefinitionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TransliterationDefinitionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SchemaRoutineType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TransformDefinitionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link UserDefinedOrderingDefinitionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TableDefinitionType }{@code >}
     *     
     */
    public void setTableDefinitionOrViewDefinitionOrDomainDefinition(JAXBElement<?> value) {
        this.tableDefinitionOrViewDefinitionOrDomainDefinition = value;
    }

}
