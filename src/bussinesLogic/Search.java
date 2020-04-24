package bussinesLogic;
import java.time.*;
import java.util.*;

import data.Book;

public class Search {
	
	private ArrayList<String> keywords;
	private String wholeSearch;
	private ArrayList<Book> genre;
	
	public Search(ArrayList<String> keywords, String wholeSearch, ArrayList<Book> genre) {
		super();
		this.keywords = keywords;
		this.wholeSearch = wholeSearch;
		this.genre = genre;
	}
	
	public String setKeywords(String s) {
		return s;
	}
	
	public LocalDate returnTime(LocalDate d) {
		return d;
	}
	
	public ArrayList<String> getKeywords() {
		return keywords;
	}
	public void setKeywords(ArrayList<String> keywords) {
		this.keywords = keywords;
	}
	
	public String getWholeSearch() {
		return wholeSearch;
	}
	public void setWholeSearch(String wholeSearch) {
		this.wholeSearch = wholeSearch;
	}
	
	public ArrayList<Book> getGenre() {
		return genre;
	}
	public void setGenre(ArrayList<Book> genre) {
		this.genre = genre;
	}

}
