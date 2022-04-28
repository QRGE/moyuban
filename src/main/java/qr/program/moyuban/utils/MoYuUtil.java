package qr.program.moyuban.utils;

import cn.hutool.http.HttpUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import qr.program.moyuban.bean.DayStatus;
import qr.program.moyuban.config.RollApiConfig;

import java.util.List;

/**
 * @author qr
 * @date 2022/4/28 12:01
 */
@Component
public class MoYuUtil {

    private static RollApiConfig rollApiConfig;

    @Autowired
    public MoYuUtil(RollApiConfig rollApiConfig) {
        MoYuUtil.rollApiConfig = rollApiConfig;
    }

    private final static String api1 = "https://www.mxnzp.com/api/holiday/list/year/YEAR?&app_id=appId&app_secret=appSecret";
    private final static String param1 = "YEAR";
    private final static String param2 = "appId";
    private final static String param3 = "appSecret";

    /**
     * 获取所有的节假日
     */
    public static List<DayStatus> getHolidaysByYear(String year) {
        String url = api1.replace(param1, year).replace(param2, rollApiConfig.getAppId()).replace(param3, rollApiConfig.getAppSecret());
        System.out.println(url);
        String result = HttpUtil.get(url);
        System.out.println(result);
        return null;
    }

    public static String moyu() {
        return null;
    }
}
