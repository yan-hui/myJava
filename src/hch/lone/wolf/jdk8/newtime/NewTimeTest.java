package hch.lone.wolf.jdk8.newtime;

import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @Description jdk8新的日期时间API
 * @Author hechunhui
 * @CreatedBy 2018/11/1 15:19
 */
public class NewTimeTest {
	@Test
	public void localDateTimeTest(){
		LocalDateTime time = LocalDateTime.now();
		System.out.println("time: "+time);
		LocalDate localDate = time.toLocalDate();
		System.out.println("LocalDate: "+localDate);
		LocalTime localTime = time.toLocalTime();
		System.out.println("localTime: "+localTime);


		int year = time.getYear();
		int monthValue = time.getMonthValue();
		Month month = time.getMonth();
		int dayOfYear = time.getDayOfYear();
		int dayOfMonth = time.getDayOfMonth();
		DayOfWeek dayOfWeek = time.getDayOfWeek();
		int hour = time.getHour();
		int minute = time.getMinute();
		int second = time.getSecond();
		System.out.println("year: "+year);
		System.out.println("monthValue: "+monthValue);
		//获取一个枚举DayOfWeek，如 NOVEMBER
		System.out.println("month: "+month);
		System.out.println("dayOfYear: "+dayOfYear);
		System.out.println("dayOfMonth: "+dayOfMonth);
		//THURSDAY
		System.out.println("dayOfWeek: "+dayOfWeek);
		System.out.println("hour: "+hour);
		System.out.println("minute: "+minute);
		System.out.println("second: "+second);



	}

	@Test
	public void localDateTimeTest2(){
		LocalDateTime time = LocalDateTime.now();
		LocalDateTime oftime = LocalDateTime.of(2010, 10, 02, 10, 10);
		System.out.println("ofTime: "+oftime);
		//将当前时间转成字符串类型
		DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String timeStr = time.format(pattern);
		System.out.println("timeStr: "+timeStr);
		LocalDateTime parseTime = LocalDateTime.parse("2018-10-31 10:10:10", pattern);
		System.out.println("parseTime: "+parseTime);
		//设置时区
		ZoneOffset zone = ZoneOffset.of("+8");
		Instant instant = time.toInstant(zone);
		long timeLone = instant.toEpochMilli();
		System.out.println("timeLone: "+timeLone);
		Date date = new Date(timeLone);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println("date: "+sdf.format(date));
	}
	@Test
	public void betweenTime(){
		LocalDateTime time1 = LocalDateTime.now();
		DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		LocalDateTime time2 = LocalDateTime.parse("2017-01-04 10:10:10", pattern);
		//相差几天几小时几分
		Duration duration = Duration.between(time2, time1);
		long days = duration.toDays();
		long hours = duration.toHours();
		long minutes = duration.toMinutes();
		System.out.println("days: "+days);
		System.out.println("hours: "+hours);
		System.out.println("minutes: "+minutes);
		//相差几年几月几天
		Period period = Period.between(time2.toLocalDate(), time1.toLocalDate());
		int years = period.getYears();
		int days1 = period.getDays();
		int months = period.getMonths();
		System.out.println("years: "+years);
		System.out.println("months: "+months);
		System.out.println("days1: "+days1);
	}
	@Test
	public void localDateTimeTest3(){
		DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		LocalDateTime time = LocalDateTime.now();
		time.atZone(ZoneId.systemDefault());
		//更改相对应的年月日时分秒
		LocalDateTime withYear = time.withYear(3);
		LocalDateTime withMonth = time.withMonth(3);
		LocalDateTime withDayOfYear = time.withDayOfYear(3);
		LocalDateTime withDayOfMonth = time.withDayOfMonth(3);
		LocalDateTime withHour = time.withHour(3);
		LocalDateTime withMinute = time.withMinute(3);
		LocalDateTime withSecond = time.withSecond(20);
		System.out.println("withYear: "+withYear.format(pattern));
		System.out.println("withMonth: "+withMonth.format(pattern));
		System.out.println("withDayOfYear: "+withDayOfYear.format(pattern));
		System.out.println("withDayOfMonth: "+withDayOfMonth.format(pattern));
		System.out.println("withHour: "+withHour.format(pattern));
		System.out.println("withMinute: "+withMinute.format(pattern));
		System.out.println("withSecond: "+withSecond.format(pattern));
	}
	@Test
	public void localDateTimeTest4(){
		DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

		LocalDateTime dateTime = LocalDateTime.now();
		LocalDateTime dateTime2 = LocalDateTime.now();
		System.out.println("equals: "+dateTime.equals(dateTime2));
		LocalDateTime plusYears = dateTime.plusYears(3);
		LocalDateTime plusMonths = dateTime.plusMonths(3);
		LocalDateTime plusDays = dateTime.plusDays(3);
		LocalDateTime plusHours = dateTime.plusHours(3);
		LocalDateTime plusMinutes = dateTime.plusMinutes(3);
		LocalDateTime plusSeconds = dateTime.plusSeconds(30);
		LocalDateTime plusWeeks = dateTime.plusWeeks(3);
		//添加指定时间
		System.out.println("now: "+dateTime.format(pattern));
		System.out.println("plusYears: "+plusYears.format(pattern));
		System.out.println("plusMonths: "+plusMonths.format(pattern));
		System.out.println("plusDays: "+plusDays.format(pattern));
		System.out.println("plusHours: "+plusHours.format(pattern));
		System.out.println("plusMinutes: "+plusMinutes.format(pattern));
		System.out.println("plusSeconds: "+plusSeconds.format(pattern));
		System.out.println("plusWeeks: "+plusWeeks.format(pattern));
		System.out.println("-----------------------------------------");
		//减去相应时间
		LocalDateTime minusYears = dateTime.minusYears(3);
		LocalDateTime minusWeeks = dateTime.minusWeeks(3);
		LocalDateTime minusMonths = dateTime.minusMonths(3);
		LocalDateTime minusDays = dateTime.minusDays(3);
		LocalDateTime minusHours = dateTime.minusHours(3);
		LocalDateTime minusMinutes = dateTime.minusMinutes(3);
		LocalDateTime minusSeconds = dateTime.minusSeconds(30);
		System.out.println("now: "+dateTime.format(pattern));
		System.out.println("minusYears: "+minusYears.format(pattern));
		System.out.println("minusWeeks: "+minusWeeks.format(pattern));
		System.out.println("minusMonths: "+minusMonths.format(pattern));
		System.out.println("minusDays: "+minusDays.format(pattern));
		System.out.println("minusHours: "+minusHours.format(pattern));
		System.out.println("minusMinutes: "+minusMinutes.format(pattern));
		System.out.println("minusSeconds: "+minusSeconds.format(pattern));
	}
}
