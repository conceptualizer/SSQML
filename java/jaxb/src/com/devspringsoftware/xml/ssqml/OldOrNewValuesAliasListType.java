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
 * <p>Java class for OldOrNewValuesAliasListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OldOrNewValuesAliasListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}OldOrNewValuesAlias" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OldOrNewValuesAliasListType", propOrder = {
    "oldOrNewValuesAlias"
})
public class OldOrNewValuesAliasListType {

    @XmlElement(name = "OldOrNewValuesAlias", required = true)
    protected List<OldOrNewValuesAliasType> oldOrNewValuesAlias;

    /**
     * Gets the value of the oldOrNewValuesAlias property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the oldOrNewValuesAlias property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOldOrNewValuesAlias().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OldOrNewValuesAliasType }
     * 
     * 
     */
    public List<OldOrNewValuesAliasType> getOldOrNewValuesAlias() {
        if (oldOrNewValuesAlias == null) {
            oldOrNewValuesAlias = new ArrayList<OldOrNewValuesAliasType>();
        }
        return this.oldOrNewValuesAlias;
    }

}
