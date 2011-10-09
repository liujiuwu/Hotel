
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
 *         &lt;element name="CancelWebResResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "cancelWebResResult"
})
@XmlRootElement(name = "CancelWebResResponse")
public class CancelWebResResponse {

    @XmlElement(name = "CancelWebResResult")
    protected String cancelWebResResult;

    /**
     * Gets the value of the cancelWebResResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancelWebResResult() {
        return cancelWebResResult;
    }

    /**
     * Sets the value of the cancelWebResResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancelWebResResult(String value) {
        this.cancelWebResResult = value;
    }

}
