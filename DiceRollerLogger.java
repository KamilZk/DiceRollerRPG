package com.kz.diceroller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/*import javax.swing.ImageIcon;*/
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
/*import javax.swing.JLabel;*/
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class DiceRollerLogger extends JDialog implements ActionListener
{

	private static final long serialVersionUID = 1L;
	private static JTextArea oknoLog;
	private JButton btnZapis, btnPowrot;
	
/*	int pozycjaX;
	int pozycjaY;*/
	
	
	//==============================================
	public DiceRollerLogger(JFrame owner)
	{
		super (owner, "Dice Roller Log");
		

/*		pozycjaX = (int) super.getLocation().getX();
		pozycjaY = super.getY();
		
		System.out.println("X: " + pozycjaX + " Y: " + pozycjaY);*/
		
		
		setResizable(false);
		
		setSize(400,380);
		//setLocation(pozycjaX+100,pozycjaY);
		setLocation(600,200);
		getContentPane().setLayout(null);
		
		
		
		//T£O
/*		JLabel label = new JLabel(new ImageIcon("img/bg3.jpg"));
		setContentPane(label);*/
		
		//JTextArea
		oknoLog = new JTextArea();
		oknoLog.setEditable(false);
		JScrollPane scrollPane = new JScrollPane(oknoLog);
		scrollPane.setBounds(10, 10, 375, 275);
		getContentPane().add(scrollPane);
		oknoLog.setLineWrap(true);
		oknoLog.setWrapStyleWord(true);
		
		btnZapis = new JButton("Zapis do pliku");
		btnZapis.setBounds(10,290,180,50);
		getContentPane().add(btnZapis);
		btnZapis.addActionListener(this);
		
		btnPowrot = new JButton("Zamknij okno");
		btnPowrot.setBounds(205,290,180,50);
		getContentPane().add(btnPowrot);
		btnPowrot.addActionListener(this);
		
	}
	
	public static void setOknoLog(String log)
	{
		oknoLog.append(log + "\n"); 
	}
	
	//==============================================
	//==============================================
	
/*	public static void main(String[] args)
	{
		DiceRollerLogger app2 = new DiceRollerLogger();
		app2.setVisible(true);
		
	}*/
	//==============================================
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		Object zrodlo = e.getSource();
		
		if(zrodlo == btnZapis)
		{
			JFileChooser fc = new JFileChooser();
			if (fc.showSaveDialog(null)==JFileChooser.APPROVE_OPTION)
			{
				File plik = fc.getSelectedFile();
				try
				{
					PrintWriter pw = new PrintWriter(plik);
					Scanner skaner = new Scanner(oknoLog.getText());
					while (skaner.hasNext())
					{
						pw.println(skaner.nextLine()/* + "\n"*/);
						
					}
					pw.close();
					JOptionPane.showMessageDialog(null, "Zapisano do: " + plik);
					skaner.close();
					
				} 
				catch (FileNotFoundException e1)
				{
					e1.printStackTrace();
				}
			}
		}
		
		if(zrodlo == btnPowrot)
		{
			dispose();
		}
		
	}

}
