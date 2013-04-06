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
 * <p>Java class for CharacterValueFunctionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CharacterValueFunctionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.devspringsoftware.com}CharacterSubstringFunction"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}RegularExpressionSubstringFunction"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}Fold"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}Transcoding"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}CharacterTransliteration"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}TrimFunction"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}CharacterOverlayFunction"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}NormalizeFunction"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}SpecificTypeMethod"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}XmlCharacterStringSerialization"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CharacterValueFunctionType", propOrder = {
    "characterSubstringFunctionOrRegularExpressionSubstringFunctionOrFold"
})
public class CharacterValueFunctionType {

    @XmlElements({
        @XmlElement(name = "CharacterSubstringFunction", type = CharacterSubstringFunctionType.class),
        @XmlElement(name = "RegularExpressionSubstringFunction", type = RegularExpressionSubstringFunctionType.class),
        @XmlElement(name = "Fold", type = FoldType.class),
        @XmlElement(name = "Transcoding", type = TranscodingType.class),
        @XmlElement(name = "CharacterTransliteration", type = CharacterTransliterationType.class),
        @XmlElement(name = "TrimFunction", type = TrimFunctionType.class),
        @XmlElement(name = "CharacterOverlayFunction", type = CharacterOverlayFunctionType.class),
        @XmlElement(name = "NormalizeFunction", type = NormalizeFunctionType.class),
        @XmlElement(name = "SpecificTypeMethod", type = SpecificTypeMethodType.class),
        @XmlElement(name = "XmlCharacterStringSerialization", type = XmlCharacterStringSerializationType.class)
    })
    protected Object characterSubstringFunctionOrRegularExpressionSubstringFunctionOrFold;

    /**
     * Gets the value of the characterSubstringFunctionOrRegularExpressionSubstringFunctionOrFold property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterSubstringFunctionType }
     *     {@link RegularExpressionSubstringFunctionType }
     *     {@link FoldType }
     *     {@link TranscodingType }
     *     {@link CharacterTransliterationType }
     *     {@link TrimFunctionType }
     *     {@link CharacterOverlayFunctionType }
     *     {@link NormalizeFunctionType }
     *     {@link SpecificTypeMethodType }
     *     {@link XmlCharacterStringSerializationType }
     *     
     */
    public Object getCharacterSubstringFunctionOrRegularExpressionSubstringFunctionOrFold() {
        return characterSubstringFunctionOrRegularExpressionSubstringFunctionOrFold;
    }

    /**
     * Sets the value of the characterSubstringFunctionOrRegularExpressionSubstringFunctionOrFold property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterSubstringFunctionType }
     *     {@link RegularExpressionSubstringFunctionType }
     *     {@link FoldType }
     *     {@link TranscodingType }
     *     {@link CharacterTransliterationType }
     *     {@link TrimFunctionType }
     *     {@link CharacterOverlayFunctionType }
     *     {@link NormalizeFunctionType }
     *     {@link SpecificTypeMethodType }
     *     {@link XmlCharacterStringSerializationType }
     *     
     */
    public void setCharacterSubstringFunctionOrRegularExpressionSubstringFunctionOrFold(Object value) {
        this.characterSubstringFunctionOrRegularExpressionSubstringFunctionOrFold = value;
    }

}
