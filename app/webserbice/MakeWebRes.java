
package webserbice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HotelID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ms" type="{http://tempuri.org/}MasterStruct" minOccurs="0"/>
 *         &lt;element name="gs" type="{http://tempuri.org/}GuestStruct" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "hotelID",
    "ms",
    "gs"
})
@XmlRootElement(name = "MakeWebRes")
public class MakeWebRes {

    @XmlElement(name = "HotelID")
    protected String hotelID;
    protected MasterStruct ms;
    protected GuestStruct gs;

    /**
     * Gets the value of the hotelID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelID() {
        return hotelID;
    }

    /**
     * Sets the value of the hotelID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelID(String value) {
        this.hotelID = value;
    }

    /**
     * Gets the value of the ms property.
     * 
     * @return
     *     possible object is
     *     {@link MasterStruct }
     *     
     */
    public MasterStruct getMs() {
        return ms;
    }

    /**
     * Sets the value of the ms property.
     * 
     * @param value
     *     allowed object is
     *     {@link MasterStruct }
     *     
     */
    public void setMs(MasterStruct value) {
        this.ms = value;
    }

    /**
     * Gets the value of the gs property.
     * 
     * @return
     *     possible object is
     *     {@link GuestStruct }
     *     
     */
    public GuestStruct getGs() {
        return gs;
    }

    /**
     * Sets the value of the gs property.
     * 
     * @param value
     *     allowed object is
     *     {@link GuestStruct }
     *     
     */
    public void setGs(GuestStruct value) {
        this.gs = value;
    }

}
