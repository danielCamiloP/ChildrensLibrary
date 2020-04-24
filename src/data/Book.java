package data;

import java.awt.image.BufferedImage;

public class Book {
	
	private String name;
	private int code;
	private String formatID;
	private int newID;
	private String genre;
	private String direction;
	private BufferedImage picture;
	
	public Book(String name, int code, String formatID, int newID, String genre, String direction,
			BufferedImage picture) {
		super();
		this.name = name;
		this.code = code;
		this.formatID = formatID;
		this.newID = newID;
		this.genre = genre;
		this.direction = direction;
		this.picture = picture;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	
	public String getFormatID() {
		return formatID;
	}
	public void setFormatID(String formatID) {
		this.formatID = formatID;
	}
	
	public int getNewID() {
		return newID;
	}
	public void setNewID(int newID) {
		this.newID = newID;
	}
	
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public String getDirection() {
		return direction;
	}
	public void setDirection(String direction) {
		this.direction = direction;
	}
	
	public BufferedImage getPicture() {
		return picture;
	}
	public void setPicture(BufferedImage picture) {
		this.picture = picture;
	}

}
