package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;

import basic.Car;

public class BiPredicateExample {
	public static void main(String[] args) {
		List<Car> cars = Arrays.asList(
				new Car("Aston_Martin", 3.5),
				new Car("Mercedes", 2.75),
				new Car("Ferrari", 5.7));
		
		BiPredicate<String, Double> bi = (car, price) -> {
			return (car.startsWith("A") || price > 3.0);
		};
		
		List<Car> resultPredFirst = filteredCar(cars, bi);
		System.out.println("First " + resultPredFirst);
		
		List<Car> resultPredSecond = filteredCar(cars, (car, price) -> price > 5.0);
		System.out.println("Second " + resultPredSecond);
		
		List<Car> resultPredThird = filteredCar(cars, (car, price) -> !car.startsWith("Z") && price > 2.0);
		resultPredThird
		.forEach((car) -> {
			if(car!=null)
				System.out.println("Third " + car.getName() + " " + car.getPrice()); 
			});
		
	}
	
	public static <T extends Car> List<T> filteredCar(List<T> list, BiPredicate<String, Double> bi){
		return list
				.stream()
				.filter(aux -> bi.test(aux.getName(), aux.getPrice()))
				.collect(Collectors.toList());
	}
	
}
