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
 * <p>Java class for AlterColumnDefinitionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlterColumnDefinitionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}AlterStaticString"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}ColumnStaticString" minOccurs="0"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}ColumnName"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}AlterColumnAction"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlterColumnDefinitionType", propOrder = {
    "alterStaticString",
    "columnStaticString",
    "columnName",
    "alterColumnAction"
})
public class AlterColumnDefinitionType {

    @XmlElement(name = "AlterStaticString", required = true)
    protected AlterStaticStringType alterStaticString;
    @XmlElement(name = "ColumnStaticString")
    protected ColumnStaticStringType columnStaticString;
    @XmlElementRef(name = "ColumnName", namespace = "http://www.devspringsoftware.com", type = JAXBElement.class)
    protected JAXBElement<ActualIdentifierType> columnName;
    @XmlElement(name = "AlterColumnAction", required = true)
    protected AlterColumnActionType alterColumnAction;

    /**
     * Gets the value of the alterStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link AlterStaticStringType }
     *     
     */
    public AlterStaticStringType getAlterStaticString() {
        return alterStaticString;
    }

    /**
     * Sets the value of the alterStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlterStaticStringType }
     *     
     */
    public void setAlterStaticString(AlterStaticStringType value) {
        this.alterStaticString = value;
    }

    /**
     * Gets the value of the columnStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link ColumnStaticStringType }
     *     
     */
    public ColumnStaticStringType getColumnStaticString() {
        return columnStaticString;
    }

    /**
     * Sets the value of the columnStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link ColumnStaticStringType }
     *     
     */
    public void setColumnStaticString(ColumnStaticStringType value) {
        this.columnStaticString = value;
    }

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
     * Gets the value of the alterColumnAction property.
     * 
     * @return
     *     possible object is
     *     {@link AlterColumnActionType }
     *     
     */
    public AlterColumnActionType getAlterColumnAction() {
        return alterColumnAction;
    }

    /**
     * Sets the value of the alterColumnAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlterColumnActionType }
     *     
     */
    public void setAlterColumnAction(AlterColumnActionType value) {
        this.alterColumnAction = value;
    }

}
