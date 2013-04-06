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
 * <p>Java class for OriginalMethodSpecificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OriginalMethodSpecificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}PartialMethodSpecification"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}SelfAsResultStaticString" minOccurs="0"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}SelfAsLocatorStaticString" minOccurs="0"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}MethodCharacteristics" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OriginalMethodSpecificationType", propOrder = {
    "partialMethodSpecification",
    "selfAsResultStaticString",
    "selfAsLocatorStaticString",
    "methodCharacteristics"
})
public class OriginalMethodSpecificationType {

    @XmlElement(name = "PartialMethodSpecification", required = true)
    protected PartialMethodSpecificationType partialMethodSpecification;
    @XmlElement(name = "SelfAsResultStaticString")
    protected SelfAsResultStaticStringType selfAsResultStaticString;
    @XmlElement(name = "SelfAsLocatorStaticString")
    protected SelfAsLocatorStaticStringType selfAsLocatorStaticString;
    @XmlElement(name = "MethodCharacteristics")
    protected MethodCharacteristicsType methodCharacteristics;

    /**
     * Gets the value of the partialMethodSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link PartialMethodSpecificationType }
     *     
     */
    public PartialMethodSpecificationType getPartialMethodSpecification() {
        return partialMethodSpecification;
    }

    /**
     * Sets the value of the partialMethodSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartialMethodSpecificationType }
     *     
     */
    public void setPartialMethodSpecification(PartialMethodSpecificationType value) {
        this.partialMethodSpecification = value;
    }

    /**
     * Gets the value of the selfAsResultStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link SelfAsResultStaticStringType }
     *     
     */
    public SelfAsResultStaticStringType getSelfAsResultStaticString() {
        return selfAsResultStaticString;
    }

    /**
     * Sets the value of the selfAsResultStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link SelfAsResultStaticStringType }
     *     
     */
    public void setSelfAsResultStaticString(SelfAsResultStaticStringType value) {
        this.selfAsResultStaticString = value;
    }

    /**
     * Gets the value of the selfAsLocatorStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link SelfAsLocatorStaticStringType }
     *     
     */
    public SelfAsLocatorStaticStringType getSelfAsLocatorStaticString() {
        return selfAsLocatorStaticString;
    }

    /**
     * Sets the value of the selfAsLocatorStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link SelfAsLocatorStaticStringType }
     *     
     */
    public void setSelfAsLocatorStaticString(SelfAsLocatorStaticStringType value) {
        this.selfAsLocatorStaticString = value;
    }

    /**
     * Gets the value of the methodCharacteristics property.
     * 
     * @return
     *     possible object is
     *     {@link MethodCharacteristicsType }
     *     
     */
    public MethodCharacteristicsType getMethodCharacteristics() {
        return methodCharacteristics;
    }

    /**
     * Sets the value of the methodCharacteristics property.
     * 
     * @param value
     *     allowed object is
     *     {@link MethodCharacteristicsType }
     *     
     */
    public void setMethodCharacteristics(MethodCharacteristicsType value) {
        this.methodCharacteristics = value;
    }

}
