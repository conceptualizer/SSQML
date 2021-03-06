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
 * <p>Java class for RoutineCharacteristicType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoutineCharacteristicType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.devspringsoftware.com}ParameterStyleClause"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}RoutineCharacteristic_ISO9075ChoiceGroup1"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}DeterministicCharacteristic"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}SqlDataAccessIndication"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}NullCallClause"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}DynamicResultSetsCharacteristic"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}SavepointLevelIndication"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoutineCharacteristicType", propOrder = {
    "parameterStyleClauseOrRoutineCharacteristicISO9075ChoiceGroup1OrDeterministicCharacteristic"
})
public class RoutineCharacteristicType {

    @XmlElements({
        @XmlElement(name = "ParameterStyleClause", type = ParameterStyleClauseType.class),
        @XmlElement(name = "RoutineCharacteristic_ISO9075ChoiceGroup1", type = RoutineCharacteristicISO9075ChoiceGroup1Type.class),
        @XmlElement(name = "DeterministicCharacteristic", type = DeterministicCharacteristicType.class),
        @XmlElement(name = "SqlDataAccessIndication", type = SqlDataAccessIndicationType.class),
        @XmlElement(name = "NullCallClause", type = NullCallClauseType.class),
        @XmlElement(name = "DynamicResultSetsCharacteristic", type = DynamicResultSetsCharacteristicType.class),
        @XmlElement(name = "SavepointLevelIndication", type = SavepointLevelIndicationType.class)
    })
    protected Object parameterStyleClauseOrRoutineCharacteristicISO9075ChoiceGroup1OrDeterministicCharacteristic;

    /**
     * Gets the value of the parameterStyleClauseOrRoutineCharacteristicISO9075ChoiceGroup1OrDeterministicCharacteristic property.
     * 
     * @return
     *     possible object is
     *     {@link ParameterStyleClauseType }
     *     {@link RoutineCharacteristicISO9075ChoiceGroup1Type }
     *     {@link DeterministicCharacteristicType }
     *     {@link SqlDataAccessIndicationType }
     *     {@link NullCallClauseType }
     *     {@link DynamicResultSetsCharacteristicType }
     *     {@link SavepointLevelIndicationType }
     *     
     */
    public Object getParameterStyleClauseOrRoutineCharacteristicISO9075ChoiceGroup1OrDeterministicCharacteristic() {
        return parameterStyleClauseOrRoutineCharacteristicISO9075ChoiceGroup1OrDeterministicCharacteristic;
    }

    /**
     * Sets the value of the parameterStyleClauseOrRoutineCharacteristicISO9075ChoiceGroup1OrDeterministicCharacteristic property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParameterStyleClauseType }
     *     {@link RoutineCharacteristicISO9075ChoiceGroup1Type }
     *     {@link DeterministicCharacteristicType }
     *     {@link SqlDataAccessIndicationType }
     *     {@link NullCallClauseType }
     *     {@link DynamicResultSetsCharacteristicType }
     *     {@link SavepointLevelIndicationType }
     *     
     */
    public void setParameterStyleClauseOrRoutineCharacteristicISO9075ChoiceGroup1OrDeterministicCharacteristic(Object value) {
        this.parameterStyleClauseOrRoutineCharacteristicISO9075ChoiceGroup1OrDeterministicCharacteristic = value;
    }

}
