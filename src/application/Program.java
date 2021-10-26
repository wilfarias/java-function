package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

		// Implementação da interface
		/*
		 * A função map aplica a função UpperCaseName para cada elemento da lista,
		 * gerando uma nova lista que foi convertida para stream, dado que a função map
		 * somente funciona com stream
		 * 
		 * A função Collector converte novamente o stream para lista
		 */
		// List <String> names = list.stream().map(new
		// UpperCaseName()).collect(Collectors.toList());

		// Reference method com método estático
		// List <String> names =
		// list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());

		// Expressão lambda declarada
		//Function<Product, String> func = p -> p.getName().toUpperCase();
		//List<String> names = list.stream().map(func).collect(Collectors.toList());

		// Expressão lambda inline
		List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());

		names.forEach(System.out::println); // reference method

	}
}