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
 * <p>Java class for SchemaDefinitionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SchemaDefinitionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}CreateSchemaStaticString"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}SchemaNameClause"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}SchemaCharacterSetOrPath" minOccurs="0"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}SchemaElement" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SchemaDefinitionType", propOrder = {
    "createSchemaStaticString",
    "schemaNameClause",
    "schemaCharacterSetOrPath",
    "schemaElement"
})
public class SchemaDefinitionType {

    @XmlElement(name = "CreateSchemaStaticString", required = true)
    protected CreateSchemaStaticStringType createSchemaStaticString;
    @XmlElement(name = "SchemaNameClause", required = true)
    protected SchemaNameClauseType schemaNameClause;
    @XmlElement(name = "SchemaCharacterSetOrPath")
    protected SchemaCharacterSetOrPathType schemaCharacterSetOrPath;
    @XmlElement(name = "SchemaElement")
    protected List<SchemaElementType> schemaElement;

    /**
     * Gets the value of the createSchemaStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link CreateSchemaStaticStringType }
     *     
     */
    public CreateSchemaStaticStringType getCreateSchemaStaticString() {
        return createSchemaStaticString;
    }

    /**
     * Sets the value of the createSchemaStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateSchemaStaticStringType }
     *     
     */
    public void setCreateSchemaStaticString(CreateSchemaStaticStringType value) {
        this.createSchemaStaticString = value;
    }

    /**
     * Gets the value of the schemaNameClause property.
     * 
     * @return
     *     possible object is
     *     {@link SchemaNameClauseType }
     *     
     */
    public SchemaNameClauseType getSchemaNameClause() {
        return schemaNameClause;
    }

    /**
     * Sets the value of the schemaNameClause property.
     * 
     * @param value
     *     allowed object is
     *     {@link SchemaNameClauseType }
     *     
     */
    public void setSchemaNameClause(SchemaNameClauseType value) {
        this.schemaNameClause = value;
    }

    /**
     * Gets the value of the schemaCharacterSetOrPath property.
     * 
     * @return
     *     possible object is
     *     {@link SchemaCharacterSetOrPathType }
     *     
     */
    public SchemaCharacterSetOrPathType getSchemaCharacterSetOrPath() {
        return schemaCharacterSetOrPath;
    }

    /**
     * Sets the value of the schemaCharacterSetOrPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link SchemaCharacterSetOrPathType }
     *     
     */
    public void setSchemaCharacterSetOrPath(SchemaCharacterSetOrPathType value) {
        this.schemaCharacterSetOrPath = value;
    }

    /**
     * Gets the value of the schemaElement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the schemaElement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSchemaElement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SchemaElementType }
     * 
     * 
     */
    public List<SchemaElementType> getSchemaElement() {
        if (schemaElement == null) {
            schemaElement = new ArrayList<SchemaElementType>();
        }
        return this.schemaElement;
    }

}
