
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
 *         &lt;element name="NewCardResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "newCardResult"
})
@XmlRootElement(name = "NewCardResponse")
public class NewCardResponse {

    @XmlElement(name = "NewCardResult")
    protected String newCardResult;

    /**
     * Gets the value of the newCardResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewCardResult() {
        return newCardResult;
    }

    /**
     * Sets the value of the newCardResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewCardResult(String value) {
        this.newCardResult = value;
    }

}
