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
 * <p>Java class for DynamicCursorNameType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DynamicCursorNameType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.devspringsoftware.com}CursorName"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}ExtendedCursorName"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DynamicCursorNameType", propOrder = {
    "cursorNameOrExtendedCursorName"
})
public class DynamicCursorNameType {

    @XmlElements({
        @XmlElement(name = "CursorName", type = LocalQualifiedNameType.class),
        @XmlElement(name = "ExtendedCursorName", type = ExtendedCursorNameType.class)
    })
    protected Object cursorNameOrExtendedCursorName;

    /**
     * Gets the value of the cursorNameOrExtendedCursorName property.
     * 
     * @return
     *     possible object is
     *     {@link LocalQualifiedNameType }
     *     {@link ExtendedCursorNameType }
     *     
     */
    public Object getCursorNameOrExtendedCursorName() {
        return cursorNameOrExtendedCursorName;
    }

    /**
     * Sets the value of the cursorNameOrExtendedCursorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocalQualifiedNameType }
     *     {@link ExtendedCursorNameType }
     *     
     */
    public void setCursorNameOrExtendedCursorName(Object value) {
        this.cursorNameOrExtendedCursorName = value;
    }

}
