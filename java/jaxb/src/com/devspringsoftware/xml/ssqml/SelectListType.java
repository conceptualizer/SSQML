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
 * <p>Java class for SelectListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SelectListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.devspringsoftware.com}Asterisk"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}SelectList_ISO9075ChoiceGroup1"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SelectListType", propOrder = {
    "asteriskOrSelectListISO9075ChoiceGroup1"
})
public class SelectListType {

    @XmlElements({
        @XmlElement(name = "Asterisk", type = String.class),
        @XmlElement(name = "SelectList_ISO9075ChoiceGroup1", type = SelectListISO9075ChoiceGroup1Type.class)
    })
    protected Object asteriskOrSelectListISO9075ChoiceGroup1;

    /**
     * Gets the value of the asteriskOrSelectListISO9075ChoiceGroup1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     {@link SelectListISO9075ChoiceGroup1Type }
     *     
     */
    public Object getAsteriskOrSelectListISO9075ChoiceGroup1() {
        return asteriskOrSelectListISO9075ChoiceGroup1;
    }

    /**
     * Sets the value of the asteriskOrSelectListISO9075ChoiceGroup1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     {@link SelectListISO9075ChoiceGroup1Type }
     *     
     */
    public void setAsteriskOrSelectListISO9075ChoiceGroup1(Object value) {
        this.asteriskOrSelectListISO9075ChoiceGroup1 = value;
    }

}
