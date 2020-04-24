package bussinesLogic;

import java.awt.EventQueue;
import java.util.TreeMap;
import java.util.TreeSet;

import data.Book;
import ui.UI;

public class Core {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UI window = new UI(new TreeMap<String,String>(), new TreeSet<Book>());
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}

}
