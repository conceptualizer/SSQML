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
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for YearMonthLiteralType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="YearMonthLiteralType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.devspringsoftware.com}YearsValue"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}YearMonthLiteral_ISO9075ChoiceGroup1"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "YearMonthLiteralType", propOrder = {
    "yearsValueOrYearMonthLiteralISO9075ChoiceGroup1"
})
public class YearMonthLiteralType {

    @XmlElements({
        @XmlElement(name = "YearsValue", type = String.class),
        @XmlElement(name = "YearMonthLiteral_ISO9075ChoiceGroup1", type = YearMonthLiteralISO9075ChoiceGroup1Type.class)
    })
    protected Object yearsValueOrYearMonthLiteralISO9075ChoiceGroup1;

    /**
     * Gets the value of the yearsValueOrYearMonthLiteralISO9075ChoiceGroup1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     {@link YearMonthLiteralISO9075ChoiceGroup1Type }
     *     
     */
    public Object getYearsValueOrYearMonthLiteralISO9075ChoiceGroup1() {
        return yearsValueOrYearMonthLiteralISO9075ChoiceGroup1;
    }

    /**
     * Sets the value of the yearsValueOrYearMonthLiteralISO9075ChoiceGroup1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     {@link YearMonthLiteralISO9075ChoiceGroup1Type }
     *     
     */
    public void setYearsValueOrYearMonthLiteralISO9075ChoiceGroup1(Object value) {
        this.yearsValueOrYearMonthLiteralISO9075ChoiceGroup1 = value;
    }

}
