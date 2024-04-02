package bt1_;

public class Person {
String name;
int age;
String adress;
public Person(String name, int age, String adress)
{
	this.adress= adress;
	this.name = name;
	if(age>0)
	{
		this.age=age;
	}
	else
	{
		this.age = 1;
	}
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	if(age>0)
	this.age = age;
}
public String getAdress() {
	return adress;
}
public void setAdress(String adress) {
	this.adress = adress;
}


}
