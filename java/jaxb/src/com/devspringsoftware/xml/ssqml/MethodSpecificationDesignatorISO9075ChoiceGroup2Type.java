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
 * <p>Java class for MethodSpecificationDesignator_ISO9075ChoiceGroup2Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MethodSpecificationDesignator_ISO9075ChoiceGroup2Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://www.devspringsoftware.com}InstanceStaticString" minOccurs="0"/>
 *           &lt;element ref="{http://www.devspringsoftware.com}StaticStaticString" minOccurs="0"/>
 *           &lt;element ref="{http://www.devspringsoftware.com}ConstructorStaticString" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.devspringsoftware.com}MethodStaticString"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}MethodName"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}SqlParameterDeclarationList"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}ReturnsClause" minOccurs="0"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}ForStaticString"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}SchemaResolvedUserDefinedTypeName"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MethodSpecificationDesignator_ISO9075ChoiceGroup2Type", propOrder = {
    "instanceStaticStringOrStaticStaticStringOrConstructorStaticString",
    "methodStaticString",
    "methodName",
    "sqlParameterDeclarationList",
    "returnsClause",
    "forStaticString",
    "schemaResolvedUserDefinedTypeName"
})
public class MethodSpecificationDesignatorISO9075ChoiceGroup2Type {

    @XmlElements({
        @XmlElement(name = "InstanceStaticString", type = InstanceStaticStringType.class),
        @XmlElement(name = "StaticStaticString", type = StaticStaticStringType.class),
        @XmlElement(name = "ConstructorStaticString", type = ConstructorStaticStringType.class)
    })
    protected Object instanceStaticStringOrStaticStaticStringOrConstructorStaticString;
    @XmlElement(name = "MethodStaticString", required = true)
    protected MethodStaticStringType methodStaticString;
    @XmlElement(name = "MethodName", required = true)
    protected ActualIdentifierType methodName;
    @XmlElement(name = "SqlParameterDeclarationList", required = true)
    protected SqlParameterDeclarationListType sqlParameterDeclarationList;
    @XmlElement(name = "ReturnsClause")
    protected ReturnsClauseType returnsClause;
    @XmlElement(name = "ForStaticString", required = true)
    protected ForStaticStringType forStaticString;
    @XmlElement(name = "SchemaResolvedUserDefinedTypeName", required = true)
    protected SchemaQualifiedTypeNameType schemaResolvedUserDefinedTypeName;

    /**
     * Gets the value of the instanceStaticStringOrStaticStaticStringOrConstructorStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link InstanceStaticStringType }
     *     {@link StaticStaticStringType }
     *     {@link ConstructorStaticStringType }
     *     
     */
    public Object getInstanceStaticStringOrStaticStaticStringOrConstructorStaticString() {
        return instanceStaticStringOrStaticStaticStringOrConstructorStaticString;
    }

    /**
     * Sets the value of the instanceStaticStringOrStaticStaticStringOrConstructorStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstanceStaticStringType }
     *     {@link StaticStaticStringType }
     *     {@link ConstructorStaticStringType }
     *     
     */
    public void setInstanceStaticStringOrStaticStaticStringOrConstructorStaticString(Object value) {
        this.instanceStaticStringOrStaticStaticStringOrConstructorStaticString = value;
    }

    /**
     * Gets the value of the methodStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link MethodStaticStringType }
     *     
     */
    public MethodStaticStringType getMethodStaticString() {
        return methodStaticString;
    }

    /**
     * Sets the value of the methodStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link MethodStaticStringType }
     *     
     */
    public void setMethodStaticString(MethodStaticStringType value) {
        this.methodStaticString = value;
    }

    /**
     * Gets the value of the methodName property.
     * 
     * @return
     *     possible object is
     *     {@link ActualIdentifierType }
     *     
     */
    public ActualIdentifierType getMethodName() {
        return methodName;
    }

    /**
     * Sets the value of the methodName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActualIdentifierType }
     *     
     */
    public void setMethodName(ActualIdentifierType value) {
        this.methodName = value;
    }

    /**
     * Gets the value of the sqlParameterDeclarationList property.
     * 
     * @return
     *     possible object is
     *     {@link SqlParameterDeclarationListType }
     *     
     */
    public SqlParameterDeclarationListType getSqlParameterDeclarationList() {
        return sqlParameterDeclarationList;
    }

    /**
     * Sets the value of the sqlParameterDeclarationList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SqlParameterDeclarationListType }
     *     
     */
    public void setSqlParameterDeclarationList(SqlParameterDeclarationListType value) {
        this.sqlParameterDeclarationList = value;
    }

    /**
     * Gets the value of the returnsClause property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnsClauseType }
     *     
     */
    public ReturnsClauseType getReturnsClause() {
        return returnsClause;
    }

    /**
     * Sets the value of the returnsClause property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnsClauseType }
     *     
     */
    public void setReturnsClause(ReturnsClauseType value) {
        this.returnsClause = value;
    }

    /**
     * Gets the value of the forStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link ForStaticStringType }
     *     
     */
    public ForStaticStringType getForStaticString() {
        return forStaticString;
    }

    /**
     * Sets the value of the forStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForStaticStringType }
     *     
     */
    public void setForStaticString(ForStaticStringType value) {
        this.forStaticString = value;
    }

    /**
     * Gets the value of the schemaResolvedUserDefinedTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link SchemaQualifiedTypeNameType }
     *     
     */
    public SchemaQualifiedTypeNameType getSchemaResolvedUserDefinedTypeName() {
        return schemaResolvedUserDefinedTypeName;
    }

    /**
     * Sets the value of the schemaResolvedUserDefinedTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link SchemaQualifiedTypeNameType }
     *     
     */
    public void setSchemaResolvedUserDefinedTypeName(SchemaQualifiedTypeNameType value) {
        this.schemaResolvedUserDefinedTypeName = value;
    }

}