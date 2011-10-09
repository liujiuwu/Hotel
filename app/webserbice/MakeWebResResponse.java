
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
 *         &lt;element name="MakeWebResResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "makeWebResResult"
})
@XmlRootElement(name = "MakeWebResResponse")
public class MakeWebResResponse {

    @XmlElement(name = "MakeWebResResult")
    protected String makeWebResResult;

    /**
     * Gets the value of the makeWebResResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMakeWebResResult() {
        return makeWebResResult;
    }

    /**
     * Sets the value of the makeWebResResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMakeWebResResult(String value) {
        this.makeWebResResult = value;
    }

}
