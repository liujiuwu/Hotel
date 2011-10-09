
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
 *         &lt;element name="ModifyWebRes_ShortResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "modifyWebResShortResult"
})
@XmlRootElement(name = "ModifyWebRes_ShortResponse")
public class ModifyWebResShortResponse {

    @XmlElement(name = "ModifyWebRes_ShortResult")
    protected String modifyWebResShortResult;

    /**
     * Gets the value of the modifyWebResShortResult property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModifyWebResShortResult() {
        return modifyWebResShortResult;
    }

    /**
     * Sets the value of the modifyWebResShortResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModifyWebResShortResult(String value) {
        this.modifyWebResShortResult = value;
    }

}
