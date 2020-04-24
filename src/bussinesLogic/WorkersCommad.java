package bussinesLogic;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeMap;

import javax.imageio.ImageIO;
import javax.imageio.stream.ImageInputStream;

import data.Book;

public class WorkersCommad {

	TreeMap<String, String> validWorkers = new TreeMap<String, String>();
	Scanner in = new Scanner(System.in);
	
	public boolean login() {
	
		boolean validWorker = false;
		String id = "";
		String password = "";
		System.out.println("Write your worker id: ");
		id = in.nextLine();
		System.out.println("Write your password: ");
		password = in.nextLine();
			if (validWorkers.get(id).equals(password)) validWorker = true;
			else validWorker = login(); 
		return validWorker;
		
	}
	
	public Book addBook (String s) {
		
		Book bookx = null;
		try {
			Scanner reader = new Scanner(new File("infoBooks.txt"));
			while(reader.hasNextLine()) {
				String x = reader.nextLine();
				bookx = infoBook(x);
			}
			reader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return bookx;
		
	}
	
	public Book infoBook(String x) {
		
		Scanner aux = new Scanner(x);
		aux.useDelimiter(", ");
		// inicializamos variables
		String name = "";
		int code;
		String formatID = "";
		int newID;
		String genre = "";
		String direction = "";
		BufferedImage picture = null;
		// nombre del libro
		String temp = aux.next();
		name = temp;
		// code del libro
		temp = aux.next();
		code = Integer.parseInt(temp);
		// formatID del libro
		temp = aux.next();
		formatID = temp;
		// newID del libro
		temp = aux.next();
		newID = Integer.parseInt(temp);
		// genero del libro
		temp = aux.next();
		genre = temp;
		// direcciones del libro
		temp = aux.next();
		direction = temp;
		Book b = new Book(name, code, formatID, newID, genre, direction, picture);
		aux.close();
		return b;
		
	}

	public Book addPicture (Book book, String photoName, String directory) throws Exception {
		BufferedImage photo = ImageIO.read((ImageInputStream) new File(directory + "\"" + photoName + ".png"));
		book.setPicture(photo);
		return book;
	}
	
	
	public String addDirections (String s) {
		return s;
	}
	
}