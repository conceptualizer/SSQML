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
 * <p>Java class for BlobTrimOperandsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BlobTrimOperandsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}TrimSpecification" minOccurs="0"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}TrimOctet" minOccurs="0"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}FromStaticString" minOccurs="0"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}BlobTrimSource"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BlobTrimOperandsType", propOrder = {
    "trimSpecification",
    "trimOctet",
    "fromStaticString",
    "blobTrimSource"
})
public class BlobTrimOperandsType {

    @XmlElement(name = "TrimSpecification")
    protected TrimSpecificationType trimSpecification;
    @XmlElement(name = "TrimOctet")
    protected BlobValueExpressionType trimOctet;
    @XmlElement(name = "FromStaticString")
    protected FromStaticStringType fromStaticString;
    @XmlElement(name = "BlobTrimSource", required = true)
    protected BlobValueExpressionType blobTrimSource;

    /**
     * Gets the value of the trimSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link TrimSpecificationType }
     *     
     */
    public TrimSpecificationType getTrimSpecification() {
        return trimSpecification;
    }

    /**
     * Sets the value of the trimSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrimSpecificationType }
     *     
     */
    public void setTrimSpecification(TrimSpecificationType value) {
        this.trimSpecification = value;
    }

    /**
     * Gets the value of the trimOctet property.
     * 
     * @return
     *     possible object is
     *     {@link BlobValueExpressionType }
     *     
     */
    public BlobValueExpressionType getTrimOctet() {
        return trimOctet;
    }

    /**
     * Sets the value of the trimOctet property.
     * 
     * @param value
     *     allowed object is
     *     {@link BlobValueExpressionType }
     *     
     */
    public void setTrimOctet(BlobValueExpressionType value) {
        this.trimOctet = value;
    }

    /**
     * Gets the value of the fromStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link FromStaticStringType }
     *     
     */
    public FromStaticStringType getFromStaticString() {
        return fromStaticString;
    }

    /**
     * Sets the value of the fromStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link FromStaticStringType }
     *     
     */
    public void setFromStaticString(FromStaticStringType value) {
        this.fromStaticString = value;
    }

    /**
     * Gets the value of the blobTrimSource property.
     * 
     * @return
     *     possible object is
     *     {@link BlobValueExpressionType }
     *     
     */
    public BlobValueExpressionType getBlobTrimSource() {
        return blobTrimSource;
    }

    /**
     * Sets the value of the blobTrimSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link BlobValueExpressionType }
     *     
     */
    public void setBlobTrimSource(BlobValueExpressionType value) {
        this.blobTrimSource = value;
    }

}
