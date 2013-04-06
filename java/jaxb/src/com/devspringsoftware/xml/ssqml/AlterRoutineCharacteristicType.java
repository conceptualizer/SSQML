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
 * <p>Java class for AlterRoutineCharacteristicType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlterRoutineCharacteristicType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.devspringsoftware.com}ParameterStyleClause"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}SqlDataAccessIndication"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}NullCallClause"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}DynamicResultSetsCharacteristic"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}AlterRoutineCharacteristic_ISO9075ChoiceGroup1"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlterRoutineCharacteristicType", propOrder = {
    "parameterStyleClauseOrSqlDataAccessIndicationOrNullCallClause"
})
public class AlterRoutineCharacteristicType {

    @XmlElements({
        @XmlElement(name = "ParameterStyleClause", type = ParameterStyleClauseType.class),
        @XmlElement(name = "SqlDataAccessIndication", type = SqlDataAccessIndicationType.class),
        @XmlElement(name = "NullCallClause", type = NullCallClauseType.class),
        @XmlElement(name = "DynamicResultSetsCharacteristic", type = DynamicResultSetsCharacteristicType.class),
        @XmlElement(name = "AlterRoutineCharacteristic_ISO9075ChoiceGroup1", type = AlterRoutineCharacteristicISO9075ChoiceGroup1Type.class)
    })
    protected Object parameterStyleClauseOrSqlDataAccessIndicationOrNullCallClause;

    /**
     * Gets the value of the parameterStyleClauseOrSqlDataAccessIndicationOrNullCallClause property.
     * 
     * @return
     *     possible object is
     *     {@link ParameterStyleClauseType }
     *     {@link SqlDataAccessIndicationType }
     *     {@link NullCallClauseType }
     *     {@link DynamicResultSetsCharacteristicType }
     *     {@link AlterRoutineCharacteristicISO9075ChoiceGroup1Type }
     *     
     */
    public Object getParameterStyleClauseOrSqlDataAccessIndicationOrNullCallClause() {
        return parameterStyleClauseOrSqlDataAccessIndicationOrNullCallClause;
    }

    /**
     * Sets the value of the parameterStyleClauseOrSqlDataAccessIndicationOrNullCallClause property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParameterStyleClauseType }
     *     {@link SqlDataAccessIndicationType }
     *     {@link NullCallClauseType }
     *     {@link DynamicResultSetsCharacteristicType }
     *     {@link AlterRoutineCharacteristicISO9075ChoiceGroup1Type }
     *     
     */
    public void setParameterStyleClauseOrSqlDataAccessIndicationOrNullCallClause(Object value) {
        this.parameterStyleClauseOrSqlDataAccessIndicationOrNullCallClause = value;
    }

}