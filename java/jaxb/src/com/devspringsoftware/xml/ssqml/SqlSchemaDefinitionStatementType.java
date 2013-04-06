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
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SqlSchemaDefinitionStatementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SqlSchemaDefinitionStatementType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.devspringsoftware.com}SchemaDefinition"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}TableDefinition"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}ViewDefinition"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}SqlInvokedRoutine"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}GrantStatement"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}RoleDefinition"/>
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
 *         &lt;element ref="{http://www.devspringsoftware.com}SequenceGeneratorDefinition"/>
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
@XmlType(name = "SqlSchemaDefinitionStatementType", propOrder = {
    "schemaDefinitionOrTableDefinitionOrViewDefinition"
})
public class SqlSchemaDefinitionStatementType {

    @XmlElements({
        @XmlElement(name = "SchemaDefinition", type = SchemaDefinitionType.class),
        @XmlElement(name = "TableDefinition", type = TableDefinitionType.class),
        @XmlElement(name = "ViewDefinition", type = ViewDefinitionType.class),
        @XmlElement(name = "SqlInvokedRoutine", type = SchemaRoutineType.class),
        @XmlElement(name = "GrantStatement", type = GrantStatementType.class),
        @XmlElement(name = "RoleDefinition", type = RoleDefinitionType.class),
        @XmlElement(name = "DomainDefinition", type = DomainDefinitionType.class),
        @XmlElement(name = "CharacterSetDefinition", type = CharacterSetDefinitionType.class),
        @XmlElement(name = "CollationDefinition", type = CollationDefinitionType.class),
        @XmlElement(name = "TransliterationDefinition", type = TransliterationDefinitionType.class),
        @XmlElement(name = "AssertionDefinition", type = AssertionDefinitionType.class),
        @XmlElement(name = "TriggerDefinition", type = TriggerDefinitionType.class),
        @XmlElement(name = "UserDefinedTypeDefinition", type = UserDefinedTypeDefinitionType.class),
        @XmlElement(name = "UserDefinedCastDefinition", type = UserDefinedCastDefinitionType.class),
        @XmlElement(name = "UserDefinedOrderingDefinition", type = UserDefinedOrderingDefinitionType.class),
        @XmlElement(name = "TransformDefinition", type = TransformDefinitionType.class),
        @XmlElement(name = "SequenceGeneratorDefinition", type = SequenceGeneratorDefinitionType.class),
        @XmlElement(name = "SqlServerModuleDefinition", type = SqlServerModuleDefinitionType.class)
    })
    protected Object schemaDefinitionOrTableDefinitionOrViewDefinition;

    /**
     * Gets the value of the schemaDefinitionOrTableDefinitionOrViewDefinition property.
     * 
     * @return
     *     possible object is
     *     {@link SchemaDefinitionType }
     *     {@link TableDefinitionType }
     *     {@link ViewDefinitionType }
     *     {@link SchemaRoutineType }
     *     {@link GrantStatementType }
     *     {@link RoleDefinitionType }
     *     {@link DomainDefinitionType }
     *     {@link CharacterSetDefinitionType }
     *     {@link CollationDefinitionType }
     *     {@link TransliterationDefinitionType }
     *     {@link AssertionDefinitionType }
     *     {@link TriggerDefinitionType }
     *     {@link UserDefinedTypeDefinitionType }
     *     {@link UserDefinedCastDefinitionType }
     *     {@link UserDefinedOrderingDefinitionType }
     *     {@link TransformDefinitionType }
     *     {@link SequenceGeneratorDefinitionType }
     *     {@link SqlServerModuleDefinitionType }
     *     
     */
    public Object getSchemaDefinitionOrTableDefinitionOrViewDefinition() {
        return schemaDefinitionOrTableDefinitionOrViewDefinition;
    }

    /**
     * Sets the value of the schemaDefinitionOrTableDefinitionOrViewDefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link SchemaDefinitionType }
     *     {@link TableDefinitionType }
     *     {@link ViewDefinitionType }
     *     {@link SchemaRoutineType }
     *     {@link GrantStatementType }
     *     {@link RoleDefinitionType }
     *     {@link DomainDefinitionType }
     *     {@link CharacterSetDefinitionType }
     *     {@link CollationDefinitionType }
     *     {@link TransliterationDefinitionType }
     *     {@link AssertionDefinitionType }
     *     {@link TriggerDefinitionType }
     *     {@link UserDefinedTypeDefinitionType }
     *     {@link UserDefinedCastDefinitionType }
     *     {@link UserDefinedOrderingDefinitionType }
     *     {@link TransformDefinitionType }
     *     {@link SequenceGeneratorDefinitionType }
     *     {@link SqlServerModuleDefinitionType }
     *     
     */
    public void setSchemaDefinitionOrTableDefinitionOrViewDefinition(Object value) {
        this.schemaDefinitionOrTableDefinitionOrViewDefinition = value;
    }

}
