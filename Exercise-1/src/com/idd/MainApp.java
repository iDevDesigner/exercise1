package com.idd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
//import java.util.stream.Stream;

public class MainApp {

	public static void main(String[] args) {

//		Defining Collection

		List<Product> prodList = new ArrayList<Product>();

//		Adding Items to the Collection

		prodList.add(new Product(1, "Nike", "This is the best sport shoes brand in the world", 999.99));
		prodList.add(new Product(2, "Adidas", "Adidas is popular for its unique designs and quality", 999.99));
		prodList.add(new Product(3, "Terra", "Terra is one of the fastest growing brand in India", 699.99));
		prodList.add(new Product(4, "Teva", "Good Product For Price", 499.99));
		prodList.add(new Product(5, "Clarks",
				"Clarks brand is a British based shoe manufacturer & founded in year 1825", 899.99));
		prodList.add(new Product(6, "Fila", "Top Quality sportswear and accessories", 999.99));
		prodList.add(new Product(7, "Territory Boots",
				"Lee Cooper is widely popular for its exquisite range of apparels, accessories, and Shoes", 799.99));
		prodList.add(new Product(8, "Woodland", "Woodland makes rough and tough shoes, boots", 999.99));
		prodList.add(new Product(9, "Tentree", "Good Quality", 399.99));
		prodList.add(new Product(10, "Puma", "Puma is a globally famous Shoes and apparel brand", 999.99));
		prodList.add(new Product(11, "Ted Baker", "Best You can Have!", 299.99));
		prodList.add(new Product(12, "Reebok",
				"Established in 1895 in England, Reebok is one of the major admired brands", 899.99));

//		 Printing All the Products Available

		System.out.println("All Products Available: ");
		System.out.println("==============================");
		prodList.forEach(prods -> System.out.println(prods));

//		Filter Items by Brand Name Starts with "T" using Stream and Lambda Function and Printing Out

		System.out.println();
		System.out.println();
		System.out.println("Products Brand Name Starts with T: ");
		System.out.println("=====================================");
//		prodList.stream().filter(prod -> prod.brand.startsWith("T")).forEach(System.out::println);
		List<Product> srtProd = prodList.stream().filter(prod -> prod.brand.startsWith("T"))
				.collect(Collectors.toCollection(ArrayList::new));

		for (Product pd : srtProd) {
			System.out.println(pd.toString());
		}

//		 Sorted By Highest Price (Descending Order)

		System.out.println();
		System.out.println();
		System.out.println("Sorted in Descending Order of Price: ");
		System.out.println("==============================");

//		 Using Comparator and Collections Class to Sort
		Comparator<Product> cmp = Comparator.comparing(Product::getPrice);
		Collections.sort(srtProd, cmp.reversed());
		for (Product p : srtProd) {
			System.out.println(p.toString());
		}

	}

}
