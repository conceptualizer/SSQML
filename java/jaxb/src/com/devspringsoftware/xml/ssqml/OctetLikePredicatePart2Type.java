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
 * <p>Java class for OctetLikePredicatePart2Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OctetLikePredicatePart2Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}NotStaticString" minOccurs="0"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}LikeStaticString"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}OctetPattern"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}EscapeStaticString" minOccurs="0"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}EscapeOctet" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OctetLikePredicatePart2Type", propOrder = {
    "notStaticString",
    "likeStaticString",
    "octetPattern",
    "escapeStaticString",
    "escapeOctet"
})
public class OctetLikePredicatePart2Type {

    @XmlElement(name = "NotStaticString")
    protected NotStaticStringType notStaticString;
    @XmlElement(name = "LikeStaticString", required = true)
    protected LikeStaticStringType likeStaticString;
    @XmlElement(name = "OctetPattern", required = true)
    protected BlobValueExpressionType octetPattern;
    @XmlElement(name = "EscapeStaticString")
    protected EscapeStaticStringType escapeStaticString;
    @XmlElement(name = "EscapeOctet")
    protected BlobValueExpressionType escapeOctet;

    /**
     * Gets the value of the notStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link NotStaticStringType }
     *     
     */
    public NotStaticStringType getNotStaticString() {
        return notStaticString;
    }

    /**
     * Sets the value of the notStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotStaticStringType }
     *     
     */
    public void setNotStaticString(NotStaticStringType value) {
        this.notStaticString = value;
    }

    /**
     * Gets the value of the likeStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link LikeStaticStringType }
     *     
     */
    public LikeStaticStringType getLikeStaticString() {
        return likeStaticString;
    }

    /**
     * Sets the value of the likeStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link LikeStaticStringType }
     *     
     */
    public void setLikeStaticString(LikeStaticStringType value) {
        this.likeStaticString = value;
    }

    /**
     * Gets the value of the octetPattern property.
     * 
     * @return
     *     possible object is
     *     {@link BlobValueExpressionType }
     *     
     */
    public BlobValueExpressionType getOctetPattern() {
        return octetPattern;
    }

    /**
     * Sets the value of the octetPattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link BlobValueExpressionType }
     *     
     */
    public void setOctetPattern(BlobValueExpressionType value) {
        this.octetPattern = value;
    }

    /**
     * Gets the value of the escapeStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link EscapeStaticStringType }
     *     
     */
    public EscapeStaticStringType getEscapeStaticString() {
        return escapeStaticString;
    }

    /**
     * Sets the value of the escapeStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link EscapeStaticStringType }
     *     
     */
    public void setEscapeStaticString(EscapeStaticStringType value) {
        this.escapeStaticString = value;
    }

    /**
     * Gets the value of the escapeOctet property.
     * 
     * @return
     *     possible object is
     *     {@link BlobValueExpressionType }
     *     
     */
    public BlobValueExpressionType getEscapeOctet() {
        return escapeOctet;
    }

    /**
     * Sets the value of the escapeOctet property.
     * 
     * @param value
     *     allowed object is
     *     {@link BlobValueExpressionType }
     *     
     */
    public void setEscapeOctet(BlobValueExpressionType value) {
        this.escapeOctet = value;
    }

}
