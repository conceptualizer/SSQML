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
 * <p>Java class for GeneralLiteralType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeneralLiteralType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.devspringsoftware.com}CharacterStringLiteral"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}NationalCharacterStringLiteral"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}UnicodeCharacterStringLiteral"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}BinaryStringLiteral"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}DatetimeLiteral"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}IntervalLiteral"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}BooleanLiteral"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeneralLiteralType", propOrder = {
    "characterStringLiteralOrNationalCharacterStringLiteralOrUnicodeCharacterStringLiteral"
})
public class GeneralLiteralType {

    @XmlElementRefs({
        @XmlElementRef(name = "CharacterStringLiteral", namespace = "http://www.devspringsoftware.com", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "IntervalLiteral", namespace = "http://www.devspringsoftware.com", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "UnicodeCharacterStringLiteral", namespace = "http://www.devspringsoftware.com", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "DatetimeLiteral", namespace = "http://www.devspringsoftware.com", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "NationalCharacterStringLiteral", namespace = "http://www.devspringsoftware.com", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "BinaryStringLiteral", namespace = "http://www.devspringsoftware.com", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "BooleanLiteral", namespace = "http://www.devspringsoftware.com", type = JAXBElement.class, required = false)
    })
    protected JAXBElement<?> characterStringLiteralOrNationalCharacterStringLiteralOrUnicodeCharacterStringLiteral;

    /**
     * Gets the value of the characterStringLiteralOrNationalCharacterStringLiteralOrUnicodeCharacterStringLiteral property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CharacterStringLiteralType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CharacterStringLiteralType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CharacterStringLiteralType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CharacterStringLiteralType }{@code >}
     *     {@link JAXBElement }{@code <}{@link UnicodeCharacterStringLiteralType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DatetimeLiteralType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CharacterStringLiteralType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BinaryStringLiteralType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CharacterStringLiteralType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CharacterStringLiteralType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IntervalLiteralType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NationalCharacterStringLiteralType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CharacterStringLiteralType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BooleanLiteralType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CharacterStringLiteralType }{@code >}
     *     
     */
    public JAXBElement<?> getCharacterStringLiteralOrNationalCharacterStringLiteralOrUnicodeCharacterStringLiteral() {
        return characterStringLiteralOrNationalCharacterStringLiteralOrUnicodeCharacterStringLiteral;
    }

    /**
     * Sets the value of the characterStringLiteralOrNationalCharacterStringLiteralOrUnicodeCharacterStringLiteral property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CharacterStringLiteralType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CharacterStringLiteralType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CharacterStringLiteralType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CharacterStringLiteralType }{@code >}
     *     {@link JAXBElement }{@code <}{@link UnicodeCharacterStringLiteralType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DatetimeLiteralType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CharacterStringLiteralType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BinaryStringLiteralType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CharacterStringLiteralType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CharacterStringLiteralType }{@code >}
     *     {@link JAXBElement }{@code <}{@link IntervalLiteralType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NationalCharacterStringLiteralType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CharacterStringLiteralType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BooleanLiteralType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CharacterStringLiteralType }{@code >}
     *     
     */
    public void setCharacterStringLiteralOrNationalCharacterStringLiteralOrUnicodeCharacterStringLiteral(JAXBElement<?> value) {
        this.characterStringLiteralOrNationalCharacterStringLiteralOrUnicodeCharacterStringLiteral = value;
    }

}
