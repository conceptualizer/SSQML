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
 * <p>Java class for RefCastOptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RefCastOptionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}CastToRef" minOccurs="0"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}CastToType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RefCastOptionType", propOrder = {
    "castToRef",
    "castToType"
})
public class RefCastOptionType {

    @XmlElement(name = "CastToRef")
    protected CastToRefType castToRef;
    @XmlElement(name = "CastToType")
    protected CastToTypeType castToType;

    /**
     * Gets the value of the castToRef property.
     * 
     * @return
     *     possible object is
     *     {@link CastToRefType }
     *     
     */
    public CastToRefType getCastToRef() {
        return castToRef;
    }

    /**
     * Sets the value of the castToRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link CastToRefType }
     *     
     */
    public void setCastToRef(CastToRefType value) {
        this.castToRef = value;
    }

    /**
     * Gets the value of the castToType property.
     * 
     * @return
     *     possible object is
     *     {@link CastToTypeType }
     *     
     */
    public CastToTypeType getCastToType() {
        return castToType;
    }

    /**
     * Sets the value of the castToType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CastToTypeType }
     *     
     */
    public void setCastToType(CastToTypeType value) {
        this.castToType = value;
    }

}
