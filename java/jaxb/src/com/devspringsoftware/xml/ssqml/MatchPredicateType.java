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
 * <p>Java class for MatchPredicateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MatchPredicateType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}RowValuePredicand"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}MatchPredicatePart2"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MatchPredicateType", propOrder = {
    "rowValuePredicand",
    "matchPredicatePart2"
})
public class MatchPredicateType {

    @XmlElementRef(name = "RowValuePredicand", namespace = "http://www.devspringsoftware.com", type = JAXBElement.class)
    protected JAXBElement<RowValuePredicandType> rowValuePredicand;
    @XmlElement(name = "MatchPredicatePart2", required = true)
    protected MatchPredicatePart2Type matchPredicatePart2;

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
     * Gets the value of the matchPredicatePart2 property.
     * 
     * @return
     *     possible object is
     *     {@link MatchPredicatePart2Type }
     *     
     */
    public MatchPredicatePart2Type getMatchPredicatePart2() {
        return matchPredicatePart2;
    }

    /**
     * Sets the value of the matchPredicatePart2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link MatchPredicatePart2Type }
     *     
     */
    public void setMatchPredicatePart2(MatchPredicatePart2Type value) {
        this.matchPredicatePart2 = value;
    }

}
