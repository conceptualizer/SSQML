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
 * <p>Java class for ColumnNameListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ColumnNameListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}ColumnName"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}CommaColumnNameItemtype" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ColumnNameListType", propOrder = {
    "columnName",
    "commaColumnNameItemtype"
})
public class ColumnNameListType {

    @XmlElementRef(name = "ColumnName", namespace = "http://www.devspringsoftware.com", type = JAXBElement.class)
    protected JAXBElement<ActualIdentifierType> columnName;
    @XmlElement(name = "CommaColumnNameItemtype")
    protected List<CommaColumnNameItemtypeType> commaColumnNameItemtype;

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
     * Gets the value of the commaColumnNameItemtype property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commaColumnNameItemtype property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommaColumnNameItemtype().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommaColumnNameItemtypeType }
     * 
     * 
     */
    public List<CommaColumnNameItemtypeType> getCommaColumnNameItemtype() {
        if (commaColumnNameItemtype == null) {
            commaColumnNameItemtype = new ArrayList<CommaColumnNameItemtypeType>();
        }
        return this.commaColumnNameItemtype;
    }

}
