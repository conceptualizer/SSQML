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
 * <p>Java class for RepresentationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RepresentationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.devspringsoftware.com}PredefinedType"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}MemberList"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RepresentationType", propOrder = {
    "predefinedTypeOrMemberList"
})
public class RepresentationType {

    @XmlElements({
        @XmlElement(name = "PredefinedType", type = PredefinedTypeType.class),
        @XmlElement(name = "MemberList", type = MemberListType.class)
    })
    protected Object predefinedTypeOrMemberList;

    /**
     * Gets the value of the predefinedTypeOrMemberList property.
     * 
     * @return
     *     possible object is
     *     {@link PredefinedTypeType }
     *     {@link MemberListType }
     *     
     */
    public Object getPredefinedTypeOrMemberList() {
        return predefinedTypeOrMemberList;
    }

    /**
     * Sets the value of the predefinedTypeOrMemberList property.
     * 
     * @param value
     *     allowed object is
     *     {@link PredefinedTypeType }
     *     {@link MemberListType }
     *     
     */
    public void setPredefinedTypeOrMemberList(Object value) {
        this.predefinedTypeOrMemberList = value;
    }

}
