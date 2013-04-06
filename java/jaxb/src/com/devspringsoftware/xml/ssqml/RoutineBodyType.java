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
 * <p>Java class for RoutineBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoutineBodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.devspringsoftware.com}SqlRoutineSpec"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}ExternalBodyReference"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoutineBodyType", propOrder = {
    "sqlRoutineSpecOrExternalBodyReference"
})
public class RoutineBodyType {

    @XmlElements({
        @XmlElement(name = "SqlRoutineSpec", type = SqlRoutineSpecType.class),
        @XmlElement(name = "ExternalBodyReference", type = ExternalBodyReferenceType.class)
    })
    protected Object sqlRoutineSpecOrExternalBodyReference;

    /**
     * Gets the value of the sqlRoutineSpecOrExternalBodyReference property.
     * 
     * @return
     *     possible object is
     *     {@link SqlRoutineSpecType }
     *     {@link ExternalBodyReferenceType }
     *     
     */
    public Object getSqlRoutineSpecOrExternalBodyReference() {
        return sqlRoutineSpecOrExternalBodyReference;
    }

    /**
     * Sets the value of the sqlRoutineSpecOrExternalBodyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link SqlRoutineSpecType }
     *     {@link ExternalBodyReferenceType }
     *     
     */
    public void setSqlRoutineSpecOrExternalBodyReference(Object value) {
        this.sqlRoutineSpecOrExternalBodyReference = value;
    }

}
