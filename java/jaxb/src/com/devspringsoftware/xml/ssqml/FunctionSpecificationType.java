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
 * <p>Java class for FunctionSpecificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FunctionSpecificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}FunctionStaticString"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}SchemaQualifiedRoutineName"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}SqlParameterDeclarationList"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}ReturnsClause"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}RoutineCharacteristics"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}DispatchClause" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FunctionSpecificationType", propOrder = {
    "functionStaticString",
    "schemaQualifiedRoutineName",
    "sqlParameterDeclarationList",
    "returnsClause",
    "routineCharacteristics",
    "dispatchClause"
})
public class FunctionSpecificationType {

    @XmlElement(name = "FunctionStaticString", required = true)
    protected FunctionStaticStringType functionStaticString;
    @XmlElement(name = "SchemaQualifiedRoutineName", required = true)
    protected SchemaQualifiedNameType schemaQualifiedRoutineName;
    @XmlElement(name = "SqlParameterDeclarationList", required = true)
    protected SqlParameterDeclarationListType sqlParameterDeclarationList;
    @XmlElement(name = "ReturnsClause", required = true)
    protected ReturnsClauseType returnsClause;
    @XmlElement(name = "RoutineCharacteristics", required = true)
    protected RoutineCharacteristicsType routineCharacteristics;
    @XmlElement(name = "DispatchClause")
    protected DispatchClauseType dispatchClause;

    /**
     * Gets the value of the functionStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link FunctionStaticStringType }
     *     
     */
    public FunctionStaticStringType getFunctionStaticString() {
        return functionStaticString;
    }

    /**
     * Sets the value of the functionStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link FunctionStaticStringType }
     *     
     */
    public void setFunctionStaticString(FunctionStaticStringType value) {
        this.functionStaticString = value;
    }

    /**
     * Gets the value of the schemaQualifiedRoutineName property.
     * 
     * @return
     *     possible object is
     *     {@link SchemaQualifiedNameType }
     *     
     */
    public SchemaQualifiedNameType getSchemaQualifiedRoutineName() {
        return schemaQualifiedRoutineName;
    }

    /**
     * Sets the value of the schemaQualifiedRoutineName property.
     * 
     * @param value
     *     allowed object is
     *     {@link SchemaQualifiedNameType }
     *     
     */
    public void setSchemaQualifiedRoutineName(SchemaQualifiedNameType value) {
        this.schemaQualifiedRoutineName = value;
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
     * Gets the value of the routineCharacteristics property.
     * 
     * @return
     *     possible object is
     *     {@link RoutineCharacteristicsType }
     *     
     */
    public RoutineCharacteristicsType getRoutineCharacteristics() {
        return routineCharacteristics;
    }

    /**
     * Sets the value of the routineCharacteristics property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoutineCharacteristicsType }
     *     
     */
    public void setRoutineCharacteristics(RoutineCharacteristicsType value) {
        this.routineCharacteristics = value;
    }

    /**
     * Gets the value of the dispatchClause property.
     * 
     * @return
     *     possible object is
     *     {@link DispatchClauseType }
     *     
     */
    public DispatchClauseType getDispatchClause() {
        return dispatchClause;
    }

    /**
     * Sets the value of the dispatchClause property.
     * 
     * @param value
     *     allowed object is
     *     {@link DispatchClauseType }
     *     
     */
    public void setDispatchClause(DispatchClauseType value) {
        this.dispatchClause = value;
    }

}
