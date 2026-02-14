package com.AK.Main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.AK.Config.AppConfig;
import com.AK.SBeans.WeekDayAnalyzer;

public class DI_UsingPureCodeDrivenCfgs {

	public static void main(String[] args) {
		// create  IOC container
		try
		{
			AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
			
			// get target spring bean class obj ref
			WeekDayAnalyzer analyzer = ctx.getBean("wda", WeekDayAnalyzer.class);
			
			// invoke the business method
			String result = analyzer.showMessage("Mrinalini");
			IO.println("Result:: " + result + ".");
			
			ctx.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
