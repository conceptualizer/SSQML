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
 * <p>Java class for SpecificRoutineDesignator_ISO9075ChoiceGroup2Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpecificRoutineDesignator_ISO9075ChoiceGroup2Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}RoutineType"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}MemberName"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}ForStaticString" minOccurs="0"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}SchemaResolvedUserDefinedTypeName" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpecificRoutineDesignator_ISO9075ChoiceGroup2Type", propOrder = {
    "routineType",
    "memberName",
    "forStaticString",
    "schemaResolvedUserDefinedTypeName"
})
public class SpecificRoutineDesignatorISO9075ChoiceGroup2Type {

    @XmlElement(name = "RoutineType", required = true)
    protected RoutineTypeType routineType;
    @XmlElement(name = "MemberName", required = true)
    protected MemberNameType memberName;
    @XmlElement(name = "ForStaticString")
    protected ForStaticStringType forStaticString;
    @XmlElement(name = "SchemaResolvedUserDefinedTypeName")
    protected SchemaQualifiedTypeNameType schemaResolvedUserDefinedTypeName;

    /**
     * Gets the value of the routineType property.
     * 
     * @return
     *     possible object is
     *     {@link RoutineTypeType }
     *     
     */
    public RoutineTypeType getRoutineType() {
        return routineType;
    }

    /**
     * Sets the value of the routineType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoutineTypeType }
     *     
     */
    public void setRoutineType(RoutineTypeType value) {
        this.routineType = value;
    }

    /**
     * Gets the value of the memberName property.
     * 
     * @return
     *     possible object is
     *     {@link MemberNameType }
     *     
     */
    public MemberNameType getMemberName() {
        return memberName;
    }

    /**
     * Sets the value of the memberName property.
     * 
     * @param value
     *     allowed object is
     *     {@link MemberNameType }
     *     
     */
    public void setMemberName(MemberNameType value) {
        this.memberName = value;
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
