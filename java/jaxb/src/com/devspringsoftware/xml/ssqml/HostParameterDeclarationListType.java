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
 * <p>Java class for HostParameterDeclarationListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HostParameterDeclarationListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}LeftParen"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}HostParameterDeclaration"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}CommaHostParameterDeclarationItemtype" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}RightParen"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostParameterDeclarationListType", propOrder = {
    "leftParen",
    "hostParameterDeclaration",
    "commaHostParameterDeclarationItemtype",
    "rightParen"
})
public class HostParameterDeclarationListType {

    @XmlElement(name = "LeftParen", required = true)
    protected String leftParen;
    @XmlElement(name = "HostParameterDeclaration", required = true)
    protected HostParameterDeclarationType hostParameterDeclaration;
    @XmlElement(name = "CommaHostParameterDeclarationItemtype")
    protected List<CommaHostParameterDeclarationItemtypeType> commaHostParameterDeclarationItemtype;
    @XmlElement(name = "RightParen", required = true)
    protected String rightParen;

    /**
     * Gets the value of the leftParen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeftParen() {
        return leftParen;
    }

    /**
     * Sets the value of the leftParen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeftParen(String value) {
        this.leftParen = value;
    }

    /**
     * Gets the value of the hostParameterDeclaration property.
     * 
     * @return
     *     possible object is
     *     {@link HostParameterDeclarationType }
     *     
     */
    public HostParameterDeclarationType getHostParameterDeclaration() {
        return hostParameterDeclaration;
    }

    /**
     * Sets the value of the hostParameterDeclaration property.
     * 
     * @param value
     *     allowed object is
     *     {@link HostParameterDeclarationType }
     *     
     */
    public void setHostParameterDeclaration(HostParameterDeclarationType value) {
        this.hostParameterDeclaration = value;
    }

    /**
     * Gets the value of the commaHostParameterDeclarationItemtype property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commaHostParameterDeclarationItemtype property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommaHostParameterDeclarationItemtype().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommaHostParameterDeclarationItemtypeType }
     * 
     * 
     */
    public List<CommaHostParameterDeclarationItemtypeType> getCommaHostParameterDeclarationItemtype() {
        if (commaHostParameterDeclarationItemtype == null) {
            commaHostParameterDeclarationItemtype = new ArrayList<CommaHostParameterDeclarationItemtypeType>();
        }
        return this.commaHostParameterDeclarationItemtype;
    }

    /**
     * Gets the value of the rightParen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRightParen() {
        return rightParen;
    }

    /**
     * Sets the value of the rightParen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRightParen(String value) {
        this.rightParen = value;
    }

}