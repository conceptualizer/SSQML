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
 * <p>Java class for RecursiveSearchOrder_ISO9075ChoiceGroup1Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecursiveSearchOrder_ISO9075ChoiceGroup1Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}DepthFirstByStaticString"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}SortSpecificationList"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecursiveSearchOrder_ISO9075ChoiceGroup1Type", propOrder = {
    "depthFirstByStaticString",
    "sortSpecificationList"
})
public class RecursiveSearchOrderISO9075ChoiceGroup1Type {

    @XmlElement(name = "DepthFirstByStaticString", required = true)
    protected DepthFirstByStaticStringType depthFirstByStaticString;
    @XmlElement(name = "SortSpecificationList", required = true)
    protected SortSpecificationListType sortSpecificationList;

    /**
     * Gets the value of the depthFirstByStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link DepthFirstByStaticStringType }
     *     
     */
    public DepthFirstByStaticStringType getDepthFirstByStaticString() {
        return depthFirstByStaticString;
    }

    /**
     * Sets the value of the depthFirstByStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepthFirstByStaticStringType }
     *     
     */
    public void setDepthFirstByStaticString(DepthFirstByStaticStringType value) {
        this.depthFirstByStaticString = value;
    }

    /**
     * Gets the value of the sortSpecificationList property.
     * 
     * @return
     *     possible object is
     *     {@link SortSpecificationListType }
     *     
     */
    public SortSpecificationListType getSortSpecificationList() {
        return sortSpecificationList;
    }

    /**
     * Sets the value of the sortSpecificationList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SortSpecificationListType }
     *     
     */
    public void setSortSpecificationList(SortSpecificationListType value) {
        this.sortSpecificationList = value;
    }

}
