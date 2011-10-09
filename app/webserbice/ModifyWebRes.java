
package webserbice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="orderNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hotelid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="masterStruct" type="{http://tempuri.org/}MasterStruct" minOccurs="0"/>
 *         &lt;element name="guestStruct" type="{http://tempuri.org/}GuestStruct" minOccurs="0"/>
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
    "orderNo",
    "hotelid",
    "masterStruct",
    "guestStruct"
})
@XmlRootElement(name = "ModifyWebRes")
public class ModifyWebRes {

    protected String orderNo;
    protected String hotelid;
    protected MasterStruct masterStruct;
    protected GuestStruct guestStruct;

    /**
     * Gets the value of the orderNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * Sets the value of the orderNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderNo(String value) {
        this.orderNo = value;
    }

    /**
     * Gets the value of the hotelid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelid() {
        return hotelid;
    }

    /**
     * Sets the value of the hotelid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelid(String value) {
        this.hotelid = value;
    }

    /**
     * Gets the value of the masterStruct property.
     * 
     * @return
     *     possible object is
     *     {@link MasterStruct }
     *     
     */
    public MasterStruct getMasterStruct() {
        return masterStruct;
    }

    /**
     * Sets the value of the masterStruct property.
     * 
     * @param value
     *     allowed object is
     *     {@link MasterStruct }
     *     
     */
    public void setMasterStruct(MasterStruct value) {
        this.masterStruct = value;
    }

    /**
     * Gets the value of the guestStruct property.
     * 
     * @return
     *     possible object is
     *     {@link GuestStruct }
     *     
     */
    public GuestStruct getGuestStruct() {
        return guestStruct;
    }

    /**
     * Sets the value of the guestStruct property.
     * 
     * @param value
     *     allowed object is
     *     {@link GuestStruct }
     *     
     */
    public void setGuestStruct(GuestStruct value) {
        this.guestStruct = value;
    }

}
