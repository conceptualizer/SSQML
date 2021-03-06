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
 * <p>Java class for UserDefinedTypeBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UserDefinedTypeBodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}SchemaResolvedUserDefinedTypeName"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}SubtypeClause" minOccurs="0"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}AsStaticString" minOccurs="0"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}Representation" minOccurs="0"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}UserDefinedTypeOptionList" minOccurs="0"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}MethodSpecificationList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserDefinedTypeBodyType", propOrder = {
    "schemaResolvedUserDefinedTypeName",
    "subtypeClause",
    "asStaticString",
    "representation",
    "userDefinedTypeOptionList",
    "methodSpecificationList"
})
public class UserDefinedTypeBodyType {

    @XmlElement(name = "SchemaResolvedUserDefinedTypeName", required = true)
    protected SchemaQualifiedTypeNameType schemaResolvedUserDefinedTypeName;
    @XmlElement(name = "SubtypeClause")
    protected SubtypeClauseType subtypeClause;
    @XmlElement(name = "AsStaticString")
    protected AsStaticStringType asStaticString;
    @XmlElement(name = "Representation")
    protected RepresentationType representation;
    @XmlElement(name = "UserDefinedTypeOptionList")
    protected UserDefinedTypeOptionListType userDefinedTypeOptionList;
    @XmlElement(name = "MethodSpecificationList")
    protected MethodSpecificationListType methodSpecificationList;

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

    /**
     * Gets the value of the subtypeClause property.
     * 
     * @return
     *     possible object is
     *     {@link SubtypeClauseType }
     *     
     */
    public SubtypeClauseType getSubtypeClause() {
        return subtypeClause;
    }

    /**
     * Sets the value of the subtypeClause property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubtypeClauseType }
     *     
     */
    public void setSubtypeClause(SubtypeClauseType value) {
        this.subtypeClause = value;
    }

    /**
     * Gets the value of the asStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link AsStaticStringType }
     *     
     */
    public AsStaticStringType getAsStaticString() {
        return asStaticString;
    }

    /**
     * Sets the value of the asStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link AsStaticStringType }
     *     
     */
    public void setAsStaticString(AsStaticStringType value) {
        this.asStaticString = value;
    }

    /**
     * Gets the value of the representation property.
     * 
     * @return
     *     possible object is
     *     {@link RepresentationType }
     *     
     */
    public RepresentationType getRepresentation() {
        return representation;
    }

    /**
     * Sets the value of the representation property.
     * 
     * @param value
     *     allowed object is
     *     {@link RepresentationType }
     *     
     */
    public void setRepresentation(RepresentationType value) {
        this.representation = value;
    }

    /**
     * Gets the value of the userDefinedTypeOptionList property.
     * 
     * @return
     *     possible object is
     *     {@link UserDefinedTypeOptionListType }
     *     
     */
    public UserDefinedTypeOptionListType getUserDefinedTypeOptionList() {
        return userDefinedTypeOptionList;
    }

    /**
     * Sets the value of the userDefinedTypeOptionList property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserDefinedTypeOptionListType }
     *     
     */
    public void setUserDefinedTypeOptionList(UserDefinedTypeOptionListType value) {
        this.userDefinedTypeOptionList = value;
    }

    /**
     * Gets the value of the methodSpecificationList property.
     * 
     * @return
     *     possible object is
     *     {@link MethodSpecificationListType }
     *     
     */
    public MethodSpecificationListType getMethodSpecificationList() {
        return methodSpecificationList;
    }

    /**
     * Sets the value of the methodSpecificationList property.
     * 
     * @param value
     *     allowed object is
     *     {@link MethodSpecificationListType }
     *     
     */
    public void setMethodSpecificationList(MethodSpecificationListType value) {
        this.methodSpecificationList = value;
    }

}
