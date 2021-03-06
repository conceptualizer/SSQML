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
 * <p>Java class for WindowSpecificationDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WindowSpecificationDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}ExistingWindowName" minOccurs="0"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}WindowPartitionClause" minOccurs="0"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}WindowOrderClause" minOccurs="0"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}WindowFrameClause" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WindowSpecificationDetailsType", propOrder = {
    "existingWindowName",
    "windowPartitionClause",
    "windowOrderClause",
    "windowFrameClause"
})
public class WindowSpecificationDetailsType {

    @XmlElement(name = "ExistingWindowName")
    protected ActualIdentifierType existingWindowName;
    @XmlElement(name = "WindowPartitionClause")
    protected WindowPartitionClauseType windowPartitionClause;
    @XmlElement(name = "WindowOrderClause")
    protected WindowOrderClauseType windowOrderClause;
    @XmlElement(name = "WindowFrameClause")
    protected WindowFrameClauseType windowFrameClause;

    /**
     * Gets the value of the existingWindowName property.
     * 
     * @return
     *     possible object is
     *     {@link ActualIdentifierType }
     *     
     */
    public ActualIdentifierType getExistingWindowName() {
        return existingWindowName;
    }

    /**
     * Sets the value of the existingWindowName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActualIdentifierType }
     *     
     */
    public void setExistingWindowName(ActualIdentifierType value) {
        this.existingWindowName = value;
    }

    /**
     * Gets the value of the windowPartitionClause property.
     * 
     * @return
     *     possible object is
     *     {@link WindowPartitionClauseType }
     *     
     */
    public WindowPartitionClauseType getWindowPartitionClause() {
        return windowPartitionClause;
    }

    /**
     * Sets the value of the windowPartitionClause property.
     * 
     * @param value
     *     allowed object is
     *     {@link WindowPartitionClauseType }
     *     
     */
    public void setWindowPartitionClause(WindowPartitionClauseType value) {
        this.windowPartitionClause = value;
    }

    /**
     * Gets the value of the windowOrderClause property.
     * 
     * @return
     *     possible object is
     *     {@link WindowOrderClauseType }
     *     
     */
    public WindowOrderClauseType getWindowOrderClause() {
        return windowOrderClause;
    }

    /**
     * Sets the value of the windowOrderClause property.
     * 
     * @param value
     *     allowed object is
     *     {@link WindowOrderClauseType }
     *     
     */
    public void setWindowOrderClause(WindowOrderClauseType value) {
        this.windowOrderClause = value;
    }

    /**
     * Gets the value of the windowFrameClause property.
     * 
     * @return
     *     possible object is
     *     {@link WindowFrameClauseType }
     *     
     */
    public WindowFrameClauseType getWindowFrameClause() {
        return windowFrameClause;
    }

    /**
     * Sets the value of the windowFrameClause property.
     * 
     * @param value
     *     allowed object is
     *     {@link WindowFrameClauseType }
     *     
     */
    public void setWindowFrameClause(WindowFrameClauseType value) {
        this.windowFrameClause = value;
    }

}
