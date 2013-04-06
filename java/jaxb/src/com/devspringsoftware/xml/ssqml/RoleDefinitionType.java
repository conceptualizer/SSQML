//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.03 at 08:58:47 PM EDT 
//


package com.devspringsoftware.xml.ssqml;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RoleDefinitionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoleDefinitionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}CreateRoleStaticString"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}RoleName"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}WithAdminStaticString" minOccurs="0"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}Grantor" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoleDefinitionType", propOrder = {
    "createRoleStaticString",
    "roleName",
    "withAdminStaticString",
    "grantor"
})
public class RoleDefinitionType {

    @XmlElement(name = "CreateRoleStaticString", required = true)
    protected CreateRoleStaticStringType createRoleStaticString;
    @XmlElementRef(name = "RoleName", namespace = "http://www.devspringsoftware.com", type = JAXBElement.class)
    protected JAXBElement<ActualIdentifierType> roleName;
    @XmlElement(name = "WithAdminStaticString")
    protected WithAdminStaticStringType withAdminStaticString;
    @XmlElement(name = "Grantor")
    protected GrantorType grantor;

    /**
     * Gets the value of the createRoleStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link CreateRoleStaticStringType }
     *     
     */
    public CreateRoleStaticStringType getCreateRoleStaticString() {
        return createRoleStaticString;
    }

    /**
     * Sets the value of the createRoleStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateRoleStaticStringType }
     *     
     */
    public void setCreateRoleStaticString(CreateRoleStaticStringType value) {
        this.createRoleStaticString = value;
    }

    /**
     * Gets the value of the roleName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ActualIdentifierType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ActualIdentifierType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ActualIdentifierType }{@code >}
     *     
     */
    public JAXBElement<ActualIdentifierType> getRoleName() {
        return roleName;
    }

    /**
     * Sets the value of the roleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ActualIdentifierType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ActualIdentifierType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ActualIdentifierType }{@code >}
     *     
     */
    public void setRoleName(JAXBElement<ActualIdentifierType> value) {
        this.roleName = value;
    }

    /**
     * Gets the value of the withAdminStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link WithAdminStaticStringType }
     *     
     */
    public WithAdminStaticStringType getWithAdminStaticString() {
        return withAdminStaticString;
    }

    /**
     * Sets the value of the withAdminStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link WithAdminStaticStringType }
     *     
     */
    public void setWithAdminStaticString(WithAdminStaticStringType value) {
        this.withAdminStaticString = value;
    }

    /**
     * Gets the value of the grantor property.
     * 
     * @return
     *     possible object is
     *     {@link GrantorType }
     *     
     */
    public GrantorType getGrantor() {
        return grantor;
    }

    /**
     * Sets the value of the grantor property.
     * 
     * @param value
     *     allowed object is
     *     {@link GrantorType }
     *     
     */
    public void setGrantor(GrantorType value) {
        this.grantor = value;
    }

}
