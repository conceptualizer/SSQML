//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.03 at 08:58:47 PM EDT 
//


package com.devspringsoftware.xml.ssqml;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GrantPrivilegeStatementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GrantPrivilegeStatementType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}GrantStaticString"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}Privileges"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}ToStaticString"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}Grantee"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}CommaGranteeItemtype" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}WithHierarchyOptionStaticString" minOccurs="0"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}WithGrantOptionStaticString" minOccurs="0"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}GrantedByStaticString" minOccurs="0"/>
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
@XmlType(name = "GrantPrivilegeStatementType", propOrder = {
    "grantStaticString",
    "privileges",
    "toStaticString",
    "grantee",
    "commaGranteeItemtype",
    "withHierarchyOptionStaticString",
    "withGrantOptionStaticString",
    "grantedByStaticString",
    "grantor"
})
public class GrantPrivilegeStatementType {

    @XmlElement(name = "GrantStaticString", required = true)
    protected GrantStaticStringType grantStaticString;
    @XmlElement(name = "Privileges", required = true)
    protected PrivilegesType privileges;
    @XmlElement(name = "ToStaticString", required = true)
    protected ToStaticStringType toStaticString;
    @XmlElement(name = "Grantee", required = true)
    protected GranteeType grantee;
    @XmlElement(name = "CommaGranteeItemtype")
    protected List<CommaGranteeItemtypeType> commaGranteeItemtype;
    @XmlElement(name = "WithHierarchyOptionStaticString")
    protected WithHierarchyOptionStaticStringType withHierarchyOptionStaticString;
    @XmlElement(name = "WithGrantOptionStaticString")
    protected WithGrantOptionStaticStringType withGrantOptionStaticString;
    @XmlElement(name = "GrantedByStaticString")
    protected GrantedByStaticStringType grantedByStaticString;
    @XmlElement(name = "Grantor")
    protected GrantorType grantor;

    /**
     * Gets the value of the grantStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link GrantStaticStringType }
     *     
     */
    public GrantStaticStringType getGrantStaticString() {
        return grantStaticString;
    }

    /**
     * Sets the value of the grantStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link GrantStaticStringType }
     *     
     */
    public void setGrantStaticString(GrantStaticStringType value) {
        this.grantStaticString = value;
    }

    /**
     * Gets the value of the privileges property.
     * 
     * @return
     *     possible object is
     *     {@link PrivilegesType }
     *     
     */
    public PrivilegesType getPrivileges() {
        return privileges;
    }

    /**
     * Sets the value of the privileges property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrivilegesType }
     *     
     */
    public void setPrivileges(PrivilegesType value) {
        this.privileges = value;
    }

    /**
     * Gets the value of the toStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link ToStaticStringType }
     *     
     */
    public ToStaticStringType getToStaticString() {
        return toStaticString;
    }

    /**
     * Sets the value of the toStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link ToStaticStringType }
     *     
     */
    public void setToStaticString(ToStaticStringType value) {
        this.toStaticString = value;
    }

    /**
     * Gets the value of the grantee property.
     * 
     * @return
     *     possible object is
     *     {@link GranteeType }
     *     
     */
    public GranteeType getGrantee() {
        return grantee;
    }

    /**
     * Sets the value of the grantee property.
     * 
     * @param value
     *     allowed object is
     *     {@link GranteeType }
     *     
     */
    public void setGrantee(GranteeType value) {
        this.grantee = value;
    }

    /**
     * Gets the value of the commaGranteeItemtype property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commaGranteeItemtype property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommaGranteeItemtype().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommaGranteeItemtypeType }
     * 
     * 
     */
    public List<CommaGranteeItemtypeType> getCommaGranteeItemtype() {
        if (commaGranteeItemtype == null) {
            commaGranteeItemtype = new ArrayList<CommaGranteeItemtypeType>();
        }
        return this.commaGranteeItemtype;
    }

    /**
     * Gets the value of the withHierarchyOptionStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link WithHierarchyOptionStaticStringType }
     *     
     */
    public WithHierarchyOptionStaticStringType getWithHierarchyOptionStaticString() {
        return withHierarchyOptionStaticString;
    }

    /**
     * Sets the value of the withHierarchyOptionStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link WithHierarchyOptionStaticStringType }
     *     
     */
    public void setWithHierarchyOptionStaticString(WithHierarchyOptionStaticStringType value) {
        this.withHierarchyOptionStaticString = value;
    }

    /**
     * Gets the value of the withGrantOptionStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link WithGrantOptionStaticStringType }
     *     
     */
    public WithGrantOptionStaticStringType getWithGrantOptionStaticString() {
        return withGrantOptionStaticString;
    }

    /**
     * Sets the value of the withGrantOptionStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link WithGrantOptionStaticStringType }
     *     
     */
    public void setWithGrantOptionStaticString(WithGrantOptionStaticStringType value) {
        this.withGrantOptionStaticString = value;
    }

    /**
     * Gets the value of the grantedByStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link GrantedByStaticStringType }
     *     
     */
    public GrantedByStaticStringType getGrantedByStaticString() {
        return grantedByStaticString;
    }

    /**
     * Sets the value of the grantedByStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link GrantedByStaticStringType }
     *     
     */
    public void setGrantedByStaticString(GrantedByStaticStringType value) {
        this.grantedByStaticString = value;
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
