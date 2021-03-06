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
 * <p>Java class for WindowDefinitionListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WindowDefinitionListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}WindowDefinition"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}CommaWindowDefinitionItemtype" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WindowDefinitionListType", propOrder = {
    "windowDefinition",
    "commaWindowDefinitionItemtype"
})
public class WindowDefinitionListType {

    @XmlElement(name = "WindowDefinition", required = true)
    protected WindowDefinitionType windowDefinition;
    @XmlElement(name = "CommaWindowDefinitionItemtype")
    protected List<CommaWindowDefinitionItemtypeType> commaWindowDefinitionItemtype;

    /**
     * Gets the value of the windowDefinition property.
     * 
     * @return
     *     possible object is
     *     {@link WindowDefinitionType }
     *     
     */
    public WindowDefinitionType getWindowDefinition() {
        return windowDefinition;
    }

    /**
     * Sets the value of the windowDefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link WindowDefinitionType }
     *     
     */
    public void setWindowDefinition(WindowDefinitionType value) {
        this.windowDefinition = value;
    }

    /**
     * Gets the value of the commaWindowDefinitionItemtype property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the commaWindowDefinitionItemtype property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCommaWindowDefinitionItemtype().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommaWindowDefinitionItemtypeType }
     * 
     * 
     */
    public List<CommaWindowDefinitionItemtypeType> getCommaWindowDefinitionItemtype() {
        if (commaWindowDefinitionItemtype == null) {
            commaWindowDefinitionItemtype = new ArrayList<CommaWindowDefinitionItemtypeType>();
        }
        return this.commaWindowDefinitionItemtype;
    }

}
