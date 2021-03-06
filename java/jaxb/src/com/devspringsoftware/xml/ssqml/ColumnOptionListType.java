//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.03 at 08:58:47 PM EDT 
//


package com.devspringsoftware.xml.ssqml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ColumnOptionListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ColumnOptionListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}ScopeClause" minOccurs="0"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}DefaultClause" minOccurs="0"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}ColumnConstraintDefinition" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ColumnOptionListType", propOrder = {
    "scopeClause",
    "defaultClause",
    "columnConstraintDefinition"
})
public class ColumnOptionListType {

    @XmlElement(name = "ScopeClause")
    protected ScopeClauseType scopeClause;
    @XmlElementRef(name = "DefaultClause", namespace = "http://www.devspringsoftware.com", type = JAXBElement.class, required = false)
    protected JAXBElement<DefaultClauseType> defaultClause;
    @XmlElement(name = "ColumnConstraintDefinition")
    protected List<ColumnConstraintDefinitionType> columnConstraintDefinition;

    /**
     * Gets the value of the scopeClause property.
     * 
     * @return
     *     possible object is
     *     {@link ScopeClauseType }
     *     
     */
    public ScopeClauseType getScopeClause() {
        return scopeClause;
    }

    /**
     * Sets the value of the scopeClause property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScopeClauseType }
     *     
     */
    public void setScopeClause(ScopeClauseType value) {
        this.scopeClause = value;
    }

    /**
     * Gets the value of the defaultClause property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DefaultClauseType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DefaultClauseType }{@code >}
     *     
     */
    public JAXBElement<DefaultClauseType> getDefaultClause() {
        return defaultClause;
    }

    /**
     * Sets the value of the defaultClause property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DefaultClauseType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DefaultClauseType }{@code >}
     *     
     */
    public void setDefaultClause(JAXBElement<DefaultClauseType> value) {
        this.defaultClause = value;
    }

    /**
     * Gets the value of the columnConstraintDefinition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the columnConstraintDefinition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getColumnConstraintDefinition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ColumnConstraintDefinitionType }
     * 
     * 
     */
    public List<ColumnConstraintDefinitionType> getColumnConstraintDefinition() {
        if (columnConstraintDefinition == null) {
            columnConstraintDefinition = new ArrayList<ColumnConstraintDefinitionType>();
        }
        return this.columnConstraintDefinition;
    }

}
