package application;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {

		Scanner inputTitle = new Scanner(System.in);
		System.out.println("Enter Title:");
		String  title = inputTitle.next();
		
		Scanner inputISBN = new Scanner(System.in);
		System.out.println("Enter ISBN:");
		String  isbn = inputISBN.next();
		
		Scanner inputPublisher = new Scanner(System.in);
		System.out.println("Enter Publisher:");
		String  publisher = inputPublisher.next();
		
		Scanner inputPrice = new Scanner(System.in);
		System.out.println("Enter Price:");
		double  price = inputPrice.nextDouble();
		
		Scanner inputYear = new Scanner(System.in);
		System.out.println("Enter Year:");
		int  year = inputYear.nextInt();
		
		Scanner inputGenre = new Scanner(System.in);
		System.out.println("Select Genre: Input 1 for Science Book or Input 2 for Children Book");
		int  genre = inputGenre.nextInt();
		
		if(genre == 1)
		{
			ScienceBook newScienceBook = new ScienceBook(title, isbn, publisher, price, year);
			newScienceBook.setTitle(title);
			newScienceBook.setISBN(isbn);
			newScienceBook.setPublisher(publisher);
			newScienceBook.setPrice(price);
			newScienceBook.setYear(year);

			System.out.println("Book Details:" + newScienceBook.toString());

		}
		else if (genre == 2)
		{
			ScienceBook newChildrenBook = new ScienceBook(title, isbn, publisher, price, year);
			newChildrenBook.setTitle(title);
			newChildrenBook.setISBN(isbn);
			newChildrenBook.setPublisher(publisher);
			newChildrenBook.setPrice(price);
			newChildrenBook.setYear(year);

			System.out.println("Book Details:" + newChildrenBook.toString());
		} else
		{
			System.out.println("Incorrect Genre ID");
		}

	}

}
