
package webserbice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hotelId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="brand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="roomType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="arriveTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="departureTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="guestNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="roomNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="money" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="money1" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="rateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hGuest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hCompany" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hAgency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hRoomCenter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="closed" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="src" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "city",
    "hotelId",
    "brand",
    "roomType",
    "arriveTime",
    "departureTime",
    "guestNumber",
    "roomNumber",
    "money",
    "money1",
    "rateCode",
    "hGuest",
    "hCompany",
    "hAgency",
    "hRoomCenter",
    "mode",
    "closed",
    "src"
})
@XmlRootElement(name = "RateQueryWeb")
public class RateQueryWeb {

    protected String city;
    protected String hotelId;
    protected String brand;
    protected String roomType;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar arriveTime;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar departureTime;
    protected int guestNumber;
    protected int roomNumber;
    @XmlElement(required = true)
    protected BigDecimal money;
    @XmlElement(required = true)
    protected BigDecimal money1;
    protected String rateCode;
    protected String hGuest;
    protected String hCompany;
    protected String hAgency;
    protected String hRoomCenter;
    protected String mode;
    protected String closed;
    protected String src;

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the hotelId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelId() {
        return hotelId;
    }

    /**
     * Sets the value of the hotelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelId(String value) {
        this.hotelId = value;
    }

    /**
     * Gets the value of the brand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Sets the value of the brand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrand(String value) {
        this.brand = value;
    }

    /**
     * Gets the value of the roomType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomType() {
        return roomType;
    }

    /**
     * Sets the value of the roomType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomType(String value) {
        this.roomType = value;
    }

    /**
     * Gets the value of the arriveTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getArriveTime() {
        return arriveTime;
    }

    /**
     * Sets the value of the arriveTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setArriveTime(XMLGregorianCalendar value) {
        this.arriveTime = value;
    }

    /**
     * Gets the value of the departureTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDepartureTime() {
        return departureTime;
    }

    /**
     * Sets the value of the departureTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDepartureTime(XMLGregorianCalendar value) {
        this.departureTime = value;
    }

    /**
     * Gets the value of the guestNumber property.
     * 
     */
    public int getGuestNumber() {
        return guestNumber;
    }

    /**
     * Sets the value of the guestNumber property.
     * 
     */
    public void setGuestNumber(int value) {
        this.guestNumber = value;
    }

    /**
     * Gets the value of the roomNumber property.
     * 
     */
    public int getRoomNumber() {
        return roomNumber;
    }

    /**
     * Sets the value of the roomNumber property.
     * 
     */
    public void setRoomNumber(int value) {
        this.roomNumber = value;
    }

    /**
     * Gets the value of the money property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMoney() {
        return money;
    }

    /**
     * Sets the value of the money property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMoney(BigDecimal value) {
        this.money = value;
    }

    /**
     * Gets the value of the money1 property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMoney1() {
        return money1;
    }

    /**
     * Sets the value of the money1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMoney1(BigDecimal value) {
        this.money1 = value;
    }

    /**
     * Gets the value of the rateCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateCode() {
        return rateCode;
    }

    /**
     * Sets the value of the rateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateCode(String value) {
        this.rateCode = value;
    }

    /**
     * Gets the value of the hGuest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHGuest() {
        return hGuest;
    }

    /**
     * Sets the value of the hGuest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHGuest(String value) {
        this.hGuest = value;
    }

    /**
     * Gets the value of the hCompany property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHCompany() {
        return hCompany;
    }

    /**
     * Sets the value of the hCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHCompany(String value) {
        this.hCompany = value;
    }

    /**
     * Gets the value of the hAgency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHAgency() {
        return hAgency;
    }

    /**
     * Sets the value of the hAgency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHAgency(String value) {
        this.hAgency = value;
    }

    /**
     * Gets the value of the hRoomCenter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHRoomCenter() {
        return hRoomCenter;
    }

    /**
     * Sets the value of the hRoomCenter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHRoomCenter(String value) {
        this.hRoomCenter = value;
    }

    /**
     * Gets the value of the mode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMode() {
        return mode;
    }

    /**
     * Sets the value of the mode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMode(String value) {
        this.mode = value;
    }

    /**
     * Gets the value of the closed property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClosed() {
        return closed;
    }

    /**
     * Sets the value of the closed property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClosed(String value) {
        this.closed = value;
    }

    /**
     * Gets the value of the src property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrc() {
        return src;
    }

    /**
     * Sets the value of the src property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSrc(String value) {
        this.src = value;
    }

}
