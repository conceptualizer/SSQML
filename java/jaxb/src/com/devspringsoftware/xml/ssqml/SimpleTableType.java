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
 * <p>Java class for SimpleTableType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SimpleTableType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.devspringsoftware.com}QuerySpecification"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}TableValueConstructor"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}ExplicitTable"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SimpleTableType", propOrder = {
    "querySpecificationOrTableValueConstructorOrExplicitTable"
})
public class SimpleTableType {

    @XmlElements({
        @XmlElement(name = "QuerySpecification", type = QuerySpecificationType.class),
        @XmlElement(name = "TableValueConstructor", type = TableValueConstructorType.class),
        @XmlElement(name = "ExplicitTable", type = ExplicitTableType.class)
    })
    protected Object querySpecificationOrTableValueConstructorOrExplicitTable;

    /**
     * Gets the value of the querySpecificationOrTableValueConstructorOrExplicitTable property.
     * 
     * @return
     *     possible object is
     *     {@link QuerySpecificationType }
     *     {@link TableValueConstructorType }
     *     {@link ExplicitTableType }
     *     
     */
    public Object getQuerySpecificationOrTableValueConstructorOrExplicitTable() {
        return querySpecificationOrTableValueConstructorOrExplicitTable;
    }

    /**
     * Sets the value of the querySpecificationOrTableValueConstructorOrExplicitTable property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuerySpecificationType }
     *     {@link TableValueConstructorType }
     *     {@link ExplicitTableType }
     *     
     */
    public void setQuerySpecificationOrTableValueConstructorOrExplicitTable(Object value) {
        this.querySpecificationOrTableValueConstructorOrExplicitTable = value;
    }

}
