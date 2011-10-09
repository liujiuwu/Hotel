
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
 *         &lt;element name="guestStruct" type="{http://tempuri.org/}GuestStruct" minOccurs="0"/>
 *         &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "guestStruct",
    "password"
})
@XmlRootElement(name = "NewCard")
public class NewCard {

    protected GuestStruct guestStruct;
    @XmlElement(name = "Password")
    protected String password;

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

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

}
