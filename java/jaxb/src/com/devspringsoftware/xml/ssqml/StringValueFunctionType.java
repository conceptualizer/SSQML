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
 * <p>Java class for StringValueFunctionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StringValueFunctionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.devspringsoftware.com}CharacterValueFunction"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}BlobValueFunction"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StringValueFunctionType", propOrder = {
    "characterValueFunctionOrBlobValueFunction"
})
public class StringValueFunctionType {

    @XmlElements({
        @XmlElement(name = "CharacterValueFunction", type = CharacterValueFunctionType.class),
        @XmlElement(name = "BlobValueFunction", type = BlobValueFunctionType.class)
    })
    protected Object characterValueFunctionOrBlobValueFunction;

    /**
     * Gets the value of the characterValueFunctionOrBlobValueFunction property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterValueFunctionType }
     *     {@link BlobValueFunctionType }
     *     
     */
    public Object getCharacterValueFunctionOrBlobValueFunction() {
        return characterValueFunctionOrBlobValueFunction;
    }

    /**
     * Sets the value of the characterValueFunctionOrBlobValueFunction property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterValueFunctionType }
     *     {@link BlobValueFunctionType }
     *     
     */
    public void setCharacterValueFunctionOrBlobValueFunction(Object value) {
        this.characterValueFunctionOrBlobValueFunction = value;
    }

}
