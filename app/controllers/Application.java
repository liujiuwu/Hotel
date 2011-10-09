package controllers;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;

import models.Hotel;
import models.Room;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.math.NumberUtils;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import play.Logger;
import play.libs.XPath;
import play.mvc.Controller;
import utils.PureUtils;
import webserbice.RateQueryWebResponse.RateQueryWebResult;
import webserbice.WsDataEngineForWebSite;
import webserbice.WsDataEngineForWebSiteSoap;
import config.ApplicationConfig;

public class Application extends Controller {

    public static void index() {
        List<Hotel> hotels = ApplicationConfig.getHotels();
        render(hotels);
    }

    public static void search() {
        String hotelId = params.get("hotelId");

        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_MONTH, 1);
        Date from = calendar.getTime();
        if (params.get("from") != null) {
            from = params.get("from", Date.class);
        }

        calendar.add(Calendar.DAY_OF_MONTH, 2);
        Date to = calendar.getTime();
        if (params.get("to") != null) {
            to = params.get("to", Date.class);
        }

        List<Room> rooms = getRooms(hotelId, from, to);
        List<Hotel> hotels = ApplicationConfig.getHotels();

        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        String startTime = sf.format(from);
        String endTime = sf.format(to);

        renderTemplate("Application/list.html", hotelId, hotels, rooms, startTime, endTime);
    }

    public static void book(String hotelId, String roomName, String rate, String rateCode, int avail) {
        Date from = params.get("from", Date.class);
        Date to = params.get("to", Date.class);

        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        String startTime = sf.format(from);
        String endTime = sf.format(to);

        Room room = new Room();
        room.setHotelId(hotelId);
        room.setRoomName(roomName);
        room.setRate(rate);
        room.setRateCode(rateCode);
        render(startTime, endTime, room, avail);
    }

    private static List<Room> getRooms(String hotelId, Date from, Date to) {
        List<Room> rooms = new ArrayList<Room>();
        RateQueryWebResult rateQueryWebResult = getRateQueryWebResult(hotelId, from, to);
        Element element = (Element) rateQueryWebResult.getAny();
        for (Node node : XPath.selectNodes("//NewDataSet//Table1", element)) {
            String name = StringUtils.trimToEmpty(XPath.selectText("descript", node));
            String code = StringUtils.trimToEmpty(XPath.selectText("code", node));
            String rate = StringUtils.trimToEmpty(XPath.selectText("rate", node));
            String rateCode = StringUtils.trimToEmpty(XPath.selectText("ratecode", node));
            String avail = StringUtils.trimToEmpty(XPath.selectText("avail", node));
            Room room = new Room();
            room.setHotelId(hotelId);
            room.setRoomName(name);
            room.setCode(code);
            room.setRate(rate);
            room.setRateCode(rateCode);
            room.setAvail(NumberUtils.toInt(avail));
            rooms.add(room);
        }
        return rooms;
    }

    public static void confirmBooking(String hotelId, String roomType, BigDecimal rate, String rateCode, String name, String email, String mobile, String phone, String fax, String cardNumber, int roomNumber, int guestNumber) {
        Date from = params.get("from", Date.class);
        Date to = params.get("to", Date.class);
        Date bd = params.get("birthday", Date.class);

        XMLGregorianCalendar arriveTime = PureUtils.convertToXMLGregorianCalendar(from);
        XMLGregorianCalendar departureTime = PureUtils.convertToXMLGregorianCalendar(to);
        XMLGregorianCalendar birthday = PureUtils.convertToXMLGregorianCalendar(bd);

        WsDataEngineForWebSite ws = new WsDataEngineForWebSite();
        WsDataEngineForWebSiteSoap wsp = ws.getWsDataEngineForWebSiteSoap12();
        // wsp.makeWebResShort(hotelid, roomType, roomNumber, rateCode, rate, arriveTime, departureTime, guestNumber, name, birthday, email, mobile, phone, fax, cardNumber)
        String ret = wsp.makeWebResShort(hotelId, roomType, roomNumber, rateCode, rate, arriveTime, departureTime, guestNumber, name, birthday, email, mobile, phone, fax, cardNumber);

        renderText("ok=" + ret);
    }

    private static RateQueryWebResult getRateQueryWebResult(String hotelId, Date from, Date to) {
        WsDataEngineForWebSite ws = new WsDataEngineForWebSite();
        WsDataEngineForWebSiteSoap wsp = ws.getWsDataEngineForWebSiteSoap12();
        RateQueryWebResult rateQueryWebResult = wsp.rateQueryWeb("", hotelId, "", "", PureUtils.convertToXMLGregorianCalendar(from), PureUtils.convertToXMLGregorianCalendar(to), 1, 1, new BigDecimal(0), new BigDecimal(0), "", "", "", "", "", "", "", "");
        return rateQueryWebResult;
    }

}