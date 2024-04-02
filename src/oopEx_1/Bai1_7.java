package oopEx_1;

public class Bai1_7 {
int day;
int month;
int year;
public Bai1_7(int day, int month, int year) 
{
	if(day>=1&&day<=31)
	{
		this.day=day;
	}
	else 
	{
		this.day=0;
	}
	if(month>=1&&month<=12)
	{
		this.month=month;
	}
	else
	{
		this.month=0;
	}
	if(year>=0)
	{
		this.year=year;
	}
	else
	{
		this.year=0;
	}
}

public int getDay() {
	return day;
}
// thay đổi
public void setDay(int day) {
	if(day>=1&&day<=31)
	this.day = day;
	
}

public int getMonth() {
	return month;
}

public void setMonth(int month) {
	if(month>=1&&month<=12)
	this.month = month;
}

public int getYear() {
	
	return year;
}

public void setYear(int year) {
	if(year>=0)
	this.year = year;
}
public void setDate(int day, int month, int year)
{
	if(day>=1&&day<=31)
	{
		this.day=day;
	}
	else 
	{
		this.day=0;
	}
	if(month>=1&&month<=12)
	{
		this.month=month;
	}
	else
	{
		this.month=0;
	}
	if(year>=0)
	{
		this.year=year;
	}
	else
	{
		this.year=0;
	}
}
@Override
public String toString() {
	return  day + "/" + month + "/" + year;
}
public static void main(String[] args) {
	 Bai1_7 d1 = new Bai1_7(1, 2, 2014);
	 System.out.println(d1);  

   
     d1.setMonth(12);
     d1.setDay(9);
     d1.setYear(2099);
     System.out.println(d1);  
     System.out.println("Month: " + d1.getMonth());
     System.out.println("Day: " + d1.getDay());
     System.out.println("Year: " + d1.getYear());

     
     d1.setDate(3, 4, 2016);
     System.out.println(d1);  
}
}
