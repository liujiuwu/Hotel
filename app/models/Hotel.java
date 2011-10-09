package models;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

public class Hotel {
    private String hotelId;
    private String name;

    /**
     * @return the hotelId
     */
    public final String getHotelId() {
        return hotelId;
    }

    /**
     * @param hotelId
     *            the hotelId to set
     */
    public final void setHotelId(String hotelId) {
        this.hotelId = hotelId;
    }

    /**
     * @return the name
     */
    public final String getName() {
        return name;
    }

    /**
     * @param name
     *            the name to set
     */
    public final void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

}
