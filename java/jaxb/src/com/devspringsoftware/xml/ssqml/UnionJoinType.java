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
 * <p>Java class for UnionJoinType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnionJoinType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}TableReference"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}UnionJoinStaticString"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}TablePrimary"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnionJoinType", propOrder = {
    "tableReference",
    "unionJoinStaticString",
    "tablePrimary"
})
public class UnionJoinType {

    @XmlElement(name = "TableReference", required = true)
    protected TableReferenceType tableReference;
    @XmlElement(name = "UnionJoinStaticString", required = true)
    protected UnionJoinStaticStringType unionJoinStaticString;
    @XmlElement(name = "TablePrimary", required = true)
    protected TablePrimaryType tablePrimary;

    /**
     * Gets the value of the tableReference property.
     * 
     * @return
     *     possible object is
     *     {@link TableReferenceType }
     *     
     */
    public TableReferenceType getTableReference() {
        return tableReference;
    }

    /**
     * Sets the value of the tableReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link TableReferenceType }
     *     
     */
    public void setTableReference(TableReferenceType value) {
        this.tableReference = value;
    }

    /**
     * Gets the value of the unionJoinStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link UnionJoinStaticStringType }
     *     
     */
    public UnionJoinStaticStringType getUnionJoinStaticString() {
        return unionJoinStaticString;
    }

    /**
     * Sets the value of the unionJoinStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnionJoinStaticStringType }
     *     
     */
    public void setUnionJoinStaticString(UnionJoinStaticStringType value) {
        this.unionJoinStaticString = value;
    }

    /**
     * Gets the value of the tablePrimary property.
     * 
     * @return
     *     possible object is
     *     {@link TablePrimaryType }
     *     
     */
    public TablePrimaryType getTablePrimary() {
        return tablePrimary;
    }

    /**
     * Sets the value of the tablePrimary property.
     * 
     * @param value
     *     allowed object is
     *     {@link TablePrimaryType }
     *     
     */
    public void setTablePrimary(TablePrimaryType value) {
        this.tablePrimary = value;
    }

}
