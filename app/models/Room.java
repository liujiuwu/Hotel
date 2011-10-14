package models;

public class Room {
    private String hotelId;
    private String roomName;
    private String code;
    private String rate;
    private String rackRate;
    private String rateCode;
    private int avail;

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
     * @return the roomName
     */
    public final String getRoomName() {
        return roomName;
    }

    /**
     * @param roomName
     *            the roomName to set
     */
    public final void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    /**
     * @return the code
     */
    public final String getCode() {
        return code;
    }

    /**
     * @param code
     *            the code to set
     */
    public final void setCode(String code) {
        this.code = code;
    }

    /**
     * @return the rate
     */
    public final String getRate() {
        return rate;
    }

    /**
     * @param rate
     *            the rate to set
     */
    public final void setRate(String rate) {
        this.rate = rate;
    }

    /**
     * @return the rateCode
     */
    public final String getRateCode() {
        return rateCode;
    }

    /**
     * @param rateCode
     *            the rateCode to set
     */
    public final void setRateCode(String rateCode) {
        this.rateCode = rateCode;
    }

    /**
     * @return the avail
     */
    public final int getAvail() {
        return avail;
    }

    /**
     * @param avail
     *            the avail to set
     */
    public final void setAvail(int avail) {
        this.avail = avail;
    }

    /**
     * @return the rackRate
     */
    public final String getRackRate() {
        return rackRate;
    }

    /**
     * @param rackRate the rackRate to set
     */
    public final void setRackRate(String rackRate) {
        this.rackRate = rackRate;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((code == null) ? 0 : code.hashCode());
        result = prime * result + ((hotelId == null) ? 0 : hotelId.hashCode());
        return result;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Room other = (Room) obj;
        if (code == null) {
            if (other.code != null)
                return false;
        } else if (!code.equals(other.code))
            return false;
        if (hotelId == null) {
            if (other.hotelId != null)
                return false;
        } else if (!hotelId.equals(other.hotelId))
            return false;
        return true;
    }
    
    
    

}
