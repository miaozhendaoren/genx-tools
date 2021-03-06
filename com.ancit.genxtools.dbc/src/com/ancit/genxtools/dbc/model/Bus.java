//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.11.06 at 11:40:49 AM CET 
//


package com.ancit.genxtools.dbc.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Bus implements Serializable{

    protected List<Message> message;
    protected String name;
    protected Integer baudrate;

    /**
     * Gets the value of the message property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the message property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Message }
     * 
     * 
     */
    public List<Message> getMessage() {
        if (message == null) {
            message = new ArrayList<Message>();
        }
        return this.message;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the baudrate property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public int getBaudrate() {
        if (baudrate == null) {
            return  500000;
        } else {
            return baudrate;
        }
    }

    /**
     * Sets the value of the baudrate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBaudrate(Integer value) {
        this.baudrate = value;
    }

}
