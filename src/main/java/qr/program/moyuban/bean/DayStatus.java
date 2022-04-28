package qr.program.moyuban.bean;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @author qr
 * @date 2022/4/28 11:58
 */
@Getter
@Setter
public class DayStatus {

    private Date date;
    private String yearTips;
    private Integer weekOfYear;
    private Integer dayOfYear;
    private String chineseZodiac;
    private Integer type;
    private String typeDes;
    private Integer indexWorkDayOfMonth;
    private String constellation;
    private String lunarCalendar;
    private Integer weekDay;
    private String solarTerms;
    private String avoid;
    private String suit;
}
