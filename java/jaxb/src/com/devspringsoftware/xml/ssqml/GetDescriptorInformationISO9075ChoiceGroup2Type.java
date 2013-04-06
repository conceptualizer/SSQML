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
 * <p>Java class for GetDescriptorInformation_ISO9075ChoiceGroup2Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetDescriptorInformation_ISO9075ChoiceGroup2Type">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}ValueStaticString"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}ItemNumber"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}GetItemInformation"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}CommaGetItemInformationItemtype" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetDescriptorInformation_ISO9075ChoiceGroup2Type", propOrder = {
    "valueStaticString",
    "itemNumber",
    "getItemInformation",
    "commaGetItemInformationItemtype"
})
public class GetDescriptorInformationISO9075ChoiceGroup2Type {

    @XmlElement(name = "ValueStaticString", required = true)
    protected ValueStaticStringType valueStaticString;
    @XmlElement(name = "ItemNumber", required = true)
    protected SimpleValueSpecificationType itemNumber;
    @XmlElement(name = "GetItemInformation", required = true)
    protected GetItemInformationType getItemInformation;
    @XmlElement(name = "CommaGetItemInformationItemtype")
    protected List<CommaGetItemInformationItemtypeType> commaGetItemInformationItemtype;

    /**
     * Gets the value of the valueStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link ValueStaticStringType }
     *     
     */
    public ValueStaticStringType getValueStaticString() {
        return valueStaticString;
    }

    /**
     * Sets the value of the valueStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueStaticStringType }
     *     
     */
    public void setValueStaticString(ValueStaticStringType value) {
        this.valueStaticString = value;
    }

    /**
     * Gets the value of the itemNumber property.
     * 
     * @return
     *     possible object is
     *     {@link SimpleValueSpecificationType }
     *     
     */
    public SimpleValueSpecificationType getItemNumber() {
        return itemNumber;
    }

    /**
     * Sets the value of the itemNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleValueSpecificationType }
     *     
     */
    public void setItemNumber(SimpleValueSpecificationType value) {
        this.itemNumber = value;
    }

    /**
     * Gets the value of the getItemInformation property.
     * 
     * @return
     *     possible object is
     *     {@link GetItemInformationType }
     *     
     */
    public GetItemInformationType getGetItemInformation() {
        return getItemInformation;
    }

    /**
     * Sets the value of the getItemInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetItemInformationType }
     *     
     */
    public void setGetItemInformation(GetItemInformationType value) {
        this.getItemInformation = value;
    }

    /**
     * Gets the value of the commaGetItemInformationItemtype property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commaGetItemInformationItemtype property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommaGetItemInformationItemtype().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommaGetItemInformationItemtypeType }
     * 
     * 
     */
    public List<CommaGetItemInformationItemtypeType> getCommaGetItemInformationItemtype() {
        if (commaGetItemInformationItemtype == null) {
            commaGetItemInformationItemtype = new ArrayList<CommaGetItemInformationItemtypeType>();
        }
        return this.commaGetItemInformationItemtype;
    }

}