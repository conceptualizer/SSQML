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
 * <p>Java class for PrepareStatementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrepareStatementType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}PrepareStaticString"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}SqlStatementName"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}AttributesSpecification" minOccurs="0"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}FromStaticString"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}SqlStatementVariable"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrepareStatementType", propOrder = {
    "prepareStaticString",
    "sqlStatementName",
    "attributesSpecification",
    "fromStaticString",
    "sqlStatementVariable"
})
public class PrepareStatementType {

    @XmlElement(name = "PrepareStaticString", required = true)
    protected PrepareStaticStringType prepareStaticString;
    @XmlElement(name = "SqlStatementName", required = true)
    protected SqlStatementNameType sqlStatementName;
    @XmlElement(name = "AttributesSpecification")
    protected AttributesSpecificationType attributesSpecification;
    @XmlElement(name = "FromStaticString", required = true)
    protected FromStaticStringType fromStaticString;
    @XmlElement(name = "SqlStatementVariable", required = true)
    protected SimpleValueSpecificationType sqlStatementVariable;

    /**
     * Gets the value of the prepareStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link PrepareStaticStringType }
     *     
     */
    public PrepareStaticStringType getPrepareStaticString() {
        return prepareStaticString;
    }

    /**
     * Sets the value of the prepareStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrepareStaticStringType }
     *     
     */
    public void setPrepareStaticString(PrepareStaticStringType value) {
        this.prepareStaticString = value;
    }

    /**
     * Gets the value of the sqlStatementName property.
     * 
     * @return
     *     possible object is
     *     {@link SqlStatementNameType }
     *     
     */
    public SqlStatementNameType getSqlStatementName() {
        return sqlStatementName;
    }

    /**
     * Sets the value of the sqlStatementName property.
     * 
     * @param value
     *     allowed object is
     *     {@link SqlStatementNameType }
     *     
     */
    public void setSqlStatementName(SqlStatementNameType value) {
        this.sqlStatementName = value;
    }

    /**
     * Gets the value of the attributesSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link AttributesSpecificationType }
     *     
     */
    public AttributesSpecificationType getAttributesSpecification() {
        return attributesSpecification;
    }

    /**
     * Sets the value of the attributesSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttributesSpecificationType }
     *     
     */
    public void setAttributesSpecification(AttributesSpecificationType value) {
        this.attributesSpecification = value;
    }

    /**
     * Gets the value of the fromStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link FromStaticStringType }
     *     
     */
    public FromStaticStringType getFromStaticString() {
        return fromStaticString;
    }

    /**
     * Sets the value of the fromStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link FromStaticStringType }
     *     
     */
    public void setFromStaticString(FromStaticStringType value) {
        this.fromStaticString = value;
    }

    /**
     * Gets the value of the sqlStatementVariable property.
     * 
     * @return
     *     possible object is
     *     {@link SimpleValueSpecificationType }
     *     
     */
    public SimpleValueSpecificationType getSqlStatementVariable() {
        return sqlStatementVariable;
    }

    /**
     * Sets the value of the sqlStatementVariable property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleValueSpecificationType }
     *     
     */
    public void setSqlStatementVariable(SimpleValueSpecificationType value) {
        this.sqlStatementVariable = value;
    }

}
