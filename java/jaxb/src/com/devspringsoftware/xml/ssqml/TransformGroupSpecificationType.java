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
 * <p>Java class for TransformGroupSpecificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransformGroupSpecificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}TransformGroupStaticString"/>
 *         &lt;choice>
 *           &lt;element ref="{http://www.devspringsoftware.com}SingleGroupSpecification"/>
 *           &lt;element ref="{http://www.devspringsoftware.com}MultipleGroupSpecification"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransformGroupSpecificationType", propOrder = {
    "transformGroupStaticString",
    "singleGroupSpecificationOrMultipleGroupSpecification"
})
public class TransformGroupSpecificationType {

    @XmlElement(name = "TransformGroupStaticString", required = true)
    protected TransformGroupStaticStringType transformGroupStaticString;
    @XmlElements({
        @XmlElement(name = "SingleGroupSpecification", type = ActualIdentifierType.class),
        @XmlElement(name = "MultipleGroupSpecification", type = MultipleGroupSpecificationType.class)
    })
    protected Object singleGroupSpecificationOrMultipleGroupSpecification;

    /**
     * Gets the value of the transformGroupStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link TransformGroupStaticStringType }
     *     
     */
    public TransformGroupStaticStringType getTransformGroupStaticString() {
        return transformGroupStaticString;
    }

    /**
     * Sets the value of the transformGroupStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransformGroupStaticStringType }
     *     
     */
    public void setTransformGroupStaticString(TransformGroupStaticStringType value) {
        this.transformGroupStaticString = value;
    }

    /**
     * Gets the value of the singleGroupSpecificationOrMultipleGroupSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link ActualIdentifierType }
     *     {@link MultipleGroupSpecificationType }
     *     
     */
    public Object getSingleGroupSpecificationOrMultipleGroupSpecification() {
        return singleGroupSpecificationOrMultipleGroupSpecification;
    }

    /**
     * Sets the value of the singleGroupSpecificationOrMultipleGroupSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActualIdentifierType }
     *     {@link MultipleGroupSpecificationType }
     *     
     */
    public void setSingleGroupSpecificationOrMultipleGroupSpecification(Object value) {
        this.singleGroupSpecificationOrMultipleGroupSpecification = value;
    }

}
