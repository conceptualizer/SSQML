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
 * <p>Java class for IntervalTerm_ISO9075ChoiceGroup1Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IntervalTerm_ISO9075ChoiceGroup1Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}IntervalTerm2"/>
 *         &lt;choice>
 *           &lt;element ref="{http://www.devspringsoftware.com}IntervalTerm_ISO9075ChoiceGroup2"/>
 *           &lt;element ref="{http://www.devspringsoftware.com}IntervalTerm_ISO9075ChoiceGroup3"/>
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
@XmlType(name = "IntervalTerm_ISO9075ChoiceGroup1Type", propOrder = {
    "intervalTerm2",
    "intervalTermISO9075ChoiceGroup2OrIntervalTermISO9075ChoiceGroup3"
})
public class IntervalTermISO9075ChoiceGroup1Type {

    @XmlElement(name = "IntervalTerm2", required = true)
    protected IntervalTermType intervalTerm2;
    @XmlElements({
        @XmlElement(name = "IntervalTerm_ISO9075ChoiceGroup2", type = IntervalTermISO9075ChoiceGroup2Type.class),
        @XmlElement(name = "IntervalTerm_ISO9075ChoiceGroup3", type = IntervalTermISO9075ChoiceGroup3Type.class)
    })
    protected Object intervalTermISO9075ChoiceGroup2OrIntervalTermISO9075ChoiceGroup3;

    /**
     * Gets the value of the intervalTerm2 property.
     * 
     * @return
     *     possible object is
     *     {@link IntervalTermType }
     *     
     */
    public IntervalTermType getIntervalTerm2() {
        return intervalTerm2;
    }

    /**
     * Sets the value of the intervalTerm2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntervalTermType }
     *     
     */
    public void setIntervalTerm2(IntervalTermType value) {
        this.intervalTerm2 = value;
    }

    /**
     * Gets the value of the intervalTermISO9075ChoiceGroup2OrIntervalTermISO9075ChoiceGroup3 property.
     * 
     * @return
     *     possible object is
     *     {@link IntervalTermISO9075ChoiceGroup2Type }
     *     {@link IntervalTermISO9075ChoiceGroup3Type }
     *     
     */
    public Object getIntervalTermISO9075ChoiceGroup2OrIntervalTermISO9075ChoiceGroup3() {
        return intervalTermISO9075ChoiceGroup2OrIntervalTermISO9075ChoiceGroup3;
    }

    /**
     * Sets the value of the intervalTermISO9075ChoiceGroup2OrIntervalTermISO9075ChoiceGroup3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntervalTermISO9075ChoiceGroup2Type }
     *     {@link IntervalTermISO9075ChoiceGroup3Type }
     *     
     */
    public void setIntervalTermISO9075ChoiceGroup2OrIntervalTermISO9075ChoiceGroup3(Object value) {
        this.intervalTermISO9075ChoiceGroup2OrIntervalTermISO9075ChoiceGroup3 = value;
    }

}
