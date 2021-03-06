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
 * <p>Java class for ReturnsClauseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReturnsClauseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}ReturnsStaticString"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}ReturnsType"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}XmlPassingMechanism" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReturnsClauseType", propOrder = {
    "returnsStaticString",
    "returnsType",
    "xmlPassingMechanism"
})
public class ReturnsClauseType {

    @XmlElement(name = "ReturnsStaticString", required = true)
    protected ReturnsStaticStringType returnsStaticString;
    @XmlElement(name = "ReturnsType", required = true)
    protected ReturnsTypeType returnsType;
    @XmlElementRef(name = "XmlPassingMechanism", namespace = "http://www.devspringsoftware.com", type = JAXBElement.class, required = false)
    protected JAXBElement<XmlPassingMechanismType> xmlPassingMechanism;

    /**
     * Gets the value of the returnsStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnsStaticStringType }
     *     
     */
    public ReturnsStaticStringType getReturnsStaticString() {
        return returnsStaticString;
    }

    /**
     * Sets the value of the returnsStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnsStaticStringType }
     *     
     */
    public void setReturnsStaticString(ReturnsStaticStringType value) {
        this.returnsStaticString = value;
    }

    /**
     * Gets the value of the returnsType property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnsTypeType }
     *     
     */
    public ReturnsTypeType getReturnsType() {
        return returnsType;
    }

    /**
     * Sets the value of the returnsType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnsTypeType }
     *     
     */
    public void setReturnsType(ReturnsTypeType value) {
        this.returnsType = value;
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

}
