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
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CharacterPrimaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CharacterPrimaryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.devspringsoftware.com}ValueExpressionPrimary"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}StringValueFunction"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CharacterPrimaryType", propOrder = {
    "valueExpressionPrimaryOrStringValueFunction"
})
public class CharacterPrimaryType {

    @XmlElementRefs({
        @XmlElementRef(name = "StringValueFunction", namespace = "http://www.devspringsoftware.com", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ValueExpressionPrimary", namespace = "http://www.devspringsoftware.com", type = JAXBElement.class, required = false)
    })
    protected JAXBElement<?> valueExpressionPrimaryOrStringValueFunction;

    /**
     * Gets the value of the valueExpressionPrimaryOrStringValueFunction property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ValueExpressionPrimaryType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ValueExpressionPrimaryType }{@code >}
     *     {@link JAXBElement }{@code <}{@link StringValueFunctionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ValueExpressionPrimaryType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ValueExpressionPrimaryType }{@code >}
     *     
     */
    public JAXBElement<?> getValueExpressionPrimaryOrStringValueFunction() {
        return valueExpressionPrimaryOrStringValueFunction;
    }

    /**
     * Sets the value of the valueExpressionPrimaryOrStringValueFunction property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ValueExpressionPrimaryType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ValueExpressionPrimaryType }{@code >}
     *     {@link JAXBElement }{@code <}{@link StringValueFunctionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ValueExpressionPrimaryType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ValueExpressionPrimaryType }{@code >}
     *     
     */
    public void setValueExpressionPrimaryOrStringValueFunction(JAXBElement<?> value) {
        this.valueExpressionPrimaryOrStringValueFunction = value;
    }

}
