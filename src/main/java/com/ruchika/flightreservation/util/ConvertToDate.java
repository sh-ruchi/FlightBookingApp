package com.ruchika.flightreservation.util;

import java.sql.Time;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class ConvertToDate {

	public Date convertToDate(String date) throws ParseException {
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		Date convertedDate;
		convertedDate = sdf1.parse(date);
		return convertedDate;
	}
	
	public Timestamp convertToTime(String datetime) throws ParseException {
//		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		Timestamp convertedTime;
		DateFormat df = new SimpleDateFormat("HH:mm:ss");
		Date date= df.parse(datetime);
		System.out.println(date.getTime());
		return new Timestamp(date.getTime());
	
	}
	

}
