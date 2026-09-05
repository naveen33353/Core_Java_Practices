package com.oops;

public class ArrayOfObjects {
public static void main(String[] args) {
//	Car car1 = new Car("Mustang","Yellow");
//	Car car2 = new Car("porshe","red");
//	Car car3 = new Car("Toyota","Black");
//	
//	Car[] cars = {car1, car2, car3};
//	
//	for(int i = 0; i< cars.length; i++) {
//		cars[i].drive();
//	}
	
//	Anonymous Objects : Consrut=cting objects without giving an identifier
	
	Car[] cars = {new Car("Mustang","Yellow"),
			new Car("porshe","red"),
			new Car("Toyota","Black")};
	
	for(Car car : cars) {
		car.color= "Blue";
	}
	
	for(Car car : cars) {
		car.drive();
	}
	
	
}
}
