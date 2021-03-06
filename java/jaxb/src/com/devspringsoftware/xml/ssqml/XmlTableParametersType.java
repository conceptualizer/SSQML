//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.03 at 08:58:47 PM EDT 
//


package com.devspringsoftware.xml.ssqml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XmlTableParametersType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XmlTableParametersType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}PassingStaticString"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}XmlQueryArgument"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}CommaXmlQueryArgumentItemtype" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XmlTableParametersType", propOrder = {
    "passingStaticString",
    "xmlQueryArgument",
    "commaXmlQueryArgumentItemtype"
})
public class XmlTableParametersType {

    @XmlElement(name = "PassingStaticString", required = true)
    protected PassingStaticStringType passingStaticString;
    @XmlElement(name = "XmlQueryArgument", required = true)
    protected XmlQueryArgumentType xmlQueryArgument;
    @XmlElement(name = "CommaXmlQueryArgumentItemtype")
    protected List<CommaXmlQueryArgumentItemtypeType> commaXmlQueryArgumentItemtype;

    /**
     * Gets the value of the passingStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link PassingStaticStringType }
     *     
     */
    public PassingStaticStringType getPassingStaticString() {
        return passingStaticString;
    }

    /**
     * Sets the value of the passingStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link PassingStaticStringType }
     *     
     */
    public void setPassingStaticString(PassingStaticStringType value) {
        this.passingStaticString = value;
    }

    /**
     * Gets the value of the xmlQueryArgument property.
     * 
     * @return
     *     possible object is
     *     {@link XmlQueryArgumentType }
     *     
     */
    public XmlQueryArgumentType getXmlQueryArgument() {
        return xmlQueryArgument;
    }

    /**
     * Sets the value of the xmlQueryArgument property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlQueryArgumentType }
     *     
     */
    public void setXmlQueryArgument(XmlQueryArgumentType value) {
        this.xmlQueryArgument = value;
    }

    /**
     * Gets the value of the commaXmlQueryArgumentItemtype property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commaXmlQueryArgumentItemtype property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommaXmlQueryArgumentItemtype().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommaXmlQueryArgumentItemtypeType }
     * 
     * 
     */
    public List<CommaXmlQueryArgumentItemtypeType> getCommaXmlQueryArgumentItemtype() {
        if (commaXmlQueryArgumentItemtype == null) {
            commaXmlQueryArgumentItemtype = new ArrayList<CommaXmlQueryArgumentItemtypeType>();
        }
        return this.commaXmlQueryArgumentItemtype;
    }

}
