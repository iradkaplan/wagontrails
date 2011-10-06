import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JCheckBox;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;

import javax.swing.JTextPane;

////////////////////////////////////////////////////////////////////////////////////
//
//    GENERAL INFO
//      -Component naming convention: <componentType>_<paneInitials>_<purpose>
//
//    CONSTANTS
//      -Panel width: 464
//      -Title  font size: 30
//      -Header font size: 20
//      -Normal font size: 11
//      -Small  font size: 8
//
//    PANELS
//      - Main Panel <M> 
//          1) Title Screen Panel <TS>
//          2) Party Creation Panel <PC>
//          3) Travel Options Panel <TO>
//          4) End Screen
//      - Error Panel <E>
//
////////////////////////////////////////////////////////////////////////////////////

public class Display {

	private Menu menu;

	private JPanel panel_TS_TitleScreen;
	
	private JFrame frame;
	private JTextField textField_PC_PlayerName;
	private JTextField textField_PC_Name3;
	private final ButtonGroup travelPaceGroup = new ButtonGroup();
	private final ButtonGroup rationsGroup = new ButtonGroup();
	private JPanel panel_M_Main;
	private JTextField textField_PC_Name1;
	private JTextField textField_PC_Name4;
	private JTextField textField_PC_Name2;

	private JRadioButton radioBtn_TO_Pace1;
	private JRadioButton radioBtn_TO_Pace2;
	private JRadioButton radioBtn_TO_Pace3;
	private JRadioButton radioBtn_TO_Pace4;

	private JRadioButton radioBtn_TO_Rations1;
	private JRadioButton radioBtn_TO_Rations2;
	private JRadioButton radioBtn_TO_Rations3;
	private JRadioButton radioBtn_TO_Rations4;

	private JTextPane textPane_ES_TravelGroup;

	private JComboBox comboBox_PC_Profession;

	/**
	 * switches the GUI to a different menu
	 * 
	 * @param newPanel
	 *            the menu being changed to.
	 * 
	 *            0) Title Screen 1) Party Creation 2) Travel Options 3) End
	 *            Screen
	 */
	public void switchMainPanel(int newPanel) {
		CardLayout cl_panel_M_Main = (CardLayout) panel_M_Main.getLayout();
		cl_panel_M_Main.show(panel_M_Main, newPanel + "");
	}

	/**
	 * Returns the Ration Level (enum) selected by the user on the Travel
	 * Options page.
	 * 
	 * @return the new Ration Level
	 */
	private RationLevel getRationsSelection() {
		RationLevel current;
		if (radioBtn_TO_Rations1.isSelected()) {
			current = RationLevel.STARVING;
		} else if (radioBtn_TO_Rations2.isSelected()) {
			current = RationLevel.LOW;
		} else if (radioBtn_TO_Rations3.isSelected()) {
			current = RationLevel.MEDIUM;
		} else {
			current = RationLevel.HIGH;
		}
		return current;
	}

	/**
	 * Returns the Travel Pace (enum) selected by the user on the Travel Options
	 * page.
	 * 
	 * @return the new Travel Pace
	 */
	private TravelPace getTravelSelection() {
		TravelPace current;
		if (radioBtn_TO_Pace1.isSelected()) {
			current = TravelPace.STOPPED;
		} else if (radioBtn_TO_Pace2.isSelected()) {
			current = TravelPace.SLOW;
		} else if (radioBtn_TO_Pace3.isSelected()) {
			current = TravelPace.MEDIUM;
		} else {
			current = TravelPace.FAST;
		}
		return current;
	}

	private void showTravelGroupInfo() {
		textPane_ES_TravelGroup.setText(menu.getTravelGroupString());
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Display window = new Display();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Display() {
		menu = new Menu();
		initialize();
		switchMainPanel(0);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		frame = new JFrame();
		frame.setBounds(100, 100, 480, 360);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		panel_M_Main = new JPanel();
		panel_M_Main.setBounds(0, 0, 464, 302);
		frame.getContentPane().add(panel_M_Main);
		panel_M_Main.setLayout(new CardLayout(0, 0));

		panel_TS_TitleScreen = new JPanel();
		panel_M_Main.add(panel_TS_TitleScreen, "0"); // Title Screen Panel --
														// panel 0
		panel_TS_TitleScreen.setLayout(null);

		JLabel label_TS_Title = new JLabel("Welcome to the Oregon Trail");
		label_TS_Title.setFont(new Font("Tahoma", Font.PLAIN, 30));
		label_TS_Title.setHorizontalAlignment(SwingConstants.CENTER);
		label_TS_Title.setBounds(10, 0, 444, 40);
		panel_TS_TitleScreen.add(label_TS_Title);
		JButton button_TS_Continue = new JButton("Continue");

		// ------------------ Continue Button on Party Creation mouse listener
		// ------------------
		button_TS_Continue.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				switchMainPanel(1);
			}
		});
		button_TS_Continue.setFont(new Font("Tahoma", Font.PLAIN, 15));
		button_TS_Continue.setBounds(154, 267, 125, 35);
		panel_TS_TitleScreen.add(button_TS_Continue);
		
		
		JPanel panelImage = new JPanel();
		panelImage.setBounds(20, 41, 419, 215);
		ImageIcon image = new ImageIcon("src/oregonTrailIntro.jpg");
		JLabel imageHolder = new JLabel(image);
		panelImage.add(imageHolder);
		panel_TS_TitleScreen.add(panelImage);	
		
		JPanel panel_PC_PartyCreation = new JPanel();
		panel_M_Main.add(panel_PC_PartyCreation, "1"); // Party Creation Panel
														// -- panel 1
		panel_PC_PartyCreation.setLayout(null);

		JLabel label_PC_Title = new JLabel("Party Member Creation");
		label_PC_Title.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_PC_Title.setHorizontalAlignment(SwingConstants.CENTER);
		label_PC_Title.setBounds(10, 11, 444, 36);
		panel_PC_PartyCreation.add(label_PC_Title);

		JLabel label_PC_CreateHeader = new JLabel("Create your character");
		label_PC_CreateHeader.setBounds(25, 58, 257, 14);
		panel_PC_PartyCreation.add(label_PC_CreateHeader);

		JLabel label_PC_CharacterName = new JLabel("Name:");
		label_PC_CharacterName.setBounds(25, 83, 88, 14);
		panel_PC_PartyCreation.add(label_PC_CharacterName);

		textField_PC_PlayerName = new JTextField();
		textField_PC_PlayerName.setBounds(111, 80, 225, 20);
		panel_PC_PartyCreation.add(textField_PC_PlayerName);
		textField_PC_PlayerName.setColumns(10);

		JLabel label_PC_Profession = new JLabel("Profession:");
		label_PC_Profession.setBounds(25, 108, 88, 14);
		panel_PC_PartyCreation.add(label_PC_Profession);

		comboBox_PC_Profession = new JComboBox();
		comboBox_PC_Profession.setBounds(111, 105, 225, 20);
		comboBox_PC_Profession.addItem("Banker");
		comboBox_PC_Profession.addItem("Carpenter");
		comboBox_PC_Profession.addItem("Farmer");
		panel_PC_PartyCreation.add(comboBox_PC_Profession);

		JLabel label_PC_ProfessionDescription = new JLabel("");
		label_PC_ProfessionDescription.setBounds(111, 136, 225, 14);
		panel_PC_PartyCreation.add(label_PC_ProfessionDescription);

		JLabel lblPerson = new JLabel("Person 3:");
		lblPerson.setBounds(25, 227, 60, 14);
		panel_PC_PartyCreation.add(lblPerson);

		textField_PC_Name3 = new JTextField();
		textField_PC_Name3.setColumns(10);
		textField_PC_Name3.setBounds(81, 224, 126, 20);
		panel_PC_PartyCreation.add(textField_PC_Name3);

		JButton button_PC_Continue = new JButton("Continue");

		// ------------------ Continue Button on Party Creation mouse listener
		// ------------------
		button_PC_Continue.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				if (!(textField_PC_PlayerName.getText().length() >= 1)) {
					JOptionPane.showMessageDialog(frame,
							"Player must have a name.", "Error",
							JOptionPane.ERROR_MESSAGE);
					return;
				}
				if (!(textField_PC_Name1.getText().length() >= 1)) {
					JOptionPane.showMessageDialog(frame,
							"Person 1 must have a name.", "Error",
							JOptionPane.ERROR_MESSAGE);
					return;
				}
				if (!(textField_PC_Name2.getText().length() >= 1)) {
					JOptionPane.showMessageDialog(frame,
							"Person 2 must have a name.", "Error",
							JOptionPane.ERROR_MESSAGE);
					return;
				}
				if (!(textField_PC_Name3.getText().length() >= 1)) {
					JOptionPane.showMessageDialog(frame,
							"Person 3 must have a name.", "Error",
							JOptionPane.ERROR_MESSAGE);
					return;
				}
				if (!(textField_PC_Name4.getText().length() >= 1)) {
					JOptionPane.showMessageDialog(frame,
							"Person 4 must have a name.", "Error",
							JOptionPane.ERROR_MESSAGE);
					return;
				}
				switchMainPanel(2);
			}
		});
		button_PC_Continue.setFont(new Font("Tahoma", Font.PLAIN, 15));
		button_PC_Continue.setBounds(157, 255, 150, 36);
		panel_PC_PartyCreation.add(button_PC_Continue);

		JLabel label = new JLabel("Person 1:");
		label.setBounds(25, 199, 60, 14);
		panel_PC_PartyCreation.add(label);

		textField_PC_Name1 = new JTextField();
		textField_PC_Name1.setColumns(10);
		textField_PC_Name1.setBounds(81, 196, 126, 20);
		panel_PC_PartyCreation.add(textField_PC_Name1);

		JLabel lblPerson_2 = new JLabel("Person 4:");
		lblPerson_2.setBounds(257, 224, 60, 14);
		panel_PC_PartyCreation.add(lblPerson_2);

		textField_PC_Name4 = new JTextField();
		textField_PC_Name4.setColumns(10);
		textField_PC_Name4.setBounds(313, 221, 126, 20);
		panel_PC_PartyCreation.add(textField_PC_Name4);

		JLabel lblPerson_1 = new JLabel("Person 2:");
		lblPerson_1.setBounds(257, 196, 60, 14);
		panel_PC_PartyCreation.add(lblPerson_1);

		textField_PC_Name2 = new JTextField();
		textField_PC_Name2.setColumns(10);
		textField_PC_Name2.setBounds(313, 193, 126, 20);
		panel_PC_PartyCreation.add(textField_PC_Name2);

		JLabel lblEnterTheNames = new JLabel("Enter the names of the people you want to travel with");
		lblEnterTheNames.setBounds(25, 174, 429, 14);
		panel_PC_PartyCreation.add(lblEnterTheNames);

		JPanel panel_TO_TravelOptions = new JPanel();
		panel_M_Main.add(panel_TO_TravelOptions, "2"); // Travel Options Panel
														// -- panel 2
		panel_TO_TravelOptions.setLayout(null);

		JLabel label_TO_Title = new JLabel("Travel Options");
		label_TO_Title.setBounds(10, 11, 444, 25);
		label_TO_Title.setHorizontalAlignment(SwingConstants.CENTER);
		label_TO_Title.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_TO_TravelOptions.add(label_TO_Title);

		JLabel label_TO_PaceHeader = new JLabel("Set travel pace");
		label_TO_PaceHeader.setBounds(10, 56, 444, 14);
		panel_TO_TravelOptions.add(label_TO_PaceHeader);

		JLabel label_TO_RationsHeader = new JLabel("Set rations");
		label_TO_RationsHeader.setBounds(10, 154, 444, 14);
		panel_TO_TravelOptions.add(label_TO_RationsHeader);

		radioBtn_TO_Pace1 = new JRadioButton("Stopped");
		travelPaceGroup.add(radioBtn_TO_Pace1);
		radioBtn_TO_Pace1.setBounds(20, 77, 169, 23);
		panel_TO_TravelOptions.add(radioBtn_TO_Pace1);

		radioBtn_TO_Pace2 = new JRadioButton("Slow - 5 miles per day");
		travelPaceGroup.add(radioBtn_TO_Pace2);
		radioBtn_TO_Pace2.setBounds(231, 77, 187, 23);
		panel_TO_TravelOptions.add(radioBtn_TO_Pace2);

		radioBtn_TO_Pace3 = new JRadioButton("Medium - 10 miles per day");
		radioBtn_TO_Pace3.setSelected(true);
		travelPaceGroup.add(radioBtn_TO_Pace3);
		radioBtn_TO_Pace3.setBounds(20, 100, 209, 23);
		panel_TO_TravelOptions.add(radioBtn_TO_Pace3);

		radioBtn_TO_Pace4 = new JRadioButton("Fast - 15 miles per day");
		travelPaceGroup.add(radioBtn_TO_Pace4);
		radioBtn_TO_Pace4.setBounds(231, 100, 187, 23);
		panel_TO_TravelOptions.add(radioBtn_TO_Pace4);

		radioBtn_TO_Rations1 = new JRadioButton("Starving");
		rationsGroup.add(radioBtn_TO_Rations1);
		radioBtn_TO_Rations1.setBounds(20, 175, 187, 23);
		panel_TO_TravelOptions.add(radioBtn_TO_Rations1);

		radioBtn_TO_Rations2 = new JRadioButton("Low - 1 lb food / person");
		rationsGroup.add(radioBtn_TO_Rations2);
		radioBtn_TO_Rations2.setBounds(231, 175, 187, 23);
		panel_TO_TravelOptions.add(radioBtn_TO_Rations2);

		radioBtn_TO_Rations3 = new JRadioButton("Medium - 3 lbs food / person");
		radioBtn_TO_Rations3.setSelected(true);
		rationsGroup.add(radioBtn_TO_Rations3);
		radioBtn_TO_Rations3.setBounds(20, 198, 209, 23);
		panel_TO_TravelOptions.add(radioBtn_TO_Rations3);

		radioBtn_TO_Rations4 = new JRadioButton("High - 5 lbs food / person");
		rationsGroup.add(radioBtn_TO_Rations4);
		radioBtn_TO_Rations4.setBounds(231, 198, 193, 23);
		panel_TO_TravelOptions.add(radioBtn_TO_Rations4);

		JButton button_TO_Continue = new JButton("Continue");

		// ------------------ Continue Button on Travel Options mouse listener
		// ------------------
		button_TO_Continue.addMouseListener(new MouseAdapter() {

			/**
			 * -Switches to the End Screen panel -Gets the pioneer names from
			 * the Party Creation panel and puts them into an array -Calls
			 * startUpMenu
			 * 
			 * @param arg0
			 *            when the mouse is pressed on the continue button
			 */
			@Override
			public void mousePressed(MouseEvent arg0) {
				boolean checkNames;
				Profession prof = Profession.NONE;
				ArrayList<String> names = new ArrayList<String>(4);
				names.add(textField_PC_Name1.getText());
				names.add(textField_PC_Name2.getText());
				names.add(textField_PC_Name3.getText());
				names.add(textField_PC_Name4.getText());
				if (comboBox_PC_Profession.getSelectedIndex() == 0) {
					prof = Profession.BANKER;
				} else if (comboBox_PC_Profession.getSelectedIndex() == 1) {
					prof = Profession.CARPENTER;
				} else if (comboBox_PC_Profession.getSelectedIndex() == 2) {
					prof = Profession.FARMER;
				}
				menu.startUpMenu(textField_PC_PlayerName.getText(), names,
						prof, getTravelSelection(), getRationsSelection());
				showTravelGroupInfo();
				switchMainPanel(3);
			}
		});
		button_TO_Continue.setFont(new Font("Tahoma", Font.PLAIN, 15));
		button_TO_Continue.setBounds(157, 244, 150, 36);
		panel_TO_TravelOptions.add(button_TO_Continue);

		JPanel panel_ES_EndScreen = new JPanel();
		panel_M_Main.add(panel_ES_EndScreen, "3");
		panel_ES_EndScreen.setLayout(null);

		textPane_ES_TravelGroup = new JTextPane();
		textPane_ES_TravelGroup.setEditable(false);
		textPane_ES_TravelGroup.setBounds(20, 21, 227, 258);
		panel_ES_EndScreen.add(textPane_ES_TravelGroup);
		
		JPanel panelImage2 = new JPanel();
		ImageIcon image2 = new ImageIcon("src/oregonTrailStart.jpg");
		JLabel imageHolder2 = new JLabel(image2);
		panelImage2.setBounds(257, 72, 197, 147);
		panelImage2.add(imageHolder2);
		panel_ES_EndScreen.add(panelImage2);

		JPanel panel_E_Error = new JPanel();
		panel_E_Error.setBounds(0, 301, 464, 21);
		frame.getContentPane().add(panel_E_Error);
		panel_E_Error.setLayout(null);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(10, 3, 444, 14);
		panel_E_Error.add(lblNewLabel);
	}
}