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
 * <p>Java class for ExtractSourceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExtractSourceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.devspringsoftware.com}DatetimeValueExpression"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}IntervalValueExpression"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtractSourceType", propOrder = {
    "datetimeValueExpressionOrIntervalValueExpression"
})
public class ExtractSourceType {

    @XmlElementRefs({
        @XmlElementRef(name = "IntervalValueExpression", namespace = "http://www.devspringsoftware.com", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "DatetimeValueExpression", namespace = "http://www.devspringsoftware.com", type = JAXBElement.class, required = false)
    })
    protected JAXBElement<?> datetimeValueExpressionOrIntervalValueExpression;

    /**
     * Gets the value of the datetimeValueExpressionOrIntervalValueExpression property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link IntervalValueExpressionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IntervalValueExpressionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DatetimeValueExpressionType }{@code >}
     *     
     */
    public JAXBElement<?> getDatetimeValueExpressionOrIntervalValueExpression() {
        return datetimeValueExpressionOrIntervalValueExpression;
    }

    /**
     * Sets the value of the datetimeValueExpressionOrIntervalValueExpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link IntervalValueExpressionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IntervalValueExpressionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DatetimeValueExpressionType }{@code >}
     *     
     */
    public void setDatetimeValueExpressionOrIntervalValueExpression(JAXBElement<?> value) {
        this.datetimeValueExpressionOrIntervalValueExpression = value;
    }

}
