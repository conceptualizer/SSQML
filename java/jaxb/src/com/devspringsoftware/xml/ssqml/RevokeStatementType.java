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
 * <p>Java class for RevokeStatementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RevokeStatementType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.devspringsoftware.com}RevokePrivilegeStatement"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}RevokeRoleStatement"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RevokeStatementType", propOrder = {
    "revokePrivilegeStatementOrRevokeRoleStatement"
})
public class RevokeStatementType {

    @XmlElements({
        @XmlElement(name = "RevokePrivilegeStatement", type = RevokePrivilegeStatementType.class),
        @XmlElement(name = "RevokeRoleStatement", type = RevokeRoleStatementType.class)
    })
    protected Object revokePrivilegeStatementOrRevokeRoleStatement;

    /**
     * Gets the value of the revokePrivilegeStatementOrRevokeRoleStatement property.
     * 
     * @return
     *     possible object is
     *     {@link RevokePrivilegeStatementType }
     *     {@link RevokeRoleStatementType }
     *     
     */
    public Object getRevokePrivilegeStatementOrRevokeRoleStatement() {
        return revokePrivilegeStatementOrRevokeRoleStatement;
    }

    /**
     * Sets the value of the revokePrivilegeStatementOrRevokeRoleStatement property.
     * 
     * @param value
     *     allowed object is
     *     {@link RevokePrivilegeStatementType }
     *     {@link RevokeRoleStatementType }
     *     
     */
    public void setRevokePrivilegeStatementOrRevokeRoleStatement(Object value) {
        this.revokePrivilegeStatementOrRevokeRoleStatement = value;
    }

}