//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.03 at 08:58:47 PM EDT 
//


package com.devspringsoftware.xml.ssqml;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IntervalValueExpression_ISO9075ChoiceGroup4Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IntervalValueExpression_ISO9075ChoiceGroup4Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}PlusSign"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}IntervalTerm1"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntervalValueExpression_ISO9075ChoiceGroup4Type", propOrder = {
    "plusSign",
    "intervalTerm1"
})
public class IntervalValueExpressionISO9075ChoiceGroup4Type {

    @XmlElement(name = "PlusSign", required = true)
    protected String plusSign;
    @XmlElement(name = "IntervalTerm1", required = true)
    protected IntervalTermType intervalTerm1;

    /**
     * Gets the value of the plusSign property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlusSign() {
        return plusSign;
    }

    /**
     * Sets the value of the plusSign property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlusSign(String value) {
        this.plusSign = value;
    }

    /**
     * Gets the value of the intervalTerm1 property.
     * 
     * @return
     *     possible object is
     *     {@link IntervalTermType }
     *     
     */
    public IntervalTermType getIntervalTerm1() {
        return intervalTerm1;
    }

    /**
     * Sets the value of the intervalTerm1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntervalTermType }
     *     
     */
    public void setIntervalTerm1(IntervalTermType value) {
        this.intervalTerm1 = value;
    }

}
