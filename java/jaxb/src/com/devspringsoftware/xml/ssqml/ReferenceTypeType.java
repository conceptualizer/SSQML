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
 * <p>Java class for ReferenceTypeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReferenceTypeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}RefStaticString"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}LeftParen"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}ReferencedType"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}RightParen"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}ScopeClause" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReferenceTypeType", propOrder = {
    "refStaticString",
    "leftParen",
    "referencedType",
    "rightParen",
    "scopeClause"
})
public class ReferenceTypeType {

    @XmlElement(name = "RefStaticString", required = true)
    protected RefStaticStringType refStaticString;
    @XmlElement(name = "LeftParen", required = true)
    protected String leftParen;
    @XmlElement(name = "ReferencedType", required = true)
    protected SchemaQualifiedTypeNameType referencedType;
    @XmlElement(name = "RightParen", required = true)
    protected String rightParen;
    @XmlElement(name = "ScopeClause")
    protected ScopeClauseType scopeClause;

    /**
     * Gets the value of the refStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link RefStaticStringType }
     *     
     */
    public RefStaticStringType getRefStaticString() {
        return refStaticString;
    }

    /**
     * Sets the value of the refStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link RefStaticStringType }
     *     
     */
    public void setRefStaticString(RefStaticStringType value) {
        this.refStaticString = value;
    }

    /**
     * Gets the value of the leftParen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeftParen() {
        return leftParen;
    }

    /**
     * Sets the value of the leftParen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeftParen(String value) {
        this.leftParen = value;
    }

    /**
     * Gets the value of the referencedType property.
     * 
     * @return
     *     possible object is
     *     {@link SchemaQualifiedTypeNameType }
     *     
     */
    public SchemaQualifiedTypeNameType getReferencedType() {
        return referencedType;
    }

    /**
     * Sets the value of the referencedType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SchemaQualifiedTypeNameType }
     *     
     */
    public void setReferencedType(SchemaQualifiedTypeNameType value) {
        this.referencedType = value;
    }

    /**
     * Gets the value of the rightParen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRightParen() {
        return rightParen;
    }

    /**
     * Sets the value of the rightParen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRightParen(String value) {
        this.rightParen = value;
    }

    /**
     * Gets the value of the scopeClause property.
     * 
     * @return
     *     possible object is
     *     {@link ScopeClauseType }
     *     
     */
    public ScopeClauseType getScopeClause() {
        return scopeClause;
    }

    /**
     * Sets the value of the scopeClause property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScopeClauseType }
     *     
     */
    public void setScopeClause(ScopeClauseType value) {
        this.scopeClause = value;
    }

}
