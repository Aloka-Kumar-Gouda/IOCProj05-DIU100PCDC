package com.AK.SBeans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wda")
public class WeekDayAnalyzer {
	
	private LocalDate date;
	
	public WeekDayAnalyzer() {
		IO.println("WeekDayAnalyzer:: 0-param constructor !");
	}
	
	@Autowired
	public void setDate(LocalDate date) {
		IO.println("WeekDayAnalyzer.setDate()");
		this.date = date;
	}
	
	// business method
	public String showMessage(String user) {
		// get weekday number
		int wno = date.getDayOfWeek().getValue();
		String msg;
		
		// business logic
		if(wno>=1 && wno<=5)
			msg = "Happy Working Day:: ";
		else 
			msg = "Happy WeekEnd:: ";
		
		// final message
		return msg + user;
	}
}
