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
 * <p>Java class for NonJoinQueryTermType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NonJoinQueryTermType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.devspringsoftware.com}NonJoinQueryPrimary"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}NonJoinQueryTerm_ISO9075ChoiceGroup1"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NonJoinQueryTermType", propOrder = {
    "nonJoinQueryPrimaryOrNonJoinQueryTermISO9075ChoiceGroup1"
})
public class NonJoinQueryTermType {

    @XmlElements({
        @XmlElement(name = "NonJoinQueryPrimary", type = NonJoinQueryPrimaryType.class),
        @XmlElement(name = "NonJoinQueryTerm_ISO9075ChoiceGroup1", type = NonJoinQueryTermISO9075ChoiceGroup1Type.class)
    })
    protected Object nonJoinQueryPrimaryOrNonJoinQueryTermISO9075ChoiceGroup1;

    /**
     * Gets the value of the nonJoinQueryPrimaryOrNonJoinQueryTermISO9075ChoiceGroup1 property.
     * 
     * @return
     *     possible object is
     *     {@link NonJoinQueryPrimaryType }
     *     {@link NonJoinQueryTermISO9075ChoiceGroup1Type }
     *     
     */
    public Object getNonJoinQueryPrimaryOrNonJoinQueryTermISO9075ChoiceGroup1() {
        return nonJoinQueryPrimaryOrNonJoinQueryTermISO9075ChoiceGroup1;
    }

    /**
     * Sets the value of the nonJoinQueryPrimaryOrNonJoinQueryTermISO9075ChoiceGroup1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonJoinQueryPrimaryType }
     *     {@link NonJoinQueryTermISO9075ChoiceGroup1Type }
     *     
     */
    public void setNonJoinQueryPrimaryOrNonJoinQueryTermISO9075ChoiceGroup1(Object value) {
        this.nonJoinQueryPrimaryOrNonJoinQueryTermISO9075ChoiceGroup1 = value;
    }

}