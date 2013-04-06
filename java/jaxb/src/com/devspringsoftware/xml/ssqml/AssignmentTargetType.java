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
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AssignmentTargetType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssignmentTargetType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.devspringsoftware.com}TargetSpecification"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}ModifiedFieldReference"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}MutatorReference"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssignmentTargetType", propOrder = {
    "targetSpecificationOrModifiedFieldReferenceOrMutatorReference"
})
public class AssignmentTargetType {

    @XmlElementRefs({
        @XmlElementRef(name = "MutatorReference", namespace = "http://www.devspringsoftware.com", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "ModifiedFieldReference", namespace = "http://www.devspringsoftware.com", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TargetSpecification", namespace = "http://www.devspringsoftware.com", type = JAXBElement.class, required = false)
    })
    protected JAXBElement<?> targetSpecificationOrModifiedFieldReferenceOrMutatorReference;

    /**
     * Gets the value of the targetSpecificationOrModifiedFieldReferenceOrMutatorReference property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link MutatorReferenceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TargetSpecificationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TargetSpecificationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ModifiedFieldReferenceType }{@code >}
     *     
     */
    public JAXBElement<?> getTargetSpecificationOrModifiedFieldReferenceOrMutatorReference() {
        return targetSpecificationOrModifiedFieldReferenceOrMutatorReference;
    }

    /**
     * Sets the value of the targetSpecificationOrModifiedFieldReferenceOrMutatorReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link MutatorReferenceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TargetSpecificationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TargetSpecificationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ModifiedFieldReferenceType }{@code >}
     *     
     */
    public void setTargetSpecificationOrModifiedFieldReferenceOrMutatorReference(JAXBElement<?> value) {
        this.targetSpecificationOrModifiedFieldReferenceOrMutatorReference = value;
    }

}
