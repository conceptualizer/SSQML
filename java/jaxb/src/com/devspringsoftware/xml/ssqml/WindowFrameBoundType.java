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
 * <p>Java class for WindowFrameBoundType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WindowFrameBoundType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{http://www.devspringsoftware.com}WindowFrameStart"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}UnboundedFollowingStaticString"/>
 *         &lt;element ref="{http://www.devspringsoftware.com}WindowFrameFollowing"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WindowFrameBoundType", propOrder = {
    "windowFrameStartOrUnboundedFollowingStaticStringOrWindowFrameFollowing"
})
public class WindowFrameBoundType {

    @XmlElements({
        @XmlElement(name = "WindowFrameStart", type = WindowFrameStartType.class),
        @XmlElement(name = "UnboundedFollowingStaticString", type = UnboundedFollowingStaticStringType.class),
        @XmlElement(name = "WindowFrameFollowing", type = WindowFrameFollowingType.class)
    })
    protected Object windowFrameStartOrUnboundedFollowingStaticStringOrWindowFrameFollowing;

    /**
     * Gets the value of the windowFrameStartOrUnboundedFollowingStaticStringOrWindowFrameFollowing property.
     * 
     * @return
     *     possible object is
     *     {@link WindowFrameStartType }
     *     {@link UnboundedFollowingStaticStringType }
     *     {@link WindowFrameFollowingType }
     *     
     */
    public Object getWindowFrameStartOrUnboundedFollowingStaticStringOrWindowFrameFollowing() {
        return windowFrameStartOrUnboundedFollowingStaticStringOrWindowFrameFollowing;
    }

    /**
     * Sets the value of the windowFrameStartOrUnboundedFollowingStaticStringOrWindowFrameFollowing property.
     * 
     * @param value
     *     allowed object is
     *     {@link WindowFrameStartType }
     *     {@link UnboundedFollowingStaticStringType }
     *     {@link WindowFrameFollowingType }
     *     
     */
    public void setWindowFrameStartOrUnboundedFollowingStaticStringOrWindowFrameFollowing(Object value) {
        this.windowFrameStartOrUnboundedFollowingStaticStringOrWindowFrameFollowing = value;
    }

}
