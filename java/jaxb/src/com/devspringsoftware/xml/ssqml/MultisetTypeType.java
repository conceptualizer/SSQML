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
 * <p>Java class for MultisetTypeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MultisetTypeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}DataType"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}MultisetStaticString"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultisetTypeType", propOrder = {
    "dataType",
    "multisetStaticString"
})
public class MultisetTypeType {

    @XmlElementRef(name = "DataType", namespace = "http://www.devspringsoftware.com", type = JAXBElement.class)
    protected JAXBElement<DataTypeType> dataType;
    @XmlElement(name = "MultisetStaticString", required = true)
    protected MultisetStaticStringType multisetStaticString;

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
     * Gets the value of the multisetStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link MultisetStaticStringType }
     *     
     */
    public MultisetStaticStringType getMultisetStaticString() {
        return multisetStaticString;
    }

    /**
     * Sets the value of the multisetStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultisetStaticStringType }
     *     
     */
    public void setMultisetStaticString(MultisetStaticStringType value) {
        this.multisetStaticString = value;
    }

}
