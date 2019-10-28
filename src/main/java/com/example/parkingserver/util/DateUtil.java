package com.example.parkingserver.util;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 基础日期类
 *
 * @author zhouszxfs@xinfushe.com
 * @date 2019-10-28 15:31
 * @param
 * @return
 */
public class DateUtil {
    public final static SimpleDateFormat monthFormat = new SimpleDateFormat("yyyy-MM");
    public final static SimpleDateFormat dayFormat = new SimpleDateFormat("yyyy-MM-dd");
    public final static SimpleDateFormat timeFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    public final static SimpleDateFormat yyyyMMdd = new SimpleDateFormat("yyyyMMdd");
    public final static SimpleDateFormat hourFormat = new SimpleDateFormat("HH点mm分");
    public final static SimpleDateFormat timeFormat2 = new SimpleDateFormat("yyyyMMddHHmmss");

    public static String getTimeDate2(Date date) {
        return timeFormat2.format(date);
    }
    /***
     * 计算传入日期的往后顺延N天以后的日期对象
     *
     * @param date
     *            传入的日期对象
     * @param n
     *            往后顺延的天数
     * @return 顺延后的日期对象
     */
    public static Date getPreviousNDate(Date date, long n) {
        if (date == null) {
            return null;
        }
        long time = date.getTime();
        // 用毫秒数来计算新的日期
        time = time + n * 24 * 60 * 60 * 1000;
        return new Date(time);
    }

    /***
     * 计算传入日期的往前顺延N天以后的日期对象
     *
     * @param d
     *            传入的日期对象
     * @param day
     *            往前顺延的天数
     * @return 顺延前的日期对象
     */
    public static Date getBeforeNDate(Date d, int day) {
        Calendar now = Calendar.getInstance();
        now.setTime(d);
        now.set(Calendar.DATE, now.get(Calendar.DATE) - day);
        return now.getTime();
    }

    /**
     * 获取日期的开始时间
     *  @param d
     *  @return
     *	@return 			: Date
     *  @createDate  	: 2017年9月14日 下午3:41:09
     *  @author         	: wangchao
     *  @version        	: v1.0
     *  @updateDate    	: 2017年9月14日 下午3:41:09
     *  @updateAuthor  :
     */
    public static Date getThisBeginDate(Date d) {
        Calendar begin = Calendar.getInstance();
        begin.setTime(d);
        begin.set(Calendar.HOUR_OF_DAY, 0);
        begin.set(Calendar.MINUTE, 0);
        begin.set(Calendar.SECOND, 0);
        return begin.getTime();
    }

    /**
     * 获取日期的结束时间
     *  @param d
     *  @return
     *	@return 			: Date
     *  @createDate  	: 2017年9月14日 下午3:41:52
     *  @author         	: wangchao
     *  @version        	: v1.0
     *  @updateDate    	: 2017年9月14日 下午3:41:52
     *  @updateAuthor  :
     */
    public static Date getThisEndDate(Date d) {
        Calendar end = Calendar.getInstance();
        end.setTime(d);
        end.set(Calendar.HOUR_OF_DAY, 23);
        end.set(Calendar.MINUTE, 59);
        end.set(Calendar.SECOND, 59);
        return end.getTime();
    }

    public static String getDateStrByWeek() {
        SimpleDateFormat format = new SimpleDateFormat("yyw");
        return format.format(Calendar.getInstance().getTime());
    }

    public static String getDateStrByMonth() {
        SimpleDateFormat format = new SimpleDateFormat("yyMM");
        return format.format(Calendar.getInstance().getTime());
    }

    public static Date parseDate(String in, String format) {
        SimpleDateFormat df = new SimpleDateFormat(format);
        try {
            return df.parse(in);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String getDateStr(Date in, String format) {
        if (in == null) {
            return "";
        }
        SimpleDateFormat df = new SimpleDateFormat(format);
        return df.format(in);
    }

    public static Date addOneDay(Date d) {
        if (d == null) return null;
        Calendar cal = Calendar.getInstance();
        cal.setTime(d);
        cal.set(Calendar.HOUR_OF_DAY, 23);
        cal.set(Calendar.MINUTE, 59);
        cal.set(Calendar.SECOND, 59);
        return cal.getTime();
    }

    private static String secondStr = "秒";
    private static String minStr = "分";
    private static String hourStr = "小时";

    public static String getDateGap(Date s, Date e) {
        if (s == null || e == null) return "";
        long slong = s.getTime();
        long elong = e.getTime();
        if (slong >= elong) return "0" + secondStr;
        int sec = (int) ((elong - slong) / 1000);
        if (sec < 60) return sec + secondStr;
        int min = (int) (sec / 60);
        sec = sec - min * 60;
        if (min < 60) return min + minStr + sec + secondStr;
        int hour = (int) (min / 60);
        min = min - hour * 60;
        return hour + hourStr + min + minStr + sec + secondStr;
    }

    public static void main(String[] args) throws IOException {

        //        boolean dsf = isValidTime("2010-10-10 12:00:00");
        //        System.out.println("getMonthDate" + "===" + getMonthDate());
        //        System.out.println("getDayDate" + "===" + getDayDate());
        //        System.out.println("getTimeDate" + "===" + getTimeDate());
        //        System.out.println(subMonth(new Date(), -3));

        System.out.println("getPreviousDateList" + "===" + DateUtil.getCurrentHalf());

    }

    public static String getMonthDate(Date date) {
        return monthFormat.format(date);
    }

    public static String getMonthDate() {
        return monthFormat.format(new Date());
    }

    public static String getDayDate(Date date) {
        return dayFormat.format(date);
    }

    public static String getDayDate() {
        return dayFormat.format(new Date());
    }

    public static String getTimeDate(Date date) {
        return timeFormat.format(date);
    }

    public static String getHourDate(Date date){
        return hourFormat.format(date);
    }

    public static String getTimeDate() {
        return timeFormat.format(new Date());
    }

    /**
     * 判断 是否为 合法日期 字符串
     *
     * @author lifq
     * <p>
     * 2016年5月3日  下午4:03:12
     */
    public static boolean isValidDate(String str) {
        boolean convertSuccess = true;
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        try {
            //  　　　　设置lenient为false. 否则SimpleDateFormat会比较宽松地验证日期，比如2007/02/29会被接受，并转换成2007/03/01
            format.setLenient(false);
            format.parse(str);
        } catch (ParseException e) {
            // e.printStackTrace();
            // 如果throw java.text.ParseException或者NullPointerException，就说明格式不对
            convertSuccess = false;
        }
        return convertSuccess;
    }

    /**
     * 判断时间格式 格式必须为“YYYY-MM-dd hh:mm:ss”
     * 2004-2-30 是无效的
     *
     * @param str
     * @return
     */
    public static boolean isValidTime(String str) {
        try {
            Date date = (Date) timeFormat.parse(str);
            return str.equals(timeFormat.format(date));
        } catch (Exception e) {
            return false;
        }
    }


    /**
     * 获取201606 类似的字符串
     *
     * @author lifq
     * <p>
     * 2016年6月21日  上午10:58:17
     */
    public static String getYearMonthStr() {
        SimpleDateFormat format = new SimpleDateFormat("yyyyMM");
        return format.format(Calendar.getInstance().getTime());
    }

    /**
     * 获取 2016-08 格式的字符串
     *
     * @author lifq
     * <p>
     * 2016年8月24日  下午3:31:45
     */
    public static String getCurYearMonthStr() {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM");
        return format.format(Calendar.getInstance().getTime());
    }

    /**
     * 获取当前 月份
     *
     * @author lifq
     * <p>
     * 2016年8月24日  下午9:16:31
     */
    public static String getCurMonthStr() {
        SimpleDateFormat format = new SimpleDateFormat("MM");
        return format.format(Calendar.getInstance().getTime());
    }

    /**
     * 获取上个月信息  格式：yyyy-MM
     *
     * @author lifq
     * <p>
     * 2016年8月25日  下午5:55:44
     */
    public static String getPreMonthStr() {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM");
        Calendar c = Calendar.getInstance();
        c.add(Calendar.MONTH, -1);
        return format.format(c.getTime());
    }

    /**
     * 获取上个月信息  格式：yyyy-MM
     *
     * @author lifq
     * <p>
     * 2016年8月25日  下午5:55:44
     */
    public static String getDayStr(String str) {
        try {
            Date date = (Date) dayFormat.parse(str);
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            return format.format(date.getTime());
        }catch (Exception e){

        }
        return null;
    }

    /**
     * 获取上个月信息  格式：yyyy-MM
     *
     * @author lifq
     * <p>
     * 2016年8月25日  下午5:55:44
     */
    public static String getPreMonthStr(String str) {
        try {
            Date date = (Date) monthFormat.parse(str);
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM");
            Calendar c = Calendar.getInstance();
            c.setTime(date);
            c.add(Calendar.MONTH, -1);
            return format.format(c.getTime());
        }catch (Exception e){

        }
        return null;
    }

    /**
     * 获取perNum前月份信息 格式：yyyy-MM
     *
     * @author lifq
     * <p>
     * 2016年8月25日  下午8:24:24
     */
    public static String getPreMonthStr(int perNum) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM");
        Calendar c = Calendar.getInstance();
        c.add(Calendar.MONTH, perNum);
        return format.format(c.getTime());
    }

    /***
     * 获取yyyyMMdd类型的时间字符串
     *
     * @return 时间字符串
     */
    public static String getYYYYMMDDDate() {

        return yyyyMMdd.format(new Date());
    }


    /**
     * 获取半个小时之前的时间
     *
     * @return
     */
    public static String getCurrentHalf() {
        Calendar calendar = Calendar.getInstance();

        calendar.set(Calendar.MINUTE, calendar.get(Calendar.MINUTE) - 60);

        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(calendar.getTime());
    }

    /**
     * 取得季度月
     *
     * @param str
     * @return
     */
    public static Date[] getSeasonDate(String str) {
        Date[] season = new Date[3];
        try {
            Date date = (Date) monthFormat.parse(str);
            Calendar c = Calendar.getInstance();
            c.setTime(date);
            int nSeason = getSeason(date);
            if (nSeason == 1) {// 第一季度
                c.set(Calendar.MONTH, Calendar.JANUARY);
                season[0] = c.getTime();
                c.set(Calendar.MONTH, Calendar.FEBRUARY);
                season[1] = c.getTime();
                c.set(Calendar.MONTH, Calendar.MARCH);
                season[2] = c.getTime();
            } else if (nSeason == 2) {// 第二季度
                c.set(Calendar.MONTH, Calendar.APRIL);
                season[0] = c.getTime();
                c.set(Calendar.MONTH, Calendar.MAY);
                season[1] = c.getTime();
                c.set(Calendar.MONTH, Calendar.JUNE);
                season[2] = c.getTime();
            } else if (nSeason == 3) {// 第三季度
                c.set(Calendar.MONTH, Calendar.JULY);
                season[0] = c.getTime();
                c.set(Calendar.MONTH, Calendar.AUGUST);
                season[1] = c.getTime();
                c.set(Calendar.MONTH, Calendar.SEPTEMBER);
                season[2] = c.getTime();
            } else if (nSeason == 4) {// 第四季度
                c.set(Calendar.MONTH, Calendar.OCTOBER);
                season[0] = c.getTime();
                c.set(Calendar.MONTH, Calendar.NOVEMBER);
                season[1] = c.getTime();
                c.set(Calendar.MONTH, Calendar.DECEMBER);
                season[2] = c.getTime();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return season;
    }

    /**
     *
     * 1 第一季度 2 第二季度 3 第三季度 4 第四季度
     *
     * @param date
     * @return
     */
    public static int getSeason(Date date) {
        int season = 0;
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        int month = c.get(Calendar.MONTH);
        switch (month) {
            case Calendar.JANUARY:
            case Calendar.FEBRUARY:
            case Calendar.MARCH:
                season = 1;
                break;
            case Calendar.APRIL:
            case Calendar.MAY:
            case Calendar.JUNE:
                season = 2;
                break;
            case Calendar.JULY:
            case Calendar.AUGUST:
            case Calendar.SEPTEMBER:
                season = 3;
                break;
            case Calendar.OCTOBER:
            case Calendar.NOVEMBER:
            case Calendar.DECEMBER:
                season = 4;
                break;
            default:
                break;
        }
        return season;
    }

    /**
     * 获取某季度的第一天和最后一天
     *	@param num:第几季度
     */
    public static String[] getCurrQuarter(int num) {
        String[] s = new String[2];
        String str = "";
        // 设置本年的季
        Calendar quarterCalendar = null;
        switch (num) {
            case 1: // 本年到现在经过了一个季度，在加上前4个季度
                quarterCalendar = Calendar.getInstance();
                quarterCalendar.set(Calendar.MONTH, 3);
                quarterCalendar.set(Calendar.DATE, 1);
                quarterCalendar.add(Calendar.DATE, -1);
                str = dayFormat.format(quarterCalendar.getTime());
                s[0] = str.substring(0, str.length() - 5) + "01-01";
                s[1] = str;
                break;
            case 2: // 本年到现在经过了二个季度，在加上前三个季度
                quarterCalendar = Calendar.getInstance();
                quarterCalendar.set(Calendar.MONTH, 6);
                quarterCalendar.set(Calendar.DATE, 1);
                quarterCalendar.add(Calendar.DATE, -1);
                str = dayFormat.format(quarterCalendar.getTime());
                s[0] = str.substring(0, str.length() - 5) + "04-01";
                s[1] = str;
                break;
            case 3:// 本年到现在经过了三个季度，在加上前二个季度
                quarterCalendar = Calendar.getInstance();
                quarterCalendar.set(Calendar.MONTH, 9);
                quarterCalendar.set(Calendar.DATE, 1);
                quarterCalendar.add(Calendar.DATE, -1);
                str = dayFormat.format(quarterCalendar.getTime());
                s[0] = str.substring(0, str.length() - 5) + "07-01";
                s[1] = str;
                break;
            case 4:// 本年到现在经过了四个季度，在加上前一个季度
                quarterCalendar = Calendar.getInstance();
                str = dayFormat.format(quarterCalendar.getTime());
                s[0] = str.substring(0, str.length() - 5) + "10-01";
                s[1] = str.substring(0, str.length() - 5) + "12-31";
                break;
        }
        return s;
    }

    /****
     * 传入具体日期 ，返回具体日期增加2个月。
     * @param dt 日期(2017-04-13)
     * @return 2017-05-13
     * @throws ParseException
     */
    private static String subMonth(Date dt) {
        Calendar rightNow = Calendar.getInstance();
        rightNow.setTime(dt);
        rightNow.add(Calendar.MONTH, 2);
        Date dt1 = rightNow.getTime();
        String reStr = yyyyMMdd.format(dt1);
        return reStr;
    }

    /****
     * 传入具体日期 ，返回具体日期增加2个月。
     * @param dt 日期(2017-04-13)
     * @return 2017-05-13
     * @throws ParseException
     */
    public static String subMonth(Date dt, int num) {
        Calendar rightNow = Calendar.getInstance();
        rightNow.setTime(dt);
        rightNow.add(Calendar.MONTH, num);
        Date dt1 = rightNow.getTime();
        String reStr = yyyyMMdd.format(dt1);
        return reStr;
    }

    /**
     * 根据日期获取顺延N天日期列表
     * @param dt
     * @param n
     * @return
     */
    public static List<String> getDateList(Date dt,int n){
        List<String> dateList = new ArrayList<>();
        Calendar cal = Calendar.getInstance();
        cal.setTime(dt);
        for (int i=1;i<=n;i++){
            System.out.println(dayFormat.format(cal.getTime()));
            dateList.add(dayFormat.format(cal.getTime()));
            cal.add(Calendar.DAY_OF_MONTH, +1);
        }
        return dateList;
    }

    /**
     * 根据日期获取当前周数
     *
     * @author zhouszxfs@xinfushe.com
     * @date 2019-07-11 13:57
     * @param dt
     * @return int
     */
    public static int getWeekIntByDate(Date dt) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dt);
        return calendar.get(Calendar.WEEK_OF_YEAR);
    }

    /**
     * 获取上周的第一天与最后一天（带时间）
     *
     * @author zhouszxfs@xinfushe.com
     * @date 2019-07-15 10:31
     * @param
     * @return java.util.Map<java.lang.String,java.lang.String>
     */
    public static Map<String, String> getPreWeekDays() {
        Map<String, String> res = new HashMap<>();
        Calendar cl = Calendar.getInstance();
        cl.setTime(new Date());
        int firstDays = 1 - cl.get(Calendar.DAY_OF_WEEK); //距离本周第一天的天数
        cl.add(Calendar.DATE, firstDays - 1);
        res.put("lastDay", dayFormat.format(cl.getTime()) + " 23:59:59"); //上周最后一天日期
        cl.add(Calendar.DATE, -6);
        res.put("firstDay", dayFormat.format(cl.getTime()) + " 00:00:00"); //上周第一天日期
        return res;
    }

    /**
     * 获取本年度当前周之前的所有周，周数+每周第一天+每周最后一天
     *
     * @author zhouszxfs@xinfushe.com
     * @date 2019-07-11 09:27
     * @param
     * @return java.util.List<java.util.Map<java.lang.String,java.lang.String>>
     */
    public static List<Map<String, Object>> getYearWeekList() {
        List<Map<String, Object>> weekList = new ArrayList<>(); //key:周数，第一天，最后一天
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        int weekInt = calendar.get(Calendar.WEEK_OF_YEAR); //获取当前第几周
        int mondayDays = 1 - calendar.get(Calendar.DAY_OF_WEEK); //距离本周第一天的天数，用于获取上周第一天、最后一天日期
        calendar.add(Calendar.DATE, mondayDays - 7);
        Calendar monday = Calendar.getInstance(); //上周第一天日期
        monday.setTime(calendar.getTime());

        Calendar calendar1 = Calendar.getInstance();
        calendar1.add(Calendar.DATE, mondayDays - 1);
        Calendar sunday = Calendar.getInstance(); //上周最后一天日期
        sunday.setTime(calendar1.getTime());
        for (int i = 0; i < weekInt - 1; i ++) {
            Map<String, Object> days = new HashMap<>();
            monday.add(Calendar.DATE, i == 0 ? 0 : -7);
            sunday.add(Calendar.DATE, i == 0 ? 0 : -7);
            days.put("firstDay", dayFormat.format(monday.getTime())); //当前周第一天
            days.put("lastDay", dayFormat.format(sunday.getTime())); //当前周最后一天
            days.put("week", weekInt - i - 1); //第几周
            days.put("isPay", 1); //是否发放，0：已发放，1：未发放
            weekList.add(days);
        }
        return weekList;
    }

    /**
     * 获取本周的第一天与下周第一天
     *
     * @author zhouszxfs@xinfushe.com
     * @date 2019-07-15 13:41
     * @param num: 0 今天， -1 昨天， 1 明天
     * @return java.util.Map<java.lang.String,java.lang.String>
     */
    public static Map<String, String> getWeekDays(int num) {
        Map<String, String> res = new HashMap<>();
        Calendar cl = Calendar.getInstance();
        cl.setTime(new Date());
        cl.add(Calendar.DATE, num);
        int firstDays = 1 - cl.get(Calendar.DAY_OF_WEEK); //距离本周第一天的天数
        cl.add(Calendar.DATE, firstDays);
        res.put("firstDay", dayFormat.format(cl.getTime())); //本周第一天日期
        cl.add(Calendar.DATE, 7);
        res.put("lastDay", dayFormat.format(cl.getTime())); //下周第一天日期
        cl.add(Calendar.DATE, -1);
        res.put("period", dayFormat.format(cl.getTime())); //本周最后一天
        return res;
    }

    /**
     * 获取当前月的第一天与下月第一天
     *
     * @author zhouszxfs@xinfushe.com
     * @date 2019-07-15 13:53
     * @param num: 0 今天， -1 昨天， 1 明天
     * @return java.util.Map<java.lang.String,java.lang.String>
     */
    public static Map<String, String> getMonthDays(int num) {
        Map<String, String> res = new HashMap<>();
        Calendar cl = Calendar.getInstance();
        cl.setTime(new Date());
        cl.add(Calendar.DATE, num);
        cl.add(Calendar.MONTH, 0);
        cl.set(Calendar.DAY_OF_MONTH, 1);
        String firstDay = DateUtil.dayFormat.format(cl.getTime());
        res.put("firstDay", firstDay);
        cl = Calendar.getInstance();
        cl.add(Calendar.DATE, num);
        cl.add(Calendar.MONTH, 1);
        cl.set(Calendar.DAY_OF_MONTH, 1);
        String lastDay = DateUtil.dayFormat.format(cl.getTime());
        res.put("lastDay", lastDay);
        res.put("period", monthFormat.format(new Date()));
        return res;
    }

    public static Map<String, String> getMonthDays(int num,Date date) {
        Map<String, String> res = new HashMap<>();
        Calendar cl = Calendar.getInstance();
        cl.setTime(date);
        cl.add(Calendar.DATE, num);
        cl.add(Calendar.MONTH, 0);
        cl.set(Calendar.DAY_OF_MONTH, 1);
        String firstDay = DateUtil.dayFormat.format(cl.getTime());
        res.put("firstDay", firstDay);
        cl = Calendar.getInstance();
        cl.add(Calendar.DATE, num);
        cl.add(Calendar.MONTH, 1);
        cl.set(Calendar.DAY_OF_MONTH, 1);
        String lastDay = DateUtil.dayFormat.format(getBeforeNDate(cl.getTime(),1));
        res.put("lastDay", lastDay);
        res.put("period", monthFormat.format(new Date()));
        return res;
    }

    /**
     * 获取当前年
     * @param
     * @return
     */
    public static int getCurrentYear(){
        Calendar currCal=Calendar.getInstance();
        int currentYear = currCal.get(Calendar.YEAR);
        return currentYear;
    }

    /**
     * 获取某年第一天日期
     * @param year 年份
     * @return Date
     */
    public static Date getYearFirst(int year){
        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.set(Calendar.YEAR, year);
        Date currYearFirst = calendar.getTime();
        return currYearFirst;
    }

    /**
     * 获取某年最后一天日期
     * @param year 年份
     * @return Date
     */
    public static Date getYearLast(int year){
        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.set(Calendar.YEAR, year);
        calendar.roll(Calendar.DAY_OF_YEAR, -1);
        Date currYearLast = calendar.getTime();
        return currYearLast;
    }
}
