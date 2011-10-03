import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;
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
//      - Error Panel <E>
//
////////////////////////////////////////////////////////////////////////////////////

public class Display {
	
	private JFrame frame;
	private JTextField textField_PC_Character;
	private JTextField textField_PC_MemberName;
	private final ButtonGroup travelPaceGroup = new ButtonGroup();
	private final ButtonGroup rationsGroup = new ButtonGroup();
	private JPanel panel_M_Main;

	/**
	 * switches the GUI to a different menu
	 * 
	 * @param newPanel the menu being changed to.
	 * 
	 *     0) Title Screen
	 *     1) Party Creation
	 *     2) Travel Options
	 */
	public void switchMainPanel(int newPanel){
		CardLayout cl_panel_M_Main = (CardLayout)panel_M_Main.getLayout();
		cl_panel_M_Main.show(panel_M_Main, newPanel + "");
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
		initialize();
		switchMainPanel(1);
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
		
		JPanel panel_TS_TitleScreen = new JPanel();
		panel_M_Main.add(panel_TS_TitleScreen, "0");    //Title Screen Panel -- panel 0
		panel_TS_TitleScreen.setLayout(null);
		
		JLabel label_TS_Title = new JLabel("Welcome to the Oregon Trail");
		label_TS_Title.setFont(new Font("Tahoma", Font.PLAIN, 30));
		label_TS_Title.setHorizontalAlignment(SwingConstants.CENTER);
		label_TS_Title.setBounds(10, 10, 444, 40);
		panel_TS_TitleScreen.add(label_TS_Title);
		
		JButton button_TS_Continue = new JButton("Continue");
		button_TS_Continue.setFont(new Font("Tahoma", Font.PLAIN, 15));
		button_TS_Continue.setBounds(136, 177, 200, 75);
		panel_TS_TitleScreen.add(button_TS_Continue);
		
		JPanel panel_PC_PartyCreation = new JPanel();
		panel_M_Main.add(panel_PC_PartyCreation, "1");    //Party Creation Panel -- panel 1
		panel_PC_PartyCreation.setLayout(null);
		
		JLabel label_PC_Title = new JLabel("Party Member Creation");
		label_PC_Title.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_PC_Title.setHorizontalAlignment(SwingConstants.CENTER);
		label_PC_Title.setBounds(10, 11, 444, 36);
		panel_PC_PartyCreation.add(label_PC_Title);
		
		JLabel label_PC_CreateHeader = new JLabel("Create your character");
		label_PC_CreateHeader.setBounds(25, 58, 107, 14);
		panel_PC_PartyCreation.add(label_PC_CreateHeader);
		
		JLabel label_PC_CharacterName = new JLabel("Name:");
		label_PC_CharacterName.setBounds(25, 83, 60, 14);
		panel_PC_PartyCreation.add(label_PC_CharacterName);
		
		textField_PC_Character = new JTextField();
		textField_PC_Character.setText("T-Pain");
		textField_PC_Character.setBounds(111, 80, 225, 20);
		panel_PC_PartyCreation.add(textField_PC_Character);
		textField_PC_Character.setColumns(10);
		
		JLabel label_PC_Profession = new JLabel("Profession:");
		label_PC_Profession.setBounds(25, 108, 54, 14);
		panel_PC_PartyCreation.add(label_PC_Profession);
		
		JComboBox comboBox_PC_Profession = new JComboBox();
		comboBox_PC_Profession.setBounds(111, 105, 225, 20);
		panel_PC_PartyCreation.add(comboBox_PC_Profession);
		
		JLabel label_PC_ProfessionDescription = new JLabel("Profession description");
		label_PC_ProfessionDescription.setBounds(111, 136, 225, 14);
		panel_PC_PartyCreation.add(label_PC_ProfessionDescription);
		
		JLabel label_PC_AddHeader = new JLabel("Add party members");
		label_PC_AddHeader.setBounds(25, 171, 94, 14);
		panel_PC_PartyCreation.add(label_PC_AddHeader);
		
		JButton button_PC_Add = new JButton("Add member");
		
		//------------------ Add Button on Party Creation mouse listener ------------------
		button_PC_Add.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.out.println("PC Add Clicked");
			}
		});
		button_PC_Add.setBounds(25, 192, 115, 23);
		panel_PC_PartyCreation.add(button_PC_Add);
		
		JLabel label_PC_MemberName = new JLabel("Name:");
		label_PC_MemberName.setBounds(25, 227, 31, 14);
		panel_PC_PartyCreation.add(label_PC_MemberName);
		
		textField_PC_MemberName = new JTextField();
		textField_PC_MemberName.setColumns(10);
		textField_PC_MemberName.setBounds(66, 224, 126, 20);
		panel_PC_PartyCreation.add(textField_PC_MemberName);
		
		JLabel label_PC_RemoveHeader = new JLabel("Edit party members");
		label_PC_RemoveHeader.setBounds(344, 171, 94, 14);
		panel_PC_PartyCreation.add(label_PC_RemoveHeader);
		
		JButton button_PC_Remove = new JButton("Remove Member");
		
		//------------------ Remove Button on Party Creation mouse listener ------------------
		button_PC_Remove.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.out.println("PC Remove Clicked");
			}
		});
		button_PC_Remove.setBounds(323, 192, 115, 23);
		panel_PC_PartyCreation.add(button_PC_Remove);
		
		JLabel label_PC_Member = new JLabel("Party Member:");
		label_PC_Member.setBounds(242, 224, 71, 14);
		panel_PC_PartyCreation.add(label_PC_Member);
		
		JComboBox comboBox_PC_MemberList = new JComboBox();
		comboBox_PC_MemberList.setBounds(323, 221, 116, 20);
		panel_PC_PartyCreation.add(comboBox_PC_MemberList);
		
		JButton button_PC_Continue = new JButton("Continue");
		
		//------------------ Continue Button on Party Creation mouse listener ------------------
		button_PC_Continue.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.out.println("PC Cont Clicked");
				switchMainPanel(2);
			}
		});
		button_PC_Continue.setFont(new Font("Tahoma", Font.PLAIN, 15));
		button_PC_Continue.setBounds(157, 255, 150, 36);
		panel_PC_PartyCreation.add(button_PC_Continue);
		
		JPanel panel_TO_TravelOptions = new JPanel();
		panel_M_Main.add(panel_TO_TravelOptions, "2");    //Travel Options Panel -- panel 2
		panel_TO_TravelOptions.setLayout(null);
		
		JLabel label_TO_Title = new JLabel("Travel Options");
		label_TO_Title.setBounds(10, 11, 444, 25);
		label_TO_Title.setHorizontalAlignment(SwingConstants.CENTER);
		label_TO_Title.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_TO_TravelOptions.add(label_TO_Title);
		
		JLabel label_TO_PaceHeader = new JLabel("Set travel pace");
		label_TO_PaceHeader.setBounds(10, 56, 73, 14);
		panel_TO_TravelOptions.add(label_TO_PaceHeader);
		
		JLabel label_TO_RationsHeader = new JLabel("Set rations");
		label_TO_RationsHeader.setBounds(10, 154, 52, 14);
		panel_TO_TravelOptions.add(label_TO_RationsHeader);
		
		JRadioButton radioBtn_TO_Pace1 = new JRadioButton("Stopped");
		travelPaceGroup.add(radioBtn_TO_Pace1);
		radioBtn_TO_Pace1.setBounds(20, 77, 149, 23);
		panel_TO_TravelOptions.add(radioBtn_TO_Pace1);
		
		JRadioButton radioBtn_TO_Pace2 = new JRadioButton("Slow - 5 miles per day");
		travelPaceGroup.add(radioBtn_TO_Pace2);
		radioBtn_TO_Pace2.setBounds(231, 77, 149, 23);
		panel_TO_TravelOptions.add(radioBtn_TO_Pace2);
		
		JRadioButton radioBtn_TO_Pace3 = new JRadioButton("Medium - 10 miles per day");
		travelPaceGroup.add(radioBtn_TO_Pace3);
		radioBtn_TO_Pace3.setBounds(20, 100, 149, 23);
		panel_TO_TravelOptions.add(radioBtn_TO_Pace3);
		
		JRadioButton radioBtn_TO_Pace4 = new JRadioButton("Fast - 15 miles per day");
		travelPaceGroup.add(radioBtn_TO_Pace4);
		radioBtn_TO_Pace4.setBounds(231, 100, 149, 23);
		panel_TO_TravelOptions.add(radioBtn_TO_Pace4);
		
		JRadioButton radioBtn_TO_Rations1 = new JRadioButton("Starving");
		rationsGroup.add(radioBtn_TO_Rations1);
		radioBtn_TO_Rations1.setBounds(20, 175, 187, 23);
		panel_TO_TravelOptions.add(radioBtn_TO_Rations1);
		
		JRadioButton radioBtn_TO_Rations2 = new JRadioButton("Low - 1 pound of food per person");
		rationsGroup.add(radioBtn_TO_Rations2);
		radioBtn_TO_Rations2.setBounds(231, 175, 187, 23);
		panel_TO_TravelOptions.add(radioBtn_TO_Rations2);
		
		JRadioButton radioBtn_TO_Rations3 = new JRadioButton("Medium - 3 pounds of food per person");
		rationsGroup.add(radioBtn_TO_Rations3);
		radioBtn_TO_Rations3.setBounds(20, 198, 209, 23);
		panel_TO_TravelOptions.add(radioBtn_TO_Rations3);
		
		JRadioButton radioBtn_TO_Rations4 = new JRadioButton("High - 5 pounds of food per person");
		rationsGroup.add(radioBtn_TO_Rations4);
		radioBtn_TO_Rations4.setBounds(231, 198, 193, 23);
		panel_TO_TravelOptions.add(radioBtn_TO_Rations4);
		
		JButton button_TO_Continue = new JButton("Continue");
		
		//------------------ Continue Button on Travel Options mouse listener ------------------
		button_TO_Continue.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				System.out.println("TO Cont Clicked");
				switchMainPanel(1);
			}
		});
		button_TO_Continue.setFont(new Font("Tahoma", Font.PLAIN, 15));
		button_TO_Continue.setBounds(157, 244, 150, 36);
		panel_TO_TravelOptions.add(button_TO_Continue);
		
		JPanel panel_E_Error = new JPanel();
		panel_E_Error.setBounds(0, 301, 464, 21);
		frame.getContentPane().add(panel_E_Error);
		panel_E_Error.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Error msg");
		lblNewLabel.setBounds(10, 3, 444, 14);
		panel_E_Error.add(lblNewLabel);
	}
}