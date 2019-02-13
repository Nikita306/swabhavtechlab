package com.techlab.dip.violation;

public class TaxCalculator {
	private LogType logType;
	

	public TaxCalculator(LogType logtype) {
		this.logType = logtype;
	}

	public LogType getLogType() {
		return logType;
	}

	public void setLogType(LogType logType) {
		this.logType = logType;
	}

	public int calculate(int salary, int hours) {
		
		int newSalary=-1;
		try {
			 newSalary = salary / hours;
		} catch (Exception ex) {
			DBLogger dbloger = new DBLogger();
			FileLoger fileloger = new FileLoger();
			ex.getMessage();
			if (getLogType() == LogType.DB) {
				dbloger.log();
			} else {
				fileloger.log();
			}
		}
		return newSalary;

	}

}
