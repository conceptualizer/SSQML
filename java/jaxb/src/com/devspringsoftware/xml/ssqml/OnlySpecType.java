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
 * <p>Java class for OnlySpecType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OnlySpecType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}OnlyStaticString"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}LeftParen"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}TableOrQueryName"/>
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
@XmlType(name = "OnlySpecType", propOrder = {
    "onlyStaticString",
    "leftParen",
    "tableOrQueryName",
    "rightParen"
})
public class OnlySpecType {

    @XmlElement(name = "OnlyStaticString", required = true)
    protected OnlyStaticStringType onlyStaticString;
    @XmlElement(name = "LeftParen", required = true)
    protected String leftParen;
    @XmlElement(name = "TableOrQueryName", required = true)
    protected TableOrQueryNameType tableOrQueryName;
    @XmlElement(name = "RightParen", required = true)
    protected String rightParen;

    /**
     * Gets the value of the onlyStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link OnlyStaticStringType }
     *     
     */
    public OnlyStaticStringType getOnlyStaticString() {
        return onlyStaticString;
    }

    /**
     * Sets the value of the onlyStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link OnlyStaticStringType }
     *     
     */
    public void setOnlyStaticString(OnlyStaticStringType value) {
        this.onlyStaticString = value;
    }

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
     * Gets the value of the tableOrQueryName property.
     * 
     * @return
     *     possible object is
     *     {@link TableOrQueryNameType }
     *     
     */
    public TableOrQueryNameType getTableOrQueryName() {
        return tableOrQueryName;
    }

    /**
     * Sets the value of the tableOrQueryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link TableOrQueryNameType }
     *     
     */
    public void setTableOrQueryName(TableOrQueryNameType value) {
        this.tableOrQueryName = value;
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
