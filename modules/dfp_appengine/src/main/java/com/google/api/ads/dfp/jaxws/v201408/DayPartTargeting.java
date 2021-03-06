
package com.google.api.ads.dfp.jaxws.v201408;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Modify the delivery times of line items for particular days of the week. By
 *             default, line items are served at all days and times.
 *           
 * 
 * <p>Java class for DayPartTargeting complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DayPartTargeting">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dayParts" type="{https://www.google.com/apis/ads/publisher/v201408}DayPart" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="timeZone" type="{https://www.google.com/apis/ads/publisher/v201408}DeliveryTimeZone" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DayPartTargeting", propOrder = {
    "dayParts",
    "timeZone"
})
public class DayPartTargeting {

    protected List<DayPart> dayParts;
    protected DeliveryTimeZone timeZone;

    /**
     * Gets the value of the dayParts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dayParts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDayParts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DayPart }
     * 
     * 
     */
    public List<DayPart> getDayParts() {
        if (dayParts == null) {
            dayParts = new ArrayList<DayPart>();
        }
        return this.dayParts;
    }

    /**
     * Gets the value of the timeZone property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryTimeZone }
     *     
     */
    public DeliveryTimeZone getTimeZone() {
        return timeZone;
    }

    /**
     * Sets the value of the timeZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryTimeZone }
     *     
     */
    public void setTimeZone(DeliveryTimeZone value) {
        this.timeZone = value;
    }

}
