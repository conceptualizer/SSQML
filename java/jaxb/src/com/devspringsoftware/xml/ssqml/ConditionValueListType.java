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
 * <p>Java class for ConditionValueListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConditionValueListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}ConditionValue"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}CommaConditionValueItemtype" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConditionValueListType", propOrder = {
    "conditionValue",
    "commaConditionValueItemtype"
})
public class ConditionValueListType {

    @XmlElement(name = "ConditionValue", required = true)
    protected ConditionValueType conditionValue;
    @XmlElement(name = "CommaConditionValueItemtype")
    protected List<CommaConditionValueItemtypeType> commaConditionValueItemtype;

    /**
     * Gets the value of the conditionValue property.
     * 
     * @return
     *     possible object is
     *     {@link ConditionValueType }
     *     
     */
    public ConditionValueType getConditionValue() {
        return conditionValue;
    }

    /**
     * Sets the value of the conditionValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConditionValueType }
     *     
     */
    public void setConditionValue(ConditionValueType value) {
        this.conditionValue = value;
    }

    /**
     * Gets the value of the commaConditionValueItemtype property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commaConditionValueItemtype property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommaConditionValueItemtype().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommaConditionValueItemtypeType }
     * 
     * 
     */
    public List<CommaConditionValueItemtypeType> getCommaConditionValueItemtype() {
        if (commaConditionValueItemtype == null) {
            commaConditionValueItemtype = new ArrayList<CommaConditionValueItemtypeType>();
        }
        return this.commaConditionValueItemtype;
    }

}
