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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WindowClauseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WindowClauseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}WindowStaticString"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}WindowDefinitionList"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WindowClauseType", propOrder = {
    "windowStaticString",
    "windowDefinitionList"
})
public class WindowClauseType {

    @XmlElement(name = "WindowStaticString", required = true)
    protected WindowStaticStringType windowStaticString;
    @XmlElement(name = "WindowDefinitionList", required = true)
    protected WindowDefinitionListType windowDefinitionList;

    /**
     * Gets the value of the windowStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link WindowStaticStringType }
     *     
     */
    public WindowStaticStringType getWindowStaticString() {
        return windowStaticString;
    }

    /**
     * Sets the value of the windowStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link WindowStaticStringType }
     *     
     */
    public void setWindowStaticString(WindowStaticStringType value) {
        this.windowStaticString = value;
    }

    /**
     * Gets the value of the windowDefinitionList property.
     * 
     * @return
     *     possible object is
     *     {@link WindowDefinitionListType }
     *     
     */
    public WindowDefinitionListType getWindowDefinitionList() {
        return windowDefinitionList;
    }

    /**
     * Sets the value of the windowDefinitionList property.
     * 
     * @param value
     *     allowed object is
     *     {@link WindowDefinitionListType }
     *     
     */
    public void setWindowDefinitionList(WindowDefinitionListType value) {
        this.windowDefinitionList = value;
    }

}
