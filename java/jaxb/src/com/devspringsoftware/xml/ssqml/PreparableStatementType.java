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
 * <p>Java class for PreparableStatementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PreparableStatementType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.devspringsoftware.com}PreparableSqlDataStatement"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}PreparableSqlSchemaStatement"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}PreparableSqlTransactionStatement"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}PreparableSqlControlStatement"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}PreparableSqlSessionStatement"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PreparableStatementType", propOrder = {
    "preparableSqlDataStatementOrPreparableSqlSchemaStatementOrPreparableSqlTransactionStatement"
})
public class PreparableStatementType {

    @XmlElements({
        @XmlElement(name = "PreparableSqlDataStatement", type = PreparableSqlDataStatementType.class),
        @XmlElement(name = "PreparableSqlSchemaStatement", type = SqlSchemaStatementType.class),
        @XmlElement(name = "PreparableSqlTransactionStatement", type = SqlTransactionStatementType.class),
        @XmlElement(name = "PreparableSqlControlStatement", type = SqlControlStatementType.class),
        @XmlElement(name = "PreparableSqlSessionStatement", type = SqlSessionStatementType.class)
    })
    protected Object preparableSqlDataStatementOrPreparableSqlSchemaStatementOrPreparableSqlTransactionStatement;

    /**
     * Gets the value of the preparableSqlDataStatementOrPreparableSqlSchemaStatementOrPreparableSqlTransactionStatement property.
     * 
     * @return
     *     possible object is
     *     {@link PreparableSqlDataStatementType }
     *     {@link SqlSchemaStatementType }
     *     {@link SqlTransactionStatementType }
     *     {@link SqlControlStatementType }
     *     {@link SqlSessionStatementType }
     *     
     */
    public Object getPreparableSqlDataStatementOrPreparableSqlSchemaStatementOrPreparableSqlTransactionStatement() {
        return preparableSqlDataStatementOrPreparableSqlSchemaStatementOrPreparableSqlTransactionStatement;
    }

    /**
     * Sets the value of the preparableSqlDataStatementOrPreparableSqlSchemaStatementOrPreparableSqlTransactionStatement property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreparableSqlDataStatementType }
     *     {@link SqlSchemaStatementType }
     *     {@link SqlTransactionStatementType }
     *     {@link SqlControlStatementType }
     *     {@link SqlSessionStatementType }
     *     
     */
    public void setPreparableSqlDataStatementOrPreparableSqlSchemaStatementOrPreparableSqlTransactionStatement(Object value) {
        this.preparableSqlDataStatementOrPreparableSqlSchemaStatementOrPreparableSqlTransactionStatement = value;
    }

}
