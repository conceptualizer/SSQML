//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.03 at 08:58:47 PM EDT 
//


package com.devspringsoftware.xml.ssqml;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XmlTableRegularColumnDefinitionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XmlTableRegularColumnDefinitionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}ColumnName"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}DataType"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}XmlPassingMechanism" minOccurs="0"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}DefaultClause" minOccurs="0"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}PathStaticString" minOccurs="0"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}XmlTableColumnPattern" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XmlTableRegularColumnDefinitionType", propOrder = {
    "columnName",
    "dataType",
    "xmlPassingMechanism",
    "defaultClause",
    "pathStaticString",
    "xmlTableColumnPattern"
})
public class XmlTableRegularColumnDefinitionType {

    @XmlElementRef(name = "ColumnName", namespace = "http://www.devspringsoftware.com", type = JAXBElement.class)
    protected JAXBElement<ActualIdentifierType> columnName;
    @XmlElementRef(name = "DataType", namespace = "http://www.devspringsoftware.com", type = JAXBElement.class)
    protected JAXBElement<DataTypeType> dataType;
    @XmlElementRef(name = "XmlPassingMechanism", namespace = "http://www.devspringsoftware.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XmlPassingMechanismType> xmlPassingMechanism;
    @XmlElementRef(name = "DefaultClause", namespace = "http://www.devspringsoftware.com", type = JAXBElement.class, required = false)
    protected JAXBElement<DefaultClauseType> defaultClause;
    @XmlElement(name = "PathStaticString")
    protected PathStaticStringType pathStaticString;
    @XmlElement(name = "XmlTableColumnPattern")
    protected CharacterStringLiteralType xmlTableColumnPattern;

    /**
     * Gets the value of the columnName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ActualIdentifierType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ActualIdentifierType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ActualIdentifierType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ActualIdentifierType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ActualIdentifierType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ActualIdentifierType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ActualIdentifierType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ActualIdentifierType }{@code >}
     *     
     */
    public JAXBElement<ActualIdentifierType> getColumnName() {
        return columnName;
    }

    /**
     * Sets the value of the columnName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ActualIdentifierType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ActualIdentifierType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ActualIdentifierType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ActualIdentifierType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ActualIdentifierType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ActualIdentifierType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ActualIdentifierType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ActualIdentifierType }{@code >}
     *     
     */
    public void setColumnName(JAXBElement<ActualIdentifierType> value) {
        this.columnName = value;
    }

    /**
     * Gets the value of the dataType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DataTypeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DataTypeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DataTypeType }{@code >}
     *     
     */
    public JAXBElement<DataTypeType> getDataType() {
        return dataType;
    }

    /**
     * Sets the value of the dataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DataTypeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DataTypeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DataTypeType }{@code >}
     *     
     */
    public void setDataType(JAXBElement<DataTypeType> value) {
        this.dataType = value;
    }

    /**
     * Gets the value of the xmlPassingMechanism property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XmlPassingMechanismType }{@code >}
     *     {@link JAXBElement }{@code <}{@link XmlPassingMechanismType }{@code >}
     *     {@link JAXBElement }{@code <}{@link XmlPassingMechanismType }{@code >}
     *     
     */
    public JAXBElement<XmlPassingMechanismType> getXmlPassingMechanism() {
        return xmlPassingMechanism;
    }

    /**
     * Sets the value of the xmlPassingMechanism property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XmlPassingMechanismType }{@code >}
     *     {@link JAXBElement }{@code <}{@link XmlPassingMechanismType }{@code >}
     *     {@link JAXBElement }{@code <}{@link XmlPassingMechanismType }{@code >}
     *     
     */
    public void setXmlPassingMechanism(JAXBElement<XmlPassingMechanismType> value) {
        this.xmlPassingMechanism = value;
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
     * Gets the value of the pathStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link PathStaticStringType }
     *     
     */
    public PathStaticStringType getPathStaticString() {
        return pathStaticString;
    }

    /**
     * Sets the value of the pathStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link PathStaticStringType }
     *     
     */
    public void setPathStaticString(PathStaticStringType value) {
        this.pathStaticString = value;
    }

    /**
     * Gets the value of the xmlTableColumnPattern property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringLiteralType }
     *     
     */
    public CharacterStringLiteralType getXmlTableColumnPattern() {
        return xmlTableColumnPattern;
    }

    /**
     * Sets the value of the xmlTableColumnPattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringLiteralType }
     *     
     */
    public void setXmlTableColumnPattern(CharacterStringLiteralType value) {
        this.xmlTableColumnPattern = value;
    }

}
