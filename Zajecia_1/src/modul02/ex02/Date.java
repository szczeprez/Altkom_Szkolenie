package modul02.ex02;

public class Date {
	int year;
	int day;
	int month;

	public Date() {
		this.year = 2016;
		this.day = 20;
		this.month = 5;
	}

	public Date(int year, int day, int month) {
		super();
		this.year = year;
		this.day = day;
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

 	@Override
 	public String toString(){
		return  year + "/" + day + "/" + month ;
	}
 
 	@Override
 	public boolean equals(Object arg0) {
 		// TODO Auto-generated method stub
 		return super.equals(arg0);
 	}
 	
 	@Override
 	public int hashCode() {
 		// TODO Auto-generated method stub
 		return super.hashCode();
 	}
	
}
