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
 * <p>Java class for SetDomainDefaultClauseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SetDomainDefaultClauseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}SetStaticString"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}DefaultClause"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetDomainDefaultClauseType", propOrder = {
    "setStaticString",
    "defaultClause"
})
public class SetDomainDefaultClauseType {

    @XmlElement(name = "SetStaticString", required = true)
    protected SetStaticStringType setStaticString;
    @XmlElementRef(name = "DefaultClause", namespace = "http://www.devspringsoftware.com", type = JAXBElement.class)
    protected JAXBElement<DefaultClauseType> defaultClause;

    /**
     * Gets the value of the setStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link SetStaticStringType }
     *     
     */
    public SetStaticStringType getSetStaticString() {
        return setStaticString;
    }

    /**
     * Sets the value of the setStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link SetStaticStringType }
     *     
     */
    public void setSetStaticString(SetStaticStringType value) {
        this.setStaticString = value;
    }

    /**
     * Gets the value of the defaultClause property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DefaultClauseType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DefaultClauseType }{@code >}
     *     
     */
    public JAXBElement<DefaultClauseType> getDefaultClause() {
        return defaultClause;
    }

    /**
     * Sets the value of the defaultClause property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DefaultClauseType }{@code >}
     *     {@link JAXBElement }{@code <}{@link DefaultClauseType }{@code >}
     *     
     */
    public void setDefaultClause(JAXBElement<DefaultClauseType> value) {
        this.defaultClause = value;
    }

}
