package oopEx2_5;

public class Customer {
	private int id;
	private String name;
	private char gender;
public Customer(int id,String name, int discount) {
	this.id=id;
	this.name=name;
	if(gender=='m'||gender=='f') {
		this.gender=gender;
	}else {
		throw new RuntimeException("gender must m of f");
	}
}
public int getId() {
	return id;
}
public String getName() {
	return name;
}
public char getGender() {
	return gender;
}
@Override
public String toString() {
	return name+"("+id+")";
}

}