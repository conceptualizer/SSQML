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
 * <p>Java class for ColumnConstraintType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ColumnConstraintType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.devspringsoftware.com}NotNullStaticString"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}UniqueSpecification"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}ReferencesSpecification"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}CheckConstraintDefinition"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ColumnConstraintType", propOrder = {
    "notNullStaticStringOrUniqueSpecificationOrReferencesSpecification"
})
public class ColumnConstraintType {

    @XmlElements({
        @XmlElement(name = "NotNullStaticString", type = NotNullStaticStringType.class),
        @XmlElement(name = "UniqueSpecification", type = UniqueSpecificationType.class),
        @XmlElement(name = "ReferencesSpecification", type = ReferencesSpecificationType.class),
        @XmlElement(name = "CheckConstraintDefinition", type = CheckConstraintDefinitionType.class)
    })
    protected Object notNullStaticStringOrUniqueSpecificationOrReferencesSpecification;

    /**
     * Gets the value of the notNullStaticStringOrUniqueSpecificationOrReferencesSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link NotNullStaticStringType }
     *     {@link UniqueSpecificationType }
     *     {@link ReferencesSpecificationType }
     *     {@link CheckConstraintDefinitionType }
     *     
     */
    public Object getNotNullStaticStringOrUniqueSpecificationOrReferencesSpecification() {
        return notNullStaticStringOrUniqueSpecificationOrReferencesSpecification;
    }

    /**
     * Sets the value of the notNullStaticStringOrUniqueSpecificationOrReferencesSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotNullStaticStringType }
     *     {@link UniqueSpecificationType }
     *     {@link ReferencesSpecificationType }
     *     {@link CheckConstraintDefinitionType }
     *     
     */
    public void setNotNullStaticStringOrUniqueSpecificationOrReferencesSpecification(Object value) {
        this.notNullStaticStringOrUniqueSpecificationOrReferencesSpecification = value;
    }

}
