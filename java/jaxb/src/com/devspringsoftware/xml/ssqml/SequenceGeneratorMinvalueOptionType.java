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
 * <p>Java class for SequenceGeneratorMinvalueOptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SequenceGeneratorMinvalueOptionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.devspringsoftware.com}SequenceGeneratorMinvalueOption_ISO9075ChoiceGroup1"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}NoMinvalueStaticString"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SequenceGeneratorMinvalueOptionType", propOrder = {
    "sequenceGeneratorMinvalueOptionISO9075ChoiceGroup1OrNoMinvalueStaticString"
})
public class SequenceGeneratorMinvalueOptionType {

    @XmlElements({
        @XmlElement(name = "SequenceGeneratorMinvalueOption_ISO9075ChoiceGroup1", type = SequenceGeneratorMinvalueOptionISO9075ChoiceGroup1Type.class),
        @XmlElement(name = "NoMinvalueStaticString", type = NoMinvalueStaticStringType.class)
    })
    protected Object sequenceGeneratorMinvalueOptionISO9075ChoiceGroup1OrNoMinvalueStaticString;

    /**
     * Gets the value of the sequenceGeneratorMinvalueOptionISO9075ChoiceGroup1OrNoMinvalueStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link SequenceGeneratorMinvalueOptionISO9075ChoiceGroup1Type }
     *     {@link NoMinvalueStaticStringType }
     *     
     */
    public Object getSequenceGeneratorMinvalueOptionISO9075ChoiceGroup1OrNoMinvalueStaticString() {
        return sequenceGeneratorMinvalueOptionISO9075ChoiceGroup1OrNoMinvalueStaticString;
    }

    /**
     * Sets the value of the sequenceGeneratorMinvalueOptionISO9075ChoiceGroup1OrNoMinvalueStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link SequenceGeneratorMinvalueOptionISO9075ChoiceGroup1Type }
     *     {@link NoMinvalueStaticStringType }
     *     
     */
    public void setSequenceGeneratorMinvalueOptionISO9075ChoiceGroup1OrNoMinvalueStaticString(Object value) {
        this.sequenceGeneratorMinvalueOptionISO9075ChoiceGroup1OrNoMinvalueStaticString = value;
    }

}
