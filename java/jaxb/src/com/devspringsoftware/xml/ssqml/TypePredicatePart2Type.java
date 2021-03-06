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
 * <p>Java class for TypePredicatePart2Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TypePredicatePart2Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}IsStaticString"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}NotStaticString" minOccurs="0"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}OfStaticString"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}LeftParen"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}TypeList"/>
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
@XmlType(name = "TypePredicatePart2Type", propOrder = {
    "isStaticString",
    "notStaticString",
    "ofStaticString",
    "leftParen",
    "typeList",
    "rightParen"
})
public class TypePredicatePart2Type {

    @XmlElement(name = "IsStaticString", required = true)
    protected IsStaticStringType isStaticString;
    @XmlElement(name = "NotStaticString")
    protected NotStaticStringType notStaticString;
    @XmlElement(name = "OfStaticString", required = true)
    protected OfStaticStringType ofStaticString;
    @XmlElement(name = "LeftParen", required = true)
    protected String leftParen;
    @XmlElement(name = "TypeList", required = true)
    protected TypeListType typeList;
    @XmlElement(name = "RightParen", required = true)
    protected String rightParen;

    /**
     * Gets the value of the isStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link IsStaticStringType }
     *     
     */
    public IsStaticStringType getIsStaticString() {
        return isStaticString;
    }

    /**
     * Sets the value of the isStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link IsStaticStringType }
     *     
     */
    public void setIsStaticString(IsStaticStringType value) {
        this.isStaticString = value;
    }

    /**
     * Gets the value of the notStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link NotStaticStringType }
     *     
     */
    public NotStaticStringType getNotStaticString() {
        return notStaticString;
    }

    /**
     * Sets the value of the notStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotStaticStringType }
     *     
     */
    public void setNotStaticString(NotStaticStringType value) {
        this.notStaticString = value;
    }

    /**
     * Gets the value of the ofStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link OfStaticStringType }
     *     
     */
    public OfStaticStringType getOfStaticString() {
        return ofStaticString;
    }

    /**
     * Sets the value of the ofStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfStaticStringType }
     *     
     */
    public void setOfStaticString(OfStaticStringType value) {
        this.ofStaticString = value;
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
     * Gets the value of the typeList property.
     * 
     * @return
     *     possible object is
     *     {@link TypeListType }
     *     
     */
    public TypeListType getTypeList() {
        return typeList;
    }

    /**
     * Sets the value of the typeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TypeListType }
     *     
     */
    public void setTypeList(TypeListType value) {
        this.typeList = value;
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
