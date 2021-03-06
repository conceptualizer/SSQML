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
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransformDefinitionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransformDefinitionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}CreateStaticString"/>
 *         &lt;choice>
 *           &lt;element ref="{http://www.devspringsoftware.com}TransformStaticString"/>
 *           &lt;element ref="{http://www.devspringsoftware.com}TransformsStaticString"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.devspringsoftware.com}ForStaticString"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}SchemaResolvedUserDefinedTypeName"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}TransformGroup" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransformDefinitionType", propOrder = {
    "createStaticString",
    "transformStaticStringOrTransformsStaticString",
    "forStaticString",
    "schemaResolvedUserDefinedTypeName",
    "transformGroup"
})
public class TransformDefinitionType {

    @XmlElement(name = "CreateStaticString", required = true)
    protected CreateStaticStringType createStaticString;
    @XmlElements({
        @XmlElement(name = "TransformStaticString", type = TransformStaticStringType.class),
        @XmlElement(name = "TransformsStaticString", type = TransformsStaticStringType.class)
    })
    protected Object transformStaticStringOrTransformsStaticString;
    @XmlElement(name = "ForStaticString", required = true)
    protected ForStaticStringType forStaticString;
    @XmlElement(name = "SchemaResolvedUserDefinedTypeName", required = true)
    protected SchemaQualifiedTypeNameType schemaResolvedUserDefinedTypeName;
    @XmlElement(name = "TransformGroup", required = true)
    protected List<TransformGroupType> transformGroup;

    /**
     * Gets the value of the createStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link CreateStaticStringType }
     *     
     */
    public CreateStaticStringType getCreateStaticString() {
        return createStaticString;
    }

    /**
     * Sets the value of the createStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateStaticStringType }
     *     
     */
    public void setCreateStaticString(CreateStaticStringType value) {
        this.createStaticString = value;
    }

    /**
     * Gets the value of the transformStaticStringOrTransformsStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link TransformStaticStringType }
     *     {@link TransformsStaticStringType }
     *     
     */
    public Object getTransformStaticStringOrTransformsStaticString() {
        return transformStaticStringOrTransformsStaticString;
    }

    /**
     * Sets the value of the transformStaticStringOrTransformsStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransformStaticStringType }
     *     {@link TransformsStaticStringType }
     *     
     */
    public void setTransformStaticStringOrTransformsStaticString(Object value) {
        this.transformStaticStringOrTransformsStaticString = value;
    }

    /**
     * Gets the value of the forStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link ForStaticStringType }
     *     
     */
    public ForStaticStringType getForStaticString() {
        return forStaticString;
    }

    /**
     * Sets the value of the forStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForStaticStringType }
     *     
     */
    public void setForStaticString(ForStaticStringType value) {
        this.forStaticString = value;
    }

    /**
     * Gets the value of the schemaResolvedUserDefinedTypeName property.
     * 
     * @return
     *     possible object is
     *     {@link SchemaQualifiedTypeNameType }
     *     
     */
    public SchemaQualifiedTypeNameType getSchemaResolvedUserDefinedTypeName() {
        return schemaResolvedUserDefinedTypeName;
    }

    /**
     * Sets the value of the schemaResolvedUserDefinedTypeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link SchemaQualifiedTypeNameType }
     *     
     */
    public void setSchemaResolvedUserDefinedTypeName(SchemaQualifiedTypeNameType value) {
        this.schemaResolvedUserDefinedTypeName = value;
    }

    /**
     * Gets the value of the transformGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transformGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransformGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransformGroupType }
     * 
     * 
     */
    public List<TransformGroupType> getTransformGroup() {
        if (transformGroup == null) {
            transformGroup = new ArrayList<TransformGroupType>();
        }
        return this.transformGroup;
    }

}
