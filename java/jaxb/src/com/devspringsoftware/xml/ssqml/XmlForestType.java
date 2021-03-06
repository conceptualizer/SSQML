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
 * <p>Java class for XmlForestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XmlForestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}XmlforestStaticString"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}LeftParen"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}XmlNamespaceDeclaration" minOccurs="0"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}Comma" minOccurs="0"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}ForestElementList"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}OptionStaticString" minOccurs="0"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}XmlContentOption" minOccurs="0"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}XmlReturningClause" minOccurs="0"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}RightParen"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XmlForestType", propOrder = {
    "xmlforestStaticString",
    "leftParen",
    "xmlNamespaceDeclaration",
    "comma",
    "forestElementList",
    "optionStaticString",
    "xmlContentOption",
    "xmlReturningClause",
    "rightParen"
})
public class XmlForestType {

    @XmlElement(name = "XmlforestStaticString", required = true)
    protected XmlforestStaticStringType xmlforestStaticString;
    @XmlElement(name = "LeftParen", required = true)
    protected String leftParen;
    @XmlElement(name = "XmlNamespaceDeclaration")
    protected XmlNamespaceDeclarationType xmlNamespaceDeclaration;
    @XmlElement(name = "Comma")
    protected String comma;
    @XmlElement(name = "ForestElementList", required = true)
    protected ForestElementListType forestElementList;
    @XmlElement(name = "OptionStaticString")
    protected OptionStaticStringType optionStaticString;
    @XmlElement(name = "XmlContentOption")
    protected XmlContentOptionType xmlContentOption;
    @XmlElement(name = "XmlReturningClause")
    protected XmlReturningClauseType xmlReturningClause;
    @XmlElement(name = "RightParen", required = true)
    protected String rightParen;

    /**
     * Gets the value of the xmlforestStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link XmlforestStaticStringType }
     *     
     */
    public XmlforestStaticStringType getXmlforestStaticString() {
        return xmlforestStaticString;
    }

    /**
     * Sets the value of the xmlforestStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlforestStaticStringType }
     *     
     */
    public void setXmlforestStaticString(XmlforestStaticStringType value) {
        this.xmlforestStaticString = value;
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
     * Gets the value of the xmlNamespaceDeclaration property.
     * 
     * @return
     *     possible object is
     *     {@link XmlNamespaceDeclarationType }
     *     
     */
    public XmlNamespaceDeclarationType getXmlNamespaceDeclaration() {
        return xmlNamespaceDeclaration;
    }

    /**
     * Sets the value of the xmlNamespaceDeclaration property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlNamespaceDeclarationType }
     *     
     */
    public void setXmlNamespaceDeclaration(XmlNamespaceDeclarationType value) {
        this.xmlNamespaceDeclaration = value;
    }

    /**
     * Gets the value of the comma property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComma() {
        return comma;
    }

    /**
     * Sets the value of the comma property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComma(String value) {
        this.comma = value;
    }

    /**
     * Gets the value of the forestElementList property.
     * 
     * @return
     *     possible object is
     *     {@link ForestElementListType }
     *     
     */
    public ForestElementListType getForestElementList() {
        return forestElementList;
    }

    /**
     * Sets the value of the forestElementList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForestElementListType }
     *     
     */
    public void setForestElementList(ForestElementListType value) {
        this.forestElementList = value;
    }

    /**
     * Gets the value of the optionStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link OptionStaticStringType }
     *     
     */
    public OptionStaticStringType getOptionStaticString() {
        return optionStaticString;
    }

    /**
     * Sets the value of the optionStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionStaticStringType }
     *     
     */
    public void setOptionStaticString(OptionStaticStringType value) {
        this.optionStaticString = value;
    }

    /**
     * Gets the value of the xmlContentOption property.
     * 
     * @return
     *     possible object is
     *     {@link XmlContentOptionType }
     *     
     */
    public XmlContentOptionType getXmlContentOption() {
        return xmlContentOption;
    }

    /**
     * Sets the value of the xmlContentOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlContentOptionType }
     *     
     */
    public void setXmlContentOption(XmlContentOptionType value) {
        this.xmlContentOption = value;
    }

    /**
     * Gets the value of the xmlReturningClause property.
     * 
     * @return
     *     possible object is
     *     {@link XmlReturningClauseType }
     *     
     */
    public XmlReturningClauseType getXmlReturningClause() {
        return xmlReturningClause;
    }

    /**
     * Sets the value of the xmlReturningClause property.
     * 
     * @param value
     *     allowed object is
     *     {@link XmlReturningClauseType }
     *     
     */
    public void setXmlReturningClause(XmlReturningClauseType value) {
        this.xmlReturningClause = value;
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

}
