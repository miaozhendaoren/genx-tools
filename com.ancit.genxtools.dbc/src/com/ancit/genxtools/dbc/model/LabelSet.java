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

public class LabelSet implements Serializable{

    protected List<BasicLabelType> labelOrLabelGroup;

    /**
     * Gets the value of the labelOrLabelGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the labelOrLabelGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLabelOrLabelGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Label }
     * {@link LabelGroup }
     * 
     * 
     */
    public List<BasicLabelType> getLabelOrLabelGroup() {
        if (labelOrLabelGroup == null) {
            labelOrLabelGroup = new ArrayList<BasicLabelType>();
        }
        return this.labelOrLabelGroup;
    }

}