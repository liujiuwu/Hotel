package models;

public class Room {
    private String hotelId;
    private String roomName;
    private String code;
    private String rate;
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

}
