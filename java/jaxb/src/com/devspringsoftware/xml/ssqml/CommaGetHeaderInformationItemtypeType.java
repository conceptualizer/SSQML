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
 * <p>Java class for CommaGetHeaderInformationItemtypeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommaGetHeaderInformationItemtypeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}Comma"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}GetHeaderInformation"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommaGetHeaderInformationItemtypeType", propOrder = {
    "comma",
    "getHeaderInformation"
})
public class CommaGetHeaderInformationItemtypeType {

    @XmlElement(name = "Comma", required = true)
    protected String comma;
    @XmlElement(name = "GetHeaderInformation", required = true)
    protected GetHeaderInformationType getHeaderInformation;

    /**
     * Gets the value of the comma property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComma() {
        return comma;
    }

    /**
     * Sets the value of the comma property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComma(String value) {
        this.comma = value;
    }

    /**
     * Gets the value of the getHeaderInformation property.
     * 
     * @return
     *     possible object is
     *     {@link GetHeaderInformationType }
     *     
     */
    public GetHeaderInformationType getGetHeaderInformation() {
        return getHeaderInformation;
    }

    /**
     * Sets the value of the getHeaderInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetHeaderInformationType }
     *     
     */
    public void setGetHeaderInformation(GetHeaderInformationType value) {
        this.getHeaderInformation = value;
    }

}