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
 * <p>Java class for MultipleColumnAssignmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MultipleColumnAssignmentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}SetTargetList"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}EqualsOperator"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}AssignedRow"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultipleColumnAssignmentType", propOrder = {
    "setTargetList",
    "equalsOperator",
    "assignedRow"
})
public class MultipleColumnAssignmentType {

    @XmlElement(name = "SetTargetList", required = true)
    protected SetTargetListType setTargetList;
    @XmlElement(name = "EqualsOperator", required = true)
    protected String equalsOperator;
    @XmlElement(name = "AssignedRow", required = true)
    protected AssignedRowType assignedRow;

    /**
     * Gets the value of the setTargetList property.
     * 
     * @return
     *     possible object is
     *     {@link SetTargetListType }
     *     
     */
    public SetTargetListType getSetTargetList() {
        return setTargetList;
    }

    /**
     * Sets the value of the setTargetList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SetTargetListType }
     *     
     */
    public void setSetTargetList(SetTargetListType value) {
        this.setTargetList = value;
    }

    /**
     * Gets the value of the equalsOperator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEqualsOperator() {
        return equalsOperator;
    }

    /**
     * Sets the value of the equalsOperator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEqualsOperator(String value) {
        this.equalsOperator = value;
    }

    /**
     * Gets the value of the assignedRow property.
     * 
     * @return
     *     possible object is
     *     {@link AssignedRowType }
     *     
     */
    public AssignedRowType getAssignedRow() {
        return assignedRow;
    }

    /**
     * Sets the value of the assignedRow property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssignedRowType }
     *     
     */
    public void setAssignedRow(AssignedRowType value) {
        this.assignedRow = value;
    }

}
