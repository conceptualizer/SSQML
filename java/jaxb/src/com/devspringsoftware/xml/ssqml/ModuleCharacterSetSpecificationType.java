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
 * <p>Java class for ModuleCharacterSetSpecificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ModuleCharacterSetSpecificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}NamesAreStaticString"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}CharacterSetSpecification"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModuleCharacterSetSpecificationType", propOrder = {
    "namesAreStaticString",
    "characterSetSpecification"
})
public class ModuleCharacterSetSpecificationType {

    @XmlElement(name = "NamesAreStaticString", required = true)
    protected NamesAreStaticStringType namesAreStaticString;
    @XmlElementRef(name = "CharacterSetSpecification", namespace = "http://www.devspringsoftware.com", type = JAXBElement.class)
    protected JAXBElement<CharacterSetSpecificationType> characterSetSpecification;

    /**
     * Gets the value of the namesAreStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link NamesAreStaticStringType }
     *     
     */
    public NamesAreStaticStringType getNamesAreStaticString() {
        return namesAreStaticString;
    }

    /**
     * Sets the value of the namesAreStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link NamesAreStaticStringType }
     *     
     */
    public void setNamesAreStaticString(NamesAreStaticStringType value) {
        this.namesAreStaticString = value;
    }

    /**
     * Gets the value of the characterSetSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CharacterSetSpecificationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CharacterSetSpecificationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CharacterSetSpecificationType }{@code >}
     *     
     */
    public JAXBElement<CharacterSetSpecificationType> getCharacterSetSpecification() {
        return characterSetSpecification;
    }

    /**
     * Sets the value of the characterSetSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CharacterSetSpecificationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CharacterSetSpecificationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CharacterSetSpecificationType }{@code >}
     *     
     */
    public void setCharacterSetSpecification(JAXBElement<CharacterSetSpecificationType> value) {
        this.characterSetSpecification = value;
    }

}
