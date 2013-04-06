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
 * <p>Java class for TableElementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TableElementType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.devspringsoftware.com}ColumnDefinition"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}TableConstraintDefinition"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}LikeClause"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}SelfReferencingColumnSpecification"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}ColumnOptions"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TableElementType", propOrder = {
    "columnDefinitionOrTableConstraintDefinitionOrLikeClause"
})
public class TableElementType {

    @XmlElements({
        @XmlElement(name = "ColumnDefinition", type = ColumnDefinitionType.class),
        @XmlElement(name = "TableConstraintDefinition", type = TableConstraintDefinitionType.class),
        @XmlElement(name = "LikeClause", type = LikeClauseType.class),
        @XmlElement(name = "SelfReferencingColumnSpecification", type = SelfReferencingColumnSpecificationType.class),
        @XmlElement(name = "ColumnOptions", type = ColumnOptionsType.class)
    })
    protected Object columnDefinitionOrTableConstraintDefinitionOrLikeClause;

    /**
     * Gets the value of the columnDefinitionOrTableConstraintDefinitionOrLikeClause property.
     * 
     * @return
     *     possible object is
     *     {@link ColumnDefinitionType }
     *     {@link TableConstraintDefinitionType }
     *     {@link LikeClauseType }
     *     {@link SelfReferencingColumnSpecificationType }
     *     {@link ColumnOptionsType }
     *     
     */
    public Object getColumnDefinitionOrTableConstraintDefinitionOrLikeClause() {
        return columnDefinitionOrTableConstraintDefinitionOrLikeClause;
    }

    /**
     * Sets the value of the columnDefinitionOrTableConstraintDefinitionOrLikeClause property.
     * 
     * @param value
     *     allowed object is
     *     {@link ColumnDefinitionType }
     *     {@link TableConstraintDefinitionType }
     *     {@link LikeClauseType }
     *     {@link SelfReferencingColumnSpecificationType }
     *     {@link ColumnOptionsType }
     *     
     */
    public void setColumnDefinitionOrTableConstraintDefinitionOrLikeClause(Object value) {
        this.columnDefinitionOrTableConstraintDefinitionOrLikeClause = value;
    }

}