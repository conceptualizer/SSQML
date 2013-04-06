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
 * <p>Java class for UnicodeRepresentationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnicodeRepresentationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.devspringsoftware.com}CharacterRepresentation"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}UnicodeEscapeValue"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnicodeRepresentationType", propOrder = {
    "characterRepresentationOrUnicodeEscapeValue"
})
public class UnicodeRepresentationType {

    @XmlElements({
        @XmlElement(name = "CharacterRepresentation", type = CharacterRepresentationType.class),
        @XmlElement(name = "UnicodeEscapeValue", type = UnicodeEscapeValueType.class)
    })
    protected Object characterRepresentationOrUnicodeEscapeValue;

    /**
     * Gets the value of the characterRepresentationOrUnicodeEscapeValue property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterRepresentationType }
     *     {@link UnicodeEscapeValueType }
     *     
     */
    public Object getCharacterRepresentationOrUnicodeEscapeValue() {
        return characterRepresentationOrUnicodeEscapeValue;
    }

    /**
     * Sets the value of the characterRepresentationOrUnicodeEscapeValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterRepresentationType }
     *     {@link UnicodeEscapeValueType }
     *     
     */
    public void setCharacterRepresentationOrUnicodeEscapeValue(Object value) {
        this.characterRepresentationOrUnicodeEscapeValue = value;
    }

}