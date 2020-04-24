package data;
import java.time.*;

public class User {
	
	private LocalDate date;
	private String search;
	
	public User(LocalDate date, String search) {
		super();
		this.date = date;
		this.search = search;
	}
	
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	public String getSearch() {
		return search;
	}
	public void setSearch(String search) {
		this.search = search;
	}

}
