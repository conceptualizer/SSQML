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
 * <p>Java class for InPredicateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InPredicateType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}RowValuePredicand"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}InPredicatePart2"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InPredicateType", propOrder = {
    "rowValuePredicand",
    "inPredicatePart2"
})
public class InPredicateType {

    @XmlElementRef(name = "RowValuePredicand", namespace = "http://www.devspringsoftware.com", type = JAXBElement.class)
    protected JAXBElement<RowValuePredicandType> rowValuePredicand;
    @XmlElement(name = "InPredicatePart2", required = true)
    protected InPredicatePart2Type inPredicatePart2;

    /**
     * Gets the value of the rowValuePredicand property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RowValuePredicandType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RowValuePredicandType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RowValuePredicandType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RowValuePredicandType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RowValuePredicandType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RowValuePredicandType }{@code >}
     *     
     */
    public JAXBElement<RowValuePredicandType> getRowValuePredicand() {
        return rowValuePredicand;
    }

    /**
     * Sets the value of the rowValuePredicand property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RowValuePredicandType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RowValuePredicandType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RowValuePredicandType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RowValuePredicandType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RowValuePredicandType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RowValuePredicandType }{@code >}
     *     
     */
    public void setRowValuePredicand(JAXBElement<RowValuePredicandType> value) {
        this.rowValuePredicand = value;
    }

    /**
     * Gets the value of the inPredicatePart2 property.
     * 
     * @return
     *     possible object is
     *     {@link InPredicatePart2Type }
     *     
     */
    public InPredicatePart2Type getInPredicatePart2() {
        return inPredicatePart2;
    }

    /**
     * Sets the value of the inPredicatePart2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link InPredicatePart2Type }
     *     
     */
    public void setInPredicatePart2(InPredicatePart2Type value) {
        this.inPredicatePart2 = value;
    }

}
