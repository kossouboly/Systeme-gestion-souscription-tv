package com.tedjigroup.principal;

import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class MainScreen extends JFrame {
	
	
	// panel1: enregistrement de l'utilisateur
	
	
	JPanel subscriberPanel;
	JTextField subName;
	JTextField subLastName;
	JTextField subMobile;
	JTextField subCity ;
	
	JLabel nameLBL;
	JLabel lastLBL;
	JLabel mobileLBL;
	JLabel cityLBL;
	
	
	
	
	

	public MainScreen() {
		
		
		subscriberPanel = new JPanel();	
		Border panel1Title = BorderFactory.createTitledBorder("Details du souscripteur");	
		subscriberPanel.setBorder(panel1Title);
		subscriberPanel.setBounds(15,15,300,200);
		
		subscriberPanel.setLayout(new GridLayout(4,2));
		
		//JLabel
		
		nameLBL = new JLabel("Prenoms: ");
		nameLBL = new JLabel("Noms: ");
		mobileLBL = new JLabel("Telephone: ");
		cityLBL = new JLabel("Ville: ");
		
		
		//TextFields
		
		subName=new JTextField();
		subLastName = new JTextField();
		subMobile = new JTextField();
		subCity = new JTextField();

		
		
		// ajouter les composants au panel1
		
		
		subscriberPanel.add(nameLBL);
		subscriberPanel.add(subName);
		subscriberPanel.add(lastLBL);
		subscriberPanel.add(subLastName);
		subscriberPanel.add(mobileLBL);
		subscriberPanel.add(subMobile);
		subscriberPanel.add(cityLBL);
		subscriberPanel.add(subCity);
		
		// Ajouter le panel1 al fenetre JFrame
		
		setLayout(null);
		add(subscriberPanel);
	}

	public static void main(String[] args) {
		
		
		MainScreen mainScreen = new MainScreen();
		mainScreen.setBounds(100,100,1000,800);
		mainScreen.setVisible(true);
	}

}
