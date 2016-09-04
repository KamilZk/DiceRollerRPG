package com.kz.diceroller;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
/*import java.io.File;
import java.io.IOException;*/
import java.util.Date;
import java.util.Random;

/*import javax.imageio.ImageIO;
import javax.swing.ImageIcon;*/
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


public class DiceRoller extends JFrame implements ActionListener
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//==============================================
	private String wynikRzutow = "";
	private int suma, los;
	//private int ilosc=1;
	
	private JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btnC;
	private JButton btnK2, btnK3, btnK4, btnK6, btnK8, btnK10, btnK12, btnK20, btnK100;
	private JButton btnLog;
	private JLabel lblIlosc, lblKosc, lblRzut, lblSuma;
	private JLabel lblCopyright;
	BufferedImage biBtn1, biBtn2, biBtn3, biBtn4, biBtn5, biBtn6, biBtn7, biBtn8, biBtn9, biBtn10, biBtnC;
	BufferedImage biBtnK2, biBtnK3, biBtnK4, biBtnK6, biBtnK10, biBtnK12, biBtnK20, biBtnK100;
	BufferedImage biBtnK8;
	BufferedImage biLog;
	
	private DiceRollerLogger oknoLogger;

	//==============================================
	//==============================================
	public DiceRoller()
	{
		setResizable(false);
		setTitle("Dice Roller");
		setSize(400,380);
		setLocation(200,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		oknoLogger = new DiceRollerLogger(this);
		
		//LOOK And Feel
		try
		{
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
			//UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
			SwingUtilities.updateComponentTreeUI(this);
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e)
		{
			e.printStackTrace();
		}
		
		//T£O
		//setContentPane(new JLabel(new ImageIcon("img/bg3.jpg")));

		//BTN K2
/*		try
		{
			biBtnK2 = ImageIO.read(new File("img/btnk2.gif"));
		} catch (IOException e)
		{
			
			e.printStackTrace();
		}
		btnK2 = new JButton(new ImageIcon(biBtnK2));*/
		btnK2 = new JButton("K2");
		btnK2.setBounds(227,95,50,50);
		getContentPane().add(btnK2);
		btnK2.addActionListener(this);
		
		//BTN K3
/*		try
		{
			biBtnK3 = ImageIO.read(new File("img/btnk3.png"));
		} catch (IOException e)
		{
			
			e.printStackTrace();
		}
		btnK3 = new JButton(new ImageIcon(biBtnK3));
		btnK3.setBorderPainted(false);
		btnK3.setBorder(null);
		btnK3.setContentAreaFilled(false);*/
		btnK3 = new JButton("K3");
		btnK3.setBounds(282,95,50,50);
		getContentPane().add(btnK3);
		btnK3.addActionListener(this);
		
		//BTN K4
/*		try
		{
			biBtnK4 = ImageIO.read(new File("img/btnk4.gif"));
		} catch (IOException e)
		{
			
			e.printStackTrace();
		}
		btnK4 = new JButton(new ImageIcon(biBtnK4));*/
		btnK4 = new JButton("K4");
		btnK4.addActionListener(this); 
		btnK4.setBounds(337, 95, 50, 50);
		getContentPane().add(btnK4);
		
		//BTN K6
/*		try
		{
			biBtnK6 = ImageIO.read(new File("img/btnk6.png"));
		} catch (IOException e)
		{
			
			e.printStackTrace();
		}
		btnK6 = new JButton(new ImageIcon(biBtnK6));
		btnK6.setBorderPainted(false);
		btnK6.setBorder(null);
		btnK6.setContentAreaFilled(false);*/
		btnK6 = new JButton("K6");
		btnK6.setBounds(227, 151, 50, 50);
		getContentPane().add(btnK6);
		btnK6.addActionListener(this);
		
		//BTN K8
/*		try
		{
			biBtnK8 = ImageIO.read(new File("img/btnk8.png"));
		} catch (IOException e)
		{
			
			e.printStackTrace();
		}
		btnK8 = new JButton(new ImageIcon(biBtnK8));
		btnK8.setBorderPainted(false);
		btnK8.setBorder(null);
		btnK8.setContentAreaFilled(false);*/
		btnK8 = new JButton("K8");
		btnK8.setBounds(282, 151, 50, 50);
		getContentPane().add(btnK8);
		btnK8.addActionListener(this);
	
		
		//BTN K10
/*		try
		{
			biBtnK2 = ImageIO.read(new File("img/btnk10.gif"));
		} catch (IOException e)
		{
			
			e.printStackTrace();
		}
		btnK10 = new JButton(new ImageIcon(biBtnK10));*/
		btnK10 = new JButton("K10");
		btnK10.setBounds(337, 151, 50, 50);
		getContentPane().add(btnK10);
		btnK10.addActionListener(this);
		
		//BTN K12
/*		try
		{
			biBtnK12 = ImageIO.read(new File("img/btnk12.gif"));
		} catch (IOException e)
		{
			
			e.printStackTrace();
		}
		btnK12 = new JButton(new ImageIcon(biBtnK12));*/
		btnK12 = new JButton("K12");
		btnK12.setBounds(227, 212, 50, 50);
		getContentPane().add(btnK12);
		btnK12.addActionListener(this);
		
		//BTN K20
/*		try
		{
			biBtnK20 = ImageIO.read(new File("img/btnk20.gif"));
		} catch (IOException e)
		{
			
			e.printStackTrace();
		}
		btnK20 = new JButton(new ImageIcon(biBtnK20));*/
		btnK20 = new JButton("K20");
		btnK20.setBounds(282, 212, 50, 50);
		getContentPane().add(btnK20);
		btnK20.addActionListener(this);
		
		//BTN K100
/*		try
		{
			biBtnK2 = ImageIO.read(new File("img/btnk100.gif"));
		} catch (IOException e)
		{
			
			e.printStackTrace();
		}
		btnK100 = new JButton(new ImageIcon(biBtnK100));*/
		btnK100 = new JButton("K100");
		btnK100.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnK100.setBounds(337, 212, 50, 50);
		getContentPane().add(btnK100);
		btnK100.addActionListener(this);
		
		lblIlosc = new JLabel("1");
		lblIlosc.setBackground(Color.LIGHT_GRAY);
		lblIlosc.setOpaque(true);
		lblIlosc.setFont(new Font("Segoe Print", Font.ITALIC, 14));
		lblIlosc.setBounds(10, 11, 25, 14);
		getContentPane().add(lblIlosc);
		
		lblKosc = new JLabel("d...");
		lblKosc.setBackground(Color.LIGHT_GRAY);
		lblKosc.setOpaque(true);
		lblKosc.setFont(new Font("Segoe Print", Font.ITALIC, 14));
		lblKosc.setBounds(35, 11, 45, 14);
		getContentPane().add(lblKosc);
		
		lblRzut = new JLabel(".");
		lblRzut.setForeground(Color.BLACK);
		lblRzut.setBackground(Color.LIGHT_GRAY);
		lblRzut.setOpaque(true);
		lblRzut.setVerticalAlignment(SwingConstants.CENTER);
		lblRzut.setFont(new Font("Segoe Print", Font.BOLD, 14));
		lblRzut.setHorizontalAlignment(SwingConstants.RIGHT);
		lblRzut.setBounds(10, 36, 380, 24);
		getContentPane().add(lblRzut);
		
		lblSuma = new JLabel("Suma: ");
		lblSuma.setBackground(Color.LIGHT_GRAY);
		lblSuma.setOpaque(true);
		lblSuma.setFont(new Font("Segoe Print", Font.BOLD | Font.ITALIC, 14));
		lblSuma.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSuma.setBounds(300, 11, 85, 14);
		getContentPane().add(lblSuma);
		
		//BTN1
/*		try
		{
			biBtn1 = ImageIO.read(new File("img/btn1.gif"));
		} catch (IOException e)
		{
			e.printStackTrace();
		}
		btn1 = new JButton(new ImageIcon(biBtn1));*/
		btn1 = new JButton("1");
		btn1.setBounds(10, 95, 50, 50);
		getContentPane().add(btn1);
		btn1.addActionListener(this);
		
		
		//BTN2
/*		try
		{
			biBtn2 = ImageIO.read(new File("img/btn2.gif"));
		} catch (IOException e)
		{
			e.printStackTrace();
		}
		btn2 = new JButton(new ImageIcon(biBtn2));*/
		btn2 = new JButton("2");
		btn2.setBounds(70, 95, 50, 50);
		getContentPane().add(btn2);
		btn2.addActionListener(this);
		
		//BTN3
/*		try
		{
			biBtn3 = ImageIO.read(new File("img/btn3.gif"));
		} catch (IOException e)
		{
			e.printStackTrace();
		}
		btn3 = new JButton(new ImageIcon(biBtn3));*/
		btn3 = new JButton("3");
		btn3.setBounds(132, 95, 50, 50);
		getContentPane().add(btn3);
		btn3.addActionListener(this);
		
		//BTN4
/*		try
		{
			biBtn4 = ImageIO.read(new File("img/btn4.gif"));
		} catch (IOException e)
		{

			e.printStackTrace();
		}
		btn4 = new JButton(new ImageIcon(biBtn4));*/
		btn4 = new JButton("4");
		btn4.setBounds(10, 151, 50, 50);
		getContentPane().add(btn4);
		btn4.addActionListener(this);
		
		//BTN5
/*		try
		{
			biBtn5 = ImageIO.read(new File("img/btn5.gif"));
		} catch (IOException e)
		{

			e.printStackTrace();
		}
		btn5 = new JButton(new ImageIcon(biBtn5));*/
		btn5 = new JButton("5");
		btn5.setBounds(70, 151, 50, 50);
		getContentPane().add(btn5);
		btn5.addActionListener(this);
		
		//BTN6
/*		try
		{
			biBtn6 = ImageIO.read(new File("img/btn6.gif"));
		} catch (IOException e)
		{

			e.printStackTrace();
		}
		btn6 = new JButton(new ImageIcon(biBtn6));*/
		btn6 = new JButton("6");
		btn6.setBounds(132, 151, 50, 50);
		getContentPane().add(btn6);
		btn6.addActionListener(this);
		
		//BTN7
/*		try
		{
			biBtn7 = ImageIO.read(new File("img/btn7.gif"));
		} catch (IOException e)
		{

			e.printStackTrace();
		}
		btn7 = new JButton(new ImageIcon(biBtn7));*/
		btn7 = new JButton("7");
		btn7.setBounds(10, 212, 50, 50);
		getContentPane().add(btn7);
		btn7.addActionListener(this);
		
		//BTN8
/*		try
		{
			biBtn8 = ImageIO.read(new File("img/btn8.gif"));
		} catch (IOException e)
		{

			e.printStackTrace();
		}
		btn8 = new JButton(new ImageIcon(biBtn8));*/
		btn8 = new JButton("8");
		btn8.setBounds(70, 212, 50, 50);
		getContentPane().add(btn8);
		btn8.addActionListener(this);
		
		//BTN9
/*		try
		{
			biBtn9 = ImageIO.read(new File("img/btn9.gif"));
		} catch (IOException e)
		{

			e.printStackTrace();
		}
		btn9 = new JButton(new ImageIcon(biBtn9));*/
		btn9 = new JButton("9");
		btn9.setBounds(132, 212, 50, 50);
		getContentPane().add(btn9);
		btn9.addActionListener(this);
		
		//BTN10
/*		try
		{
			biBtn10 = ImageIO.read(new File("img/btn10.gif"));
		} catch (IOException e)
		{

			e.printStackTrace();
		}
		btn10 = new JButton(new ImageIcon(biBtn10));*/
		btn10 = new JButton("10");
		btn10.setBounds(70, 273, 50, 50);
		getContentPane().add(btn10);
		btn10.addActionListener(this);
		
		//BTN C
/*		try
		{
			biBtnC = ImageIO.read(new File("img/btnC.gif"));
		} catch (IOException e)
		{

			e.printStackTrace();
		}
		btnC = new JButton(new ImageIcon(biBtnC));*/
		btnC = new JButton("C");
		btnC.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnC.setForeground(Color.RED);
		
		btnC.setBounds(132, 273, 50, 50);
		getContentPane().add(btnC);
		btnC.addActionListener(this);
				
		//BTN LOG
/*		try
		{
			biLog = ImageIO.read(new File("img/btnlog.gif"));
		} catch (IOException e)
		{
			
			e.printStackTrace();
		}
		btnLog = new JButton(new ImageIcon(biLog));
		btnLog.setBorderPainted(false);
		btnLog.setBorder(null);
		btnLog.setContentAreaFilled(false);*/
		
		btnLog = new JButton("Log");
		btnLog.setBounds(282, 270, 50, 50);
		getContentPane().add(btnLog);
		btnLog.addActionListener(this);
		
		//Copyright
		lblCopyright = new JLabel("\u00a9 Kamil Zakrzewski, v1.0rc");
		lblCopyright.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCopyright.setBounds(235, 330, 150, 15);
		getContentPane().add(lblCopyright);

	}
	//==============================================	
	public void losuj(int kosc, int ilosc)
	{
		
		Random losowanie = new Random();
		
		if (ilosc == 1)
		{
			los = losowanie.nextInt(kosc)+1;
			wynikRzutow = String.valueOf(los);
			lblSuma.setText("Suma: ");
		}
		
		else if (ilosc >1)
		{
			
		for(int i=0; i<ilosc; i++)
		{
			los = losowanie.nextInt(kosc)+1;
			
			suma = suma + los;
			
			if (i == 0)
			{
				wynikRzutow = String.valueOf(los);
			}
			else if(i > 0)
			{
				wynikRzutow = wynikRzutow + " + " + String.valueOf(los);
			}

			
		}
		
		lblSuma.setText("Suma: " + String.valueOf(suma));
		}
		

		
		//lblIlosc.setText(String.valueOf(ilosc));
		
		lblKosc.setText("d" + kosc);
			
		
		lblRzut.setText(wynikRzutow);
		
		zapisLog (kosc, ilosc, suma, wynikRzutow);
		
		los = suma = 0;
	}
	
	public void zapisLog (int kosc, int ilosc, int suma, String wynikRzutow)
	{
		if (suma == 0)
		{
			DiceRollerLogger.setOknoLog(new Date().toString() + " || " + ilosc + "d" + kosc + ": " + wynikRzutow);
		}
		else
		{
			DiceRollerLogger.setOknoLog(new Date().toString() + " || " + ilosc + "d" + kosc + ": " + wynikRzutow + " = " + suma);	
		}
		
	}
	
/*	public void setIlosc(int ilosc)
	{
		this.ilosc = ilosc;
	}
	
	public int getIlosc()
	{
		return ilosc;
	}*/
	
	//==============================================
	//==============================================
	public static void main(String[] args)
	{
		DiceRoller app = new DiceRoller();
		app.setVisible(true);
		
	
		
	}
	//==============================================
	//==============================================
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		Object z = e.getSource();
		
		if(z==btn1)
		{
			lblIlosc.setText("1");
			lblKosc.setText("d...");
		}		

		if(z==btn2)
		{
			//ilosc = "2";
			lblIlosc.setText("2");
			lblKosc.setText("d...");
		}
		
		if(z==btn3)
		{
			//ilosc = 3;
			lblIlosc.setText("3");
			lblKosc.setText("d...");
		}	
		
		if(z==btn4)
		{
			//ilosc = 4;
			lblIlosc.setText("4");
			lblKosc.setText("d...");
		}	
		
		if(z==btn5)
		{
//			ilosc = 5;
			lblIlosc.setText("5");
			lblKosc.setText("d...");
		}	
		
		if(z==btn6)
		{
//			ilosc = 6;
			lblIlosc.setText("6");
			lblKosc.setText("d...");
		}	
		
		if(z==btn7)
		{
			//ilosc = 7;
			lblIlosc.setText("7");
			lblKosc.setText("d...");
		}	
		
		if(z==btn8)
		{
			//ilosc = 8;
			lblIlosc.setText("8");
			lblKosc.setText("d...");
		}	
		
		if(z==btn9)
		{
			//ilosc = 9;
			lblIlosc.setText("9");
			lblKosc.setText("d...");
		}	
		
		if(z==btn10)
		{
			//ilosc = 10;
			lblIlosc.setText("10");
			lblKosc.setText("d...");
		}	
		
		if(z==btnC)
		{
			
			//ilosc = 1;
			lblIlosc.setText("1");
			lblKosc.setText("d...");
			lblRzut.setText(".");
			lblSuma.setText("Suma: ");
		}	
		
		//***********************************************
		
		if(z==btnK2)
		{
			int ilosc = Integer.parseInt(lblIlosc.getText());
			//losuj(2);
			losuj(2,ilosc);
		}
		
		if(z==btnK3)
		{
			int ilosc = Integer.parseInt(lblIlosc.getText());
			losuj(3,ilosc);
//			losuj(3);			
		}
		
		if(z==btnK4)
		{
			int ilosc = Integer.parseInt(lblIlosc.getText());
			losuj(4,ilosc);
//			losuj(4);			
		}
		
		if(z==btnK6)
		{
			int ilosc = Integer.parseInt(lblIlosc.getText());
			losuj(6,ilosc);
//			losuj(6);			
		}
		
		if(z==btnK8)
		{
			int ilosc = Integer.parseInt(lblIlosc.getText());
			losuj(8,ilosc);
//			losuj(8);			
		}
		
		if(z==btnK10)
		{
			int ilosc = Integer.parseInt(lblIlosc.getText());
			losuj(10,ilosc);
//			losuj(10);			
		}

		if(z==btnK12)
		{
			int ilosc = Integer.parseInt(lblIlosc.getText());
			losuj(12,ilosc);
//			losuj(12);			
		}
		
		if(z==btnK20)
		{
			int ilosc = Integer.parseInt(lblIlosc.getText());
			losuj(20,ilosc);
//			losuj(20);			
		}
				
		if(z==btnK100)
		{
			int ilosc = Integer.parseInt(lblIlosc.getText());
			losuj(100,ilosc);
//			losuj(100);			
		}
		
		if(z==btnLog)
		{
			if (oknoLogger ==null)
			{
				oknoLogger = new DiceRollerLogger(this);
			}
			
			if (oknoLogger.isVisible())
			{
				oknoLogger.setVisible(false);
			}
			else
			{
				oknoLogger.setVisible(true);
			}
							
		}
		
	}

}
