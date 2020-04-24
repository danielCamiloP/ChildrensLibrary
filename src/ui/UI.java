package ui;

import javax.swing.JFrame;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;

import bussinesLogic.Search;
import data.Book;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.util.TreeMap;
import java.util.TreeSet;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import java.awt.GridLayout;
import java.awt.CardLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class UI extends JFrame{

	private static final long serialVersionUID = -6789065573941301335L;
	
	private JPanel mainPanel;
	private JPanel workersPanel;
	private JPanel childrensPanel;

	private JLabel lblWelcomeLabel;
	
	private JButton btnIncomeWorkers;
	private JButton btnIncomeChildrens;
	private JButton btnNewButton;
	
	public UI(TreeMap<String, String> vldWrkrs, TreeSet<Book> books) {
		setupMainPanel();
		this.setBounds(0, 0, 500, 500);
		this.setTitle("ChildrensLibrary");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public void startComponents() {
		setupMainPanel();
		//setupChildrensPanel();
		//setupWorkersPanel();
	}
	
	public void setupMainPanel() {
		
		mainPanel = new JPanel();
		mainPanel.setBackground(new Color(236, 240, 241));
		mainPanel.setLayout(new BorderLayout(0, 0));
		
		getContentPane().add(mainPanel);
		
		JPanel panelUp = new JPanel();
		mainPanel.add(panelUp, BorderLayout.NORTH);
		panelUp.setBackground(new Color(133, 193, 233));
		panelUp.setLayout(new BorderLayout(0, 0));
		
		lblWelcomeLabel = new JLabel("Bienvenido a la biblioteca infantil");
		lblWelcomeLabel.setBackground(new Color(174, 214, 241));
		lblWelcomeLabel.setFont(new Font("Lucida Handwriting", Font.BOLD, 40));
		lblWelcomeLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panelUp.add(lblWelcomeLabel, BorderLayout.NORTH);
		
		JPanel panelCenter = new JPanel();
		mainPanel.add(panelCenter, BorderLayout.CENTER);
		panelCenter.setBackground(new Color(133, 193, 233));
		GridBagLayout gbl_panelCenter = new GridBagLayout();
		gbl_panelCenter.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panelCenter.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panelCenter.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panelCenter.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		panelCenter.setLayout(gbl_panelCenter);
		
		btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.fill = GridBagConstraints.BOTH;
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 5;
		gbc_btnNewButton.gridy = 4;
		panelCenter.add(btnNewButton, gbc_btnNewButton);
		
		JPanel panelDown = new JPanel();
		mainPanel.add(panelDown, BorderLayout.SOUTH);
		panelDown.setBackground(new Color(133, 193, 233));
		
		btnIncomeWorkers = new JButton("Ingreso para trabajadores");
		panelDown.add(btnIncomeWorkers);
		
	}

	public void setupChildrensPanel() {
		
		childrensPanel = new JPanel();
		
		
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 255, 255));
		panel.setBounds(96, 173, 539, 294);
		mainPanel.add(panel);
		panel.setLayout(null);
		
		JTextField txtPorFavorIngresa = new JTextField();
		txtPorFavorIngresa.setColumns(40);
		txtPorFavorIngresa.setText("Por favor ingresa aqu\u00ED el nombre o alguna palabra clave del libro que deseas buscar");
		txtPorFavorIngresa.setBounds(10, 35, 519, 20);
		txtPorFavorIngresa.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(txtPorFavorIngresa);
		
		JCheckBox chckbxAventura = new JCheckBox("Aventura");
		chckbxAventura.setBounds(69, 92, 97, 23);
		panel.add(chckbxAventura);
		
		JCheckBox chckbxAccin = new JCheckBox("Acci\u00F3n");
		chckbxAccin.setBounds(69, 142, 97, 23);
		panel.add(chckbxAccin);
		
		JCheckBox chckbxCuento = new JCheckBox("Cuento");
		chckbxCuento.setBounds(69, 192, 97, 23);
		panel.add(chckbxCuento);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Disney");
		chckbxNewCheckBox.setBounds(330, 92, 97, 23);
		panel.add(chckbxNewCheckBox);
		
		JCheckBox chckbxMitosYLeyendas = new JCheckBox("Mitos y leyendas");
		chckbxMitosYLeyendas.setBounds(330, 142, 110, 23);
		panel.add(chckbxMitosYLeyendas);
		
		JCheckBox chckbxFbula = new JCheckBox("F\u00E1bula");
		chckbxFbula.setBounds(330, 192, 97, 23);
		panel.add(chckbxFbula);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Search search = null;
				mainPanel.removeAll();
				remove(mainPanel);
			}
		});
		btnBuscar.setForeground(new Color(199, 21, 133));
		btnBuscar.setFont(new Font("Cooper Black", Font.PLAIN, 13));
		btnBuscar.setBounds(199, 142, 89, 23);
		panel.add(btnBuscar);
		
		mainPanel.setForeground(Color.GREEN);
		mainPanel.setBounds(100, 100, 754, 556);
		getContentPane().add(mainPanel);
	}

	protected void setupWorkersPanel() {
		workersPanel = new JPanel();
		
		workersPanel.setLayout(null);
		
		
		
		workersPanel.setForeground(Color.GREEN);
		workersPanel.setBounds(100, 100, 754, 556);
		getContentPane().add(workersPanel);
	}
}
