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
 * <p>Java class for NullPredicateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NullPredicateType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}RowValuePredicand"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}NullPredicatePart2"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NullPredicateType", propOrder = {
    "rowValuePredicand",
    "nullPredicatePart2"
})
public class NullPredicateType {

    @XmlElementRef(name = "RowValuePredicand", namespace = "http://www.devspringsoftware.com", type = JAXBElement.class)
    protected JAXBElement<RowValuePredicandType> rowValuePredicand;
    @XmlElement(name = "NullPredicatePart2", required = true)
    protected NullPredicatePart2Type nullPredicatePart2;

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
     * Gets the value of the nullPredicatePart2 property.
     * 
     * @return
     *     possible object is
     *     {@link NullPredicatePart2Type }
     *     
     */
    public NullPredicatePart2Type getNullPredicatePart2() {
        return nullPredicatePart2;
    }

    /**
     * Sets the value of the nullPredicatePart2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link NullPredicatePart2Type }
     *     
     */
    public void setNullPredicatePart2(NullPredicatePart2Type value) {
        this.nullPredicatePart2 = value;
    }

}
