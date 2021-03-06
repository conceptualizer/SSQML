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
 * <p>Java class for CycleClauseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CycleClauseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}CycleStaticString"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}CycleColumnList"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}SetStaticString"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}CycleMarkColumn"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}ToStaticString"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}CycleMarkValue"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}DefaultStaticString"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}NonCycleMarkValue"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}UsingStaticString"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}PathColumn"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CycleClauseType", propOrder = {
    "cycleStaticString",
    "cycleColumnList",
    "setStaticString",
    "cycleMarkColumn",
    "toStaticString",
    "cycleMarkValue",
    "defaultStaticString",
    "nonCycleMarkValue",
    "usingStaticString",
    "pathColumn"
})
public class CycleClauseType {

    @XmlElement(name = "CycleStaticString", required = true)
    protected CycleStaticStringType cycleStaticString;
    @XmlElement(name = "CycleColumnList", required = true)
    protected CycleColumnListType cycleColumnList;
    @XmlElement(name = "SetStaticString", required = true)
    protected SetStaticStringType setStaticString;
    @XmlElement(name = "CycleMarkColumn", required = true)
    protected ActualIdentifierType cycleMarkColumn;
    @XmlElement(name = "ToStaticString", required = true)
    protected ToStaticStringType toStaticString;
    @XmlElement(name = "CycleMarkValue", required = true)
    protected ValueExpressionType cycleMarkValue;
    @XmlElement(name = "DefaultStaticString", required = true)
    protected DefaultStaticStringType defaultStaticString;
    @XmlElement(name = "NonCycleMarkValue", required = true)
    protected ValueExpressionType nonCycleMarkValue;
    @XmlElement(name = "UsingStaticString", required = true)
    protected UsingStaticStringType usingStaticString;
    @XmlElement(name = "PathColumn", required = true)
    protected ActualIdentifierType pathColumn;

    /**
     * Gets the value of the cycleStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link CycleStaticStringType }
     *     
     */
    public CycleStaticStringType getCycleStaticString() {
        return cycleStaticString;
    }

    /**
     * Sets the value of the cycleStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link CycleStaticStringType }
     *     
     */
    public void setCycleStaticString(CycleStaticStringType value) {
        this.cycleStaticString = value;
    }

    /**
     * Gets the value of the cycleColumnList property.
     * 
     * @return
     *     possible object is
     *     {@link CycleColumnListType }
     *     
     */
    public CycleColumnListType getCycleColumnList() {
        return cycleColumnList;
    }

    /**
     * Sets the value of the cycleColumnList property.
     * 
     * @param value
     *     allowed object is
     *     {@link CycleColumnListType }
     *     
     */
    public void setCycleColumnList(CycleColumnListType value) {
        this.cycleColumnList = value;
    }

    /**
     * Gets the value of the setStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link SetStaticStringType }
     *     
     */
    public SetStaticStringType getSetStaticString() {
        return setStaticString;
    }

    /**
     * Sets the value of the setStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link SetStaticStringType }
     *     
     */
    public void setSetStaticString(SetStaticStringType value) {
        this.setStaticString = value;
    }

    /**
     * Gets the value of the cycleMarkColumn property.
     * 
     * @return
     *     possible object is
     *     {@link ActualIdentifierType }
     *     
     */
    public ActualIdentifierType getCycleMarkColumn() {
        return cycleMarkColumn;
    }

    /**
     * Sets the value of the cycleMarkColumn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActualIdentifierType }
     *     
     */
    public void setCycleMarkColumn(ActualIdentifierType value) {
        this.cycleMarkColumn = value;
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
     * Gets the value of the cycleMarkValue property.
     * 
     * @return
     *     possible object is
     *     {@link ValueExpressionType }
     *     
     */
    public ValueExpressionType getCycleMarkValue() {
        return cycleMarkValue;
    }

    /**
     * Sets the value of the cycleMarkValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueExpressionType }
     *     
     */
    public void setCycleMarkValue(ValueExpressionType value) {
        this.cycleMarkValue = value;
    }

    /**
     * Gets the value of the defaultStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link DefaultStaticStringType }
     *     
     */
    public DefaultStaticStringType getDefaultStaticString() {
        return defaultStaticString;
    }

    /**
     * Sets the value of the defaultStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link DefaultStaticStringType }
     *     
     */
    public void setDefaultStaticString(DefaultStaticStringType value) {
        this.defaultStaticString = value;
    }

    /**
     * Gets the value of the nonCycleMarkValue property.
     * 
     * @return
     *     possible object is
     *     {@link ValueExpressionType }
     *     
     */
    public ValueExpressionType getNonCycleMarkValue() {
        return nonCycleMarkValue;
    }

    /**
     * Sets the value of the nonCycleMarkValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValueExpressionType }
     *     
     */
    public void setNonCycleMarkValue(ValueExpressionType value) {
        this.nonCycleMarkValue = value;
    }

    /**
     * Gets the value of the usingStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link UsingStaticStringType }
     *     
     */
    public UsingStaticStringType getUsingStaticString() {
        return usingStaticString;
    }

    /**
     * Sets the value of the usingStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link UsingStaticStringType }
     *     
     */
    public void setUsingStaticString(UsingStaticStringType value) {
        this.usingStaticString = value;
    }

    /**
     * Gets the value of the pathColumn property.
     * 
     * @return
     *     possible object is
     *     {@link ActualIdentifierType }
     *     
     */
    public ActualIdentifierType getPathColumn() {
        return pathColumn;
    }

    /**
     * Sets the value of the pathColumn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActualIdentifierType }
     *     
     */
    public void setPathColumn(ActualIdentifierType value) {
        this.pathColumn = value;
    }

}
