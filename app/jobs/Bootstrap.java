package jobs;

import java.util.List;

import models.Hotel;

import org.apache.commons.lang.StringUtils;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import play.Logger;
import play.jobs.Job;
import play.jobs.OnApplicationStart;
import play.libs.XPath;
import webserbice.GetHotelInfoListResponse.GetHotelInfoListResult;
import webserbice.WsDataEngineForWebSite;
import webserbice.WsDataEngineForWebSiteSoap;
import config.ApplicationConfig;

@OnApplicationStart
public class Bootstrap extends Job {
    public void doJob() {
        initHotelInfoList();
    }

    private void initHotelInfoList() {
        List<Hotel> hotels = ApplicationConfig.getHotels();
        if (hotels.isEmpty()) {
            Logger.info("getHotelInfoList远程服务获取数据");
            WsDataEngineForWebSite ws = new WsDataEngineForWebSite();
            WsDataEngineForWebSiteSoap wsp = ws.getWsDataEngineForWebSiteSoap12();
            GetHotelInfoListResult hotelInfoListResult = wsp.getHotelInfoList("", "", "");
            Element hotelInfoListResultElement = (Element) hotelInfoListResult.getAny();
            for (Node event : XPath.selectNodes("//NewDataSet//Table1", hotelInfoListResultElement)) {
                String hotelId = StringUtils.trimToEmpty(XPath.selectText("hotelid", event));
                String name = StringUtils.trimToEmpty(XPath.selectText("descript", event));
                Hotel hotel = new Hotel();
                hotel.setHotelId(hotelId);
                hotel.setName(name);
                if (!"JHHCRS".equals(hotel.getHotelId())) {
                    hotels.add(hotel);
                }
            }
        }
        Logger.info(hotels.toString());
    }
}
