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
 * <p>Java class for OrdinaryGroupingSet_ISO9075ChoiceGroup1Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrdinaryGroupingSet_ISO9075ChoiceGroup1Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}LeftParen"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}GroupingColumnReferenceList"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}RightParen"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrdinaryGroupingSet_ISO9075ChoiceGroup1Type", propOrder = {
    "leftParen",
    "groupingColumnReferenceList",
    "rightParen"
})
public class OrdinaryGroupingSetISO9075ChoiceGroup1Type {

    @XmlElement(name = "LeftParen", required = true)
    protected String leftParen;
    @XmlElement(name = "GroupingColumnReferenceList", required = true)
    protected GroupingColumnReferenceListType groupingColumnReferenceList;
    @XmlElement(name = "RightParen", required = true)
    protected String rightParen;

    /**
     * Gets the value of the leftParen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeftParen() {
        return leftParen;
    }

    /**
     * Sets the value of the leftParen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeftParen(String value) {
        this.leftParen = value;
    }

    /**
     * Gets the value of the groupingColumnReferenceList property.
     * 
     * @return
     *     possible object is
     *     {@link GroupingColumnReferenceListType }
     *     
     */
    public GroupingColumnReferenceListType getGroupingColumnReferenceList() {
        return groupingColumnReferenceList;
    }

    /**
     * Sets the value of the groupingColumnReferenceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupingColumnReferenceListType }
     *     
     */
    public void setGroupingColumnReferenceList(GroupingColumnReferenceListType value) {
        this.groupingColumnReferenceList = value;
    }

    /**
     * Gets the value of the rightParen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRightParen() {
        return rightParen;
    }

    /**
     * Sets the value of the rightParen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRightParen(String value) {
        this.rightParen = value;
    }

}
