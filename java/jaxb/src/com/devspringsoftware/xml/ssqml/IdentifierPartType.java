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
 * <p>Java class for IdentifierPartType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IdentifierPartType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.devspringsoftware.com}IdentifierStart"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}IdentifierExtend"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdentifierPartType", propOrder = {
    "identifierStartOrIdentifierExtend"
})
public class IdentifierPartType {

    @XmlElements({
        @XmlElement(name = "IdentifierStart", type = String.class),
        @XmlElement(name = "IdentifierExtend", type = IdentifierExtendType.class)
    })
    protected Object identifierStartOrIdentifierExtend;

    /**
     * Gets the value of the identifierStartOrIdentifierExtend property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     {@link IdentifierExtendType }
     *     
     */
    public Object getIdentifierStartOrIdentifierExtend() {
        return identifierStartOrIdentifierExtend;
    }

    /**
     * Sets the value of the identifierStartOrIdentifierExtend property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     {@link IdentifierExtendType }
     *     
     */
    public void setIdentifierStartOrIdentifierExtend(Object value) {
        this.identifierStartOrIdentifierExtend = value;
    }

}
