package webserbice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.4.2
 * 2011-09-27T18:23:41.225+08:00
 * Generated source version: 2.4.2
 * 
 */
@WebService(targetNamespace = "http://tempuri.org/", name = "wsDataEngineForWebSiteSoap")
@XmlSeeAlso({ObjectFactory.class})
public interface WsDataEngineForWebSiteSoap {

    /**
     * 获取奖品列表
     */
    @WebResult(name = "GetRewardsListResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetRewardsList", targetNamespace = "http://tempuri.org/", className = "webserbice.GetRewardsList")
    @WebMethod(operationName = "GetRewardsList", action = "http://tempuri.org/GetRewardsList")
    @ResponseWrapper(localName = "GetRewardsListResponse", targetNamespace = "http://tempuri.org/", className = "webserbice.GetRewardsListResponse")
    public webserbice.GetRewardsListResponse.GetRewardsListResult getRewardsList();

    @WebResult(name = "NewCardResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "NewCard", targetNamespace = "http://tempuri.org/", className = "webserbice.NewCard")
    @WebMethod(operationName = "NewCard", action = "http://tempuri.org/NewCard")
    @ResponseWrapper(localName = "NewCardResponse", targetNamespace = "http://tempuri.org/", className = "webserbice.NewCardResponse")
    public java.lang.String newCard(
        @WebParam(name = "guestStruct", targetNamespace = "http://tempuri.org/")
        webserbice.GuestStruct guestStruct,
        @WebParam(name = "Password", targetNamespace = "http://tempuri.org/")
        java.lang.String password
    );

    /**
     * 挂失卡（先冻结再挂失，本函数只负责将卡冻结，在由前台人工重发卡来实现“挂失重发”）
     */
    @WebResult(name = "FreezeCardResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "FreezeCard", targetNamespace = "http://tempuri.org/", className = "webserbice.FreezeCard")
    @WebMethod(operationName = "FreezeCard", action = "http://tempuri.org/FreezeCard")
    @ResponseWrapper(localName = "FreezeCardResponse", targetNamespace = "http://tempuri.org/", className = "webserbice.FreezeCardResponse")
    public java.lang.String freezeCard(
        @WebParam(name = "CardNo", targetNamespace = "http://tempuri.org/")
        java.lang.String cardNo,
        @WebParam(name = "Password", targetNamespace = "http://tempuri.org/")
        java.lang.String password
    );

    /**
     * 修改订单_简化
     */
    @WebResult(name = "ModifyWebRes_ShortResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "ModifyWebRes_Short", targetNamespace = "http://tempuri.org/", className = "webserbice.ModifyWebResShort")
    @WebMethod(operationName = "ModifyWebRes_Short", action = "http://tempuri.org/ModifyWebRes_Short")
    @ResponseWrapper(localName = "ModifyWebRes_ShortResponse", targetNamespace = "http://tempuri.org/", className = "webserbice.ModifyWebResShortResponse")
    public java.lang.String modifyWebResShort(
        @WebParam(name = "orderNo", targetNamespace = "http://tempuri.org/")
        java.lang.String orderNo,
        @WebParam(name = "hotelid", targetNamespace = "http://tempuri.org/")
        java.lang.String hotelid,
        @WebParam(name = "roomType", targetNamespace = "http://tempuri.org/")
        java.lang.String roomType,
        @WebParam(name = "roomNumber", targetNamespace = "http://tempuri.org/")
        int roomNumber,
        @WebParam(name = "rateCode", targetNamespace = "http://tempuri.org/")
        java.lang.String rateCode,
        @WebParam(name = "rate", targetNamespace = "http://tempuri.org/")
        java.math.BigDecimal rate,
        @WebParam(name = "arriveTime", targetNamespace = "http://tempuri.org/")
        javax.xml.datatype.XMLGregorianCalendar arriveTime,
        @WebParam(name = "departureTime", targetNamespace = "http://tempuri.org/")
        javax.xml.datatype.XMLGregorianCalendar departureTime,
        @WebParam(name = "guestNumber", targetNamespace = "http://tempuri.org/")
        int guestNumber,
        @WebParam(name = "name", targetNamespace = "http://tempuri.org/")
        java.lang.String name,
        @WebParam(name = "birthday", targetNamespace = "http://tempuri.org/")
        javax.xml.datatype.XMLGregorianCalendar birthday,
        @WebParam(name = "email", targetNamespace = "http://tempuri.org/")
        java.lang.String email,
        @WebParam(name = "mobile", targetNamespace = "http://tempuri.org/")
        java.lang.String mobile,
        @WebParam(name = "phone", targetNamespace = "http://tempuri.org/")
        java.lang.String phone,
        @WebParam(name = "fax", targetNamespace = "http://tempuri.org/")
        java.lang.String fax,
        @WebParam(name = "cardNumber", targetNamespace = "http://tempuri.org/")
        java.lang.String cardNumber
    );

    /**
     * 取消订单
     */
    @WebResult(name = "CancelWebResResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "CancelWebRes", targetNamespace = "http://tempuri.org/", className = "webserbice.CancelWebRes")
    @WebMethod(operationName = "CancelWebRes", action = "http://tempuri.org/CancelWebRes")
    @ResponseWrapper(localName = "CancelWebResResponse", targetNamespace = "http://tempuri.org/", className = "webserbice.CancelWebResResponse")
    public java.lang.String cancelWebRes(
        @WebParam(name = "orderNo", targetNamespace = "http://tempuri.org/")
        java.lang.String orderNo,
        @WebParam(name = "hotelid", targetNamespace = "http://tempuri.org/")
        java.lang.String hotelid
    );

    /**
     * 获取酒店信息
     */
    @WebResult(name = "GetHotelInfoListResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetHotelInfoList", targetNamespace = "http://tempuri.org/", className = "webserbice.GetHotelInfoList")
    @WebMethod(operationName = "GetHotelInfoList", action = "http://tempuri.org/GetHotelInfoList")
    @ResponseWrapper(localName = "GetHotelInfoListResponse", targetNamespace = "http://tempuri.org/", className = "webserbice.GetHotelInfoListResponse")
    public webserbice.GetHotelInfoListResponse.GetHotelInfoListResult getHotelInfoList(
        @WebParam(name = "hotelid", targetNamespace = "http://tempuri.org/")
        java.lang.String hotelid,
        @WebParam(name = "city", targetNamespace = "http://tempuri.org/")
        java.lang.String city,
        @WebParam(name = "brand", targetNamespace = "http://tempuri.org/")
        java.lang.String brand
    );

    /**
     * 房价查询
     */
    @WebResult(name = "RateQueryWebResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "RateQueryWeb", targetNamespace = "http://tempuri.org/", className = "webserbice.RateQueryWeb")
    @WebMethod(operationName = "RateQueryWeb", action = "http://tempuri.org/RateQueryWeb")
    @ResponseWrapper(localName = "RateQueryWebResponse", targetNamespace = "http://tempuri.org/", className = "webserbice.RateQueryWebResponse")
    public webserbice.RateQueryWebResponse.RateQueryWebResult rateQueryWeb(
        @WebParam(name = "city", targetNamespace = "http://tempuri.org/")
        java.lang.String city,
        @WebParam(name = "hotelId", targetNamespace = "http://tempuri.org/")
        java.lang.String hotelId,
        @WebParam(name = "brand", targetNamespace = "http://tempuri.org/")
        java.lang.String brand,
        @WebParam(name = "roomType", targetNamespace = "http://tempuri.org/")
        java.lang.String roomType,
        @WebParam(name = "arriveTime", targetNamespace = "http://tempuri.org/")
        javax.xml.datatype.XMLGregorianCalendar arriveTime,
        @WebParam(name = "departureTime", targetNamespace = "http://tempuri.org/")
        javax.xml.datatype.XMLGregorianCalendar departureTime,
        @WebParam(name = "guestNumber", targetNamespace = "http://tempuri.org/")
        int guestNumber,
        @WebParam(name = "roomNumber", targetNamespace = "http://tempuri.org/")
        int roomNumber,
        @WebParam(name = "money", targetNamespace = "http://tempuri.org/")
        java.math.BigDecimal money,
        @WebParam(name = "money1", targetNamespace = "http://tempuri.org/")
        java.math.BigDecimal money1,
        @WebParam(name = "rateCode", targetNamespace = "http://tempuri.org/")
        java.lang.String rateCode,
        @WebParam(name = "hGuest", targetNamespace = "http://tempuri.org/")
        java.lang.String hGuest,
        @WebParam(name = "hCompany", targetNamespace = "http://tempuri.org/")
        java.lang.String hCompany,
        @WebParam(name = "hAgency", targetNamespace = "http://tempuri.org/")
        java.lang.String hAgency,
        @WebParam(name = "hRoomCenter", targetNamespace = "http://tempuri.org/")
        java.lang.String hRoomCenter,
        @WebParam(name = "mode", targetNamespace = "http://tempuri.org/")
        java.lang.String mode,
        @WebParam(name = "closed", targetNamespace = "http://tempuri.org/")
        java.lang.String closed,
        @WebParam(name = "src", targetNamespace = "http://tempuri.org/")
        java.lang.String src
    );

    /**
     * 获取'职位'的代码
     */
    @WebResult(name = "GetBase_OccupationResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetBase_Occupation", targetNamespace = "http://tempuri.org/", className = "webserbice.GetBaseOccupation")
    @WebMethod(operationName = "GetBase_Occupation", action = "http://tempuri.org/GetBase_Occupation")
    @ResponseWrapper(localName = "GetBase_OccupationResponse", targetNamespace = "http://tempuri.org/", className = "webserbice.GetBaseOccupationResponse")
    public webserbice.GetBaseOccupationResponse.GetBaseOccupationResult getBaseOccupation(
        @WebParam(name = "SearchCode", targetNamespace = "http://tempuri.org/")
        java.lang.String searchCode
    );

    @WebResult(name = "CreateChangeOrderBatchResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "CreateChangeOrderBatch", targetNamespace = "http://tempuri.org/", className = "webserbice.CreateChangeOrderBatch")
    @WebMethod(operationName = "CreateChangeOrderBatch", action = "http://tempuri.org/CreateChangeOrderBatch")
    @ResponseWrapper(localName = "CreateChangeOrderBatchResponse", targetNamespace = "http://tempuri.org/", className = "webserbice.CreateChangeOrderBatchResponse")
    public java.lang.String createChangeOrderBatch(
        @WebParam(name = "CardNo", targetNamespace = "http://tempuri.org/")
        java.lang.String cardNo,
        @WebParam(name = "Password", targetNamespace = "http://tempuri.org/")
        java.lang.String password,
        @WebParam(name = "ProductList", targetNamespace = "http://tempuri.org/")
        java.lang.String productList,
        @WebParam(name = "street", targetNamespace = "http://tempuri.org/")
        java.lang.String street,
        @WebParam(name = "zip", targetNamespace = "http://tempuri.org/")
        java.lang.String zip
    );

    /**
     * 根据卡号获取订单列表
     */
    @WebResult(name = "GetMyResListResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetMyResList", targetNamespace = "http://tempuri.org/", className = "webserbice.GetMyResList")
    @WebMethod(operationName = "GetMyResList", action = "http://tempuri.org/GetMyResList")
    @ResponseWrapper(localName = "GetMyResListResponse", targetNamespace = "http://tempuri.org/", className = "webserbice.GetMyResListResponse")
    public webserbice.GetMyResListResponse.GetMyResListResult getMyResList(
        @WebParam(name = "cardNo", targetNamespace = "http://tempuri.org/")
        java.lang.String cardNo,
        @WebParam(name = "hotelid", targetNamespace = "http://tempuri.org/")
        java.lang.String hotelid,
        @WebParam(name = "begin_", targetNamespace = "http://tempuri.org/")
        javax.xml.datatype.XMLGregorianCalendar begin,
        @WebParam(name = "end_", targetNamespace = "http://tempuri.org/")
        javax.xml.datatype.XMLGregorianCalendar end,
        @WebParam(name = "status", targetNamespace = "http://tempuri.org/")
        java.lang.String status
    );

    /**
     * 新建预订_简化
     */
    @WebResult(name = "MakeWebRes_ShortResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "MakeWebRes_Short", targetNamespace = "http://tempuri.org/", className = "webserbice.MakeWebResShort")
    @WebMethod(operationName = "MakeWebRes_Short", action = "http://tempuri.org/MakeWebRes_Short")
    @ResponseWrapper(localName = "MakeWebRes_ShortResponse", targetNamespace = "http://tempuri.org/", className = "webserbice.MakeWebResShortResponse")
    public java.lang.String makeWebResShort(
        @WebParam(name = "hotelid", targetNamespace = "http://tempuri.org/")
        java.lang.String hotelid,
        @WebParam(name = "roomType", targetNamespace = "http://tempuri.org/")
        java.lang.String roomType,
        @WebParam(name = "roomNumber", targetNamespace = "http://tempuri.org/")
        int roomNumber,
        @WebParam(name = "rateCode", targetNamespace = "http://tempuri.org/")
        java.lang.String rateCode,
        @WebParam(name = "rate", targetNamespace = "http://tempuri.org/")
        java.math.BigDecimal rate,
        @WebParam(name = "arriveTime", targetNamespace = "http://tempuri.org/")
        javax.xml.datatype.XMLGregorianCalendar arriveTime,
        @WebParam(name = "departureTime", targetNamespace = "http://tempuri.org/")
        javax.xml.datatype.XMLGregorianCalendar departureTime,
        @WebParam(name = "guestNumber", targetNamespace = "http://tempuri.org/")
        int guestNumber,
        @WebParam(name = "name", targetNamespace = "http://tempuri.org/")
        java.lang.String name,
        @WebParam(name = "birthday", targetNamespace = "http://tempuri.org/")
        javax.xml.datatype.XMLGregorianCalendar birthday,
        @WebParam(name = "email", targetNamespace = "http://tempuri.org/")
        java.lang.String email,
        @WebParam(name = "mobile", targetNamespace = "http://tempuri.org/")
        java.lang.String mobile,
        @WebParam(name = "phone", targetNamespace = "http://tempuri.org/")
        java.lang.String phone,
        @WebParam(name = "fax", targetNamespace = "http://tempuri.org/")
        java.lang.String fax,
        @WebParam(name = "cardNumber", targetNamespace = "http://tempuri.org/")
        java.lang.String cardNumber
    );

    /**
     * 根据卡号获得订单列表
     */
    @WebResult(name = "GetResHis_by_CardnoResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetResHis_by_Cardno", targetNamespace = "http://tempuri.org/", className = "webserbice.GetResHisByCardno")
    @WebMethod(operationName = "GetResHis_by_Cardno", action = "http://tempuri.org/GetResHis_by_Cardno")
    @ResponseWrapper(localName = "GetResHis_by_CardnoResponse", targetNamespace = "http://tempuri.org/", className = "webserbice.GetResHisByCardnoResponse")
    public webserbice.GetResHisByCardnoResponse.GetResHisByCardnoResult getResHisByCardno(
        @WebParam(name = "cardno", targetNamespace = "http://tempuri.org/")
        java.lang.String cardno
    );

    /**
     * 修改贵宾卡的网上密码
     */
    @WebResult(name = "ModifyPasswordResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "ModifyPassword", targetNamespace = "http://tempuri.org/", className = "webserbice.ModifyPassword")
    @WebMethod(operationName = "ModifyPassword", action = "http://tempuri.org/ModifyPassword")
    @ResponseWrapper(localName = "ModifyPasswordResponse", targetNamespace = "http://tempuri.org/", className = "webserbice.ModifyPasswordResponse")
    public java.lang.String modifyPassword(
        @WebParam(name = "cardNo", targetNamespace = "http://tempuri.org/")
        java.lang.String cardNo,
        @WebParam(name = "Password", targetNamespace = "http://tempuri.org/")
        java.lang.String password,
        @WebParam(name = "NewPassword", targetNamespace = "http://tempuri.org/")
        java.lang.String newPassword
    );

    /**
     * 根据会员卡号、密码、类别获取会员信息
     */
    @WebResult(name = "GetCardInfoResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetCardInfo", targetNamespace = "http://tempuri.org/", className = "webserbice.GetCardInfo")
    @WebMethod(operationName = "GetCardInfo", action = "http://tempuri.org/GetCardInfo")
    @ResponseWrapper(localName = "GetCardInfoResponse", targetNamespace = "http://tempuri.org/", className = "webserbice.GetCardInfoResponse")
    public webserbice.GetCardInfoResponse.GetCardInfoResult getCardInfo(
        @WebParam(name = "CardNo", targetNamespace = "http://tempuri.org/")
        java.lang.String cardNo,
        @WebParam(name = "Password", targetNamespace = "http://tempuri.org/")
        java.lang.String password
    );

    /**
     * 网站上的“我的帐户”功能
     */
    @WebResult(name = "GetVipAccountInfoResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetVipAccountInfo", targetNamespace = "http://tempuri.org/", className = "webserbice.GetVipAccountInfo")
    @WebMethod(operationName = "GetVipAccountInfo", action = "http://tempuri.org/GetVipAccountInfo")
    @ResponseWrapper(localName = "GetVipAccountInfoResponse", targetNamespace = "http://tempuri.org/", className = "webserbice.GetVipAccountInfoResponse")
    public webserbice.GetVipAccountInfoResponse.GetVipAccountInfoResult getVipAccountInfo(
        @WebParam(name = "CardNo", targetNamespace = "http://tempuri.org/")
        java.lang.String cardNo,
        @WebParam(name = "Password", targetNamespace = "http://tempuri.org/")
        java.lang.String password
    );

    /**
     * 新建预订
     */
    @WebResult(name = "MakeWebResResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "MakeWebRes", targetNamespace = "http://tempuri.org/", className = "webserbice.MakeWebRes")
    @WebMethod(operationName = "MakeWebRes", action = "http://tempuri.org/MakeWebRes")
    @ResponseWrapper(localName = "MakeWebResResponse", targetNamespace = "http://tempuri.org/", className = "webserbice.MakeWebResResponse")
    public java.lang.String makeWebRes(
        @WebParam(name = "HotelID", targetNamespace = "http://tempuri.org/")
        java.lang.String hotelID,
        @WebParam(name = "ms", targetNamespace = "http://tempuri.org/")
        webserbice.MasterStruct ms,
        @WebParam(name = "gs", targetNamespace = "http://tempuri.org/")
        webserbice.GuestStruct gs
    );

    /**
     * 修改卡信息，修改卡信息和修改密码分开，此处密码将作为验证信息
     */
    @WebResult(name = "ModifyCardResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "ModifyCard", targetNamespace = "http://tempuri.org/", className = "webserbice.ModifyCard")
    @WebMethod(operationName = "ModifyCard", action = "http://tempuri.org/ModifyCard")
    @ResponseWrapper(localName = "ModifyCardResponse", targetNamespace = "http://tempuri.org/", className = "webserbice.ModifyCardResponse")
    public java.lang.String modifyCard(
        @WebParam(name = "cardNo", targetNamespace = "http://tempuri.org/")
        java.lang.String cardNo,
        @WebParam(name = "Password", targetNamespace = "http://tempuri.org/")
        java.lang.String password,
        @WebParam(name = "guestStruct", targetNamespace = "http://tempuri.org/")
        webserbice.GuestStruct guestStruct
    );

    @WebResult(name = "testResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "test", targetNamespace = "http://tempuri.org/", className = "webserbice.Test")
    @WebMethod(action = "http://tempuri.org/test")
    @ResponseWrapper(localName = "testResponse", targetNamespace = "http://tempuri.org/", className = "webserbice.TestResponse")
    public java.lang.String test();

    /**
     * 获取订单
     */
    @WebResult(name = "GetWebResResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetWebRes", targetNamespace = "http://tempuri.org/", className = "webserbice.GetWebRes")
    @WebMethod(operationName = "GetWebRes", action = "http://tempuri.org/GetWebRes")
    @ResponseWrapper(localName = "GetWebResResponse", targetNamespace = "http://tempuri.org/", className = "webserbice.GetWebResResponse")
    public webserbice.GetWebResResponse.GetWebResResult getWebRes(
        @WebParam(name = "orderNo", targetNamespace = "http://tempuri.org/")
        java.lang.String orderNo,
        @WebParam(name = "hotelid", targetNamespace = "http://tempuri.org/")
        java.lang.String hotelid,
        @WebParam(name = "begin_", targetNamespace = "http://tempuri.org/")
        javax.xml.datatype.XMLGregorianCalendar begin,
        @WebParam(name = "end_", targetNamespace = "http://tempuri.org/")
        javax.xml.datatype.XMLGregorianCalendar end,
        @WebParam(name = "status", targetNamespace = "http://tempuri.org/")
        java.lang.String status,
        @WebParam(name = "guestno", targetNamespace = "http://tempuri.org/")
        java.lang.String guestno
    );

    /**
     * Change Score to Gifts
     */
    @WebResult(name = "GetExchageListResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetExchageList", targetNamespace = "http://tempuri.org/", className = "webserbice.GetExchageList")
    @WebMethod(operationName = "GetExchageList", action = "http://tempuri.org/GetExchageList")
    @ResponseWrapper(localName = "GetExchageListResponse", targetNamespace = "http://tempuri.org/", className = "webserbice.GetExchageListResponse")
    public webserbice.GetExchageListResponse.GetExchageListResult getExchageList(
        @WebParam(name = "Category", targetNamespace = "http://tempuri.org/")
        java.lang.String category,
        @WebParam(name = "Class", targetNamespace = "http://tempuri.org/")
        java.lang.String _class,
        @WebParam(name = "PageNo", targetNamespace = "http://tempuri.org/")
        int pageNo,
        @WebParam(name = "PageSize", targetNamespace = "http://tempuri.org/")
        int pageSize
    );

    /**
     * 修改订单
     */
    @WebResult(name = "ModifyWebResResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "ModifyWebRes", targetNamespace = "http://tempuri.org/", className = "webserbice.ModifyWebRes")
    @WebMethod(operationName = "ModifyWebRes", action = "http://tempuri.org/ModifyWebRes")
    @ResponseWrapper(localName = "ModifyWebResResponse", targetNamespace = "http://tempuri.org/", className = "webserbice.ModifyWebResResponse")
    public java.lang.String modifyWebRes(
        @WebParam(name = "orderNo", targetNamespace = "http://tempuri.org/")
        java.lang.String orderNo,
        @WebParam(name = "hotelid", targetNamespace = "http://tempuri.org/")
        java.lang.String hotelid,
        @WebParam(name = "masterStruct", targetNamespace = "http://tempuri.org/")
        webserbice.MasterStruct masterStruct,
        @WebParam(name = "guestStruct", targetNamespace = "http://tempuri.org/")
        webserbice.GuestStruct guestStruct
    );

    /**
     * 获取'称呼'的代码
     */
    @WebResult(name = "GetGreetingResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetGreeting", targetNamespace = "http://tempuri.org/", className = "webserbice.GetGreeting")
    @WebMethod(operationName = "GetGreeting", action = "http://tempuri.org/GetGreeting")
    @ResponseWrapper(localName = "GetGreetingResponse", targetNamespace = "http://tempuri.org/", className = "webserbice.GetGreetingResponse")
    public webserbice.GetGreetingResponse.GetGreetingResult getGreeting(
        @WebParam(name = "SearchCode", targetNamespace = "http://tempuri.org/")
        java.lang.String searchCode
    );

    @WebResult(name = "GetCategoryResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetCategory", targetNamespace = "http://tempuri.org/", className = "webserbice.GetCategory")
    @WebMethod(operationName = "GetCategory", action = "http://tempuri.org/GetCategory")
    @ResponseWrapper(localName = "GetCategoryResponse", targetNamespace = "http://tempuri.org/", className = "webserbice.GetCategoryResponse")
    public webserbice.GetCategoryResponse.GetCategoryResult getCategory();

    /**
     * 获取某一会员的积分记录
     */
    @WebResult(name = "GetPointListResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetPointList", targetNamespace = "http://tempuri.org/", className = "webserbice.GetPointList")
    @WebMethod(operationName = "GetPointList", action = "http://tempuri.org/GetPointList")
    @ResponseWrapper(localName = "GetPointListResponse", targetNamespace = "http://tempuri.org/", className = "webserbice.GetPointListResponse")
    public webserbice.GetPointListResponse.GetPointListResult getPointList(
        @WebParam(name = "CardNo", targetNamespace = "http://tempuri.org/")
        java.lang.String cardNo,
        @WebParam(name = "Password", targetNamespace = "http://tempuri.org/")
        java.lang.String password,
        @WebParam(name = "BeginDate", targetNamespace = "http://tempuri.org/")
        java.lang.String beginDate,
        @WebParam(name = "EndDate", targetNamespace = "http://tempuri.org/")
        java.lang.String endDate
    );

    /**
     * 获取消费列表
     */
    @WebResult(name = "GetConsumeListResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "GetConsumeList", targetNamespace = "http://tempuri.org/", className = "webserbice.GetConsumeList")
    @WebMethod(operationName = "GetConsumeList", action = "http://tempuri.org/GetConsumeList")
    @ResponseWrapper(localName = "GetConsumeListResponse", targetNamespace = "http://tempuri.org/", className = "webserbice.GetConsumeListResponse")
    public webserbice.GetConsumeListResponse.GetConsumeListResult getConsumeList(
        @WebParam(name = "CardNo", targetNamespace = "http://tempuri.org/")
        java.lang.String cardNo,
        @WebParam(name = "Password", targetNamespace = "http://tempuri.org/")
        java.lang.String password,
        @WebParam(name = "BeginDate", targetNamespace = "http://tempuri.org/")
        java.lang.String beginDate,
        @WebParam(name = "EndDate", targetNamespace = "http://tempuri.org/")
        java.lang.String endDate
    );
}