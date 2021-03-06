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
 * <p>Java class for CommitStatementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommitStatementType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.devspringsoftware.com}CommitStaticString"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}WorkStaticString" minOccurs="0"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}AndStaticString" minOccurs="0"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}NoStaticString" minOccurs="0"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}ChainStaticString"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommitStatementType", propOrder = {
    "commitStaticString",
    "workStaticString",
    "andStaticString",
    "noStaticString",
    "chainStaticString"
})
public class CommitStatementType {

    @XmlElement(name = "CommitStaticString", required = true)
    protected CommitStaticStringType commitStaticString;
    @XmlElement(name = "WorkStaticString")
    protected WorkStaticStringType workStaticString;
    @XmlElement(name = "AndStaticString")
    protected AndStaticStringType andStaticString;
    @XmlElement(name = "NoStaticString")
    protected NoStaticStringType noStaticString;
    @XmlElement(name = "ChainStaticString", required = true)
    protected ChainStaticStringType chainStaticString;

    /**
     * Gets the value of the commitStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link CommitStaticStringType }
     *     
     */
    public CommitStaticStringType getCommitStaticString() {
        return commitStaticString;
    }

    /**
     * Sets the value of the commitStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommitStaticStringType }
     *     
     */
    public void setCommitStaticString(CommitStaticStringType value) {
        this.commitStaticString = value;
    }

    /**
     * Gets the value of the workStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link WorkStaticStringType }
     *     
     */
    public WorkStaticStringType getWorkStaticString() {
        return workStaticString;
    }

    /**
     * Sets the value of the workStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkStaticStringType }
     *     
     */
    public void setWorkStaticString(WorkStaticStringType value) {
        this.workStaticString = value;
    }

    /**
     * Gets the value of the andStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link AndStaticStringType }
     *     
     */
    public AndStaticStringType getAndStaticString() {
        return andStaticString;
    }

    /**
     * Sets the value of the andStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link AndStaticStringType }
     *     
     */
    public void setAndStaticString(AndStaticStringType value) {
        this.andStaticString = value;
    }

    /**
     * Gets the value of the noStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link NoStaticStringType }
     *     
     */
    public NoStaticStringType getNoStaticString() {
        return noStaticString;
    }

    /**
     * Sets the value of the noStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link NoStaticStringType }
     *     
     */
    public void setNoStaticString(NoStaticStringType value) {
        this.noStaticString = value;
    }

    /**
     * Gets the value of the chainStaticString property.
     * 
     * @return
     *     possible object is
     *     {@link ChainStaticStringType }
     *     
     */
    public ChainStaticStringType getChainStaticString() {
        return chainStaticString;
    }

    /**
     * Sets the value of the chainStaticString property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChainStaticStringType }
     *     
     */
    public void setChainStaticString(ChainStaticStringType value) {
        this.chainStaticString = value;
    }

}
