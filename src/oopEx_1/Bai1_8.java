package oopEx_1;

public class Bai1_8 {
int hour;
int minute;
int second;
public Bai1_8(int hour, int minute, int second)
{
	if(hour>=0&&hour<=23)
	{
		this.hour = hour;

	}
	else
	{
		this.hour = 00;

	}
	if(minute>=0&&minute<=59)
	{
		this.minute = minute;

	}
	else
	{
		this.minute = 00;

	}
	if(second>=0&&second<=59)
	{
		this.second = second;

	}
	else
	{
		this.second = 00;

	}
}
@Override
public String toString() {
    return String.format("%02d:%02d:%02d", hour, minute, second);
}
public int getHour() {
	return hour;
}
public void setHour(int hour) {
	if(hour>=0&&hour<=23)
	this.hour = hour;
}
public int getMinute() {
	return minute;
}
public void setMinute(int minute) {
	if(minute>=0&&minute<=59)
	this.minute = minute;
}
public int getSecond() {
	return second;
}
public void setSecond(int second) {
	if(minute>=0&&minute<=59)
	this.second = second;
}
public void setTime(int hour, int minute, int second)
{
	if(hour>=0&&hour<=23)
	{
		this.hour = hour;

	}
	else
	{
		this.hour = 00;

	}
	if(minute>=0&&minute<=59)
	{
		this.minute = minute;

	}
	else
	{
		this.minute = 00;

	}
	if(second>=0&&second<=59)
	{
		this.second = second;

	}
	else
	{
		this.second = 00;

	}
}
public Bai1_8 nextSecond(){
	second++;
	if(second==60){
		second=0;
		minute ++;
	if(minute==60) {
		minute = 0;
		hour ++;
	if(hour==24) {
		hour =0;
	}
	}
	}
//	return hour+":"+minute+":"+second;
    return new Bai1_8(hour, minute, second);
}
public Bai1_8 previousSecond()
{
	second--;
	if(second<0) {
		second=59;
		minute--;
		if(minute<0) {
			minute=59;
			hour--;
			if(hour<1) {
				hour=23;
			}
		}
	}
	// chưa cập nhật biến mới
	return  new Bai1_8( hour,  minute,  second);
}
public static void main(String[] args) {
	Bai1_8 t1 = new Bai1_8(1,2,3);
    System.out.println(t1);  // toString()
    t1.setHour(4);
    t1.setMinute(5);
    t1.setSecond(6);
    System.out.println(t1);  // toString()
    System.out.println("Hour: " + t1.getHour());
    System.out.println("Minute: " + t1.getMinute());
    System.out.println("Second: " + t1.getSecond());

    // Test setTime()
    t1.setTime(23, 59, 58);
    System.out.println(t1);  // toString()
	
    System.out.println(t1.nextSecond());
    // sai
    System.out.println(t1.nextSecond().nextSecond());

    System.out.println(t1.previousSecond());
    System.out.println(t1.previousSecond().previousSecond());
}
}
