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
 * <p>Java class for ReturnsTableTypeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReturnsTableTypeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}TableStaticString"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}TableFunctionColumnList"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReturnsTableTypeType", propOrder = {
    "tableStaticString",
    "tableFunctionColumnList"
})
public class ReturnsTableTypeType {

    @XmlElement(name = "TableStaticString", required = true)
    protected TableStaticStringType tableStaticString;
    @XmlElement(name = "TableFunctionColumnList", required = true)
    protected TableFunctionColumnListType tableFunctionColumnList;

    /**
     * Gets the value of the tableStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link TableStaticStringType }
     *     
     */
    public TableStaticStringType getTableStaticString() {
        return tableStaticString;
    }

    /**
     * Sets the value of the tableStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link TableStaticStringType }
     *     
     */
    public void setTableStaticString(TableStaticStringType value) {
        this.tableStaticString = value;
    }

    /**
     * Gets the value of the tableFunctionColumnList property.
     * 
     * @return
     *     possible object is
     *     {@link TableFunctionColumnListType }
     *     
     */
    public TableFunctionColumnListType getTableFunctionColumnList() {
        return tableFunctionColumnList;
    }

    /**
     * Sets the value of the tableFunctionColumnList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TableFunctionColumnListType }
     *     
     */
    public void setTableFunctionColumnList(TableFunctionColumnListType value) {
        this.tableFunctionColumnList = value;
    }

}
