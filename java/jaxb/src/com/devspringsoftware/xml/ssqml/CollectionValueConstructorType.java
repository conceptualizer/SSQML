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
 * <p>Java class for CollectionValueConstructorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CollectionValueConstructorType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.devspringsoftware.com}ArrayValueConstructor"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}MultisetValueConstructor"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollectionValueConstructorType", propOrder = {
    "arrayValueConstructorOrMultisetValueConstructor"
})
public class CollectionValueConstructorType {

    @XmlElements({
        @XmlElement(name = "ArrayValueConstructor", type = ArrayValueConstructorType.class),
        @XmlElement(name = "MultisetValueConstructor", type = MultisetValueConstructorType.class)
    })
    protected Object arrayValueConstructorOrMultisetValueConstructor;

    /**
     * Gets the value of the arrayValueConstructorOrMultisetValueConstructor property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayValueConstructorType }
     *     {@link MultisetValueConstructorType }
     *     
     */
    public Object getArrayValueConstructorOrMultisetValueConstructor() {
        return arrayValueConstructorOrMultisetValueConstructor;
    }

    /**
     * Sets the value of the arrayValueConstructorOrMultisetValueConstructor property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayValueConstructorType }
     *     {@link MultisetValueConstructorType }
     *     
     */
    public void setArrayValueConstructorOrMultisetValueConstructor(Object value) {
        this.arrayValueConstructorOrMultisetValueConstructor = value;
    }

}
