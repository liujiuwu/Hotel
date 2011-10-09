
package webserbice;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for MasterStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MasterStruct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="hReserve" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hGuest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GroupNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="roomType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="upgrade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="upgradeReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="roomNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="roomNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reserveState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="arriveTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="departureTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="agent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="company" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="roomCenter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="market" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reserveType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="channel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="share" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="guestNumber" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="children" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="rateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="packages" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="roomRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="setRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="discount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="discount1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="payCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="credCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="credUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="applName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="applicant" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="arAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="arriveDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="arriveInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="arriveCar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="arriveRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="departureDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="departureInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="departureCar" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="departureRate" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="extra" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="srqs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="amenties" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="master" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reserveNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="crsNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="saleid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cmscode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reserveBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="reserveTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="checkInBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="checkInTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="checkOutBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="checkOutTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="departureBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="depTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="changeBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="changeTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="exp_s1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="exp_s2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="exp_s3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pcrec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="comsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MasterStruct", propOrder = {
    "hReserve",
    "hGuest",
    "groupNo",
    "roomType",
    "upgrade",
    "upgradeReason",
    "roomNumber",
    "roomNo",
    "bDate",
    "state",
    "reserveState",
    "arriveTime",
    "departureTime",
    "agent",
    "company",
    "roomCenter",
    "xClass",
    "source",
    "market",
    "reserveType",
    "channel",
    "share",
    "guestNumber",
    "children",
    "rateCode",
    "packages",
    "roomRate",
    "setRate",
    "discount",
    "discount1",
    "payCode",
    "credCode",
    "credUnit",
    "applName",
    "applicant",
    "arAccount",
    "phone",
    "fax",
    "email",
    "arriveDate",
    "arriveInfo",
    "arriveCar",
    "arriveRate",
    "departureDate",
    "departureInfo",
    "departureCar",
    "departureRate",
    "extra",
    "srqs",
    "amenties",
    "master",
    "reserveNumber",
    "crsNumber",
    "remark",
    "saleid",
    "cmscode",
    "cardCode",
    "cardNumber",
    "reserveBy",
    "reserveTime",
    "checkInBy",
    "checkInTime",
    "checkOutBy",
    "checkOutTime",
    "departureBy",
    "depTime",
    "changeBy",
    "changeTime",
    "expS1",
    "expS2",
    "expS3",
    "pcrec",
    "comsg"
})
public class MasterStruct {

    protected String hReserve;
    protected String hGuest;
    @XmlElement(name = "GroupNo")
    protected String groupNo;
    protected String roomType;
    protected String upgrade;
    protected String upgradeReason;
    protected int roomNumber;
    protected String roomNo;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar bDate;
    protected String state;
    protected String reserveState;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar arriveTime;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar departureTime;
    protected String agent;
    protected String company;
    protected String roomCenter;
    protected String xClass;
    protected String source;
    protected String market;
    protected String reserveType;
    protected String channel;
    protected String share;
    protected int guestNumber;
    protected int children;
    protected String rateCode;
    protected String packages;
    @XmlElement(required = true)
    protected BigDecimal roomRate;
    @XmlElement(required = true)
    protected BigDecimal setRate;
    protected String discount;
    protected String discount1;
    protected String payCode;
    protected String credCode;
    protected String credUnit;
    protected String applName;
    protected String applicant;
    protected String arAccount;
    protected String phone;
    protected String fax;
    protected String email;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar arriveDate;
    protected String arriveInfo;
    protected String arriveCar;
    @XmlElement(required = true)
    protected BigDecimal arriveRate;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar departureDate;
    protected String departureInfo;
    protected String departureCar;
    @XmlElement(required = true)
    protected BigDecimal departureRate;
    protected String extra;
    protected String srqs;
    protected String amenties;
    protected String master;
    protected String reserveNumber;
    protected String crsNumber;
    protected String remark;
    protected String saleid;
    protected String cmscode;
    protected String cardCode;
    protected String cardNumber;
    protected String reserveBy;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar reserveTime;
    protected String checkInBy;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar checkInTime;
    protected String checkOutBy;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar checkOutTime;
    protected String departureBy;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar depTime;
    protected String changeBy;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar changeTime;
    @XmlElement(name = "exp_s1")
    protected String expS1;
    @XmlElement(name = "exp_s2")
    protected String expS2;
    @XmlElement(name = "exp_s3")
    protected String expS3;
    protected String pcrec;
    protected String comsg;

    /**
     * Gets the value of the hReserve property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHReserve() {
        return hReserve;
    }

    /**
     * Sets the value of the hReserve property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHReserve(String value) {
        this.hReserve = value;
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
     * Gets the value of the groupNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupNo() {
        return groupNo;
    }

    /**
     * Sets the value of the groupNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupNo(String value) {
        this.groupNo = value;
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
     * Gets the value of the upgrade property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpgrade() {
        return upgrade;
    }

    /**
     * Sets the value of the upgrade property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpgrade(String value) {
        this.upgrade = value;
    }

    /**
     * Gets the value of the upgradeReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpgradeReason() {
        return upgradeReason;
    }

    /**
     * Sets the value of the upgradeReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpgradeReason(String value) {
        this.upgradeReason = value;
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
     * Gets the value of the roomNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomNo() {
        return roomNo;
    }

    /**
     * Sets the value of the roomNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomNo(String value) {
        this.roomNo = value;
    }

    /**
     * Gets the value of the bDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBDate() {
        return bDate;
    }

    /**
     * Sets the value of the bDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBDate(XMLGregorianCalendar value) {
        this.bDate = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the reserveState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReserveState() {
        return reserveState;
    }

    /**
     * Sets the value of the reserveState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReserveState(String value) {
        this.reserveState = value;
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
     * Gets the value of the agent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgent() {
        return agent;
    }

    /**
     * Sets the value of the agent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgent(String value) {
        this.agent = value;
    }

    /**
     * Gets the value of the company property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompany() {
        return company;
    }

    /**
     * Sets the value of the company property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompany(String value) {
        this.company = value;
    }

    /**
     * Gets the value of the roomCenter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomCenter() {
        return roomCenter;
    }

    /**
     * Sets the value of the roomCenter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomCenter(String value) {
        this.roomCenter = value;
    }

    /**
     * Gets the value of the xClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXClass() {
        return xClass;
    }

    /**
     * Sets the value of the xClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXClass(String value) {
        this.xClass = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * Gets the value of the market property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarket() {
        return market;
    }

    /**
     * Sets the value of the market property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarket(String value) {
        this.market = value;
    }

    /**
     * Gets the value of the reserveType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReserveType() {
        return reserveType;
    }

    /**
     * Sets the value of the reserveType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReserveType(String value) {
        this.reserveType = value;
    }

    /**
     * Gets the value of the channel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannel() {
        return channel;
    }

    /**
     * Sets the value of the channel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannel(String value) {
        this.channel = value;
    }

    /**
     * Gets the value of the share property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShare() {
        return share;
    }

    /**
     * Sets the value of the share property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShare(String value) {
        this.share = value;
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
     * Gets the value of the children property.
     * 
     */
    public int getChildren() {
        return children;
    }

    /**
     * Sets the value of the children property.
     * 
     */
    public void setChildren(int value) {
        this.children = value;
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
     * Gets the value of the packages property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackages() {
        return packages;
    }

    /**
     * Sets the value of the packages property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackages(String value) {
        this.packages = value;
    }

    /**
     * Gets the value of the roomRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRoomRate() {
        return roomRate;
    }

    /**
     * Sets the value of the roomRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRoomRate(BigDecimal value) {
        this.roomRate = value;
    }

    /**
     * Gets the value of the setRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSetRate() {
        return setRate;
    }

    /**
     * Sets the value of the setRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSetRate(BigDecimal value) {
        this.setRate = value;
    }

    /**
     * Gets the value of the discount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscount() {
        return discount;
    }

    /**
     * Sets the value of the discount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscount(String value) {
        this.discount = value;
    }

    /**
     * Gets the value of the discount1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscount1() {
        return discount1;
    }

    /**
     * Sets the value of the discount1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscount1(String value) {
        this.discount1 = value;
    }

    /**
     * Gets the value of the payCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayCode() {
        return payCode;
    }

    /**
     * Sets the value of the payCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayCode(String value) {
        this.payCode = value;
    }

    /**
     * Gets the value of the credCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCredCode() {
        return credCode;
    }

    /**
     * Sets the value of the credCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCredCode(String value) {
        this.credCode = value;
    }

    /**
     * Gets the value of the credUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCredUnit() {
        return credUnit;
    }

    /**
     * Sets the value of the credUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCredUnit(String value) {
        this.credUnit = value;
    }

    /**
     * Gets the value of the applName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplName() {
        return applName;
    }

    /**
     * Sets the value of the applName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplName(String value) {
        this.applName = value;
    }

    /**
     * Gets the value of the applicant property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplicant() {
        return applicant;
    }

    /**
     * Sets the value of the applicant property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplicant(String value) {
        this.applicant = value;
    }

    /**
     * Gets the value of the arAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArAccount() {
        return arAccount;
    }

    /**
     * Sets the value of the arAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArAccount(String value) {
        this.arAccount = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    /**
     * Gets the value of the fax property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFax() {
        return fax;
    }

    /**
     * Sets the value of the fax property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFax(String value) {
        this.fax = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the arriveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getArriveDate() {
        return arriveDate;
    }

    /**
     * Sets the value of the arriveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setArriveDate(XMLGregorianCalendar value) {
        this.arriveDate = value;
    }

    /**
     * Gets the value of the arriveInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArriveInfo() {
        return arriveInfo;
    }

    /**
     * Sets the value of the arriveInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArriveInfo(String value) {
        this.arriveInfo = value;
    }

    /**
     * Gets the value of the arriveCar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArriveCar() {
        return arriveCar;
    }

    /**
     * Sets the value of the arriveCar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArriveCar(String value) {
        this.arriveCar = value;
    }

    /**
     * Gets the value of the arriveRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getArriveRate() {
        return arriveRate;
    }

    /**
     * Sets the value of the arriveRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setArriveRate(BigDecimal value) {
        this.arriveRate = value;
    }

    /**
     * Gets the value of the departureDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDepartureDate() {
        return departureDate;
    }

    /**
     * Sets the value of the departureDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDepartureDate(XMLGregorianCalendar value) {
        this.departureDate = value;
    }

    /**
     * Gets the value of the departureInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureInfo() {
        return departureInfo;
    }

    /**
     * Sets the value of the departureInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureInfo(String value) {
        this.departureInfo = value;
    }

    /**
     * Gets the value of the departureCar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureCar() {
        return departureCar;
    }

    /**
     * Sets the value of the departureCar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureCar(String value) {
        this.departureCar = value;
    }

    /**
     * Gets the value of the departureRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDepartureRate() {
        return departureRate;
    }

    /**
     * Sets the value of the departureRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDepartureRate(BigDecimal value) {
        this.departureRate = value;
    }

    /**
     * Gets the value of the extra property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtra() {
        return extra;
    }

    /**
     * Sets the value of the extra property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtra(String value) {
        this.extra = value;
    }

    /**
     * Gets the value of the srqs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrqs() {
        return srqs;
    }

    /**
     * Sets the value of the srqs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSrqs(String value) {
        this.srqs = value;
    }

    /**
     * Gets the value of the amenties property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmenties() {
        return amenties;
    }

    /**
     * Sets the value of the amenties property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmenties(String value) {
        this.amenties = value;
    }

    /**
     * Gets the value of the master property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaster() {
        return master;
    }

    /**
     * Sets the value of the master property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaster(String value) {
        this.master = value;
    }

    /**
     * Gets the value of the reserveNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReserveNumber() {
        return reserveNumber;
    }

    /**
     * Sets the value of the reserveNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReserveNumber(String value) {
        this.reserveNumber = value;
    }

    /**
     * Gets the value of the crsNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrsNumber() {
        return crsNumber;
    }

    /**
     * Sets the value of the crsNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrsNumber(String value) {
        this.crsNumber = value;
    }

    /**
     * Gets the value of the remark property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemark() {
        return remark;
    }

    /**
     * Sets the value of the remark property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemark(String value) {
        this.remark = value;
    }

    /**
     * Gets the value of the saleid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaleid() {
        return saleid;
    }

    /**
     * Sets the value of the saleid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaleid(String value) {
        this.saleid = value;
    }

    /**
     * Gets the value of the cmscode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCmscode() {
        return cmscode;
    }

    /**
     * Sets the value of the cmscode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCmscode(String value) {
        this.cmscode = value;
    }

    /**
     * Gets the value of the cardCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardCode() {
        return cardCode;
    }

    /**
     * Sets the value of the cardCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardCode(String value) {
        this.cardCode = value;
    }

    /**
     * Gets the value of the cardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardNumber() {
        return cardNumber;
    }

    /**
     * Sets the value of the cardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardNumber(String value) {
        this.cardNumber = value;
    }

    /**
     * Gets the value of the reserveBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReserveBy() {
        return reserveBy;
    }

    /**
     * Sets the value of the reserveBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReserveBy(String value) {
        this.reserveBy = value;
    }

    /**
     * Gets the value of the reserveTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReserveTime() {
        return reserveTime;
    }

    /**
     * Sets the value of the reserveTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReserveTime(XMLGregorianCalendar value) {
        this.reserveTime = value;
    }

    /**
     * Gets the value of the checkInBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckInBy() {
        return checkInBy;
    }

    /**
     * Sets the value of the checkInBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckInBy(String value) {
        this.checkInBy = value;
    }

    /**
     * Gets the value of the checkInTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCheckInTime() {
        return checkInTime;
    }

    /**
     * Sets the value of the checkInTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCheckInTime(XMLGregorianCalendar value) {
        this.checkInTime = value;
    }

    /**
     * Gets the value of the checkOutBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckOutBy() {
        return checkOutBy;
    }

    /**
     * Sets the value of the checkOutBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckOutBy(String value) {
        this.checkOutBy = value;
    }

    /**
     * Gets the value of the checkOutTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCheckOutTime() {
        return checkOutTime;
    }

    /**
     * Sets the value of the checkOutTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCheckOutTime(XMLGregorianCalendar value) {
        this.checkOutTime = value;
    }

    /**
     * Gets the value of the departureBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureBy() {
        return departureBy;
    }

    /**
     * Sets the value of the departureBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureBy(String value) {
        this.departureBy = value;
    }

    /**
     * Gets the value of the depTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDepTime() {
        return depTime;
    }

    /**
     * Sets the value of the depTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDepTime(XMLGregorianCalendar value) {
        this.depTime = value;
    }

    /**
     * Gets the value of the changeBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangeBy() {
        return changeBy;
    }

    /**
     * Sets the value of the changeBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangeBy(String value) {
        this.changeBy = value;
    }

    /**
     * Gets the value of the changeTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getChangeTime() {
        return changeTime;
    }

    /**
     * Sets the value of the changeTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setChangeTime(XMLGregorianCalendar value) {
        this.changeTime = value;
    }

    /**
     * Gets the value of the expS1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpS1() {
        return expS1;
    }

    /**
     * Sets the value of the expS1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpS1(String value) {
        this.expS1 = value;
    }

    /**
     * Gets the value of the expS2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpS2() {
        return expS2;
    }

    /**
     * Sets the value of the expS2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpS2(String value) {
        this.expS2 = value;
    }

    /**
     * Gets the value of the expS3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpS3() {
        return expS3;
    }

    /**
     * Sets the value of the expS3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpS3(String value) {
        this.expS3 = value;
    }

    /**
     * Gets the value of the pcrec property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPcrec() {
        return pcrec;
    }

    /**
     * Sets the value of the pcrec property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPcrec(String value) {
        this.pcrec = value;
    }

    /**
     * Gets the value of the comsg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComsg() {
        return comsg;
    }

    /**
     * Sets the value of the comsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComsg(String value) {
        this.comsg = value;
    }

}
