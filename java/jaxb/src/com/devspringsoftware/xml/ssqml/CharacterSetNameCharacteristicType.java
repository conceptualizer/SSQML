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
 * <p>Java class for CharacterSetNameCharacteristicType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CharacterSetNameCharacteristicType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}NamesStaticString"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}ValueSpecification"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CharacterSetNameCharacteristicType", propOrder = {
    "namesStaticString",
    "valueSpecification"
})
public class CharacterSetNameCharacteristicType {

    @XmlElement(name = "NamesStaticString", required = true)
    protected NamesStaticStringType namesStaticString;
    @XmlElementRef(name = "ValueSpecification", namespace = "http://www.devspringsoftware.com", type = JAXBElement.class)
    protected JAXBElement<ValueSpecificationType> valueSpecification;

    /**
     * Gets the value of the namesStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link NamesStaticStringType }
     *     
     */
    public NamesStaticStringType getNamesStaticString() {
        return namesStaticString;
    }

    /**
     * Sets the value of the namesStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link NamesStaticStringType }
     *     
     */
    public void setNamesStaticString(NamesStaticStringType value) {
        this.namesStaticString = value;
    }

    /**
     * Gets the value of the valueSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValueSpecificationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ValueSpecificationType }{@code >}
     *     
     */
    public JAXBElement<ValueSpecificationType> getValueSpecification() {
        return valueSpecification;
    }

    /**
     * Sets the value of the valueSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValueSpecificationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ValueSpecificationType }{@code >}
     *     
     */
    public void setValueSpecification(JAXBElement<ValueSpecificationType> value) {
        this.valueSpecification = value;
    }

}