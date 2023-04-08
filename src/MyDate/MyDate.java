package MyDate;

public class MyDate {
	private int year;
	private int month;
	private int day;
	private static String[] MONTHS = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
	private static String[] DAYS = {"Sunday", "Monday", "Tuesday", "Wednesday","Thursday", "Friday", "Saturday"};
	private static int[] DAY_IN_MONTHS= {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static int[] numberOfDaysOfLeap = {0, 31, 60, 91, 121, 152, 182, 213, 244, 274, 305, 335};// lấy số ngày của tháng trước đó trong năm nhuận 
    private static int[] nonnumberOfDaysOfLeap = {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334};// lấy số ngày của tháng trước đó trong năm không nhuận
	
	public static boolean isLeapYear(int year)
	{
		return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
	}
	
	public static boolean isValidDate(int year, int month, int day)
	{
		return (1  <= year)
	            && (1 <= month  && month <= 12)
	            && (1 <= day    && day   <= 31); 
	}
	public static int getDayOfWeek(int year, int month, int day) {
		 if (! isValidDate(year, month, day)) {
            return -1;
        }
		 else {
			 
	        int centuryNumber = 6 - 2*((year / 100) % 4);
	        int lastTwoOfYear = year % 100;  // nhận 2 số cuối của năm
	       
	        int yearNumber = lastTwoOfYear / 4; // 
	        
	        int monthNumber = isLeapYear(year) ? numberOfDaysOfLeap[month-1] : nonnumberOfDaysOfLeap[month-1]; //Tra số ngày trong tháng
	        
	        int dayNumber = day;//Lấy ngày trong tháng.
	        
	        // trả về ngày tương ứng trong tuần
	        return (  centuryNumber + lastTwoOfYear 
	                + yearNumber    + monthNumber + dayNumber) % 7; 
	        } 
	}
	
	 public void setDate(int year, int month, int day)
	    {
        this.year  = year;
        this.month = month;
        this.day   = day;
	    }
	
	public MyDate(int year, int month, int day) {
		setDate( year, month,day);
	}
	

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}
	
	public static int getMonthLastDay(int year, int month) {
        return DAY_IN_MONTHS[month-1] + (isLeapYear(year) && month == 2 ? 1 : 0 );
    }

	@Override
	public String toString() {
		int weekDay = getDayOfWeek(year, month, day);
		return String.format("%1s %2d %3s %4d", DAYS[weekDay], day, MONTHS[month-1], year);
	}
	
	
	MyDate 	nextDay() {
		   int maxDay = getMonthLastDay(year, month);
	        if (maxDay == day && month == 12 ) {
	            return this;
	        }

	        if (maxDay == day && month == 12) {
	            setDate(year+1, 1, 1);
	            return this;
	        }

	        if (maxDay == day) {
	        	setDate(year, month+1, 1);
	            return this;
	        }
	        
	        setDate(year, month, day+1);
	        return this; 
	}
	
	public MyDate nextMonth()
    {
        if (month == 12 ) {
            return this;
        }

        int maxDay = (month == 12) ? getMonthLastDay(year+1, 1): getMonthLastDay(year, month+1);// toan tu 3 ngoi

        if (day == getMonthLastDay(year, month)) {
            maxDay = maxDay;
        }
        else if (day > maxDay) {
            maxDay = maxDay;
        }
        else if (day < maxDay) {
            maxDay = day;
        }

        if (1 == month) {
            setDate(year+1, 1, maxDay);
            return this;
        }

        setDate(year, month+1, maxDay);
        return this;
    }
	
	public MyDate nextYear()
    {

        int maxDay = getMonthLastDay(year+1, month);

        if (day == getMonthLastDay(year, month)) {
            maxDay = maxDay;
        }
        else if (day > maxDay) {
            maxDay = maxDay;
        }
        else if (day < maxDay) {
            maxDay = day;
        }

        setDate(year+1, month, maxDay);
        return this;
    }
	
	public MyDate previousDay()
    {
        if (day == 1 && month == 1 && year == 1) {
            return this;
        }

        if (day == 1 && month == 1) {
            setDate(year-1 , 12, getMonthLastDay(year-1, 12));
            return this;
        }

        if (day == 1) {
            setDate(year, month-1, getMonthLastDay(year, month-1));
            return this;
        }
        
        setDate(year, month, --day);
        return this;
    }
	
	 public MyDate previousMonth()
	    {
	        if (month == 1 && year == 1) {
	            return this;
	        }

	        int maxDay = (month == 1)
	                ?   getMonthLastDay(year-1, 12)
	                :   getMonthLastDay(year, month-1);

	        if (day == getMonthLastDay(year, month)) {
	            maxDay = maxDay;
	        }
	        else if (day > maxDay) {
	            maxDay = maxDay;
	        }
	        else if (day < maxDay) {
	            maxDay = day;
	        }

	        if (month == 1) {
	            setDate(year-1, 12, maxDay);
	            return this;
	        }

	        setDate(year, month-1, maxDay);
	        return this;
	    }
	 
	 public MyDate previousYear()
	    {
	        if (year == 1) {
	            return this;
	        }

	        int maxDay = getMonthLastDay(year-1, month);

	        if (day == getMonthLastDay(year, month)) {
	            maxDay = maxDay;
	        }
	        else if (day > maxDay) {
	            maxDay = maxDay;
	        }
	        else if (day < maxDay) {
	            maxDay = day;
	        }

	        setDate(year-1, month, maxDay);
	        return this;
	    }

}
