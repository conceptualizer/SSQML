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
 * <p>Java class for CaseExpressionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CaseExpressionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.devspringsoftware.com}CaseAbbreviation"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}CaseSpecification"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CaseExpressionType", propOrder = {
    "caseAbbreviationOrCaseSpecification"
})
public class CaseExpressionType {

    @XmlElements({
        @XmlElement(name = "CaseAbbreviation", type = CaseAbbreviationType.class),
        @XmlElement(name = "CaseSpecification", type = CaseSpecificationType.class)
    })
    protected Object caseAbbreviationOrCaseSpecification;

    /**
     * Gets the value of the caseAbbreviationOrCaseSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link CaseAbbreviationType }
     *     {@link CaseSpecificationType }
     *     
     */
    public Object getCaseAbbreviationOrCaseSpecification() {
        return caseAbbreviationOrCaseSpecification;
    }

    /**
     * Sets the value of the caseAbbreviationOrCaseSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link CaseAbbreviationType }
     *     {@link CaseSpecificationType }
     *     
     */
    public void setCaseAbbreviationOrCaseSpecification(Object value) {
        this.caseAbbreviationOrCaseSpecification = value;
    }

}
