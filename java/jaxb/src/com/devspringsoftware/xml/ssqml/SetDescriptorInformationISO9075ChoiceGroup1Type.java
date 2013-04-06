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
 * <p>Java class for SetDescriptorInformation_ISO9075ChoiceGroup1Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SetDescriptorInformation_ISO9075ChoiceGroup1Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}SetHeaderInformation"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}CommaSetHeaderInformationItemtype" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetDescriptorInformation_ISO9075ChoiceGroup1Type", propOrder = {
    "setHeaderInformation",
    "commaSetHeaderInformationItemtype"
})
public class SetDescriptorInformationISO9075ChoiceGroup1Type {

    @XmlElement(name = "SetHeaderInformation", required = true)
    protected SetHeaderInformationType setHeaderInformation;
    @XmlElement(name = "CommaSetHeaderInformationItemtype")
    protected List<CommaSetHeaderInformationItemtypeType> commaSetHeaderInformationItemtype;

    /**
     * Gets the value of the setHeaderInformation property.
     * 
     * @return
     *     possible object is
     *     {@link SetHeaderInformationType }
     *     
     */
    public SetHeaderInformationType getSetHeaderInformation() {
        return setHeaderInformation;
    }

    /**
     * Sets the value of the setHeaderInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SetHeaderInformationType }
     *     
     */
    public void setSetHeaderInformation(SetHeaderInformationType value) {
        this.setHeaderInformation = value;
    }

    /**
     * Gets the value of the commaSetHeaderInformationItemtype property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commaSetHeaderInformationItemtype property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommaSetHeaderInformationItemtype().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommaSetHeaderInformationItemtypeType }
     * 
     * 
     */
    public List<CommaSetHeaderInformationItemtypeType> getCommaSetHeaderInformationItemtype() {
        if (commaSetHeaderInformationItemtype == null) {
            commaSetHeaderInformationItemtype = new ArrayList<CommaSetHeaderInformationItemtypeType>();
        }
        return this.commaSetHeaderInformationItemtype;
    }

}