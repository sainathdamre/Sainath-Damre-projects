import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.text.*;

public class LoginPage extends JFrame
{
	Container c = getContentPane();
	JPanel PFlightTypes = new JPanel(null);
	JPanel PLogin = new JPanel(null);
	JPanel PFlightDetails = new JPanel(null);

	public boolean bCheck=true;
	
	JLabel LTitle = new JLabel("<html><b><font color=\"#C71585\",size=\"6\">SNJBCOE AIRLINE RESERVATION</font></b></html>");
	
	JLabel LDomesticFlight = new JLabel("<html><B>Domestic Flights</B></html>");
	JLabel LInternationalFlight = new JLabel("<html><B>International Flights</B></html>");

	JLabel LUserName, LPassword;

	JLabel LDomesticFlight1 = new JLabel("<html><B>Domestic Flight Booking</B></html>");
	JLabel LInternationalFlight1 = new JLabel("<html><B>International Flight Booking</B></html>");

	JTextField TFUserName;
	JPasswordField TPPassword;

	JButton BLogin;

	final Object[] col1 ={ "From", "To", "Price", "Time" };
	final Object[] col2 = { "From", "To", "Price", "Time" };
	final Object[] col3 = { "From", "To", "Price", "Time" };

	final Object[][] row1 = { { "chandwad", "Bangalore", "3125", "16:30" }, { "chandwad", "Chennai ", "3225", "19:00" }, { "chandwad", "Delhi", "1425 ", "08:30" }, { "chandwad", "Goa", "1025 ", "09:50" }, { "chandwad", "Hyderabad", "1525", "11:00" }, { "chandwad", "Kolkata", "3825 ", "05:30" }, { "chandwad", "Lucknow", "3025 ", "05:30" }, { "chandwad", "Mumbai", "1725", "12:00" }, { "chandwad", "Vishakapatnam", "3725", "19:00" } };
	final Object[][] row2 = { { "chandwad", "Bali", "21485", "06:20" }, { "chandwad", "Bangkok", "9000", "20:45" }, { "chandwad", "Cairo", "22975", "10:25" }, { "chandwad", "CapeTown", "42500", "16:45" }, { "chandwad", "Chicago", "35000", "06:30" }, { "chandwad", "Dubai", "12000", "08:15" }, { "chandwad", "Frankfurt", "18500", "06:50" }, { "chandwad", "HongKong", "20845", "12:00" }, { "chandwad", "Istanbul", "22000", "10:45" }, { "chandwad", "London", "22600", "14:35" }, { "chandwad", "LosAngeles", "35000", "22:00" }, { "chandwad", "Melbourne", "27800", "21:15" }, { "chandwad", "New York", "32000", "08:50" }, { "chandwad", "Paris", "18500", "18:45" }, { "chandwad", "Rome", "19900", "20:00"}, { "chandwad", "SanFrancisco", "35000", "12:00"}, { "chandwad", "shanghai", "24430", "10:15" }, { "chandwad", "Singapore", "9000", "21:10" }, { "chandwad", "Sydney", "27800", "12:00"}, { "chandwad", "Toronto", "35000", "17:00 " } };
	final Object[][] row3 = { { "chandwad", "Bangalore", "9375", "16:30" }, { "chandwad", "Chennai ", "9675", "19:00" }, { "chandwad", "Delhi", "4275", "08:30" }, { "chandwad", "Goa", "3075", "09:50" }, { "Chandwad", "Hyderabad", "4575", "11:00" }, { "Chandwad", "Kolkata", "11475", "05:30" }, { "Chandwad", "Lucknow", "9075", "05:30" }, { "Chandwad", "Mumbai", "5175", "12:00" }, { "Chandwad", "Vishakapatnam", "11175", "19:00" } };
	final Object[][] row4 = { { "Chandwad", "Bali", "64455", "06:20" }, { "Chandwad", "Bangkok", "27000", "20:45" }, { "Chandwad", "Cairo", "68925", "10:25" }, { "Chandwad", "CapeTown", "37500", "16:45" }, { "Chandwad", "Chicago", "105000", "06:30" }, { "Chandwad", "Dubai", "36000", "08:15" }, { "Chandwad", "Frankfurt", "55500", "06:50" }, { "Chandwad", "HongKong", "62535", "12:00" }, { "Chandwad", "Istanbul", "66000", "10:45" }, { "Chandwad", "London", "67800", "14:35" }, { "Chandwad", "LosAngeles", "105000", "22:00" }, { "Chandwad", "Melbourne", "83400", "21:15" }, { "Chandwad", "New York", "96000", "08:50" }, { "Chandwad", "Paris", "55500", "18:45" }, { "Chandwad", "Rome", "59700", "20:00" }, { "Chandwad", "SanFrancisco", "105000", "12:00" }, { "Chandwad", "shanghai", "73290", "10:15" }, { "Chandwad", "Singapore", "27000", "21:10"}, { "Chandwad", "Sydney", "83400", "12:00"}, { "Chandwad", "Toronto", "105000", "17:00" } };

	JTable TServices = new JTable(row1, col1);
	JTable TDomesticFlight = new JTable(row1, col1);
	JTable TInternationalFlight = new JTable(row2, col2);
	JTable TDomesticFlight1 = new JTable(row3, col3);
	JTable TInternationalFlight1 = new JTable(row4, col2);

	JScrollPane JSP1 = new JScrollPane(TDomesticFlight, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	JScrollPane JSP2 = new JScrollPane(TInternationalFlight, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	JScrollPane JSP3 = new JScrollPane(TDomesticFlight1, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	JScrollPane JSP4 = new JScrollPane(TInternationalFlight1, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	JScrollPane JSP5 = new JScrollPane(TServices, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	Icon img1 = new ImageIcon("img/economic.jpg");
	Icon img2 = new ImageIcon("img/business.jpg");
	Icon img3 = new ImageIcon("img/economic1.jpg");
	Icon img4 = new ImageIcon("img/business1.jpg");
	Icon img5 = new ImageIcon("img/snjb.jpg");

	JLabel LEconomic = new JLabel("Economic", img1, SwingConstants.LEFT);
	JLabel LBusiness = new JLabel("Business", img2, SwingConstants.LEFT);
	JLabel LEconomic1 = new JLabel("Economic", img3, SwingConstants.LEFT);
	JLabel LBusiness1 = new JLabel("Business", img4, SwingConstants.LEFT);
	JLabel Lsnjb = new JLabel("snjbcoe", img5, SwingConstants.RIGHT);


	public LoginPage()
	{
		WindowUtilities.setNativeLookAndFeel();
		setPreferredSize(new Dimension(796,572));

		PFlightTypes.setBackground(Color.white);
		PLogin.setBackground(Color.white);
		PFlightDetails.setBackground(Color.white);

		JSP1.setBounds(0, 340, 790, 200);
		JSP2.setBounds(0, 340, 790, 200);
		JSP3.setBounds(0, 340, 790, 200);
		JSP4.setBounds(0, 340, 790, 200);
		JSP5.setBounds(0, 340, 790, 200);
		LTitle.setBounds(0,0,600,50);
		

	

		PFlightTypes.setBounds(0,0,500, 340);
		PLogin.setBounds(500,0,500, 340);
		PFlightDetails.setBounds(0,340,790,200);


		LUserName = new JLabel("         User Name ");
		LPassword = new JLabel("         Password ");
		TFUserName = new JTextField(10);
		TPPassword = new JPasswordField(10);
		BLogin = new JButton("Sign In");

		LUserName.setBounds(40, 100, 100, 21);
		LPassword.setBounds(40, 140, 100, 21);
		TFUserName.setBounds(160, 100, 100, 21);
		TPPassword.setBounds(160, 140, 100, 21);
		BLogin.setBounds(160, 200, 100,25);

		LDomesticFlight1.setBounds(60, 60, 138, 20);
		LInternationalFlight1.setBounds(60, 100, 153, 20);

		PLogin.add(LUserName);
		PLogin.add(TFUserName);
		PLogin.add(LPassword);
		PLogin.add(TPPassword);
		PLogin.add(BLogin);
		PLogin.add(LTitle);
		

		PFlightDetails.add(JSP1);
		PFlightDetails.add(JSP2);
		PFlightDetails.add(JSP3);
		PFlightDetails.add(JSP4);

		JSP1.setVisible(true);
		JSP2.setVisible(false);
		JSP3.setVisible(false);
		JSP4.setVisible(false);

		LBusiness.setBounds(265, 170, 300, 125);
		LEconomic.setBounds(0, 170, 250, 125);
		LBusiness1.setBounds(280, 200, 135, 60);
		LEconomic1.setBounds(50, 200, 147, 60);
		Lsnjb.setBounds(350, 0, 200, 120);


		PFlightTypes.add(LEconomic);
		PFlightTypes.add(LBusiness);
		PFlightTypes.add(LEconomic1);
		PFlightTypes.add(LBusiness1);
		PFlightTypes.add(Lsnjb);

		LBusiness.setVisible(false);
		LEconomic1.setVisible(false);
		LBusiness1.setVisible(true);
		LEconomic.setVisible(true);
		Lsnjb.setVisible(true);


		LDomesticFlight.setBounds(60, 60, 100, 25);
		LInternationalFlight.setBounds(60, 100, 120, 25);

		c.add(PFlightTypes);
		c.add(PLogin);
		c.add(PFlightDetails);

		PFlightTypes.add(LDomesticFlight);
		PFlightTypes.add(LInternationalFlight);

		pack();
		setVisible(true);

		addWindowListener(new ExitListener());

		LDomesticFlight.addMouseListener(new mouse1(this, true));
		LInternationalFlight.addMouseListener(new mouse1(this, false));

		LDomesticFlight1.addMouseListener(new mouse3(this, true));
		LInternationalFlight1.addMouseListener(new mouse3(this, false));

		LBusiness1.addMouseListener(new mouse2(this, true));
		LEconomic1.addMouseListener(new mouse2(this, false));

		BLogin.addActionListener(new button1(this));
	}

	public static void main(String args[])
	{
		new LoginPage();
	}
}


class button1 implements ActionListener
{
	LoginPage type;
	char[] cCheck, cPassword={'s','a','i','n','a','t', 'h','\0'};
	JFrame f;
	String sCheck,sCheck1="sainath";

	public button1(LoginPage type)
	{
		this.type = type;
	}
	public void actionPerformed(ActionEvent e)
	{
		cCheck=type.TPPassword.getPassword();
		sCheck = type.TFUserName.getText();
		if ((sCheck1.equals(sCheck)) && check())
		{
			type.PLogin.add(type.LDomesticFlight1);
			type.PLogin.add(type.LInternationalFlight1);

			type.PLogin.remove(type.LUserName);
			type.PLogin.remove(type.TFUserName);
			type.PLogin.remove(type.LPassword);
			type.PLogin.remove(type.TPPassword);
			type.PLogin.remove(type.BLogin);

			type.c.repaint();
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Invalid username or password. Try again");
		}
	}
	public boolean check()
	{
		if (cCheck.length >= 8 || cCheck.length < 4)
			return false;
		for(int i=0;i<=4;i++)
		{
			if(cCheck[i]!=cPassword[i])
				return false;
		}
		return true;
	}
}

class mouse1 extends MouseAdapter
{
	LoginPage type;
	boolean bCheck;

	public mouse1(LoginPage type, boolean bCheck)
	{
		this.type = type;
		this.bCheck = bCheck;
	}
	public void mouseEntered(MouseEvent e)
	{
		type.LDomesticFlight.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		type.LInternationalFlight.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	}
	public void mouseClicked(MouseEvent e)
	{
		if(bCheck)
			type.bCheck = true;
		else
			type.bCheck = false;
		type.LEconomic.setVisible(true);
		type.LBusiness1.setVisible(true);
		type.LBusiness1.setVisible(true);
		type.LEconomic1.setVisible(false);
		type.Lsnjb.setVisible(true);
		type.LBusiness.setVisible(false);

		type.JSP1.setVisible(false);
		type.JSP2.setVisible(false);
		type.JSP3.setVisible(false);
		type.JSP4.setVisible(false);
		if(bCheck)
			type.JSP1.setVisible(true);
		else
			type.JSP2.setVisible(true);
	}
}



class mouse3 extends MouseAdapter
{
	LoginPage type;
	boolean bCheck;

	public mouse3(LoginPage type, boolean bCheck)
	{
		this.type = type;
		this.bCheck = bCheck;
	}
	public void mouseEntered(MouseEvent e)
	{
		type.LDomesticFlight1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		type.LInternationalFlight1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	}
	public void mouseClicked(MouseEvent e)
	{
		if (bCheck)
			new DomesticFlight(type);
		else
			new InternationalFlight(type);
	}
}


class mouse2 extends MouseAdapter
{
	LoginPage type;
	boolean bCheck;

	public mouse2(LoginPage type, boolean bCheck)
	{
		this.type = type;
		this.bCheck = bCheck;
	}
	public void mouseEntered(MouseEvent e)
	{
		type.LEconomic1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		type.LBusiness1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	}
	public void mouseClicked(MouseEvent e)
	{
		if(type.bCheck)
		{
			if (bCheck)
			{
				type.LBusiness1.setVisible(false);
				type.LBusiness.setVisible(true);
				type.LEconomic.setVisible(false);
				type.LEconomic1.setVisible(true);
				type.Lsnjb.setVisible(true);
				type.JSP1.setVisible(false);
				type.JSP2.setVisible(false);
				type.JSP3.setVisible(true);
				type.JSP4.setVisible(false);
			}
			else
			{
				type.LEconomic1.setVisible(false);
				type.LBusiness.setVisible(false);
				type.LBusiness1.setVisible(true);
				type.LEconomic.setVisible(true);
				type.Lsnjb.setVisible(true);
				type.JSP1.setVisible(true);
				type.JSP2.setVisible(false);
				type.JSP3.setVisible(true);
				type.JSP4.setVisible(false);
			}
		}
		else
		{
			if (bCheck)
			{
				type.LBusiness1.setVisible(false);
				type.LBusiness.setVisible(true);
				type.LEconomic.setVisible(false);
				type.LEconomic1.setVisible(true);
				type.Lsnjb.setVisible(true);
				type.JSP1.setVisible(false);
				type.JSP2.setVisible(false);
				type.JSP3.setVisible(false);
				type.JSP4.setVisible(true);
			}
			else
			{
				type.LEconomic1.setVisible(false);
				type.LBusiness.setVisible(false);
				type.LBusiness1.setVisible(true);
				type.LEconomic.setVisible(true);
				type.Lsnjb.setVisible(true);
				type.JSP1.setVisible(false);
				type.JSP2.setVisible(true);
				type.JSP3.setVisible(false);
				type.JSP4.setVisible(false);
			}
		}
	}
}

