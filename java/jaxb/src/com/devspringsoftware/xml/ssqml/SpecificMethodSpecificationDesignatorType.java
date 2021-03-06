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
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SpecificMethodSpecificationDesignatorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpecificMethodSpecificationDesignatorType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{http://www.devspringsoftware.com}InstanceStaticString" minOccurs="0"/>
 *           &lt;element ref="{http://www.devspringsoftware.com}StaticStaticString" minOccurs="0"/>
 *           &lt;element ref="{http://www.devspringsoftware.com}ConstructorStaticString" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.devspringsoftware.com}MethodStaticString"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}MethodName"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}DataTypeList"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpecificMethodSpecificationDesignatorType", propOrder = {
    "instanceStaticStringOrStaticStaticStringOrConstructorStaticString",
    "methodStaticString",
    "methodName",
    "dataTypeList"
})
public class SpecificMethodSpecificationDesignatorType {

    @XmlElements({
        @XmlElement(name = "InstanceStaticString", type = InstanceStaticStringType.class),
        @XmlElement(name = "StaticStaticString", type = StaticStaticStringType.class),
        @XmlElement(name = "ConstructorStaticString", type = ConstructorStaticStringType.class)
    })
    protected Object instanceStaticStringOrStaticStaticStringOrConstructorStaticString;
    @XmlElement(name = "MethodStaticString", required = true)
    protected MethodStaticStringType methodStaticString;
    @XmlElement(name = "MethodName", required = true)
    protected ActualIdentifierType methodName;
    @XmlElement(name = "DataTypeList", required = true)
    protected DataTypeListType dataTypeList;

    /**
     * Gets the value of the instanceStaticStringOrStaticStaticStringOrConstructorStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link InstanceStaticStringType }
     *     {@link StaticStaticStringType }
     *     {@link ConstructorStaticStringType }
     *     
     */
    public Object getInstanceStaticStringOrStaticStaticStringOrConstructorStaticString() {
        return instanceStaticStringOrStaticStaticStringOrConstructorStaticString;
    }

    /**
     * Sets the value of the instanceStaticStringOrStaticStaticStringOrConstructorStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstanceStaticStringType }
     *     {@link StaticStaticStringType }
     *     {@link ConstructorStaticStringType }
     *     
     */
    public void setInstanceStaticStringOrStaticStaticStringOrConstructorStaticString(Object value) {
        this.instanceStaticStringOrStaticStaticStringOrConstructorStaticString = value;
    }

    /**
     * Gets the value of the methodStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link MethodStaticStringType }
     *     
     */
    public MethodStaticStringType getMethodStaticString() {
        return methodStaticString;
    }

    /**
     * Sets the value of the methodStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link MethodStaticStringType }
     *     
     */
    public void setMethodStaticString(MethodStaticStringType value) {
        this.methodStaticString = value;
    }

    /**
     * Gets the value of the methodName property.
     * 
     * @return
     *     possible object is
     *     {@link ActualIdentifierType }
     *     
     */
    public ActualIdentifierType getMethodName() {
        return methodName;
    }

    /**
     * Sets the value of the methodName property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActualIdentifierType }
     *     
     */
    public void setMethodName(ActualIdentifierType value) {
        this.methodName = value;
    }

    /**
     * Gets the value of the dataTypeList property.
     * 
     * @return
     *     possible object is
     *     {@link DataTypeListType }
     *     
     */
    public DataTypeListType getDataTypeList() {
        return dataTypeList;
    }

    /**
     * Sets the value of the dataTypeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataTypeListType }
     *     
     */
    public void setDataTypeList(DataTypeListType value) {
        this.dataTypeList = value;
    }

}
