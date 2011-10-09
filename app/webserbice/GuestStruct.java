
package webserbice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for GuestStruct complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GuestStruct">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="amenities" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hRecord" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="hotelId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="central" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="xClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="latency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="market" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="vip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="keep" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="belong" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sex" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="salutation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="birthday" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="race" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="religion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="occupation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nationality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="identityClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="identity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="identityEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="cusno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="unit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="street" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="zip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mobile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="wetSite" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="country1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="state1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="city1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="street1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="zip1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mobile1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phone1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fax1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="email1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="visaId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="visaEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="visaNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="visaUnit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="specialRequest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="feature" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="roomPrefer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="interest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lawman" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="regno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bank" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bankNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="taxNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="extraInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ref1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ref2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ref3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="remark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="arriveTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="depatureTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="arAccount1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="arAccount2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="master" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="createBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="createTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="changedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="changedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="town" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="town1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cardNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="saleid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="grade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="class1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="class2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="class3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="class4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="liason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="liason1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GuestStruct", propOrder = {
    "amenities",
    "hRecord",
    "xState",
    "hotelId",
    "central",
    "name",
    "fName",
    "lName",
    "name2",
    "name3",
    "xClass",
    "latency",
    "source",
    "market",
    "vip",
    "keep",
    "belong",
    "sex",
    "language",
    "title",
    "salutation",
    "birthday",
    "race",
    "religion",
    "occupation",
    "nationality",
    "identityClass",
    "identity",
    "identityEnd",
    "cusno",
    "unit",
    "country",
    "state",
    "city",
    "street",
    "zip",
    "mobile",
    "phone",
    "fax",
    "wetSite",
    "email",
    "country1",
    "state1",
    "city1",
    "street1",
    "zip1",
    "mobile1",
    "phone1",
    "fax1",
    "email1",
    "visaId",
    "visaEnd",
    "visaNumber",
    "visaUnit",
    "specialRequest",
    "feature",
    "roomPrefer",
    "interest",
    "lawman",
    "regno",
    "bank",
    "bankNo",
    "taxNo",
    "extraInfo",
    "ref1",
    "ref2",
    "ref3",
    "remark",
    "arriveTime",
    "depatureTime",
    "arAccount1",
    "arAccount2",
    "master",
    "createBy",
    "createTime",
    "changedBy",
    "changedTime",
    "town",
    "town1",
    "cardCode",
    "cardNo",
    "saleid",
    "grade",
    "class1",
    "class2",
    "class3",
    "class4",
    "liason",
    "liason1",
    "cno",
    "type",
    "comment"
})
public class GuestStruct {

    protected String amenities;
    protected String hRecord;
    protected String xState;
    protected String hotelId;
    protected String central;
    protected String name;
    protected String fName;
    protected String lName;
    protected String name2;
    protected String name3;
    protected String xClass;
    protected String latency;
    protected String source;
    protected String market;
    protected String vip;
    protected String keep;
    protected String belong;
    protected String sex;
    protected String language;
    protected String title;
    protected String salutation;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar birthday;
    protected String race;
    protected String religion;
    protected String occupation;
    protected String nationality;
    protected String identityClass;
    protected String identity;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar identityEnd;
    protected String cusno;
    protected String unit;
    protected String country;
    protected String state;
    protected String city;
    protected String street;
    protected String zip;
    protected String mobile;
    protected String phone;
    protected String fax;
    protected String wetSite;
    protected String email;
    protected String country1;
    protected String state1;
    protected String city1;
    protected String street1;
    protected String zip1;
    protected String mobile1;
    protected String phone1;
    protected String fax1;
    protected String email1;
    protected String visaId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar visaEnd;
    protected String visaNumber;
    protected String visaUnit;
    protected String specialRequest;
    protected String feature;
    protected String roomPrefer;
    protected String interest;
    protected String lawman;
    protected String regno;
    protected String bank;
    protected String bankNo;
    protected String taxNo;
    protected String extraInfo;
    protected String ref1;
    protected String ref2;
    protected String ref3;
    protected String remark;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar arriveTime;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar depatureTime;
    protected String arAccount1;
    protected String arAccount2;
    protected String master;
    protected String createBy;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createTime;
    protected String changedBy;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar changedTime;
    protected String town;
    protected String town1;
    protected String cardCode;
    protected String cardNo;
    protected String saleid;
    protected String grade;
    protected String class1;
    protected String class2;
    protected String class3;
    protected String class4;
    protected String liason;
    protected String liason1;
    protected String cno;
    protected String type;
    protected String comment;

    /**
     * Gets the value of the amenities property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmenities() {
        return amenities;
    }

    /**
     * Sets the value of the amenities property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmenities(String value) {
        this.amenities = value;
    }

    /**
     * Gets the value of the hRecord property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHRecord() {
        return hRecord;
    }

    /**
     * Sets the value of the hRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHRecord(String value) {
        this.hRecord = value;
    }

    /**
     * Gets the value of the xState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXState() {
        return xState;
    }

    /**
     * Sets the value of the xState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXState(String value) {
        this.xState = value;
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
     * Gets the value of the central property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCentral() {
        return central;
    }

    /**
     * Sets the value of the central property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCentral(String value) {
        this.central = value;
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
     * Gets the value of the fName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFName() {
        return fName;
    }

    /**
     * Sets the value of the fName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFName(String value) {
        this.fName = value;
    }

    /**
     * Gets the value of the lName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLName() {
        return lName;
    }

    /**
     * Sets the value of the lName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLName(String value) {
        this.lName = value;
    }

    /**
     * Gets the value of the name2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName2() {
        return name2;
    }

    /**
     * Sets the value of the name2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName2(String value) {
        this.name2 = value;
    }

    /**
     * Gets the value of the name3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName3() {
        return name3;
    }

    /**
     * Sets the value of the name3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName3(String value) {
        this.name3 = value;
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
     * Gets the value of the latency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLatency() {
        return latency;
    }

    /**
     * Sets the value of the latency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLatency(String value) {
        this.latency = value;
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
     * Gets the value of the vip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVip() {
        return vip;
    }

    /**
     * Sets the value of the vip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVip(String value) {
        this.vip = value;
    }

    /**
     * Gets the value of the keep property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeep() {
        return keep;
    }

    /**
     * Sets the value of the keep property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeep(String value) {
        this.keep = value;
    }

    /**
     * Gets the value of the belong property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBelong() {
        return belong;
    }

    /**
     * Sets the value of the belong property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBelong(String value) {
        this.belong = value;
    }

    /**
     * Gets the value of the sex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSex() {
        return sex;
    }

    /**
     * Sets the value of the sex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSex(String value) {
        this.sex = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * Gets the value of the salutation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalutation() {
        return salutation;
    }

    /**
     * Sets the value of the salutation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalutation(String value) {
        this.salutation = value;
    }

    /**
     * Gets the value of the birthday property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBirthday() {
        return birthday;
    }

    /**
     * Sets the value of the birthday property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBirthday(XMLGregorianCalendar value) {
        this.birthday = value;
    }

    /**
     * Gets the value of the race property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRace() {
        return race;
    }

    /**
     * Sets the value of the race property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRace(String value) {
        this.race = value;
    }

    /**
     * Gets the value of the religion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReligion() {
        return religion;
    }

    /**
     * Sets the value of the religion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReligion(String value) {
        this.religion = value;
    }

    /**
     * Gets the value of the occupation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccupation() {
        return occupation;
    }

    /**
     * Sets the value of the occupation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccupation(String value) {
        this.occupation = value;
    }

    /**
     * Gets the value of the nationality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationality() {
        return nationality;
    }

    /**
     * Sets the value of the nationality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationality(String value) {
        this.nationality = value;
    }

    /**
     * Gets the value of the identityClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentityClass() {
        return identityClass;
    }

    /**
     * Sets the value of the identityClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentityClass(String value) {
        this.identityClass = value;
    }

    /**
     * Gets the value of the identity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentity() {
        return identity;
    }

    /**
     * Sets the value of the identity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentity(String value) {
        this.identity = value;
    }

    /**
     * Gets the value of the identityEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIdentityEnd() {
        return identityEnd;
    }

    /**
     * Sets the value of the identityEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIdentityEnd(XMLGregorianCalendar value) {
        this.identityEnd = value;
    }

    /**
     * Gets the value of the cusno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCusno() {
        return cusno;
    }

    /**
     * Sets the value of the cusno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCusno(String value) {
        this.cusno = value;
    }

    /**
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnit(String value) {
        this.unit = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
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
     * Gets the value of the street property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreet() {
        return street;
    }

    /**
     * Sets the value of the street property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreet(String value) {
        this.street = value;
    }

    /**
     * Gets the value of the zip property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZip() {
        return zip;
    }

    /**
     * Sets the value of the zip property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZip(String value) {
        this.zip = value;
    }

    /**
     * Gets the value of the mobile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * Sets the value of the mobile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobile(String value) {
        this.mobile = value;
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
     * Gets the value of the wetSite property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWetSite() {
        return wetSite;
    }

    /**
     * Sets the value of the wetSite property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWetSite(String value) {
        this.wetSite = value;
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
     * Gets the value of the country1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry1() {
        return country1;
    }

    /**
     * Sets the value of the country1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry1(String value) {
        this.country1 = value;
    }

    /**
     * Gets the value of the state1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState1() {
        return state1;
    }

    /**
     * Sets the value of the state1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState1(String value) {
        this.state1 = value;
    }

    /**
     * Gets the value of the city1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity1() {
        return city1;
    }

    /**
     * Sets the value of the city1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity1(String value) {
        this.city1 = value;
    }

    /**
     * Gets the value of the street1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreet1() {
        return street1;
    }

    /**
     * Sets the value of the street1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreet1(String value) {
        this.street1 = value;
    }

    /**
     * Gets the value of the zip1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZip1() {
        return zip1;
    }

    /**
     * Sets the value of the zip1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZip1(String value) {
        this.zip1 = value;
    }

    /**
     * Gets the value of the mobile1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobile1() {
        return mobile1;
    }

    /**
     * Sets the value of the mobile1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobile1(String value) {
        this.mobile1 = value;
    }

    /**
     * Gets the value of the phone1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone1() {
        return phone1;
    }

    /**
     * Sets the value of the phone1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone1(String value) {
        this.phone1 = value;
    }

    /**
     * Gets the value of the fax1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFax1() {
        return fax1;
    }

    /**
     * Sets the value of the fax1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFax1(String value) {
        this.fax1 = value;
    }

    /**
     * Gets the value of the email1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail1() {
        return email1;
    }

    /**
     * Sets the value of the email1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail1(String value) {
        this.email1 = value;
    }

    /**
     * Gets the value of the visaId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisaId() {
        return visaId;
    }

    /**
     * Sets the value of the visaId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisaId(String value) {
        this.visaId = value;
    }

    /**
     * Gets the value of the visaEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVisaEnd() {
        return visaEnd;
    }

    /**
     * Sets the value of the visaEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVisaEnd(XMLGregorianCalendar value) {
        this.visaEnd = value;
    }

    /**
     * Gets the value of the visaNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisaNumber() {
        return visaNumber;
    }

    /**
     * Sets the value of the visaNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisaNumber(String value) {
        this.visaNumber = value;
    }

    /**
     * Gets the value of the visaUnit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisaUnit() {
        return visaUnit;
    }

    /**
     * Sets the value of the visaUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisaUnit(String value) {
        this.visaUnit = value;
    }

    /**
     * Gets the value of the specialRequest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialRequest() {
        return specialRequest;
    }

    /**
     * Sets the value of the specialRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialRequest(String value) {
        this.specialRequest = value;
    }

    /**
     * Gets the value of the feature property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeature() {
        return feature;
    }

    /**
     * Sets the value of the feature property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeature(String value) {
        this.feature = value;
    }

    /**
     * Gets the value of the roomPrefer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomPrefer() {
        return roomPrefer;
    }

    /**
     * Sets the value of the roomPrefer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomPrefer(String value) {
        this.roomPrefer = value;
    }

    /**
     * Gets the value of the interest property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterest() {
        return interest;
    }

    /**
     * Sets the value of the interest property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterest(String value) {
        this.interest = value;
    }

    /**
     * Gets the value of the lawman property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLawman() {
        return lawman;
    }

    /**
     * Sets the value of the lawman property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLawman(String value) {
        this.lawman = value;
    }

    /**
     * Gets the value of the regno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegno() {
        return regno;
    }

    /**
     * Sets the value of the regno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegno(String value) {
        this.regno = value;
    }

    /**
     * Gets the value of the bank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBank() {
        return bank;
    }

    /**
     * Sets the value of the bank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBank(String value) {
        this.bank = value;
    }

    /**
     * Gets the value of the bankNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankNo() {
        return bankNo;
    }

    /**
     * Sets the value of the bankNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankNo(String value) {
        this.bankNo = value;
    }

    /**
     * Gets the value of the taxNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxNo() {
        return taxNo;
    }

    /**
     * Sets the value of the taxNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxNo(String value) {
        this.taxNo = value;
    }

    /**
     * Gets the value of the extraInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtraInfo() {
        return extraInfo;
    }

    /**
     * Sets the value of the extraInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtraInfo(String value) {
        this.extraInfo = value;
    }

    /**
     * Gets the value of the ref1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRef1() {
        return ref1;
    }

    /**
     * Sets the value of the ref1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRef1(String value) {
        this.ref1 = value;
    }

    /**
     * Gets the value of the ref2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRef2() {
        return ref2;
    }

    /**
     * Sets the value of the ref2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRef2(String value) {
        this.ref2 = value;
    }

    /**
     * Gets the value of the ref3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRef3() {
        return ref3;
    }

    /**
     * Sets the value of the ref3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRef3(String value) {
        this.ref3 = value;
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
     * Gets the value of the depatureTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDepatureTime() {
        return depatureTime;
    }

    /**
     * Sets the value of the depatureTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDepatureTime(XMLGregorianCalendar value) {
        this.depatureTime = value;
    }

    /**
     * Gets the value of the arAccount1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArAccount1() {
        return arAccount1;
    }

    /**
     * Sets the value of the arAccount1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArAccount1(String value) {
        this.arAccount1 = value;
    }

    /**
     * Gets the value of the arAccount2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArAccount2() {
        return arAccount2;
    }

    /**
     * Sets the value of the arAccount2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArAccount2(String value) {
        this.arAccount2 = value;
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
     * Gets the value of the createBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * Sets the value of the createBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreateBy(String value) {
        this.createBy = value;
    }

    /**
     * Gets the value of the createTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateTime() {
        return createTime;
    }

    /**
     * Sets the value of the createTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreateTime(XMLGregorianCalendar value) {
        this.createTime = value;
    }

    /**
     * Gets the value of the changedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangedBy() {
        return changedBy;
    }

    /**
     * Sets the value of the changedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangedBy(String value) {
        this.changedBy = value;
    }

    /**
     * Gets the value of the changedTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getChangedTime() {
        return changedTime;
    }

    /**
     * Sets the value of the changedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setChangedTime(XMLGregorianCalendar value) {
        this.changedTime = value;
    }

    /**
     * Gets the value of the town property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTown() {
        return town;
    }

    /**
     * Sets the value of the town property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTown(String value) {
        this.town = value;
    }

    /**
     * Gets the value of the town1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTown1() {
        return town1;
    }

    /**
     * Sets the value of the town1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTown1(String value) {
        this.town1 = value;
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
     * Gets the value of the cardNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardNo() {
        return cardNo;
    }

    /**
     * Sets the value of the cardNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardNo(String value) {
        this.cardNo = value;
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
     * Gets the value of the grade property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrade() {
        return grade;
    }

    /**
     * Sets the value of the grade property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrade(String value) {
        this.grade = value;
    }

    /**
     * Gets the value of the class1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClass1() {
        return class1;
    }

    /**
     * Sets the value of the class1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClass1(String value) {
        this.class1 = value;
    }

    /**
     * Gets the value of the class2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClass2() {
        return class2;
    }

    /**
     * Sets the value of the class2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClass2(String value) {
        this.class2 = value;
    }

    /**
     * Gets the value of the class3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClass3() {
        return class3;
    }

    /**
     * Sets the value of the class3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClass3(String value) {
        this.class3 = value;
    }

    /**
     * Gets the value of the class4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClass4() {
        return class4;
    }

    /**
     * Sets the value of the class4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClass4(String value) {
        this.class4 = value;
    }

    /**
     * Gets the value of the liason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLiason() {
        return liason;
    }

    /**
     * Sets the value of the liason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLiason(String value) {
        this.liason = value;
    }

    /**
     * Gets the value of the liason1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLiason1() {
        return liason1;
    }

    /**
     * Sets the value of the liason1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLiason1(String value) {
        this.liason1 = value;
    }

    /**
     * Gets the value of the cno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCno() {
        return cno;
    }

    /**
     * Sets the value of the cno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCno(String value) {
        this.cno = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

}
