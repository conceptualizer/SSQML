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
 * <p>Java class for ReturnsDataTypeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReturnsDataTypeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}DataType"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}LocatorIndication" minOccurs="0"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}DocumentOrContent" minOccurs="0"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}StringTypeOption" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReturnsDataTypeType", propOrder = {
    "dataType",
    "locatorIndication",
    "documentOrContent",
    "stringTypeOption"
})
public class ReturnsDataTypeType {

    @XmlElementRef(name = "DataType", namespace = "http://www.devspringsoftware.com", type = JAXBElement.class)
    protected JAXBElement<DataTypeType> dataType;
    @XmlElement(name = "LocatorIndication")
    protected LocatorIndicationType locatorIndication;
    @XmlElement(name = "DocumentOrContent")
    protected DocumentOrContentType documentOrContent;
    @XmlElement(name = "StringTypeOption")
    protected StringTypeOptionType stringTypeOption;

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
     * Gets the value of the locatorIndication property.
     * 
     * @return
     *     possible object is
     *     {@link LocatorIndicationType }
     *     
     */
    public LocatorIndicationType getLocatorIndication() {
        return locatorIndication;
    }

    /**
     * Sets the value of the locatorIndication property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocatorIndicationType }
     *     
     */
    public void setLocatorIndication(LocatorIndicationType value) {
        this.locatorIndication = value;
    }

    /**
     * Gets the value of the documentOrContent property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentOrContentType }
     *     
     */
    public DocumentOrContentType getDocumentOrContent() {
        return documentOrContent;
    }

    /**
     * Sets the value of the documentOrContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentOrContentType }
     *     
     */
    public void setDocumentOrContent(DocumentOrContentType value) {
        this.documentOrContent = value;
    }

    /**
     * Gets the value of the stringTypeOption property.
     * 
     * @return
     *     possible object is
     *     {@link StringTypeOptionType }
     *     
     */
    public StringTypeOptionType getStringTypeOption() {
        return stringTypeOption;
    }

    /**
     * Sets the value of the stringTypeOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringTypeOptionType }
     *     
     */
    public void setStringTypeOption(StringTypeOptionType value) {
        this.stringTypeOption = value;
    }

}
