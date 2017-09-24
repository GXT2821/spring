package com.sut.gt.Dao;

import java.util.Calendar;

public class IDaoImp implements IDao {

	@Override
	public String sayHello(String name) {
		
		int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
		
		if(hour < 6) return "凌晨早，" + name;
		else if(hour < 12) return "早上好，" + name;
		else if(hour < 13) return "中午好，" + name;
		else if(hour < 18) return "下午好，" + name;
		return "晚上好，" + name;
	}

}
