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
 * <p>Java class for MethodSpecificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MethodSpecificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.devspringsoftware.com}OriginalMethodSpecification"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}OverridingMethodSpecification"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MethodSpecificationType", propOrder = {
    "originalMethodSpecificationOrOverridingMethodSpecification"
})
public class MethodSpecificationType {

    @XmlElements({
        @XmlElement(name = "OriginalMethodSpecification", type = OriginalMethodSpecificationType.class),
        @XmlElement(name = "OverridingMethodSpecification", type = OverridingMethodSpecificationType.class)
    })
    protected Object originalMethodSpecificationOrOverridingMethodSpecification;

    /**
     * Gets the value of the originalMethodSpecificationOrOverridingMethodSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalMethodSpecificationType }
     *     {@link OverridingMethodSpecificationType }
     *     
     */
    public Object getOriginalMethodSpecificationOrOverridingMethodSpecification() {
        return originalMethodSpecificationOrOverridingMethodSpecification;
    }

    /**
     * Sets the value of the originalMethodSpecificationOrOverridingMethodSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalMethodSpecificationType }
     *     {@link OverridingMethodSpecificationType }
     *     
     */
    public void setOriginalMethodSpecificationOrOverridingMethodSpecification(Object value) {
        this.originalMethodSpecificationOrOverridingMethodSpecification = value;
    }

}
