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
 * <p>Java class for ActualIdentifierType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActualIdentifierType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.devspringsoftware.com}RegularIdentifier"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}DelimitedIdentifier"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActualIdentifierType", propOrder = {
    "regularIdentifierOrDelimitedIdentifier"
})
public class ActualIdentifierType {

    @XmlElements({
        @XmlElement(name = "RegularIdentifier", type = IdentifierBodyType.class),
        @XmlElement(name = "DelimitedIdentifier", type = DelimitedIdentifierType.class)
    })
    protected Object regularIdentifierOrDelimitedIdentifier;

    /**
     * Gets the value of the regularIdentifierOrDelimitedIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifierBodyType }
     *     {@link DelimitedIdentifierType }
     *     
     */
    public Object getRegularIdentifierOrDelimitedIdentifier() {
        return regularIdentifierOrDelimitedIdentifier;
    }

    /**
     * Sets the value of the regularIdentifierOrDelimitedIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifierBodyType }
     *     {@link DelimitedIdentifierType }
     *     
     */
    public void setRegularIdentifierOrDelimitedIdentifier(Object value) {
        this.regularIdentifierOrDelimitedIdentifier = value;
    }

}
