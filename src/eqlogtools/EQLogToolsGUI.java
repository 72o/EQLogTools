// TODO
// - Auto update?
// - Timer bars?
//
// NOTES
// - Show PC spells for GROUP ONLY should be ON, else other's spells may show up in timers.
// - Known issue: If a casting skill is raised (in chat) at the same time as a detrimental spell lands on a target, 
//   the timers might not pick it up.
// - Known issue: Dispelled spells are not removed from timers.


package eqlogtools;

import sun.audio.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.*;
import java.lang.reflect.Method;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.UIManager;

import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.prefs.*;
import java.util.List;
import java.awt.Window.Type;



public class EQLogToolsGUI extends JFrame
{
	public static int mPosX=0,mPosY=0;
	public static String programTitle = "EQ LogTools beta 0.7";
	public static int counterSleepDelay = 1000;
	public static int thisSpellCastingTime;
	public static String selectedFileParentDirectory;
	public static boolean parsingTimerStarted = false;
	public static int startParsingdelay = 1;
	public static long currentTimeStamp;
	public static long selectedFileTimeStamp;
	public static String selectedFileTimeStampFormatted;
	public static File selectedFile;
	public static String currentLine;
	public static JTextField logLineField;
	public static JTextField logLineField_2;
	public static int whichSpellCounter;
	public static boolean parsingThreadOneIsRunning = false;
	public static boolean fileChooserUsed = false;
	public static String selectedFileString;
	public static int selectedClass;
	public static int selectedLevel;
	public static String[][] stringTriggerLanded;
	public static String[][] stringTrigger;
	public static long[][] spellTimers;
	public static String[][] spellNames;
	public static boolean parsingThreadTwoIsRunning;
	public static boolean parsingThreadThreeIsRunning;
	public static boolean stoppedCasting = false;
	
	public static int combo_01_CurrentSelection;
	public static int combo_02_CurrentSelection;
	public static int combo_03_CurrentSelection;
	public static int combo_04_CurrentSelection;
	public static int combo_05_CurrentSelection;
	public static int combo_06_CurrentSelection;
	public static int combo_07_CurrentSelection;
	public static int combo_08_CurrentSelection;
	public static int combo_09_CurrentSelection;
	public static int combo_10_CurrentSelection;
	public static int combo_11_CurrentSelection;
	public static int combo_12_CurrentSelection;
	public static int combo_13_CurrentSelection;
	public static int combo_14_CurrentSelection;
	public static int combo_15_CurrentSelection;
	public static int combo_16_CurrentSelection;
	public static int combo_17_CurrentSelection;
	public static int combo_18_CurrentSelection;
	
	public static String comboGroup_01_SpellCounterString;
	public static String comboGroup_02_SpellCounterString;
	public static String comboGroup_03_SpellCounterString;
	public static String comboGroup_04_SpellCounterString;
	public static String comboGroup_05_SpellCounterString;
	public static String comboGroup_06_SpellCounterString;
	public static String comboGroup_07_SpellCounterString;
	public static String comboGroup_08_SpellCounterString;
	public static String comboGroup_09_SpellCounterString;
	public static String comboGroup_10_SpellCounterString;
	public static String comboGroup_11_SpellCounterString;
	public static String comboGroup_12_SpellCounterString;
	public static String comboGroup_13_SpellCounterString;
	public static String comboGroup_14_SpellCounterString;
	public static String comboGroup_15_SpellCounterString;
	public static String comboGroup_16_SpellCounterString;
	public static String comboGroup_17_SpellCounterString;
	public static String comboGroup_18_SpellCounterString;
	
	public static long comboGroup_01_SpellCounter;
	public static long comboGroup_02_SpellCounter;
	public static long comboGroup_03_SpellCounter;
	public static long comboGroup_04_SpellCounter;
	public static long comboGroup_05_SpellCounter;
	public static long comboGroup_06_SpellCounter;
	public static long comboGroup_07_SpellCounter;
	public static long comboGroup_08_SpellCounter;
	public static long comboGroup_09_SpellCounter;
	public static long comboGroup_10_SpellCounter;
	public static long comboGroup_11_SpellCounter;
	public static long comboGroup_12_SpellCounter;
	public static long comboGroup_13_SpellCounter;
	public static long comboGroup_14_SpellCounter;
	public static long comboGroup_15_SpellCounter;
	public static long comboGroup_16_SpellCounter;
	public static long comboGroup_17_SpellCounter;
	public static long comboGroup_18_SpellCounter;
	
	public static boolean spellTimer_01_IsRunning = false; 
	public static boolean spellTimer_02_IsRunning = false;
	public static boolean spellTimer_03_IsRunning = false;
	public static boolean spellTimer_04_IsRunning = false;
	public static boolean spellTimer_05_IsRunning = false;
	public static boolean spellTimer_06_IsRunning = false;
	public static boolean spellTimer_07_IsRunning = false;
	public static boolean spellTimer_08_IsRunning = false;
	public static boolean spellTimer_09_IsRunning = false;
	public static boolean spellTimer_10_IsRunning = false;
	public static boolean spellTimer_11_IsRunning = false;
	public static boolean spellTimer_12_IsRunning = false;
	public static boolean spellTimer_13_IsRunning = false;
	public static boolean spellTimer_14_IsRunning = false;
	public static boolean spellTimer_15_IsRunning = false;
	public static boolean spellTimer_16_IsRunning = false;
	public static boolean spellTimer_17_IsRunning = false;
	public static boolean spellTimer_18_IsRunning = false;
	
	public static String triggerText_01_String;
	public static String triggerText_02_String;
	public static String triggerText_03_String;
	public static String triggerText_04_String;
	public static String triggerText_05_String;
	public static String triggerText_06_String;
	public static String triggerText_07_String;
	public static String triggerText_08_String;
	public static String triggerText_09_String;
	
	int currentWindowLocationInt_X;
	int currentWindowLocationInt_Y;
	int retrievedWinPosFromRegistry_X;
	int retrievedWinPosFromRegistry_Y;
	int retrievedClassFromRegistry;
	static boolean retrievedAlwaysOnTopFromRegistry;
	public static boolean retrievedPlayTriggerSoundsFromRegistry;
	public static String userDirectory;
	public static String currentLogFile;
	static String registryName = "eqlogtools";
	static Preferences prefs = Preferences.userRoot().node(registryName);
	
	public static JComboBox comboGroup_01;
	public static JComboBox comboGroup_02;
	public static JComboBox comboGroup_03;
	public static JComboBox comboGroup_04;
	public static JComboBox comboGroup_05;
	public static JComboBox comboGroup_06;
	public static JComboBox comboGroup_07;
	public static JComboBox comboGroup_08;
	public static JComboBox comboGroup_09;
	public static JComboBox comboGroup_10;
	public static JComboBox comboGroup_11;
	public static JComboBox comboGroup_12;
	public static JComboBox comboGroup_13;
	public static JComboBox comboGroup_14;
	public static JComboBox comboGroup_15;
	public static JComboBox comboGroup_16;
	public static JComboBox comboGroup_17;
	public static JComboBox comboGroup_18;
	public static JComboBox comboClassList;
	public static JComboBox comboLevelPicker;
	
	public static JTextField spellTimer_01;
	public static JTextField spellTimer_02;
	public static JTextField spellTimer_03;
	public static JTextField spellTimer_04;
	public static JTextField spellTimer_05;
	public static JTextField spellTimer_06;
	public static JTextField spellTimer_07;
	public static JTextField spellTimer_08;
	public static JTextField spellTimer_18;
	public static JTextField spellTimer_17;
	public static JTextField spellTimer_16;
	public static JTextField spellTimer_15;
	public static JTextField spellTimer_14;
	public static JTextField spellTimer_13;
	public static JTextField spellTimer_12;
	public static JTextField spellTimer_11;
	public static JTextField spellTimer_10;
	public static JTextField spellTimer_09;
	
	public static JLabel groupLabel_01;
	public static JLabel groupLabel_02;
	public static JLabel groupLabel_03;
	public static JLabel groupLabel_04;
	public static JLabel groupLabel_05;
	public static JLabel groupLabel_06;
	public static JLabel groupLabel_07;
	public static JLabel groupLabel_08;
	public static JLabel groupLabel_09;
	public static JLabel groupLabel_10;
	public static JLabel groupLabel_11;
	public static JLabel groupLabel_12;
	public static JLabel groupLabel_13;
	public static JLabel groupLabel_14;
	public static JLabel groupLabel_15;
	public static JLabel groupLabel_16;
	public static JLabel groupLabel_17;
	public static JLabel groupLabel_18;
	
	public static JCheckBox chckbxAlwaysOnTop;
	public static JCheckBox chckbxPlayTriggerSounds;
	public static JLabel lblParsingStatus;
	public static JLabel lblParsingStatus_2;
	static JLabel lblLogStatus;
	static JPanel panel = new JPanel();
	static JFrame frame = new JFrame();
	
	private JPanel TriggersPanel;
	public static JTextField triggerText_01;
	public static JTextField triggerText_02;
	public static JTextField triggerText_03;
	public static JTextField triggerText_04;
	public static JTextField triggerText_05;
	public static JTextField triggerText_06;
	public static JTextField triggerText_07;
	public static JTextField triggerText_08;
	public static JTextField triggerText_09;
	
	public static JLabel lblTrigger_01;
	public static JLabel lblTrigger_02;
	public static JLabel lblTrigger_03;
	public static JLabel lblTrigger_04;
	public static JLabel lblTrigger_05;
	public static JLabel lblTrigger_06;
	public static JLabel lblTrigger_07;
	public static JLabel lblTrigger_08;
	public static JLabel lblTrigger_09;
	
	public static ImageIcon triggerIcon = new ImageIcon(EQLogToolsGUI.class.getResource("/res/trigger.png"));
	public static ImageIcon blankIcon = new ImageIcon(EQLogToolsGUI.class.getResource("/res/blank.png"));
	
	public static boolean trigger_01_Activated = true;
	public static boolean trigger_02_Activated = true;
	public static boolean trigger_03_Activated = true;
	public static boolean trigger_04_Activated = true;
	public static boolean trigger_05_Activated = true;
	public static boolean trigger_06_Activated = true;
	public static boolean trigger_07_Activated = true;
	public static boolean trigger_08_Activated = true;
	public static boolean trigger_09_Activated = true;
	
	public EQLogToolsGUI()
	{
		setIconImage(Toolkit.getDefaultToolkit().getImage(EQLogToolsGUI.class.getResource("/res/icon.png")));
		setResizable(false);
		setTitle(programTitle);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 438, 313);
		setUndecorated(true);
	
		userDirectory = prefs.get("currentdirectory", userDirectory);
		currentLogFile = prefs.get("currentlogfile", currentLogFile);
		retrievedClassFromRegistry = prefs.getInt("class", retrievedClassFromRegistry);
		retrievedAlwaysOnTopFromRegistry = prefs.getBoolean("alwaysontop", retrievedAlwaysOnTopFromRegistry);
		retrievedPlayTriggerSoundsFromRegistry = prefs.getBoolean("playtriggersounds", retrievedPlayTriggerSoundsFromRegistry);
		retrievedWinPosFromRegistry_X = prefs.getInt("windowposition_x", retrievedWinPosFromRegistry_X);
		retrievedWinPosFromRegistry_Y = prefs.getInt("windowposition_y", retrievedWinPosFromRegistry_Y);
		
		if (userDirectory != null)
		{
			selectedFile = new File(currentLogFile);
			selectedFileTimeStamp = selectedFile.lastModified();
			selectedFileString = selectedFile.toString(); 
		}

		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panel);
		panel.setLayout(null);
		
		JLabel lblMinimize = new JLabel();
		lblMinimize.setBounds(393, 1, 18, 18);
		lblMinimize.setToolTipText("Minimize program");
		lblMinimize.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource("/res/button_minimize.png")));
		panel.add(lblMinimize);
		lblMinimize.addMouseListener(new MouseAdapter()
		{
			@Override
			public void mouseClicked(MouseEvent e)
			{
				setState(JFrame.ICONIFIED);
			}
		});
		
		JLabel lblExit = new JLabel();
		lblExit.setBounds(418, 1, 18, 18);
		lblExit.setToolTipText("Exit program");
		lblExit.setIcon(new ImageIcon(EQLogToolsGUI.class.getResource("/res/button_close.png")));
		panel.add(lblExit);
		lblExit.addMouseListener(new MouseAdapter()
		{
			@Override
			public void mouseClicked(MouseEvent e)
			{
				System.exit(0);
			}
		});
		
		chckbxAlwaysOnTop = new JCheckBox("Always on Top");
		chckbxAlwaysOnTop.setBounds(282, 0, 110, 19);
		chckbxAlwaysOnTop.setToolTipText("Set program \"Always on Top\"");
		panel.add(chckbxAlwaysOnTop);
		chckbxAlwaysOnTop.setBackground(Color.LIGHT_GRAY);
		chckbxAlwaysOnTop.setFont(new Font("Consolas", Font.PLAIN, 11));
		chckbxAlwaysOnTop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				setAlwaysOnTop(chckbxAlwaysOnTop.isSelected());
				
				LoadPreferences.retrievedAlwaysOnTopFromRegistry = chckbxAlwaysOnTop.isSelected();
				prefs.putBoolean("alwaysontop", LoadPreferences.retrievedAlwaysOnTopFromRegistry);
			}
		});
		
		chckbxAlwaysOnTop.setSelected(LoadPreferences.retrievedAlwaysOnTopFromRegistry);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 440, 313);
		tabbedPane.setBackground(Color.LIGHT_GRAY);
		tabbedPane.setFont(new Font("Consolas", Font.PLAIN, 11));
		panel.add(tabbedPane);
		
		JPanel TimersPanel = new JPanel();
		tabbedPane.addTab("Spell Timers", null, TimersPanel, null);
		tabbedPane.setEnabledAt(0, true);
		TimersPanel.setLayout(null);
		
		logLineField = new JTextField();
		logLineField.setBackground(Color.WHITE);
		logLineField.setEditable(false);
		logLineField.setBounds(5, 25, 424, 19);
		TimersPanel.add(logLineField);
		logLineField.setFont(new Font("Arial", Font.PLAIN, 10));
		logLineField.setColumns(10);
				
		lblLogStatus = new JLabel();
		lblLogStatus.setBackground(UIManager.getColor("ComboBox.background"));
		lblLogStatus.setBounds(4, 252, 429, 13);
		TimersPanel.add(lblLogStatus);
		lblLogStatus.setFont(new Font("Consolas", Font.PLAIN, 9));
		
		spellTimer_01 = new JTextField();
		spellTimer_01.setForeground(Color.RED);
		spellTimer_01.setFont(new Font("Consolas", Font.BOLD, 12));
		spellTimer_01.setBounds(149, 45, 48, 20);
		TimersPanel.add(spellTimer_01);
		spellTimer_01.setColumns(10);
		
		spellTimer_02 = new JTextField();
		spellTimer_02.setForeground(Color.RED);
		spellTimer_02.setFont(new Font("Consolas", Font.BOLD, 12));
		spellTimer_02.setBounds(149, 68, 48, 20);
		TimersPanel.add(spellTimer_02);
		spellTimer_02.setColumns(10);
		
		spellTimer_03 = new JTextField();
		spellTimer_03.setForeground(Color.RED);
		spellTimer_03.setFont(new Font("Consolas", Font.BOLD, 12));
		spellTimer_03.setColumns(10);
		spellTimer_03.setBounds(149, 91, 48, 20);
		TimersPanel.add(spellTimer_03);
		
		spellTimer_04 = new JTextField();
		spellTimer_04.setForeground(Color.RED);
		spellTimer_04.setFont(new Font("Consolas", Font.BOLD, 12));
		spellTimer_04.setColumns(10);
		spellTimer_04.setBounds(149, 114, 48, 20);
		TimersPanel.add(spellTimer_04);
		
		spellTimer_05 = new JTextField();
		spellTimer_05.setForeground(Color.RED);
		spellTimer_05.setFont(new Font("Consolas", Font.BOLD, 12));
		spellTimer_05.setColumns(10);
		spellTimer_05.setBounds(149, 137, 48, 20);
		TimersPanel.add(spellTimer_05);
		
		spellTimer_06 = new JTextField();
		spellTimer_06.setForeground(Color.RED);
		spellTimer_06.setFont(new Font("Consolas", Font.BOLD, 12));
		spellTimer_06.setColumns(10);
		spellTimer_06.setBounds(149, 160, 48, 20);
		TimersPanel.add(spellTimer_06);
		
		spellTimer_07 = new JTextField();
		spellTimer_07.setForeground(Color.RED);
		spellTimer_07.setFont(new Font("Consolas", Font.BOLD, 12));
		spellTimer_07.setColumns(10);
		spellTimer_07.setBounds(149, 183, 48, 20);
		TimersPanel.add(spellTimer_07);
		
		spellTimer_08 = new JTextField();
		spellTimer_08.setForeground(Color.RED);
		spellTimer_08.setFont(new Font("Consolas", Font.BOLD, 12));
		spellTimer_08.setColumns(10);
		spellTimer_08.setBounds(149, 206, 48, 20);
		TimersPanel.add(spellTimer_08);
		
		spellTimer_09 = new JTextField();
		spellTimer_09.setForeground(Color.RED);
		spellTimer_09.setFont(new Font("Consolas", Font.BOLD, 12));
		spellTimer_09.setColumns(10);
		spellTimer_09.setBounds(378, 45, 48, 20);
		TimersPanel.add(spellTimer_09);
		
		spellTimer_10 = new JTextField();
		spellTimer_10.setForeground(Color.RED);
		spellTimer_10.setFont(new Font("Consolas", Font.BOLD, 12));
		spellTimer_10.setColumns(10);
		spellTimer_10.setBounds(378, 68, 48, 20);
		TimersPanel.add(spellTimer_10);
		
		spellTimer_11 = new JTextField();
		spellTimer_11.setForeground(Color.RED);
		spellTimer_11.setFont(new Font("Consolas", Font.BOLD, 12));
		spellTimer_11.setColumns(10);
		spellTimer_11.setBounds(378, 91, 48, 20);
		TimersPanel.add(spellTimer_11);
		
		spellTimer_12 = new JTextField();
		spellTimer_12.setForeground(Color.RED);
		spellTimer_12.setFont(new Font("Consolas", Font.BOLD, 12));
		spellTimer_12.setColumns(10);
		spellTimer_12.setBounds(378, 114, 48, 20);
		TimersPanel.add(spellTimer_12);
		
		spellTimer_13 = new JTextField();
		spellTimer_13.setForeground(Color.RED);
		spellTimer_13.setFont(new Font("Consolas", Font.BOLD, 12));
		spellTimer_13.setColumns(10);
		spellTimer_13.setBounds(378, 137, 48, 20);
		TimersPanel.add(spellTimer_13);
		
		spellTimer_14 = new JTextField();
		spellTimer_14.setForeground(Color.RED);
		spellTimer_14.setFont(new Font("Consolas", Font.BOLD, 12));
		spellTimer_14.setColumns(10);
		spellTimer_14.setBounds(378, 160, 48, 20);
		TimersPanel.add(spellTimer_14);
		
		spellTimer_15 = new JTextField();
		spellTimer_15.setForeground(Color.RED);
		spellTimer_15.setFont(new Font("Consolas", Font.BOLD, 12));
		spellTimer_15.setColumns(10);
		spellTimer_15.setBounds(378, 183, 48, 20);
		TimersPanel.add(spellTimer_15);
		
		spellTimer_16 = new JTextField();
		spellTimer_16.setForeground(Color.RED);
		spellTimer_16.setFont(new Font("Consolas", Font.BOLD, 12));
		spellTimer_16.setColumns(10);
		spellTimer_16.setBounds(378, 206, 48, 20);
		TimersPanel.add(spellTimer_16);
		
		spellTimer_17 = new JTextField();
		spellTimer_17.setForeground(Color.RED);
		spellTimer_17.setFont(new Font("Consolas", Font.BOLD, 12));
		spellTimer_17.setColumns(10);
		spellTimer_17.setBounds(149, 229, 48, 20);
		TimersPanel.add(spellTimer_17);
		
		spellTimer_18 = new JTextField();
		spellTimer_18.setForeground(Color.RED);
		spellTimer_18.setFont(new Font("Consolas", Font.BOLD, 12));
		spellTimer_18.setColumns(10);
		spellTimer_18.setBounds(378, 229, 48, 20);
		TimersPanel.add(spellTimer_18);
		
		lblParsingStatus = new JLabel("");
		lblParsingStatus.setFont(new Font("Consolas", Font.PLAIN, 10));
		lblParsingStatus.setForeground(new Color(0, 100, 0));
		lblParsingStatus.setBounds(3, 270, 320, 14);
		TimersPanel.add(lblParsingStatus);
		
		groupLabel_01 = new JLabel("");
		groupLabel_01.setIcon(null);
		groupLabel_01.setBounds(8, 45, 20, 20);
		TimersPanel.add(groupLabel_01);
		
		groupLabel_02 = new JLabel("");
		groupLabel_02.setIcon(null);
		groupLabel_02.setBounds(8, 68, 20, 20);
		TimersPanel.add(groupLabel_02);
		
		groupLabel_03 = new JLabel("");
		groupLabel_03.setIcon(null);
		groupLabel_03.setBounds(8, 91, 20, 20);
		TimersPanel.add(groupLabel_03);
		
		groupLabel_04 = new JLabel("");
		groupLabel_04.setIcon(null);
		groupLabel_04.setBounds(8, 114, 20, 20);
		TimersPanel.add(groupLabel_04);
		
		groupLabel_05 = new JLabel("");
		groupLabel_05.setIcon(null);
		groupLabel_05.setBounds(8, 137, 20, 20);
		TimersPanel.add(groupLabel_05);
		
		groupLabel_06 = new JLabel("");
		groupLabel_06.setIcon(null);
		groupLabel_06.setBounds(8, 160, 20, 20);
		TimersPanel.add(groupLabel_06);
		
		groupLabel_07 = new JLabel("");
		groupLabel_07.setIcon(null);
		groupLabel_07.setBounds(8, 183, 20, 20);
		TimersPanel.add(groupLabel_07);
		
		groupLabel_08 = new JLabel("");
		groupLabel_08.setIcon(null);
		groupLabel_08.setBounds(8, 206, 20, 20);
		TimersPanel.add(groupLabel_08);
		
		groupLabel_09 = new JLabel("");
		groupLabel_09.setIcon(null);
		groupLabel_09.setBounds(236, 45, 20, 20);
		TimersPanel.add(groupLabel_09);
		
		groupLabel_10 = new JLabel("");
		groupLabel_10.setIcon(null);
		groupLabel_10.setBounds(236, 68, 20, 20);
		TimersPanel.add(groupLabel_10);
		
		groupLabel_11 = new JLabel("");
		groupLabel_11.setIcon(null);
		groupLabel_11.setBounds(236, 91, 20, 20);
		TimersPanel.add(groupLabel_11);
		
		groupLabel_12 = new JLabel("");
		groupLabel_12.setIcon(null);
		groupLabel_12.setBounds(236, 114, 20, 20);
		TimersPanel.add(groupLabel_12);
		
		groupLabel_13 = new JLabel("");
		groupLabel_13.setIcon(null);
		groupLabel_13.setBounds(236, 137, 20, 20);
		TimersPanel.add(groupLabel_13);
		
		groupLabel_14 = new JLabel("");
		groupLabel_14.setIcon(null);
		groupLabel_14.setBounds(236, 160, 20, 20);
		TimersPanel.add(groupLabel_14);
		
		groupLabel_15 = new JLabel("");
		groupLabel_15.setIcon(null);
		groupLabel_15.setBounds(236, 183, 20, 20);
		TimersPanel.add(groupLabel_15);
		
		groupLabel_16 = new JLabel("");
		groupLabel_16.setIcon(null);
		groupLabel_16.setBounds(236, 206, 20, 20);
		TimersPanel.add(groupLabel_16);
		
		groupLabel_17 = new JLabel("");
		groupLabel_17.setIcon(null);
		groupLabel_17.setBounds(8, 229, 20, 20);
		TimersPanel.add(groupLabel_17);
		
		groupLabel_18 = new JLabel("");
		groupLabel_18.setIcon(null);
		groupLabel_18.setBounds(236, 229, 20, 20);
		TimersPanel.add(groupLabel_18);
		
		comboGroup_01 = new JComboBox();
		comboGroup_01.setBackground(Color.WHITE);
		comboGroup_01.setMaximumRowCount(16);
		comboGroup_01.setModel(new DefaultComboBoxModel(new String[] {""}));
		comboGroup_01.setFont(new Font("Consolas", Font.PLAIN, 10));
		comboGroup_01.setBounds(32, 45, 115, 20);
		TimersPanel.add(comboGroup_01);
		comboGroup_01.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				combo_01_CurrentSelection = comboGroup_01.getSelectedIndex();
				if (selectedClass == 1) {
					prefs.putInt("bard_combo_01", combo_01_CurrentSelection); }
				if (selectedClass == 2) {
					prefs.putInt("cleric_combo_01", combo_01_CurrentSelection); }
				if (selectedClass == 3) {
					prefs.putInt("druid_combo_01", combo_01_CurrentSelection); }
				if (selectedClass == 4) {
					prefs.putInt("enchanter_combo_01", combo_01_CurrentSelection); }
				if (selectedClass == 5) {
					prefs.putInt("magician_combo_01", combo_01_CurrentSelection); }
				if (selectedClass == 6) {
					prefs.putInt("monk_combo_01", combo_01_CurrentSelection); }
				if (selectedClass == 7) {
					prefs.putInt("necromancer_combo_01", combo_01_CurrentSelection); }
				if (selectedClass == 8) {
					prefs.putInt("paladin_combo_01", combo_01_CurrentSelection); }
				if (selectedClass == 9) {
					prefs.putInt("ranger_combo_01", combo_01_CurrentSelection); }
				if (selectedClass == 10) {
					prefs.putInt("rogue_combo_01", combo_01_CurrentSelection); }
				if (selectedClass == 11) {
					prefs.putInt("shadowknight_combo_01", combo_01_CurrentSelection); }
				if (selectedClass == 12) {
					prefs.putInt("shaman_combo_01", combo_01_CurrentSelection); }
				if (selectedClass == 13) {
					prefs.putInt("warrior_combo_01", combo_01_CurrentSelection); }
				if (selectedClass == 14) {
					prefs.putInt("wizard_combo_01", combo_01_CurrentSelection); }

				String thisSpell = comboGroup_01.getSelectedItem().toString();
				ImageIcon icon = new ImageIcon();
				ClassHandler.getSpellType(thisSpell);
				groupLabel_01.setIcon(ClassHandler.iconName);
			}
		});
		
		comboGroup_02 = new JComboBox();
		comboGroup_02.setBackground(Color.WHITE);
		comboGroup_02.setMaximumRowCount(16);
		comboGroup_02.setModel(new DefaultComboBoxModel(new String[] {""}));
		comboGroup_02.setFont(new Font("Consolas", Font.PLAIN, 10));
		comboGroup_02.setBounds(32, 68, 115, 20);
		TimersPanel.add(comboGroup_02);
		comboGroup_02.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				combo_02_CurrentSelection = comboGroup_02.getSelectedIndex();
				if (selectedClass == 1) {
					prefs.putInt("bard_combo_02", combo_02_CurrentSelection); }
				if (selectedClass == 2) {
					prefs.putInt("cleric_combo_02", combo_02_CurrentSelection); }
				if (selectedClass == 3) {
					prefs.putInt("druid_combo_02", combo_02_CurrentSelection); }
				if (selectedClass == 4) {
					prefs.putInt("enchanter_combo_02", combo_02_CurrentSelection); }
				if (selectedClass == 5) {
					prefs.putInt("magician_combo_02", combo_02_CurrentSelection); }
				if (selectedClass == 6) {
					prefs.putInt("monk_combo_02", combo_02_CurrentSelection); }
				if (selectedClass == 7) {
					prefs.putInt("necromancer_combo_02", combo_02_CurrentSelection); }
				if (selectedClass == 8) {
					prefs.putInt("paladin_combo_02", combo_02_CurrentSelection); }
				if (selectedClass == 9) {
					prefs.putInt("ranger_combo_02", combo_02_CurrentSelection); }
				if (selectedClass == 10) {
					prefs.putInt("rogue_combo_02", combo_02_CurrentSelection); }
				if (selectedClass == 11) {
					prefs.putInt("shadowknight_combo_02", combo_02_CurrentSelection); }
				if (selectedClass == 12) {
					prefs.putInt("shaman_combo_02", combo_02_CurrentSelection); }
				if (selectedClass == 13) {
					prefs.putInt("warrior_combo_02", combo_02_CurrentSelection); }
				if (selectedClass == 14) {
					prefs.putInt("wizard_combo_02", combo_02_CurrentSelection); }
				
				String thisSpell = comboGroup_02.getSelectedItem().toString();
				ImageIcon icon = new ImageIcon();
				ClassHandler.getSpellType(thisSpell);
				groupLabel_02.setIcon(ClassHandler.iconName);
			}
		});
		
		comboGroup_03 = new JComboBox();
		comboGroup_03.setBackground(Color.WHITE);
		comboGroup_03.setModel(new DefaultComboBoxModel(new String[] {""}));
		comboGroup_03.setMaximumRowCount(16);
		comboGroup_03.setFont(new Font("Consolas", Font.PLAIN, 10));
		comboGroup_03.setBounds(32, 91, 115, 20);
		TimersPanel.add(comboGroup_03);
		comboGroup_03.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				combo_03_CurrentSelection = comboGroup_03.getSelectedIndex();
				if (selectedClass == 1) {
					prefs.putInt("bard_combo_03", combo_03_CurrentSelection); }
				if (selectedClass == 2) {
					prefs.putInt("cleric_combo_03", combo_03_CurrentSelection); }
				if (selectedClass == 3) {
					prefs.putInt("druid_combo_03", combo_03_CurrentSelection); }
				if (selectedClass == 4) {
					prefs.putInt("enchanter_combo_03", combo_03_CurrentSelection); }
				if (selectedClass == 5) {
					prefs.putInt("magician_combo_03", combo_03_CurrentSelection); }
				if (selectedClass == 6) {
					prefs.putInt("monk_combo_03", combo_03_CurrentSelection); }
				if (selectedClass == 7) {
					prefs.putInt("necromancer_combo_03", combo_03_CurrentSelection); }
				if (selectedClass == 8) {
					prefs.putInt("paladin_combo_03", combo_03_CurrentSelection); }
				if (selectedClass == 9) {
					prefs.putInt("ranger_combo_03", combo_03_CurrentSelection); }
				if (selectedClass == 10) {
					prefs.putInt("rogue_combo_03", combo_03_CurrentSelection); }
				if (selectedClass == 11) {
					prefs.putInt("shadowknight_combo_03", combo_03_CurrentSelection); }
				if (selectedClass == 12) {
					prefs.putInt("shaman_combo_03", combo_03_CurrentSelection); }
				if (selectedClass == 13) {
					prefs.putInt("warrior_combo_03", combo_03_CurrentSelection); }
				if (selectedClass == 14) {
					prefs.putInt("wizard_combo_03", combo_03_CurrentSelection); }
				
				String thisSpell = comboGroup_03.getSelectedItem().toString();
				ImageIcon icon = new ImageIcon();
				ClassHandler.getSpellType(thisSpell);
				groupLabel_03.setIcon(ClassHandler.iconName);
			}
		});
		
		comboGroup_04 = new JComboBox();
		comboGroup_04.setBackground(Color.WHITE);
		comboGroup_04.setModel(new DefaultComboBoxModel(new String[] {""}));
		comboGroup_04.setMaximumRowCount(16);
		comboGroup_04.setFont(new Font("Consolas", Font.PLAIN, 10));
		comboGroup_04.setBounds(32, 114, 115, 20);
		TimersPanel.add(comboGroup_04);
		comboGroup_04.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				combo_04_CurrentSelection = comboGroup_04.getSelectedIndex();
				if (selectedClass == 1) {
					prefs.putInt("bard_combo_04", combo_04_CurrentSelection); }
				if (selectedClass == 2) {
					prefs.putInt("cleric_combo_04", combo_04_CurrentSelection); }
				if (selectedClass == 3) {
					prefs.putInt("druid_combo_04", combo_04_CurrentSelection); }
				if (selectedClass == 4) {
					prefs.putInt("enchanter_combo_04", combo_04_CurrentSelection); }
				if (selectedClass == 5) {
					prefs.putInt("magician_combo_04", combo_04_CurrentSelection); }
				if (selectedClass == 6) {
					prefs.putInt("monk_combo_04", combo_04_CurrentSelection); }
				if (selectedClass == 7) {
					prefs.putInt("necromancer_combo_04", combo_04_CurrentSelection); }
				if (selectedClass == 8) {
					prefs.putInt("paladin_combo_04", combo_04_CurrentSelection); }
				if (selectedClass == 9) {
					prefs.putInt("ranger_combo_04", combo_04_CurrentSelection); }
				if (selectedClass == 10) {
					prefs.putInt("rogue_combo_04", combo_04_CurrentSelection); }
				if (selectedClass == 11) {
					prefs.putInt("shadowknight_combo_04", combo_04_CurrentSelection); }
				if (selectedClass == 12) {
					prefs.putInt("shaman_combo_04", combo_04_CurrentSelection); }
				if (selectedClass == 13) {
					prefs.putInt("warrior_combo_04", combo_04_CurrentSelection); }
				if (selectedClass == 14) {
					prefs.putInt("wizard_combo_04", combo_04_CurrentSelection); }
				
				String thisSpell = comboGroup_04.getSelectedItem().toString();
				ImageIcon icon = new ImageIcon();
				ClassHandler.getSpellType(thisSpell);
				groupLabel_04.setIcon(ClassHandler.iconName);
			}
		});
		
		comboGroup_05 = new JComboBox();
		comboGroup_05.setBackground(Color.WHITE);
		comboGroup_05.setModel(new DefaultComboBoxModel(new String[] {""}));
		comboGroup_05.setMaximumRowCount(16);
		comboGroup_05.setFont(new Font("Consolas", Font.PLAIN, 10));
		comboGroup_05.setBounds(32, 137, 115, 20);
		TimersPanel.add(comboGroup_05);
		comboGroup_05.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				combo_05_CurrentSelection = comboGroup_05.getSelectedIndex();
				if (selectedClass == 1) {
					prefs.putInt("bard_combo_05", combo_05_CurrentSelection); }
				if (selectedClass == 2) {
					prefs.putInt("cleric_combo_05", combo_05_CurrentSelection); }
				if (selectedClass == 3) {
					prefs.putInt("druid_combo_05", combo_05_CurrentSelection); }
				if (selectedClass == 4) {
					prefs.putInt("enchanter_combo_05", combo_05_CurrentSelection); }
				if (selectedClass == 5) {
					prefs.putInt("magician_combo_05", combo_05_CurrentSelection); }
				if (selectedClass == 6) {
					prefs.putInt("monk_combo_05", combo_05_CurrentSelection); }
				if (selectedClass == 7) {
					prefs.putInt("necromancer_combo_05", combo_05_CurrentSelection); }
				if (selectedClass == 8) {
					prefs.putInt("paladin_combo_05", combo_05_CurrentSelection); }
				if (selectedClass == 9) {
					prefs.putInt("ranger_combo_05", combo_05_CurrentSelection); }
				if (selectedClass == 10) {
					prefs.putInt("rogue_combo_05", combo_05_CurrentSelection); }
				if (selectedClass == 11) {
					prefs.putInt("shadowknight_combo_05", combo_05_CurrentSelection); }
				if (selectedClass == 12) {
					prefs.putInt("shaman_combo_05", combo_05_CurrentSelection); }
				if (selectedClass == 13) {
					prefs.putInt("warrior_combo_05", combo_05_CurrentSelection); }
				if (selectedClass == 14) {
					prefs.putInt("wizard_combo_05", combo_05_CurrentSelection); }
				
				String thisSpell = comboGroup_05.getSelectedItem().toString();
				ImageIcon icon = new ImageIcon();
				ClassHandler.getSpellType(thisSpell);
				groupLabel_05.setIcon(ClassHandler.iconName);
			}
		});
		
		comboGroup_06 = new JComboBox();
		comboGroup_06.setBackground(Color.WHITE);
		comboGroup_06.setModel(new DefaultComboBoxModel(new String[] {""}));
		comboGroup_06.setMaximumRowCount(16);
		comboGroup_06.setFont(new Font("Consolas", Font.PLAIN, 10));
		comboGroup_06.setBounds(32, 160, 115, 20);
		TimersPanel.add(comboGroup_06);
		comboGroup_06.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				combo_06_CurrentSelection = comboGroup_06.getSelectedIndex();
				if (selectedClass == 1) {
					prefs.putInt("bard_combo_06", combo_06_CurrentSelection); }
				if (selectedClass == 2) {
					prefs.putInt("cleric_combo_06", combo_06_CurrentSelection); }
				if (selectedClass == 3) {
					prefs.putInt("druid_combo_06", combo_06_CurrentSelection); }
				if (selectedClass == 4) {
					prefs.putInt("enchanter_combo_06", combo_06_CurrentSelection); }
				if (selectedClass == 5) {
					prefs.putInt("magician_combo_06", combo_06_CurrentSelection); }
				if (selectedClass == 6) {
					prefs.putInt("monk_combo_06", combo_06_CurrentSelection); }
				if (selectedClass == 7) {
					prefs.putInt("necromancer_combo_06", combo_06_CurrentSelection); }
				if (selectedClass == 8) {
					prefs.putInt("paladin_combo_06", combo_06_CurrentSelection); }
				if (selectedClass == 9) {
					prefs.putInt("ranger_combo_06", combo_06_CurrentSelection); }
				if (selectedClass == 10) {
					prefs.putInt("rogue_combo_06", combo_06_CurrentSelection); }
				if (selectedClass == 11) {
					prefs.putInt("shadowknight_combo_06", combo_06_CurrentSelection); }
				if (selectedClass == 12) {
					prefs.putInt("shaman_combo_06", combo_06_CurrentSelection); }
				if (selectedClass == 13) {
					prefs.putInt("warrior_combo_06", combo_06_CurrentSelection); }
				if (selectedClass == 14) {
					prefs.putInt("wizard_combo_06", combo_06_CurrentSelection); }
				
				String thisSpell = comboGroup_06.getSelectedItem().toString();
				ImageIcon icon = new ImageIcon();
				ClassHandler.getSpellType(thisSpell);
				groupLabel_06.setIcon(ClassHandler.iconName);
			}
		});
		
		comboGroup_07 = new JComboBox();
		comboGroup_07.setBackground(Color.WHITE);
		comboGroup_07.setModel(new DefaultComboBoxModel(new String[] {""}));
		comboGroup_07.setMaximumRowCount(16);
		comboGroup_07.setFont(new Font("Consolas", Font.PLAIN, 10));
		comboGroup_07.setBounds(32, 183, 115, 20);
		TimersPanel.add(comboGroup_07);
		comboGroup_07.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				combo_07_CurrentSelection = comboGroup_07.getSelectedIndex();
				if (selectedClass == 1) {
					prefs.putInt("bard_combo_07", combo_07_CurrentSelection); }
				if (selectedClass == 2) {
					prefs.putInt("cleric_combo_07", combo_07_CurrentSelection); }
				if (selectedClass == 3) {
					prefs.putInt("druid_combo_07", combo_07_CurrentSelection); }
				if (selectedClass == 4) {
					prefs.putInt("enchanter_combo_07", combo_07_CurrentSelection); }
				if (selectedClass == 5) {
					prefs.putInt("magician_combo_07", combo_07_CurrentSelection); }
				if (selectedClass == 6) {
					prefs.putInt("monk_combo_07", combo_07_CurrentSelection); }
				if (selectedClass == 7) {
					prefs.putInt("necromancer_combo_07", combo_07_CurrentSelection); }
				if (selectedClass == 8) {
					prefs.putInt("paladin_combo_07", combo_07_CurrentSelection); }
				if (selectedClass == 9) {
					prefs.putInt("ranger_combo_07", combo_07_CurrentSelection); }
				if (selectedClass == 10) {
					prefs.putInt("rogue_combo_07", combo_07_CurrentSelection); }
				if (selectedClass == 11) {
					prefs.putInt("shadowknight_combo_07", combo_07_CurrentSelection); }
				if (selectedClass == 12) {
					prefs.putInt("shaman_combo_07", combo_07_CurrentSelection); }
				if (selectedClass == 13) {
					prefs.putInt("warrior_combo_07", combo_07_CurrentSelection); }
				if (selectedClass == 14) {
					prefs.putInt("wizard_combo_07", combo_07_CurrentSelection); }
				
				String thisSpell = comboGroup_07.getSelectedItem().toString();
				ImageIcon icon = new ImageIcon();
				ClassHandler.getSpellType(thisSpell);
				groupLabel_07.setIcon(ClassHandler.iconName);
			}
		});
		
		comboGroup_08 = new JComboBox();
		comboGroup_08.setBackground(Color.WHITE);
		comboGroup_08.setModel(new DefaultComboBoxModel(new String[] {""}));
		comboGroup_08.setMaximumRowCount(16);
		comboGroup_08.setFont(new Font("Consolas", Font.PLAIN, 10));
		comboGroup_08.setBounds(32, 206, 115, 20);
		TimersPanel.add(comboGroup_08);
		comboGroup_08.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				combo_08_CurrentSelection = comboGroup_08.getSelectedIndex();
				if (selectedClass == 1) {
					prefs.putInt("bard_combo_08", combo_08_CurrentSelection); }
				if (selectedClass == 2) {
					prefs.putInt("cleric_combo_08", combo_08_CurrentSelection); }
				if (selectedClass == 3) {
					prefs.putInt("druid_combo_08", combo_08_CurrentSelection); }
				if (selectedClass == 4) {
					prefs.putInt("enchanter_combo_08", combo_08_CurrentSelection); }
				if (selectedClass == 5) {
					prefs.putInt("magician_combo_08", combo_08_CurrentSelection); }
				if (selectedClass == 6) {
					prefs.putInt("monk_combo_08", combo_08_CurrentSelection); }
				if (selectedClass == 7) {
					prefs.putInt("necromancer_combo_08", combo_08_CurrentSelection); }
				if (selectedClass == 8) {
					prefs.putInt("paladin_combo_08", combo_08_CurrentSelection); }
				if (selectedClass == 9) {
					prefs.putInt("ranger_combo_08", combo_08_CurrentSelection); }
				if (selectedClass == 10) {
					prefs.putInt("rogue_combo_08", combo_08_CurrentSelection); }
				if (selectedClass == 11) {
					prefs.putInt("shadowknight_combo_08", combo_08_CurrentSelection); }
				if (selectedClass == 12) {
					prefs.putInt("shaman_combo_08", combo_08_CurrentSelection); }
				if (selectedClass == 13) {
					prefs.putInt("warrior_combo_08", combo_08_CurrentSelection); }
				if (selectedClass == 14) {
					prefs.putInt("wizard_combo_08", combo_08_CurrentSelection); }
				
				String thisSpell = comboGroup_08.getSelectedItem().toString();
				ImageIcon icon = new ImageIcon();
				ClassHandler.getSpellType(thisSpell);
				groupLabel_08.setIcon(ClassHandler.iconName);
			}
		});
		
		comboGroup_09 = new JComboBox();
		comboGroup_09.setBackground(Color.WHITE);
		comboGroup_09.setModel(new DefaultComboBoxModel(new String[] {""}));
		comboGroup_09.setMaximumRowCount(16);
		comboGroup_09.setFont(new Font("Consolas", Font.PLAIN, 10));
		comboGroup_09.setBounds(261, 45, 115, 20);
		TimersPanel.add(comboGroup_09);
		comboGroup_09.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				combo_09_CurrentSelection = comboGroup_09.getSelectedIndex();
				if (selectedClass == 1) {
					prefs.putInt("bard_combo_09", combo_09_CurrentSelection); }
				if (selectedClass == 2) {
					prefs.putInt("cleric_combo_09", combo_09_CurrentSelection); }
				if (selectedClass == 3) {
					prefs.putInt("druid_combo_09", combo_09_CurrentSelection); }
				if (selectedClass == 4) {
					prefs.putInt("enchanter_combo_09", combo_09_CurrentSelection); }
				if (selectedClass == 5) {
					prefs.putInt("magician_combo_09", combo_09_CurrentSelection); }
				if (selectedClass == 6) {
					prefs.putInt("monk_combo_09", combo_09_CurrentSelection); }
				if (selectedClass == 7) {
					prefs.putInt("necromancer_combo_09", combo_09_CurrentSelection); }
				if (selectedClass == 8) {
					prefs.putInt("paladin_combo_09", combo_09_CurrentSelection); }
				if (selectedClass == 9) {
					prefs.putInt("ranger_combo_09", combo_09_CurrentSelection); }
				if (selectedClass == 10) {
					prefs.putInt("rogue_combo_09", combo_09_CurrentSelection); }
				if (selectedClass == 11) {
					prefs.putInt("shadowknight_combo_09", combo_09_CurrentSelection); }
				if (selectedClass == 12) {
					prefs.putInt("shaman_combo_09", combo_09_CurrentSelection); }
				if (selectedClass == 13) {
					prefs.putInt("warrior_combo_09", combo_09_CurrentSelection); }
				if (selectedClass == 14) {
					prefs.putInt("wizard_combo_09", combo_09_CurrentSelection); }
				
				String thisSpell = comboGroup_09.getSelectedItem().toString();
				ImageIcon icon = new ImageIcon();
				ClassHandler.getSpellType(thisSpell);
				groupLabel_09.setIcon(ClassHandler.iconName);
			}
		});
		
		comboGroup_10 = new JComboBox();
		comboGroup_10.setBackground(Color.WHITE);
		comboGroup_10.setModel(new DefaultComboBoxModel(new String[] {""}));
		comboGroup_10.setMaximumRowCount(16);
		comboGroup_10.setFont(new Font("Consolas", Font.PLAIN, 10));
		comboGroup_10.setBounds(261, 68, 115, 20);
		TimersPanel.add(comboGroup_10);
		comboGroup_10.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				combo_10_CurrentSelection = comboGroup_10.getSelectedIndex();
				if (selectedClass == 1) {
					prefs.putInt("bard_combo_10", combo_10_CurrentSelection); }
				if (selectedClass == 2) {
					prefs.putInt("cleric_combo_10", combo_10_CurrentSelection); }
				if (selectedClass == 3) {
					prefs.putInt("druid_combo_10", combo_10_CurrentSelection); }
				if (selectedClass == 4) {
					prefs.putInt("enchanter_combo_10", combo_10_CurrentSelection); }
				if (selectedClass == 5) {
					prefs.putInt("magician_combo_10", combo_10_CurrentSelection); }
				if (selectedClass == 6) {
					prefs.putInt("monk_combo_10", combo_10_CurrentSelection); }
				if (selectedClass == 7) {
					prefs.putInt("necromancer_combo_10", combo_10_CurrentSelection); }
				if (selectedClass == 8) {
					prefs.putInt("paladin_combo_10", combo_10_CurrentSelection); }
				if (selectedClass == 9) {
					prefs.putInt("ranger_combo_10", combo_10_CurrentSelection); }
				if (selectedClass == 10) {
					prefs.putInt("rogue_combo_10", combo_10_CurrentSelection); }
				if (selectedClass == 11) {
					prefs.putInt("shadowknight_combo_10", combo_10_CurrentSelection); }
				if (selectedClass == 12) {
					prefs.putInt("shaman_combo_10", combo_10_CurrentSelection); }
				if (selectedClass == 13) {
					prefs.putInt("warrior_combo_10", combo_10_CurrentSelection); }
				if (selectedClass == 14) {
					prefs.putInt("wizard_combo_10", combo_10_CurrentSelection); }
				
				String thisSpell = comboGroup_10.getSelectedItem().toString();
				ImageIcon icon = new ImageIcon();
				ClassHandler.getSpellType(thisSpell);
				groupLabel_10.setIcon(ClassHandler.iconName);
			}
		});
		
		comboGroup_11 = new JComboBox();
		comboGroup_11.setBackground(Color.WHITE);
		comboGroup_11.setModel(new DefaultComboBoxModel(new String[] {""}));
		comboGroup_11.setMaximumRowCount(16);
		comboGroup_11.setFont(new Font("Consolas", Font.PLAIN, 10));
		comboGroup_11.setBounds(261, 91, 115, 20);
		TimersPanel.add(comboGroup_11);
		comboGroup_11.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				combo_11_CurrentSelection = comboGroup_11.getSelectedIndex();
				if (selectedClass == 1) {
					prefs.putInt("bard_combo_11", combo_11_CurrentSelection); }
				if (selectedClass == 2) {
					prefs.putInt("cleric_combo_11", combo_11_CurrentSelection); }
				if (selectedClass == 3) {
					prefs.putInt("druid_combo_11", combo_11_CurrentSelection); }
				if (selectedClass == 4) {
					prefs.putInt("enchanter_combo_11", combo_11_CurrentSelection); }
				if (selectedClass == 5) {
					prefs.putInt("magician_combo_11", combo_11_CurrentSelection); }
				if (selectedClass == 6) {
					prefs.putInt("monk_combo_11", combo_11_CurrentSelection); }
				if (selectedClass == 7) {
					prefs.putInt("necromancer_combo_11", combo_11_CurrentSelection); }
				if (selectedClass == 8) {
					prefs.putInt("paladin_combo_11", combo_11_CurrentSelection); }
				if (selectedClass == 9) {
					prefs.putInt("ranger_combo_11", combo_11_CurrentSelection); }
				if (selectedClass == 10) {
					prefs.putInt("rogue_combo_11", combo_11_CurrentSelection); }
				if (selectedClass == 11) {
					prefs.putInt("shadowknight_combo_11", combo_11_CurrentSelection); }
				if (selectedClass == 12) {
					prefs.putInt("shaman_combo_11", combo_11_CurrentSelection); }
				if (selectedClass == 13) {
					prefs.putInt("warrior_combo_11", combo_11_CurrentSelection); }
				if (selectedClass == 14) {
					prefs.putInt("wizard_combo_11", combo_11_CurrentSelection); }
				
				String thisSpell = comboGroup_11.getSelectedItem().toString();
				ImageIcon icon = new ImageIcon();
				ClassHandler.getSpellType(thisSpell);
				groupLabel_11.setIcon(ClassHandler.iconName);
			}
		});
		
		comboGroup_12 = new JComboBox();
		comboGroup_12.setBackground(Color.WHITE);
		comboGroup_12.setModel(new DefaultComboBoxModel(new String[] {""}));
		comboGroup_12.setMaximumRowCount(16);
		comboGroup_12.setFont(new Font("Consolas", Font.PLAIN, 10));
		comboGroup_12.setBounds(261, 114, 115, 20);
		TimersPanel.add(comboGroup_12);
		comboGroup_12.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				combo_12_CurrentSelection = comboGroup_12.getSelectedIndex();
				if (selectedClass == 1) {
					prefs.putInt("bard_combo_12", combo_12_CurrentSelection); }
				if (selectedClass == 2) {
					prefs.putInt("cleric_combo_12", combo_12_CurrentSelection); }
				if (selectedClass == 3) {
					prefs.putInt("druid_combo_12", combo_12_CurrentSelection); }
				if (selectedClass == 4) {
					prefs.putInt("enchanter_combo_12", combo_12_CurrentSelection); }
				if (selectedClass == 5) {
					prefs.putInt("magician_combo_12", combo_12_CurrentSelection); }
				if (selectedClass == 6) {
					prefs.putInt("monk_combo_12", combo_12_CurrentSelection); }
				if (selectedClass == 7) {
					prefs.putInt("necromancer_combo_12", combo_12_CurrentSelection); }
				if (selectedClass == 8) {
					prefs.putInt("paladin_combo_12", combo_12_CurrentSelection); }
				if (selectedClass == 9) {
					prefs.putInt("ranger_combo_12", combo_12_CurrentSelection); }
				if (selectedClass == 10) {
					prefs.putInt("rogue_combo_12", combo_12_CurrentSelection); }
				if (selectedClass == 11) {
					prefs.putInt("shadowknight_combo_12", combo_12_CurrentSelection); }
				if (selectedClass == 12) {
					prefs.putInt("shaman_combo_12", combo_12_CurrentSelection); }
				if (selectedClass == 13) {
					prefs.putInt("warrior_combo_12", combo_12_CurrentSelection); }
				if (selectedClass == 14) {
					prefs.putInt("wizard_combo_12", combo_12_CurrentSelection); }
				
				String thisSpell = comboGroup_12.getSelectedItem().toString();
				ImageIcon icon = new ImageIcon();
				ClassHandler.getSpellType(thisSpell);
				groupLabel_12.setIcon(ClassHandler.iconName);
			}
		});
		
		comboGroup_13 = new JComboBox();
		comboGroup_13.setBackground(Color.WHITE);
		comboGroup_13.setModel(new DefaultComboBoxModel(new String[] {""}));
		comboGroup_13.setMaximumRowCount(16);
		comboGroup_13.setFont(new Font("Consolas", Font.PLAIN, 10));
		comboGroup_13.setBounds(261, 137, 115, 20);
		TimersPanel.add(comboGroup_13);
		comboGroup_13.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				combo_13_CurrentSelection = comboGroup_13.getSelectedIndex();
				if (selectedClass == 1) {
					prefs.putInt("bard_combo_13", combo_13_CurrentSelection); }
				if (selectedClass == 2) {
					prefs.putInt("cleric_combo_13", combo_13_CurrentSelection); }
				if (selectedClass == 3) {
					prefs.putInt("druid_combo_13", combo_13_CurrentSelection); }
				if (selectedClass == 4) {
					prefs.putInt("enchanter_combo_13", combo_13_CurrentSelection); }
				if (selectedClass == 5) {
					prefs.putInt("magician_combo_13", combo_13_CurrentSelection); }
				if (selectedClass == 6) {
					prefs.putInt("monk_combo_13", combo_13_CurrentSelection); }
				if (selectedClass == 7) {
					prefs.putInt("necromancer_combo_13", combo_13_CurrentSelection); }
				if (selectedClass == 8) {
					prefs.putInt("paladin_combo_13", combo_13_CurrentSelection); }
				if (selectedClass == 9) {
					prefs.putInt("ranger_combo_13", combo_13_CurrentSelection); }
				if (selectedClass == 10) {
					prefs.putInt("rogue_combo_13", combo_13_CurrentSelection); }
				if (selectedClass == 11) {
					prefs.putInt("shadowknight_combo_13", combo_13_CurrentSelection); }
				if (selectedClass == 12) {
					prefs.putInt("shaman_combo_13", combo_13_CurrentSelection); }
				if (selectedClass == 13) {
					prefs.putInt("warrior_combo_13", combo_13_CurrentSelection); }
				if (selectedClass == 14) {
					prefs.putInt("wizard_combo_13", combo_13_CurrentSelection); }
				
				String thisSpell = comboGroup_13.getSelectedItem().toString();
				ImageIcon icon = new ImageIcon();
				ClassHandler.getSpellType(thisSpell);
				groupLabel_13.setIcon(ClassHandler.iconName);
			}
		});
		
		comboGroup_14 = new JComboBox();
		comboGroup_14.setBackground(Color.WHITE);
		comboGroup_14.setModel(new DefaultComboBoxModel(new String[] {""}));
		comboGroup_14.setMaximumRowCount(16);
		comboGroup_14.setFont(new Font("Consolas", Font.PLAIN, 10));
		comboGroup_14.setBounds(261, 160, 115, 20);
		TimersPanel.add(comboGroup_14);
		comboGroup_14.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				combo_14_CurrentSelection = comboGroup_14.getSelectedIndex();
				if (selectedClass == 1) {
					prefs.putInt("bard_combo_14", combo_14_CurrentSelection); }
				if (selectedClass == 2) {
					prefs.putInt("cleric_combo_14", combo_14_CurrentSelection); }
				if (selectedClass == 3) {
					prefs.putInt("druid_combo_14", combo_14_CurrentSelection); }
				if (selectedClass == 4) {
					prefs.putInt("enchanter_combo_14", combo_14_CurrentSelection); }
				if (selectedClass == 5) {
					prefs.putInt("magician_combo_14", combo_14_CurrentSelection); }
				if (selectedClass == 6) {
					prefs.putInt("monk_combo_14", combo_14_CurrentSelection); }
				if (selectedClass == 7) {
					prefs.putInt("necromancer_combo_14", combo_14_CurrentSelection); }
				if (selectedClass == 8) {
					prefs.putInt("paladin_combo_14", combo_14_CurrentSelection); }
				if (selectedClass == 9) {
					prefs.putInt("ranger_combo_14", combo_14_CurrentSelection); }
				if (selectedClass == 10) {
					prefs.putInt("rogue_combo_14", combo_14_CurrentSelection); }
				if (selectedClass == 11) {
					prefs.putInt("shadowknight_combo_14", combo_14_CurrentSelection); }
				if (selectedClass == 12) {
					prefs.putInt("shaman_combo_14", combo_14_CurrentSelection); }
				if (selectedClass == 13) {
					prefs.putInt("warrior_combo_14", combo_14_CurrentSelection); }
				if (selectedClass == 14) {
					prefs.putInt("wizard_combo_14", combo_14_CurrentSelection); }
				
				String thisSpell = comboGroup_14.getSelectedItem().toString();
				ImageIcon icon = new ImageIcon();
				ClassHandler.getSpellType(thisSpell);
				groupLabel_14.setIcon(ClassHandler.iconName);
			}
		});
		
		comboGroup_15 = new JComboBox();
		comboGroup_15.setBackground(Color.WHITE);
		comboGroup_15.setModel(new DefaultComboBoxModel(new String[] {""}));
		comboGroup_15.setMaximumRowCount(16);
		comboGroup_15.setFont(new Font("Consolas", Font.PLAIN, 10));
		comboGroup_15.setBounds(261, 183, 115, 20);
		TimersPanel.add(comboGroup_15);
		comboGroup_15.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				combo_15_CurrentSelection = comboGroup_15.getSelectedIndex();
				if (selectedClass == 1) {
					prefs.putInt("bard_combo_15", combo_15_CurrentSelection); }
				if (selectedClass == 2) {
					prefs.putInt("cleric_combo_15", combo_15_CurrentSelection); }
				if (selectedClass == 3) {
					prefs.putInt("druid_combo_15", combo_15_CurrentSelection); }
				if (selectedClass == 4) {
					prefs.putInt("enchanter_combo_15", combo_15_CurrentSelection); }
				if (selectedClass == 5) {
					prefs.putInt("magician_combo_15", combo_15_CurrentSelection); }
				if (selectedClass == 6) {
					prefs.putInt("monk_combo_15", combo_15_CurrentSelection); }
				if (selectedClass == 7) {
					prefs.putInt("necromancer_combo_15", combo_15_CurrentSelection); }
				if (selectedClass == 8) {
					prefs.putInt("paladin_combo_15", combo_15_CurrentSelection); }
				if (selectedClass == 9) {
					prefs.putInt("ranger_combo_15", combo_15_CurrentSelection); }
				if (selectedClass == 10) {
					prefs.putInt("rogue_combo_15", combo_15_CurrentSelection); }
				if (selectedClass == 11) {
					prefs.putInt("shadowknight_combo_15", combo_15_CurrentSelection); }
				if (selectedClass == 12) {
					prefs.putInt("shaman_combo_15", combo_15_CurrentSelection); }
				if (selectedClass == 13) {
					prefs.putInt("warrior_combo_15", combo_15_CurrentSelection); }
				if (selectedClass == 14) {
					prefs.putInt("wizard_combo_15", combo_15_CurrentSelection); }
				
				String thisSpell = comboGroup_15.getSelectedItem().toString();
				ImageIcon icon = new ImageIcon();
				ClassHandler.getSpellType(thisSpell);
				groupLabel_15.setIcon(ClassHandler.iconName);
			}
		});
		
		comboGroup_16 = new JComboBox();
		comboGroup_16.setBackground(Color.WHITE);
		comboGroup_16.setModel(new DefaultComboBoxModel(new String[] {""}));
		comboGroup_16.setMaximumRowCount(16);
		comboGroup_16.setFont(new Font("Consolas", Font.PLAIN, 10));
		comboGroup_16.setBounds(261, 206, 115, 20);
		TimersPanel.add(comboGroup_16);
		comboGroup_16.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				combo_16_CurrentSelection = comboGroup_16.getSelectedIndex();
				if (selectedClass == 1) {
					prefs.putInt("bard_combo_16", combo_16_CurrentSelection); }
				if (selectedClass == 2) {
					prefs.putInt("cleric_combo_16", combo_16_CurrentSelection); }
				if (selectedClass == 3) {
					prefs.putInt("druid_combo_16", combo_16_CurrentSelection); }
				if (selectedClass == 4) {
					prefs.putInt("enchanter_combo_16", combo_16_CurrentSelection); }
				if (selectedClass == 5) {
					prefs.putInt("magician_combo_16", combo_16_CurrentSelection); }
				if (selectedClass == 6) {
					prefs.putInt("monk_combo_16", combo_16_CurrentSelection); }
				if (selectedClass == 7) {
					prefs.putInt("necromancer_combo_16", combo_16_CurrentSelection); }
				if (selectedClass == 8) {
					prefs.putInt("paladin_combo_16", combo_16_CurrentSelection); }
				if (selectedClass == 9) {
					prefs.putInt("ranger_combo_16", combo_16_CurrentSelection); }
				if (selectedClass == 10) {
					prefs.putInt("rogue_combo_16", combo_16_CurrentSelection); }
				if (selectedClass == 11) {
					prefs.putInt("shadowknight_combo_16", combo_16_CurrentSelection); }
				if (selectedClass == 12) {
					prefs.putInt("shaman_combo_16", combo_16_CurrentSelection); }
				if (selectedClass == 13) {
					prefs.putInt("warrior_combo_16", combo_16_CurrentSelection); }
				if (selectedClass == 14) {
					prefs.putInt("wizard_combo_16", combo_16_CurrentSelection); }
				
				String thisSpell = comboGroup_16.getSelectedItem().toString();
				ImageIcon icon = new ImageIcon();
				ClassHandler.getSpellType(thisSpell);
				groupLabel_16.setIcon(ClassHandler.iconName);
			}
		});
		
		comboGroup_17 = new JComboBox();
		comboGroup_17.setModel(new DefaultComboBoxModel(new String[] {""}));
		comboGroup_17.setMaximumRowCount(16);
		comboGroup_17.setFont(new Font("Consolas", Font.PLAIN, 10));
		comboGroup_17.setBackground(Color.WHITE);
		comboGroup_17.setBounds(32, 229, 115, 20);
		TimersPanel.add(comboGroup_17);
		comboGroup_17.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				combo_17_CurrentSelection = comboGroup_17.getSelectedIndex();
				if (selectedClass == 1) {
					prefs.putInt("bard_combo_17", combo_17_CurrentSelection); }
				if (selectedClass == 2) {
					prefs.putInt("cleric_combo_17", combo_17_CurrentSelection); }
				if (selectedClass == 3) {
					prefs.putInt("druid_combo_17", combo_17_CurrentSelection); }
				if (selectedClass == 4) {
					prefs.putInt("enchanter_combo_17", combo_17_CurrentSelection); }
				if (selectedClass == 5) {
					prefs.putInt("magician_combo_17", combo_17_CurrentSelection); }
				if (selectedClass == 6) {
					prefs.putInt("monk_combo_17", combo_17_CurrentSelection); }
				if (selectedClass == 7) {
					prefs.putInt("necromancer_combo_17", combo_17_CurrentSelection); }
				if (selectedClass == 8) {
					prefs.putInt("paladin_combo_17", combo_17_CurrentSelection); }
				if (selectedClass == 9) {
					prefs.putInt("ranger_combo_17", combo_17_CurrentSelection); }
				if (selectedClass == 10) {
					prefs.putInt("rogue_combo_17", combo_17_CurrentSelection); }
				if (selectedClass == 11) {
					prefs.putInt("shadowknight_combo_17", combo_17_CurrentSelection); }
				if (selectedClass == 12) {
					prefs.putInt("shaman_combo_17", combo_17_CurrentSelection); }
				if (selectedClass == 13) {
					prefs.putInt("warrior_combo_17", combo_17_CurrentSelection); }
				if (selectedClass == 14) {
					prefs.putInt("wizard_combo_17", combo_17_CurrentSelection); }
				
				String thisSpell = comboGroup_17.getSelectedItem().toString();
				ImageIcon icon = new ImageIcon();
				ClassHandler.getSpellType(thisSpell);
				groupLabel_17.setIcon(ClassHandler.iconName);
			}
		});

		comboGroup_18 = new JComboBox();
		comboGroup_18.setModel(new DefaultComboBoxModel(new String[] {""}));
		comboGroup_18.setMaximumRowCount(16);
		comboGroup_18.setFont(new Font("Consolas", Font.PLAIN, 10));
		comboGroup_18.setBackground(Color.WHITE);
		comboGroup_18.setBounds(261, 229, 115, 20);
		TimersPanel.add(comboGroup_18);
		comboGroup_18.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				combo_18_CurrentSelection = comboGroup_18.getSelectedIndex();
				if (selectedClass == 1) {
					prefs.putInt("bard_combo_18", combo_18_CurrentSelection); }
				if (selectedClass == 2) {
					prefs.putInt("cleric_combo_18", combo_18_CurrentSelection); }
				if (selectedClass == 3) {
					prefs.putInt("druid_combo_18", combo_18_CurrentSelection); }
				if (selectedClass == 4) {
					prefs.putInt("enchanter_combo_18", combo_18_CurrentSelection); }
				if (selectedClass == 5) {
					prefs.putInt("magician_combo_18", combo_18_CurrentSelection); }
				if (selectedClass == 6) {
					prefs.putInt("monk_combo_18", combo_18_CurrentSelection); }
				if (selectedClass == 7) {
					prefs.putInt("necromancer_combo_18", combo_18_CurrentSelection); }
				if (selectedClass == 8) {
					prefs.putInt("paladin_combo_18", combo_18_CurrentSelection); }
				if (selectedClass == 9) {
					prefs.putInt("ranger_combo_18", combo_18_CurrentSelection); }
				if (selectedClass == 10) {
					prefs.putInt("rogue_combo_18", combo_18_CurrentSelection); }
				if (selectedClass == 11) {
					prefs.putInt("shadowknight_combo_18", combo_18_CurrentSelection); }
				if (selectedClass == 12) {
					prefs.putInt("shaman_combo_18", combo_18_CurrentSelection); }
				if (selectedClass == 13) {
					prefs.putInt("warrior_combo_18", combo_18_CurrentSelection); }
				if (selectedClass == 14) {
					prefs.putInt("wizard_combo_18", combo_18_CurrentSelection); }
				
				String thisSpell = comboGroup_18.getSelectedItem().toString();
				ImageIcon icon = new ImageIcon();
				ClassHandler.getSpellType(thisSpell);
				groupLabel_18.setIcon(ClassHandler.iconName);
			}
		});
		
		comboLevelPicker = new JComboBox();
		comboLevelPicker.setToolTipText("Select the current level of your character");
		comboLevelPicker.setFont(new Font("Consolas", Font.PLAIN, 10));
		comboLevelPicker.setBackground(UIManager.getColor("ComboBox.background"));
		comboLevelPicker.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65"}));
		comboLevelPicker.setBounds(380, 3, 46, 20);
		TimersPanel.add(comboLevelPicker);
		comboLevelPicker.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				selectedLevel = comboLevelPicker.getSelectedIndex();
				
				clearCounters(); 
				if (selectedClass == 1)
				{
					prefs.putInt("bard_level", selectedLevel);
					calculateCounters("Bard", "");
				}
				if (selectedClass == 2)
				{
					prefs.putInt("cleric_level", selectedLevel);
					calculateCounters("Cleric", "");
				}
				if (selectedClass == 3)
				{
					prefs.putInt("druid_level", selectedLevel);
					calculateCounters("Druid", "");
				}
				if (selectedClass == 4)
				{
					prefs.putInt("enchanter_level", selectedLevel);
					calculateCounters("Enchanter", "");
				}
				if (selectedClass == 5)
				{
					prefs.putInt("magician_level", selectedLevel);
					calculateCounters("Magician", "");
				}
				if (selectedClass == 6)
				{
					prefs.putInt("monk_level", selectedLevel);
					calculateCounters("Monk", "");
				}
				if (selectedClass == 7)
				{
					prefs.putInt("necromancer_level", selectedLevel);
					calculateCounters("Necromancer", "");
				}
				if (selectedClass == 8)
				{
					prefs.putInt("paladin_level", selectedLevel);
					calculateCounters("Paladin", "");
				}
				if (selectedClass == 9)
				{
					prefs.putInt("ranger_level", selectedLevel);
					calculateCounters("Ranger", "");
				}
				if (selectedClass == 10)
				{
					prefs.putInt("rogue_level", selectedLevel);
					calculateCounters("Rogue", "");
				}
				if (selectedClass == 11)
				{
					prefs.putInt("shadowknight_level", selectedLevel);
					calculateCounters("Shadow Knight", "");
				}
				if (selectedClass == 12)
				{
					prefs.putInt("shaman_level", selectedLevel);
					calculateCounters("Shaman", "");
				}
				if (selectedClass == 13)
				{
					prefs.putInt("warrior_level", selectedLevel);
					calculateCounters("Warrior", "");
				}
				if (selectedClass == 14)
				{
					prefs.putInt("wizard_level", selectedLevel);
					calculateCounters("Wizard", "");
				}
			}
		});
		
		comboClassList = new JComboBox();
		comboClassList.setFont(new Font("Consolas", Font.PLAIN, 10));
		comboClassList.setBackground(UIManager.getColor("ComboBox.background"));
		comboClassList.setModel(new DefaultComboBoxModel(new String[] {"", "Bard", "Cleric", "Druid", "Enchanter", "Magician", "Monk", "Necromancer", "Paladin", "Ranger", "Rogue", "Shadow Knight", "Shaman", "Warrior", "Wizard"}));
		comboClassList.setToolTipText("Select the class you want to load spell timers for");
		comboClassList.setMaximumRowCount(15);
		comboClassList.setBounds(214, 3, 104, 20);
		TimersPanel.add(comboClassList);
		comboClassList.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				selectedClass = comboClassList.getSelectedIndex();
				ClassHandler.classChecker();
				if (selectedClass == 1) {
					calculateCounters("Bard", "");
					prefs.putInt("class", selectedClass);
				}
				if (selectedClass == 2) {
					calculateCounters("Cleric", "");
					prefs.putInt("class", selectedClass);
				}
				if (selectedClass == 3) {
					calculateCounters("Druid", "");
					prefs.putInt("class", selectedClass);
				}
				if (selectedClass == 4) {
					calculateCounters("Enchanter", "");
					prefs.putInt("class", selectedClass);
				}
				if (selectedClass == 5) {
					calculateCounters("Magician", "");
					prefs.putInt("class", selectedClass);
				}
				if (selectedClass == 6) {
					calculateCounters("Monk", "");
					prefs.putInt("class", selectedClass);
				}
				if (selectedClass == 7) {
					calculateCounters("Necromancer", "");
					prefs.putInt("class", selectedClass);
				}
				if (selectedClass == 8) {
					calculateCounters("Paladin", "");
					prefs.putInt("class", selectedClass);
				}
				if (selectedClass == 9) {
					calculateCounters("Ranger", "");
					prefs.putInt("class", selectedClass);
				}
				if (selectedClass == 10) {
					calculateCounters("Rogue", "");
					prefs.putInt("class", selectedClass);
				}
				if (selectedClass == 11) {
					calculateCounters("Shadow Knight", "");
					prefs.putInt("class", selectedClass);
				}
				if (selectedClass == 12) {
					calculateCounters("Shaman", "");
					prefs.putInt("class", selectedClass);
				}
				if (selectedClass == 13) {
					calculateCounters("Warrior", "");
					prefs.putInt("class", selectedClass);
				}
				if (selectedClass == 14) {
					calculateCounters("Wizard", "");
					prefs.putInt("class", selectedClass);
				}
				clearCounters();
				LoadPreferences.loadComboSelections();
				LoadPreferences.loadLevelSelection();
			}
		});
		
		comboClassList.setSelectedIndex(retrievedClassFromRegistry);
		
		
		JLabel lblLevel = new JLabel("Level:");
		lblLevel.setFont(new Font("Consolas", Font.PLAIN, 10));
		lblLevel.setBounds(340, 10, 37, 14);
		TimersPanel.add(lblLevel);
		
		JLabel lblClass = new JLabel("Class:");
		lblClass.setFont(new Font("Consolas", Font.PLAIN, 10));
		lblClass.setBounds(174, 10, 37, 14);
		TimersPanel.add(lblClass);
		
		JButton btnClearTimers = new JButton("Clear Timers");
		btnClearTimers.setToolTipText("Set all timers to zero");
		btnClearTimers.setBounds(324, 269, 110, 18);
		TimersPanel.add(btnClearTimers);
		btnClearTimers.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				clearCounters();
			}
		});
	
		JButton btnLoadLog = new JButton("Load Log");
		btnLoadLog.setToolTipText("Load log file to parse");
		btnLoadLog.setBounds(4, 3, 82, 20);
		TimersPanel.add(btnLoadLog);
		btnLoadLog.setFont(new Font("Consolas", Font.PLAIN, 11));
		btnLoadLog.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				userDirectory = prefs.get("currentdirectory", userDirectory);
				loadLog();
			}
		});
		
		TriggersPanel = new JPanel();
		tabbedPane.addTab("Triggers", null, TriggersPanel, null);
		tabbedPane.setEnabledAt(1, true);
		TriggersPanel.setLayout(null);
		
		lblParsingStatus_2 = new JLabel("");
		lblParsingStatus_2.setForeground(new Color(0, 100, 0));
		lblParsingStatus_2.setFont(new Font("Consolas", Font.PLAIN, 10));
		lblParsingStatus_2.setBounds(5, 269, 320, 14);
		TriggersPanel.add(lblParsingStatus_2);
		
		logLineField_2 = new JTextField();
		logLineField_2.setFont(new Font("Arial", Font.PLAIN, 10));
		logLineField_2.setEditable(false);
		logLineField_2.setColumns(10);
		logLineField_2.setBackground(Color.WHITE);
		logLineField_2.setBounds(5, 25, 424, 19);
		TriggersPanel.add(logLineField_2);
		
		JButton btnLoadLog_2 = new JButton("Load Log");
		btnLoadLog_2.setToolTipText("Load log file to parse");
		btnLoadLog_2.setFont(new Font("Consolas", Font.PLAIN, 11));
		btnLoadLog_2.setBounds(4, 3, 82, 20);
		TriggersPanel.add(btnLoadLog_2);
		btnLoadLog_2.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				userDirectory = prefs.get("currentdirectory", userDirectory);
				loadLog();
			}
		});
		
		JLabel lblTriggers = new JLabel("Triggers:");
		lblTriggers.setFont(new Font("Consolas", Font.PLAIN, 10));
		lblTriggers.setBounds(5, 48, 54, 14);
		TriggersPanel.add(lblTriggers);
		
		triggerText_01 = new JTextField(); 
		triggerText_01.setBounds(28, 68, 280, 18);
		TriggersPanel.add(triggerText_01);
		triggerText_01.setColumns(10);
		
		triggerText_02 = new JTextField();
		triggerText_02.setColumns(10);
		triggerText_02.setBounds(28, 90, 280, 18);
		TriggersPanel.add(triggerText_02);
		
		triggerText_03 = new JTextField();
		triggerText_03.setColumns(10);
		triggerText_03.setBounds(28, 112, 280, 18);
		TriggersPanel.add(triggerText_03);
		
		triggerText_04 = new JTextField();
		triggerText_04.setColumns(10);
		triggerText_04.setBounds(28, 134, 280, 18);
		TriggersPanel.add(triggerText_04);
		
		triggerText_05 = new JTextField();
		triggerText_05.setColumns(10);
		triggerText_05.setBounds(28, 156, 280, 18);
		TriggersPanel.add(triggerText_05);
		
		triggerText_06 = new JTextField();
		triggerText_06.setColumns(10);
		triggerText_06.setBounds(28, 178, 280, 18);
		TriggersPanel.add(triggerText_06);
		
		triggerText_07 = new JTextField();
		triggerText_07.setColumns(10);
		triggerText_07.setBounds(28, 200, 280, 18);
		TriggersPanel.add(triggerText_07);
		
		triggerText_08 = new JTextField();
		triggerText_08.setColumns(10);
		triggerText_08.setBounds(28, 222, 280, 18);
		TriggersPanel.add(triggerText_08);
		
		triggerText_09 = new JTextField();
		triggerText_09.setColumns(10);
		triggerText_09.setBounds(28, 244, 280, 18);
		TriggersPanel.add(triggerText_09);
		
		JButton btnSaveTrigger_01 = new JButton("Save");
		btnSaveTrigger_01.setFont(new Font("Consolas", Font.PLAIN, 9));
		btnSaveTrigger_01.setBounds(312, 67, 55, 20);
		TriggersPanel.add(btnSaveTrigger_01);
		btnSaveTrigger_01.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				triggerText_01_String = triggerText_01.getText();
				prefs.put("trigger01", triggerText_01_String);
			}
		});
	
		JButton btnSaveTrigger_02 = new JButton("Save");
		btnSaveTrigger_02.setFont(new Font("Consolas", Font.PLAIN, 9));
		btnSaveTrigger_02.setBounds(312, 89, 55, 20);
		TriggersPanel.add(btnSaveTrigger_02);
		btnSaveTrigger_02.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				triggerText_02_String = triggerText_02.getText();
				prefs.put("trigger02", triggerText_02_String);
			}
		});
		
		JButton btnSaveTrigger_03 = new JButton("Save");
		btnSaveTrigger_03.setFont(new Font("Consolas", Font.PLAIN, 9));
		btnSaveTrigger_03.setBounds(312, 111, 55, 20);
		TriggersPanel.add(btnSaveTrigger_03);
		btnSaveTrigger_03.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				triggerText_03_String = triggerText_03.getText();
				prefs.put("trigger03", triggerText_03_String);
			}
		});
		
		JButton btnSaveTrigger_04 = new JButton("Save");
		btnSaveTrigger_04.setFont(new Font("Consolas", Font.PLAIN, 9));
		btnSaveTrigger_04.setBounds(312, 133, 55, 20);
		TriggersPanel.add(btnSaveTrigger_04);
		btnSaveTrigger_04.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				triggerText_04_String = triggerText_04.getText();
				prefs.put("trigger04", triggerText_04_String);
			}
		});

		JButton btnSaveTrigger_05 = new JButton("Save");
		btnSaveTrigger_05.setFont(new Font("Consolas", Font.PLAIN, 9));
		btnSaveTrigger_05.setBounds(312, 155, 55, 20);
		TriggersPanel.add(btnSaveTrigger_05);
		btnSaveTrigger_05.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				triggerText_05_String = triggerText_05.getText();
				prefs.put("trigger05", triggerText_05_String);
			}
		});
		
		JButton btnSaveTrigger_06 = new JButton("Save");
		btnSaveTrigger_06.setFont(new Font("Consolas", Font.PLAIN, 9));
		btnSaveTrigger_06.setBounds(312, 177, 55, 20);
		TriggersPanel.add(btnSaveTrigger_06);
		btnSaveTrigger_06.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				triggerText_06_String = triggerText_06.getText();
				prefs.put("trigger06", triggerText_06_String);
			}
		});
		
		JButton btnSaveTrigger_07 = new JButton("Save");
		btnSaveTrigger_07.setFont(new Font("Consolas", Font.PLAIN, 9));
		btnSaveTrigger_07.setBounds(312, 199, 55, 20);
		TriggersPanel.add(btnSaveTrigger_07);
		btnSaveTrigger_07.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				triggerText_07_String = triggerText_07.getText();
				prefs.put("trigger07", triggerText_07_String);
			}
		});
		
		JButton btnSaveTrigger_08 = new JButton("Save");
		btnSaveTrigger_08.setFont(new Font("Consolas", Font.PLAIN, 9));
		btnSaveTrigger_08.setBounds(312, 221, 55, 20);
		TriggersPanel.add(btnSaveTrigger_08);
		btnSaveTrigger_08.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				triggerText_08_String = triggerText_08.getText();
				prefs.put("trigger08", triggerText_08_String);
			}
		});
		
		JButton btnSaveTrigger_09 = new JButton("Save");
		btnSaveTrigger_09.setFont(new Font("Consolas", Font.PLAIN, 9));
		btnSaveTrigger_09.setBounds(312, 243, 55, 20);
		TriggersPanel.add(btnSaveTrigger_09);
		btnSaveTrigger_09.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				triggerText_09_String = triggerText_09.getText();
				prefs.put("trigger09", triggerText_09_String);
			}
		});
		
		JButton btnDelTrigger_01 = new JButton("Delete");
		btnDelTrigger_01.setFont(new Font("Consolas", Font.PLAIN, 9));
		btnDelTrigger_01.setBounds(367, 67, 65, 20);
		TriggersPanel.add(btnDelTrigger_01);
		btnDelTrigger_01.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				JDialog.setDefaultLookAndFeelDecorated(true);
			    int response = JOptionPane.showConfirmDialog(null, "Are you sure?", "Delete this trigger",
			        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			    if (response == JOptionPane.NO_OPTION) {
			      return;
			    } else if (response == JOptionPane.YES_OPTION) {
			    	triggerText_01.setText("");
					triggerText_01.setBackground(Color.WHITE);
					lblTrigger_01.setIcon(blankIcon);
					prefs.put("trigger01", "");
			    } else if (response == JOptionPane.CLOSED_OPTION) {
			      return;
			    }
			}
		});
		
		JButton btnDelTrigger_02 = new JButton("Delete");
		btnDelTrigger_02.setFont(new Font("Consolas", Font.PLAIN, 9));
		btnDelTrigger_02.setBounds(367, 89, 65, 20);
		TriggersPanel.add(btnDelTrigger_02);
		btnDelTrigger_02.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				JDialog.setDefaultLookAndFeelDecorated(true);
			    int response = JOptionPane.showConfirmDialog(null, "Are you sure?", "Delete this trigger",
			        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			    if (response == JOptionPane.NO_OPTION) {
			      return;
			    } else if (response == JOptionPane.YES_OPTION) {
			    	triggerText_02.setText("");
					triggerText_02.setBackground(Color.WHITE);
					lblTrigger_02.setIcon(blankIcon);
					prefs.put("trigger02", "");
			    } else if (response == JOptionPane.CLOSED_OPTION) {
			      return;
			    }
			}
		});
		
		JButton btnDelTrigger_03 = new JButton("Delete");
		btnDelTrigger_03.setFont(new Font("Consolas", Font.PLAIN, 9));
		btnDelTrigger_03.setBounds(367, 111, 65, 20);
		TriggersPanel.add(btnDelTrigger_03);
		btnDelTrigger_03.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				JDialog.setDefaultLookAndFeelDecorated(true);
			    int response = JOptionPane.showConfirmDialog(null, "Are you sure?", "Delete this trigger",
			        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			    if (response == JOptionPane.NO_OPTION) {
			      return;
			    } else if (response == JOptionPane.YES_OPTION) {
			    	triggerText_03.setText("");
					triggerText_03.setBackground(Color.WHITE);
					lblTrigger_03.setIcon(blankIcon);
					prefs.put("trigger03", "");
			    } else if (response == JOptionPane.CLOSED_OPTION) {
			      return;
			    }
			}
		});
		
		JButton btnDelTrigger_04 = new JButton("Delete");
		btnDelTrigger_04.setFont(new Font("Consolas", Font.PLAIN, 9));
		btnDelTrigger_04.setBounds(367, 133, 65, 20);
		TriggersPanel.add(btnDelTrigger_04);
		btnDelTrigger_04.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				JDialog.setDefaultLookAndFeelDecorated(true);
			    int response = JOptionPane.showConfirmDialog(null, "Are you sure?", "Delete this trigger",
			        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			    if (response == JOptionPane.NO_OPTION) {
			      return;
			    } else if (response == JOptionPane.YES_OPTION) {
			    	triggerText_04.setText("");
					triggerText_04.setBackground(Color.WHITE);
					lblTrigger_04.setIcon(blankIcon);
					prefs.put("trigger04", "");
			    } else if (response == JOptionPane.CLOSED_OPTION) {
			      return;
			    }
			}
		});
		
		JButton btnDelTrigger_05 = new JButton("Delete");
		btnDelTrigger_05.setFont(new Font("Consolas", Font.PLAIN, 9));
		btnDelTrigger_05.setBounds(367, 155, 65, 20);
		TriggersPanel.add(btnDelTrigger_05);
		btnDelTrigger_05.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				JDialog.setDefaultLookAndFeelDecorated(true);
			    int response = JOptionPane.showConfirmDialog(null, "Are you sure?", "Delete this trigger",
			        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			    if (response == JOptionPane.NO_OPTION) {
			      return;
			    } else if (response == JOptionPane.YES_OPTION) {
			    	triggerText_05.setText("");
					triggerText_05.setBackground(Color.WHITE);
					lblTrigger_05.setIcon(blankIcon);
					prefs.put("trigger05", "");
			    } else if (response == JOptionPane.CLOSED_OPTION) {
			      return;
			    }
			}
		});
		
		JButton btnDelTrigger_06 = new JButton("Delete");
		btnDelTrigger_06.setFont(new Font("Consolas", Font.PLAIN, 9));
		btnDelTrigger_06.setBounds(367, 177, 65, 20);
		TriggersPanel.add(btnDelTrigger_06);
		btnDelTrigger_06.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				JDialog.setDefaultLookAndFeelDecorated(true);
			    int response = JOptionPane.showConfirmDialog(null, "Are you sure?", "Delete this trigger",
			        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			    if (response == JOptionPane.NO_OPTION) {
			      return;
			    } else if (response == JOptionPane.YES_OPTION) {
			    	triggerText_06.setText("");
					triggerText_06.setBackground(Color.WHITE);
					lblTrigger_06.setIcon(blankIcon);
					prefs.put("trigger06", "");
			    } else if (response == JOptionPane.CLOSED_OPTION) {
			      return;
			    }
			}
		});
		
		JButton btnDelTrigger_07 = new JButton("Delete");
		btnDelTrigger_07.setFont(new Font("Consolas", Font.PLAIN, 9));
		btnDelTrigger_07.setBounds(367, 199, 65, 20);
		TriggersPanel.add(btnDelTrigger_07);
		btnDelTrigger_07.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				JDialog.setDefaultLookAndFeelDecorated(true);
			    int response = JOptionPane.showConfirmDialog(null, "Are you sure?", "Delete this trigger",
			        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			    if (response == JOptionPane.NO_OPTION) {
			      return;
			    } else if (response == JOptionPane.YES_OPTION) {
			    	triggerText_07.setText("");
					triggerText_07.setBackground(Color.WHITE);
					lblTrigger_07.setIcon(blankIcon);
					prefs.put("trigger07", "");
			    } else if (response == JOptionPane.CLOSED_OPTION) {
			      return;
			    }
			}
		});
		
		JButton btnDelTrigger_08 = new JButton("Delete");
		btnDelTrigger_08.setFont(new Font("Consolas", Font.PLAIN, 9));
		btnDelTrigger_08.setBounds(367, 221, 65, 20);
		TriggersPanel.add(btnDelTrigger_08);
		btnDelTrigger_08.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				JDialog.setDefaultLookAndFeelDecorated(true);
			    int response = JOptionPane.showConfirmDialog(null, "Are you sure?", "Delete this trigger",
			        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			    if (response == JOptionPane.NO_OPTION) {
			      return;
			    } else if (response == JOptionPane.YES_OPTION) {
			    	triggerText_08.setText("");
					triggerText_08.setBackground(Color.WHITE);
					lblTrigger_08.setIcon(blankIcon);
					prefs.put("trigger08", "");
			    } else if (response == JOptionPane.CLOSED_OPTION) {
			      return;
			    }
			}
		});

		JButton btnDelTrigger_09 = new JButton("Delete");
		btnDelTrigger_09.setFont(new Font("Consolas", Font.PLAIN, 9));
		btnDelTrigger_09.setBounds(367, 243, 65, 20);
		TriggersPanel.add(btnDelTrigger_09);
		btnDelTrigger_09.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e)
			{
				JDialog.setDefaultLookAndFeelDecorated(true);
			    int response = JOptionPane.showConfirmDialog(null, "Are you sure?", "Delete this trigger",
			        JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			    if (response == JOptionPane.NO_OPTION) {
			      return;
			    } else if (response == JOptionPane.YES_OPTION) {
			    	triggerText_09.setText("");
					triggerText_09.setBackground(Color.WHITE);
					lblTrigger_09.setIcon(blankIcon);
					prefs.put("trigger09", "");
			    } else if (response == JOptionPane.CLOSED_OPTION) {
			      return;
			    }
			}
		});
		
		lblTrigger_01 = new JLabel("");
		lblTrigger_01.setBounds(4, 68, 20, 18);
		TriggersPanel.add(lblTrigger_01);
		
		lblTrigger_02 = new JLabel("");
		lblTrigger_02.setBounds(4, 90, 20, 18);
		TriggersPanel.add(lblTrigger_02);
		
		lblTrigger_04 = new JLabel("");
		lblTrigger_04.setBounds(4, 134, 20, 18);
		TriggersPanel.add(lblTrigger_04);
		
		lblTrigger_03 = new JLabel("");
		lblTrigger_03.setBounds(4, 112, 20, 18);
		TriggersPanel.add(lblTrigger_03);
		
		lblTrigger_08 = new JLabel("");
		lblTrigger_08.setBounds(4, 222, 20, 18);
		TriggersPanel.add(lblTrigger_08);
		
		lblTrigger_07 = new JLabel("");
		lblTrigger_07.setBounds(4, 200, 20, 18);
		TriggersPanel.add(lblTrigger_07);
		
		lblTrigger_06 = new JLabel("");
		lblTrigger_06.setBounds(4, 178, 20, 18);
		TriggersPanel.add(lblTrigger_06); 
		
		lblTrigger_05 = new JLabel("");
		lblTrigger_05.setBounds(4, 156, 20, 18);
		TriggersPanel.add(lblTrigger_05);
		
		lblTrigger_09 = new JLabel("");
		lblTrigger_09.setBounds(4, 244, 20, 18);
		TriggersPanel.add(lblTrigger_09);
		
		chckbxPlayTriggerSounds = new JCheckBox("Play trigger sounds");
		chckbxPlayTriggerSounds.setFont(new Font("Consolas", Font.PLAIN, 10));
		chckbxPlayTriggerSounds.setBounds(284, 45, 145, 18);
		TriggersPanel.add(chckbxPlayTriggerSounds);
		chckbxPlayTriggerSounds.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{ 
				LoadPreferences.retrievedPlayTriggerSoundsFromRegistry = chckbxPlayTriggerSounds.isSelected();
				prefs.putBoolean("playtriggersounds", LoadPreferences.retrievedPlayTriggerSoundsFromRegistry);
			}
		});
		chckbxPlayTriggerSounds.setSelected(LoadPreferences.retrievedPlayTriggerSoundsFromRegistry);

	
		ComponentListener listener = new ComponentAdapter() {
			public void componentShown(ComponentEvent evt) {
		        Component c = (Component) evt.getSource();
		        setLocation(retrievedWinPosFromRegistry_X, retrievedWinPosFromRegistry_Y);
		      }
			public void componentMoved(ComponentEvent evt) {
		        Component c = (Component) evt.getSource();
		        int winPos_X = getX();
		        int winPos_Y = getY();
		        prefs.putInt("windowposition_x", winPos_X);
		        prefs.putInt("windowposition_y", winPos_Y);
		      }
		};
		addComponentListener(listener);
		
		tabbedPane.addMouseListener(new MouseAdapter()
		{
		   public void mousePressed(MouseEvent e)
		   {
		      mPosX=e.getX();
		      mPosY=e.getY();
		   }
		});
		
		tabbedPane.addMouseMotionListener(new MouseAdapter()
		{
		     public void mouseDragged(MouseEvent evt)
		     {
				//sets frame position when mouse dragged			
				setLocation (evt.getXOnScreen()-mPosX,evt.getYOnScreen()-mPosY);
							
		     }
		});
		
		selectedClass = retrievedClassFromRegistry;
		
		// load prefs + check registry for alwaysontop status
		LoadPreferences.loadPreferences();
		if (LoadPreferences.retrievedAlwaysOnTopFromRegistry == true)
		{
			setAlwaysOnTop(chckbxAlwaysOnTop.isSelected());
		}
	}
	
	
	// LOAD TEXT LOG FROM BTNLOADLOG
	public static void loadLog()
	{
		JFileChooser fileChooser = new JFileChooser(userDirectory);
		FileNameExtensionFilter filter = new FileNameExtensionFilter("Text Files", "txt");
		fileChooser.setMultiSelectionEnabled(false);
		fileChooser.setFileFilter(filter);
		int openChoice = fileChooser.showOpenDialog(panel);
		
		if (openChoice == JFileChooser.APPROVE_OPTION)
		{
			File gotFile = fileChooser.getSelectedFile();
			selectedFile = gotFile;
			selectedFileString = selectedFile.toString();
			lblLogStatus.setText(selectedFileString);
			selectedFileTimeStamp = selectedFile.lastModified();
			String selectedFileParentDirectory = selectedFile.getParent();
			prefs.put("currentdirectory", selectedFileParentDirectory);
			prefs.put("currentlogfile", selectedFileString);
			
			if (parsingThreadOneIsRunning == false)
			{
				ParsingThreadOne parsingThreadOne = new ParsingThreadOne();
				parsingThreadOneIsRunning = true;
				lblParsingStatus.setText("Log loaded, parsing...");
				lblParsingStatus_2.setText("Log loaded, parsing...");
				parsingThreadOne.start();
			}
			fileChooserUsed = true;
		}
	}
	
	public static void killParsingThreadTwo()
	{
		parsingThreadTwoIsRunning = false;
	}
	
	public static void killParsingThreadThree()
	{
		parsingThreadThreeIsRunning = false;
	}
	
	// PARSING THREAD 1
	public static class ParsingThreadOne extends Thread {
		
		public void run() {
			while (parsingThreadOneIsRunning)
			{
				try {
					Thread.sleep(startParsingdelay);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				String currentLine = FileTail.tail(selectedFile);
				currentTimeStamp = selectedFile.lastModified();

				if (currentTimeStamp != selectedFileTimeStamp) {
					selectedFileTimeStamp = currentTimeStamp;
					logLineField.setText(currentLine);
					logLineField_2.setText(currentLine);
					trigger_01_Activated = false;
					trigger_02_Activated = false;
					trigger_03_Activated = false;
					trigger_04_Activated = false;
					trigger_05_Activated = false;
					trigger_06_Activated = false;
					trigger_07_Activated = false;
					trigger_08_Activated = false;
					trigger_09_Activated = false;
				}
				
				if (selectedClass == 1) {
					stringTriggerLanded = StringTriggerLanded.stringTriggerLandedBard;
					stringTrigger = StringTrigger.stringTriggerBard;
					spellTimers = SpellTimers.spellTimersBard;
					spellNames = SpellNames.spellNamesBard;
				}
				if (selectedClass == 2) {
					stringTriggerLanded = StringTriggerLanded.stringTriggerLandedCleric;
					stringTrigger = StringTrigger.stringTriggerCleric;
					spellTimers = SpellTimers.spellTimersCleric;
					spellNames = SpellNames.spellNamesCleric;
				}
				if (selectedClass == 3) {
					stringTriggerLanded = StringTriggerLanded.stringTriggerLandedDruid;
					stringTrigger = StringTrigger.stringTriggerDruid;
					spellTimers = SpellTimers.spellTimersDruid;
					spellNames = SpellNames.spellNamesDruid;
				}
				if (selectedClass == 4) {
					stringTriggerLanded = StringTriggerLanded.stringTriggerLandedEnchanter;
					stringTrigger = StringTrigger.stringTriggerEnchanter;
					spellTimers = SpellTimers.spellTimersEnchanter;
					spellNames = SpellNames.spellNamesEnchanter;
				}
				if (selectedClass == 5) {
					stringTriggerLanded = StringTriggerLanded.stringTriggerLandedMagician;
					stringTrigger = StringTrigger.stringTriggerMagician;
					spellTimers = SpellTimers.spellTimersMagician;
					spellNames = SpellNames.spellNamesMagician;
				}
				if (selectedClass == 6) {
					stringTriggerLanded = StringTriggerLanded.stringTriggerLandedMonk;
					stringTrigger = StringTrigger.stringTriggerMonk;
					spellTimers = SpellTimers.spellTimersMonk;
					spellNames = SpellNames.spellNamesMonk;
				}
				if (selectedClass == 7) {
					stringTriggerLanded = StringTriggerLanded.stringTriggerLandedNecromancer;
					stringTrigger = StringTrigger.stringTriggerNecromancer;
					spellTimers = SpellTimers.spellTimersNecromancer;
					spellNames = SpellNames.spellNamesNecromancer;
				}
				if (selectedClass == 8) {
					stringTriggerLanded = StringTriggerLanded.stringTriggerLandedPaladin;
					stringTrigger = StringTrigger.stringTriggerPaladin;
					spellTimers = SpellTimers.spellTimersPaladin;
					spellNames = SpellNames.spellNamesPaladin;
				}
				if (selectedClass == 9) {
					stringTriggerLanded = StringTriggerLanded.stringTriggerLandedRanger;
					stringTrigger = StringTrigger.stringTriggerRanger;
					spellTimers = SpellTimers.spellTimersRanger;
					spellNames = SpellNames.spellNamesRanger;
				}
				if (selectedClass == 10) {
					stringTriggerLanded = StringTriggerLanded.stringTriggerLandedRogue;
					stringTrigger = StringTrigger.stringTriggerRogue;
					spellTimers = SpellTimers.spellTimersRogue;
					spellNames = SpellNames.spellNamesRogue;
				}
				if (selectedClass == 11) {
					stringTriggerLanded = StringTriggerLanded.stringTriggerLandedShadowKnight;
					stringTrigger = StringTrigger.stringTriggerShadowKnight;
					spellTimers = SpellTimers.spellTimersShadowKnight;
					spellNames = SpellNames.spellNamesShadowKnight;
				}
				if (selectedClass == 12) {
					stringTriggerLanded = StringTriggerLanded.stringTriggerLandedShaman;
					stringTrigger = StringTrigger.stringTriggerShaman;
					spellTimers = SpellTimers.spellTimersShaman;
					spellNames = SpellNames.spellNamesShaman;
				}
				if (selectedClass == 13) {
					stringTriggerLanded = StringTriggerLanded.stringTriggerLandedWarrior;
					stringTrigger = StringTrigger.stringTriggerWarrior;
					spellTimers = SpellTimers.spellTimersWarrior;
					spellNames = SpellNames.spellNamesWarrior;
				}
				if (selectedClass == 14) {
					stringTriggerLanded = StringTriggerLanded.stringTriggerLandedWizard;
					stringTrigger = StringTrigger.stringTriggerWizard;
					spellTimers = SpellTimers.spellTimersWizard;
					spellNames = SpellNames.spellNamesWizard;
				}
				
				if (selectedClass != 0)
				{
					if (currentLine.contains(stringTrigger[0][comboGroup_01.getSelectedIndex()])) {
						whichSpellCounter = 1;
						stoppedCasting = false;
						parsingThreadThreeIsRunning = true;
						ParsingThreadThree parsingThreadThree = new ParsingThreadThree();
						parsingThreadThree.start();
						// --- sleep for current spell's cast time ---
						thisSpellCastingTime = CastingDelays.castingDelaysArray[selectedClass][0][comboGroup_01.getSelectedIndex()];
						try { Thread.sleep(thisSpellCastingTime);} catch (InterruptedException e) { e.printStackTrace(); }
						thisSpellCastingTime = 0;
						// -------------------------------------------
						if (stoppedCasting == false)
						{
							killParsingThreadThree();
							if (Arrays.asList(SpellTypes.typeBuff).contains(comboGroup_01.getSelectedItem()))
							{
									comboGroup_01_SpellCounter = spellTimers[0][comboGroup_01.getSelectedIndex()];
									if (spellTimer_01_IsRunning == false) {
										CounterThread counterThread = new CounterThread();
										counterThread.start();
									}
							}

							else
							{
								parsingThreadTwoIsRunning = true;
								ParsingThreadTwo parsingThreadTwo = new ParsingThreadTwo();
								parsingThreadTwo.start();
							}
						}
					}
		
					if (currentLine.contains(stringTrigger[1][comboGroup_02.getSelectedIndex()])) {
						whichSpellCounter = 2;
						stoppedCasting = false;
						parsingThreadThreeIsRunning = true;
						ParsingThreadThree parsingThreadThree = new ParsingThreadThree();
						parsingThreadThree.start();
						// --- sleep for current spell's cast time ---
						thisSpellCastingTime = CastingDelays.castingDelaysArray[selectedClass][1][comboGroup_02.getSelectedIndex()];
						try { Thread.sleep(thisSpellCastingTime);} catch (InterruptedException e) { e.printStackTrace(); }
						thisSpellCastingTime = 0;
						// -------------------------------------------
						if (stoppedCasting == false)
						{
							killParsingThreadThree();
							if (Arrays.asList(SpellTypes.typeBuff).contains(comboGroup_02.getSelectedItem()))
							{
								comboGroup_02_SpellCounter = spellTimers[1][comboGroup_02.getSelectedIndex()];
								if (spellTimer_02_IsRunning == false) {
									CounterThread counterThread = new CounterThread();
									counterThread.start();
								}
							}
							else
							{
								parsingThreadTwoIsRunning = true;
								ParsingThreadTwo parsingThreadTwo = new ParsingThreadTwo();
								parsingThreadTwo.start();
							}
						}
					}
	
					if (currentLine.contains(stringTrigger[2][comboGroup_03.getSelectedIndex()])) {
						whichSpellCounter = 3;
						stoppedCasting = false;
						parsingThreadThreeIsRunning = true;
						ParsingThreadThree parsingThreadThree = new ParsingThreadThree();
						parsingThreadThree.start();
						// --- sleep for current spell's cast time ---
						thisSpellCastingTime = CastingDelays.castingDelaysArray[selectedClass][2][comboGroup_03.getSelectedIndex()];
						try { Thread.sleep(thisSpellCastingTime);} catch (InterruptedException e) { e.printStackTrace(); }
						thisSpellCastingTime = 0;
						// -------------------------------------------
						if (stoppedCasting == false)
						{
							killParsingThreadThree();
							if (Arrays.asList(SpellTypes.typeBuff).contains(comboGroup_03.getSelectedItem()))
							{
								comboGroup_03_SpellCounter = spellTimers[2][comboGroup_03.getSelectedIndex()];
								if (spellTimer_03_IsRunning == false) {
									CounterThread counterThread = new CounterThread();
									counterThread.start();
								}
							}
							else
							{
								parsingThreadTwoIsRunning = true;
								ParsingThreadTwo parsingThreadTwo = new ParsingThreadTwo();
								parsingThreadTwo.start();
							}
						}
					}
	   
					if (currentLine.contains(stringTrigger[3][comboGroup_04.getSelectedIndex()])) {
						whichSpellCounter = 4;
						stoppedCasting = false;
						parsingThreadThreeIsRunning = true;
						ParsingThreadThree parsingThreadThree = new ParsingThreadThree();
						parsingThreadThree.start();
						// --- sleep for current spell's cast time ---
						thisSpellCastingTime = CastingDelays.castingDelaysArray[selectedClass][3][comboGroup_04.getSelectedIndex()];
						try { Thread.sleep(thisSpellCastingTime);} catch (InterruptedException e) { e.printStackTrace(); }
						thisSpellCastingTime = 0;
						// -------------------------------------------
						if (stoppedCasting == false)
						{
							killParsingThreadThree();
							if (Arrays.asList(SpellTypes.typeBuff).contains(comboGroup_04.getSelectedItem()))
							{
								comboGroup_04_SpellCounter = spellTimers[3][comboGroup_04.getSelectedIndex()];
								if (spellTimer_04_IsRunning == false) {
									CounterThread counterThread = new CounterThread();
									counterThread.start();
								}
							}
							else
							{
								parsingThreadTwoIsRunning = true;
								ParsingThreadTwo parsingThreadTwo = new ParsingThreadTwo();
								parsingThreadTwo.start();
							}
						}
					}
	
					if (currentLine.contains(stringTrigger[4][comboGroup_05.getSelectedIndex()])) {
						whichSpellCounter = 5;
						stoppedCasting = false;
						parsingThreadThreeIsRunning = true;
						ParsingThreadThree parsingThreadThree = new ParsingThreadThree();
						parsingThreadThree.start();
						// --- sleep for current spell's cast time ---
						thisSpellCastingTime = CastingDelays.castingDelaysArray[selectedClass][4][comboGroup_05.getSelectedIndex()];
						try { Thread.sleep(thisSpellCastingTime);} catch (InterruptedException e) { e.printStackTrace(); }
						thisSpellCastingTime = 0;
						// -------------------------------------------
						if (stoppedCasting == false)
						{
							killParsingThreadThree();
							if (Arrays.asList(SpellTypes.typeBuff).contains(comboGroup_05.getSelectedItem()))
							{
								comboGroup_05_SpellCounter = spellTimers[4][comboGroup_05.getSelectedIndex()];
								if (spellTimer_05_IsRunning == false) {
									CounterThread counterThread = new CounterThread();
									counterThread.start();
								}
							}
							else
							{
								parsingThreadTwoIsRunning = true;
								ParsingThreadTwo parsingThreadTwo = new ParsingThreadTwo();
								parsingThreadTwo.start();
							}
						}
					}
	
					if (currentLine.contains(stringTrigger[5][comboGroup_06.getSelectedIndex()])) {
						whichSpellCounter = 6;
						stoppedCasting = false;
						parsingThreadThreeIsRunning = true;
						ParsingThreadThree parsingThreadThree = new ParsingThreadThree();
						parsingThreadThree.start();
						// --- sleep for current spell's cast time ---
						thisSpellCastingTime = CastingDelays.castingDelaysArray[selectedClass][5][comboGroup_06.getSelectedIndex()];
						try { Thread.sleep(thisSpellCastingTime);} catch (InterruptedException e) { e.printStackTrace(); }
						thisSpellCastingTime = 0;
						// -------------------------------------------
						if (stoppedCasting == false)
						{
							killParsingThreadThree();
							if (Arrays.asList(SpellTypes.typeBuff).contains(comboGroup_06.getSelectedItem()))
							{
								comboGroup_06_SpellCounter = spellTimers[5][comboGroup_06.getSelectedIndex()];
								if (spellTimer_06_IsRunning == false) {
									CounterThread counterThread = new CounterThread();
									counterThread.start();
								}
							}
							else
							{
								parsingThreadTwoIsRunning = true;
								ParsingThreadTwo parsingThreadTwo = new ParsingThreadTwo();
								parsingThreadTwo.start();
							}
						}
					}
	
					if (currentLine.contains(stringTrigger[6][comboGroup_07.getSelectedIndex()])) {
						whichSpellCounter = 7;
						stoppedCasting = false;
						parsingThreadThreeIsRunning = true;
						ParsingThreadThree parsingThreadThree = new ParsingThreadThree();
						parsingThreadThree.start();
						// --- sleep for current spell's cast time ---
						thisSpellCastingTime = CastingDelays.castingDelaysArray[selectedClass][6][comboGroup_07.getSelectedIndex()];
						try { Thread.sleep(thisSpellCastingTime);} catch (InterruptedException e) { e.printStackTrace(); }
						thisSpellCastingTime = 0;
						// -------------------------------------------
						if (stoppedCasting == false)
						{
							killParsingThreadThree();
							if (Arrays.asList(SpellTypes.typeBuff).contains(comboGroup_07.getSelectedItem()))
							{
								comboGroup_07_SpellCounter = spellTimers[6][comboGroup_07.getSelectedIndex()];
								if (spellTimer_07_IsRunning == false) {
									CounterThread counterThread = new CounterThread();
									counterThread.start();
								}
							}
							else
							{
								parsingThreadTwoIsRunning = true;
								ParsingThreadTwo parsingThreadTwo = new ParsingThreadTwo();
								parsingThreadTwo.start();
							}
						}
					}
	
					if (currentLine.contains(stringTrigger[7][comboGroup_08.getSelectedIndex()])) {
						whichSpellCounter = 8;
						stoppedCasting = false;
						parsingThreadThreeIsRunning = true;
						ParsingThreadThree parsingThreadThree = new ParsingThreadThree();
						parsingThreadThree.start();
						// --- sleep for current spell's cast time ---
						thisSpellCastingTime = CastingDelays.castingDelaysArray[selectedClass][7][comboGroup_08.getSelectedIndex()];
						try { Thread.sleep(thisSpellCastingTime);} catch (InterruptedException e) { e.printStackTrace(); }
						thisSpellCastingTime = 0;
						// -------------------------------------------
						if (stoppedCasting == false)
						{
							killParsingThreadThree();
							if (Arrays.asList(SpellTypes.typeBuff).contains(comboGroup_08.getSelectedItem()))
							{
								comboGroup_08_SpellCounter = spellTimers[7][comboGroup_08.getSelectedIndex()];
								if (spellTimer_08_IsRunning == false) {
									CounterThread counterThread = new CounterThread();
									counterThread.start();
								}
							}
							else
							{
								parsingThreadTwoIsRunning = true;
								ParsingThreadTwo parsingThreadTwo = new ParsingThreadTwo();
								parsingThreadTwo.start();
							}
						}
					}
	
					if (currentLine.contains(stringTrigger[8][comboGroup_09.getSelectedIndex()])) {
						whichSpellCounter = 9;
						stoppedCasting = false;
						parsingThreadThreeIsRunning = true;
						ParsingThreadThree parsingThreadThree = new ParsingThreadThree();
						parsingThreadThree.start();
						// --- sleep for current spell's cast time ---
						thisSpellCastingTime = CastingDelays.castingDelaysArray[selectedClass][8][comboGroup_09.getSelectedIndex()];
						try { Thread.sleep(thisSpellCastingTime);} catch (InterruptedException e) { e.printStackTrace(); }
						thisSpellCastingTime = 0;
						// -------------------------------------------
						if (stoppedCasting == false)
						{
							killParsingThreadThree();
							if (Arrays.asList(SpellTypes.typeBuff).contains(comboGroup_09.getSelectedItem()))
							{
								comboGroup_09_SpellCounter = spellTimers[8][comboGroup_09.getSelectedIndex()];
								if (spellTimer_09_IsRunning == false) {
									CounterThread counterThread = new CounterThread();
									counterThread.start();
								}
							}
							else
							{
								parsingThreadTwoIsRunning = true;
								ParsingThreadTwo parsingThreadTwo = new ParsingThreadTwo();
								parsingThreadTwo.start();
							}
						}
					}
	
					if (currentLine.contains(stringTrigger[9][comboGroup_10.getSelectedIndex()])) {
						whichSpellCounter = 10;
						stoppedCasting = false;
						parsingThreadThreeIsRunning = true;
						ParsingThreadThree parsingThreadThree = new ParsingThreadThree();
						parsingThreadThree.start();
						// --- sleep for current spell's cast time ---
						thisSpellCastingTime = CastingDelays.castingDelaysArray[selectedClass][9][comboGroup_10.getSelectedIndex()];
						try { Thread.sleep(thisSpellCastingTime);} catch (InterruptedException e) { e.printStackTrace(); }
						thisSpellCastingTime = 0;
						// -------------------------------------------
						if (stoppedCasting == false)
						{
							killParsingThreadThree();
							if (Arrays.asList(SpellTypes.typeBuff).contains(comboGroup_10.getSelectedItem()))
							{
								comboGroup_10_SpellCounter = spellTimers[9][comboGroup_10.getSelectedIndex()];
								if (spellTimer_10_IsRunning == false) {
									CounterThread counterThread = new CounterThread();
									counterThread.start();
								}
							}
							else
							{
								parsingThreadTwoIsRunning = true;
								ParsingThreadTwo parsingThreadTwo = new ParsingThreadTwo();
								parsingThreadTwo.start();
							}
						}
					}
	
					if (currentLine.contains(stringTrigger[10][comboGroup_11.getSelectedIndex()])) {
						whichSpellCounter = 11;
						stoppedCasting = false;
						parsingThreadThreeIsRunning = true;
						ParsingThreadThree parsingThreadThree = new ParsingThreadThree();
						parsingThreadThree.start();
						// --- sleep for current spell's cast time ---
						thisSpellCastingTime = CastingDelays.castingDelaysArray[selectedClass][10][comboGroup_11.getSelectedIndex()];
						try { Thread.sleep(thisSpellCastingTime);} catch (InterruptedException e) { e.printStackTrace(); }
						thisSpellCastingTime = 0;
						// -------------------------------------------
						if (stoppedCasting == false)
						{
							killParsingThreadThree();
							if (Arrays.asList(SpellTypes.typeBuff).contains(comboGroup_11.getSelectedItem()))
							{
								comboGroup_11_SpellCounter = spellTimers[10][comboGroup_11.getSelectedIndex()];
								if (spellTimer_11_IsRunning == false) {
									CounterThread counterThread = new CounterThread();
									counterThread.start();
								}
							}
							else
							{
								parsingThreadTwoIsRunning = true;
								ParsingThreadTwo parsingThreadTwo = new ParsingThreadTwo();
								parsingThreadTwo.start();
							}
						}
					}
	
					if (currentLine.contains(stringTrigger[11][comboGroup_12.getSelectedIndex()])) {
						whichSpellCounter = 12;
						stoppedCasting = false;
						parsingThreadThreeIsRunning = true;
						ParsingThreadThree parsingThreadThree = new ParsingThreadThree();
						parsingThreadThree.start();
						// --- sleep for current spell's cast time ---
						thisSpellCastingTime = CastingDelays.castingDelaysArray[selectedClass][11][comboGroup_12.getSelectedIndex()];
						try { Thread.sleep(thisSpellCastingTime);} catch (InterruptedException e) { e.printStackTrace(); }
						thisSpellCastingTime = 0;
						// -------------------------------------------
						if (stoppedCasting == false)
						{
							killParsingThreadThree();
							if (Arrays.asList(SpellTypes.typeBuff).contains(comboGroup_12.getSelectedItem()))
							{
								comboGroup_12_SpellCounter = spellTimers[11][comboGroup_12.getSelectedIndex()];
								if (spellTimer_12_IsRunning == false) {
									CounterThread counterThread = new CounterThread();
									counterThread.start();
								}
							}
							else
							{
								parsingThreadTwoIsRunning = true;
								ParsingThreadTwo parsingThreadTwo = new ParsingThreadTwo();
								parsingThreadTwo.start();
							}
						}
					}
	
					if (currentLine.contains(stringTrigger[12][comboGroup_13.getSelectedIndex()])) {
						whichSpellCounter = 13;
						stoppedCasting = false;
						parsingThreadThreeIsRunning = true;
						ParsingThreadThree parsingThreadThree = new ParsingThreadThree();
						parsingThreadThree.start();
						// --- sleep for current spell's cast time ---
						thisSpellCastingTime = CastingDelays.castingDelaysArray[selectedClass][12][comboGroup_13.getSelectedIndex()];
						try { Thread.sleep(thisSpellCastingTime);} catch (InterruptedException e) { e.printStackTrace(); }
						thisSpellCastingTime = 0;
						// -------------------------------------------
						if (stoppedCasting == false)
						{
							killParsingThreadThree();
							if (Arrays.asList(SpellTypes.typeBuff).contains(comboGroup_13.getSelectedItem()))
							{
								comboGroup_13_SpellCounter = spellTimers[12][comboGroup_13.getSelectedIndex()];
								if (spellTimer_13_IsRunning == false) {
									CounterThread counterThread = new CounterThread();
									counterThread.start();
								}
							}
							else
							{
								parsingThreadTwoIsRunning = true;
								ParsingThreadTwo parsingThreadTwo = new ParsingThreadTwo();
								parsingThreadTwo.start();
							}
						}
					}
	
					if (currentLine.contains(stringTrigger[13][comboGroup_14.getSelectedIndex()])) {
						whichSpellCounter = 14;
						stoppedCasting = false;
						parsingThreadThreeIsRunning = true;
						ParsingThreadThree parsingThreadThree = new ParsingThreadThree();
						parsingThreadThree.start();
						// --- sleep for current spell's cast time ---
						thisSpellCastingTime = CastingDelays.castingDelaysArray[selectedClass][13][comboGroup_14.getSelectedIndex()];
						try { Thread.sleep(thisSpellCastingTime);} catch (InterruptedException e) { e.printStackTrace(); }
						thisSpellCastingTime = 0;
						// -------------------------------------------
						if (stoppedCasting == false)
						{
							killParsingThreadThree();
							if (Arrays.asList(SpellTypes.typeBuff).contains(comboGroup_14.getSelectedItem()))
							{
								comboGroup_14_SpellCounter = spellTimers[13][comboGroup_14.getSelectedIndex()];
								if (spellTimer_14_IsRunning == false) {
									CounterThread counterThread = new CounterThread();
									counterThread.start();
								}
							}
							else
							{
								parsingThreadTwoIsRunning = true;
								ParsingThreadTwo parsingThreadTwo = new ParsingThreadTwo();
								parsingThreadTwo.start();
							}
						}
					}
	
					if (currentLine.contains(stringTrigger[14][comboGroup_15.getSelectedIndex()])) {
						whichSpellCounter = 15;
						stoppedCasting = false;
						parsingThreadThreeIsRunning = true;
						ParsingThreadThree parsingThreadThree = new ParsingThreadThree();
						parsingThreadThree.start();
						// --- sleep for current spell's cast time ---
						thisSpellCastingTime = CastingDelays.castingDelaysArray[selectedClass][14][comboGroup_15.getSelectedIndex()];
						try { Thread.sleep(thisSpellCastingTime);} catch (InterruptedException e) { e.printStackTrace(); }
						thisSpellCastingTime = 0;
						// -------------------------------------------
						if (stoppedCasting == false)
						{
							killParsingThreadThree();
							if (Arrays.asList(SpellTypes.typeBuff).contains(comboGroup_15.getSelectedItem()))
							{
								comboGroup_15_SpellCounter = spellTimers[14][comboGroup_15.getSelectedIndex()];
								if (spellTimer_15_IsRunning == false) {
									CounterThread counterThread = new CounterThread();
									counterThread.start();
								}
							}
							else
							{
								parsingThreadTwoIsRunning = true;
								ParsingThreadTwo parsingThreadTwo = new ParsingThreadTwo();
								parsingThreadTwo.start();
							}
						}
					}
	
					if (currentLine.contains(stringTrigger[15][comboGroup_16.getSelectedIndex()])) {
						whichSpellCounter = 16;
						stoppedCasting = false;
						parsingThreadThreeIsRunning = true;
						ParsingThreadThree parsingThreadThree = new ParsingThreadThree();
						parsingThreadThree.start();
						// --- sleep for current spell's cast time ---
						thisSpellCastingTime = CastingDelays.castingDelaysArray[selectedClass][15][comboGroup_16.getSelectedIndex()];
						try { Thread.sleep(thisSpellCastingTime);} catch (InterruptedException e) { e.printStackTrace(); }
						thisSpellCastingTime = 0;
						// -------------------------------------------
						if (stoppedCasting == false)
						{
							killParsingThreadThree();
							if (Arrays.asList(SpellTypes.typeBuff).contains(comboGroup_16.getSelectedItem()))
							{
								comboGroup_16_SpellCounter = spellTimers[15][comboGroup_16.getSelectedIndex()];
								if (spellTimer_16_IsRunning == false) {
									CounterThread counterThread = new CounterThread();
									counterThread.start();
								}
							}
							else
							{
								parsingThreadTwoIsRunning = true;
								ParsingThreadTwo parsingThreadTwo = new ParsingThreadTwo();
								parsingThreadTwo.start();
							}
						}
					}
					
					if (currentLine.contains(stringTrigger[16][comboGroup_17.getSelectedIndex()])) {
						whichSpellCounter = 17;
						stoppedCasting = false;
						parsingThreadThreeIsRunning = true;
						ParsingThreadThree parsingThreadThree = new ParsingThreadThree();
						parsingThreadThree.start();
						// --- sleep for current spell's cast time ---
						thisSpellCastingTime = CastingDelays.castingDelaysArray[selectedClass][16][comboGroup_17.getSelectedIndex()];
						try { Thread.sleep(thisSpellCastingTime);} catch (InterruptedException e) { e.printStackTrace(); }
						thisSpellCastingTime = 0;
						// -------------------------------------------
						if (stoppedCasting == false)
						{
							killParsingThreadThree();
							if (Arrays.asList(SpellTypes.typeBuff).contains(comboGroup_17.getSelectedItem()))
							{
								comboGroup_17_SpellCounter = spellTimers[16][comboGroup_17.getSelectedIndex()];
								if (spellTimer_17_IsRunning == false) {
									CounterThread counterThread = new CounterThread();
									counterThread.start();
								}
							}
							else
							{
								parsingThreadTwoIsRunning = true;
								ParsingThreadTwo parsingThreadTwo = new ParsingThreadTwo();
								parsingThreadTwo.start();
							}
						}
					}
					
					if (currentLine.contains(stringTrigger[17][comboGroup_18.getSelectedIndex()])) {
						whichSpellCounter = 18;
						stoppedCasting = false;
						parsingThreadThreeIsRunning = true;
						ParsingThreadThree parsingThreadThree = new ParsingThreadThree();
						parsingThreadThree.start();
						// --- sleep for current spell's cast time ---
						thisSpellCastingTime = CastingDelays.castingDelaysArray[selectedClass][17][comboGroup_18.getSelectedIndex()];
						try { Thread.sleep(thisSpellCastingTime);} catch (InterruptedException e) { e.printStackTrace(); }
						thisSpellCastingTime = 0;
						// -------------------------------------------
						if (stoppedCasting == false)
						{
							killParsingThreadThree();
							if (Arrays.asList(SpellTypes.typeBuff).contains(comboGroup_18.getSelectedItem()))
							{
								comboGroup_18_SpellCounter = spellTimers[17][comboGroup_18.getSelectedIndex()];
								if (spellTimer_18_IsRunning == false) {
									
									CounterThread counterThread = new CounterThread();
									counterThread.start();
								}
							}
							else
							{
								parsingThreadTwoIsRunning = true;
								ParsingThreadTwo parsingThreadTwo = new ParsingThreadTwo();
								parsingThreadTwo.start();
							}
						}
					}
				}
				
				triggerText_01_String = triggerText_01.getText();
				if (currentLine.contains(triggerText_01_String))
				{
					if (triggerText_01_String != null && !triggerText_01_String.isEmpty() && trigger_01_Activated == false)
					{
						lblTrigger_01.setIcon(triggerIcon);
						triggerText_01.setBackground(new Color(144, 238, 144));
						triggerText_02.setBackground(Color.WHITE);
						triggerText_03.setBackground(Color.WHITE);
						triggerText_04.setBackground(Color.WHITE);
						triggerText_05.setBackground(Color.WHITE);
						triggerText_06.setBackground(Color.WHITE);
						triggerText_07.setBackground(Color.WHITE);
						triggerText_08.setBackground(Color.WHITE);
						triggerText_09.setBackground(Color.WHITE);
						if (chckbxPlayTriggerSounds.isSelected())
						{
							Sound.Play();
						}
						trigger_01_Activated = true;
					}
				}
				
				triggerText_02_String = triggerText_02.getText();
				if (currentLine.contains(triggerText_02_String))
				{
					if (triggerText_02_String != null && !triggerText_02_String.isEmpty() && trigger_02_Activated == false)
					{
						lblTrigger_02.setIcon(triggerIcon);
						triggerText_01.setBackground(Color.WHITE);
						triggerText_02.setBackground(new Color(144, 238, 144));
						triggerText_03.setBackground(Color.WHITE);
						triggerText_04.setBackground(Color.WHITE);
						triggerText_05.setBackground(Color.WHITE);
						triggerText_06.setBackground(Color.WHITE);
						triggerText_07.setBackground(Color.WHITE);
						triggerText_08.setBackground(Color.WHITE);
						triggerText_09.setBackground(Color.WHITE);
						if (chckbxPlayTriggerSounds.isSelected())
						{
							Sound.Play();
						}
						trigger_02_Activated = true;
					}
				}
				
				triggerText_03_String = triggerText_03.getText();
				if (currentLine.contains(triggerText_03_String))
				{
					if (triggerText_03_String != null && !triggerText_03_String.isEmpty() && trigger_03_Activated == false)
					{
						lblTrigger_03.setIcon(triggerIcon);
						triggerText_01.setBackground(Color.WHITE);
						triggerText_02.setBackground(Color.WHITE);
						triggerText_03.setBackground(new Color(144, 238, 144));
						triggerText_04.setBackground(Color.WHITE);
						triggerText_05.setBackground(Color.WHITE);
						triggerText_06.setBackground(Color.WHITE);
						triggerText_07.setBackground(Color.WHITE);
						triggerText_08.setBackground(Color.WHITE);
						triggerText_09.setBackground(Color.WHITE);
						if (chckbxPlayTriggerSounds.isSelected())
						{
							Sound.Play();
						}
						trigger_03_Activated = true;
					}
				}
				
				triggerText_04_String = triggerText_04.getText();
				if (currentLine.contains(triggerText_04_String))
				{
					if (triggerText_04_String != null && !triggerText_04_String.isEmpty() && trigger_04_Activated == false)
					{
						lblTrigger_04.setIcon(triggerIcon);
						triggerText_01.setBackground(Color.WHITE);
						triggerText_02.setBackground(Color.WHITE);
						triggerText_03.setBackground(Color.WHITE);
						triggerText_04.setBackground(new Color(144, 238, 144));
						triggerText_05.setBackground(Color.WHITE);
						triggerText_06.setBackground(Color.WHITE);
						triggerText_07.setBackground(Color.WHITE);
						triggerText_08.setBackground(Color.WHITE);
						triggerText_09.setBackground(Color.WHITE);
						if (chckbxPlayTriggerSounds.isSelected())
						{
							Sound.Play();
						}
						trigger_04_Activated = true;
					}
				}
				
				triggerText_05_String = triggerText_05.getText();
				if (currentLine.contains(triggerText_05_String))
				{
					if (triggerText_05_String != null && !triggerText_05_String.isEmpty() && trigger_05_Activated == false)
					{
						lblTrigger_05.setIcon(triggerIcon);
						triggerText_01.setBackground(Color.WHITE);
						triggerText_02.setBackground(Color.WHITE);
						triggerText_03.setBackground(Color.WHITE);
						triggerText_04.setBackground(Color.WHITE);
						triggerText_05.setBackground(new Color(144, 238, 144));
						triggerText_06.setBackground(Color.WHITE);
						triggerText_07.setBackground(Color.WHITE);
						triggerText_08.setBackground(Color.WHITE);
						triggerText_09.setBackground(Color.WHITE);
						if (chckbxPlayTriggerSounds.isSelected())
						{
							Sound.Play();
						}
						trigger_05_Activated = true;
					}
				}
				
				triggerText_06_String = triggerText_06.getText();
				if (currentLine.contains(triggerText_06_String))
				{
					if (triggerText_06_String != null && !triggerText_06_String.isEmpty() && trigger_06_Activated == false)
					{
						lblTrigger_06.setIcon(triggerIcon);
						triggerText_01.setBackground(Color.WHITE);
						triggerText_02.setBackground(Color.WHITE);
						triggerText_03.setBackground(Color.WHITE);
						triggerText_04.setBackground(Color.WHITE);
						triggerText_05.setBackground(Color.WHITE);
						triggerText_06.setBackground(new Color(144, 238, 144));
						triggerText_07.setBackground(Color.WHITE);
						triggerText_08.setBackground(Color.WHITE);
						triggerText_09.setBackground(Color.WHITE);
						if (chckbxPlayTriggerSounds.isSelected())
						{
							Sound.Play();
						}
						trigger_06_Activated = true;
					}
				}
				
				triggerText_07_String = triggerText_07.getText();
				if (currentLine.contains(triggerText_07_String))
				{
					if (triggerText_07_String != null && !triggerText_07_String.isEmpty() && trigger_07_Activated == false)
					{
						lblTrigger_07.setIcon(triggerIcon);
						triggerText_01.setBackground(Color.WHITE);
						triggerText_02.setBackground(Color.WHITE);
						triggerText_03.setBackground(Color.WHITE);
						triggerText_04.setBackground(Color.WHITE);
						triggerText_05.setBackground(Color.WHITE);
						triggerText_06.setBackground(Color.WHITE);
						triggerText_07.setBackground(new Color(144, 238, 144));
						triggerText_08.setBackground(Color.WHITE);
						triggerText_09.setBackground(Color.WHITE);
						if (chckbxPlayTriggerSounds.isSelected())
						{
							Sound.Play();
						}
						trigger_07_Activated = true;
					}
				}
				
				triggerText_08_String = triggerText_08.getText();
				if (currentLine.contains(triggerText_08_String))
				{
					if (triggerText_08_String != null && !triggerText_08_String.isEmpty() && trigger_08_Activated == false)
					{
						lblTrigger_08.setIcon(triggerIcon);
						triggerText_01.setBackground(Color.WHITE);
						triggerText_02.setBackground(Color.WHITE);
						triggerText_03.setBackground(Color.WHITE);
						triggerText_04.setBackground(Color.WHITE);
						triggerText_05.setBackground(Color.WHITE);
						triggerText_06.setBackground(Color.WHITE);
						triggerText_07.setBackground(Color.WHITE);
						triggerText_08.setBackground(new Color(144, 238, 144));
						triggerText_09.setBackground(Color.WHITE);
						if (chckbxPlayTriggerSounds.isSelected())
						{
							Sound.Play();
						}
						trigger_08_Activated = true;
					}
				}
				
				triggerText_09_String = triggerText_09.getText();
				if (currentLine.contains(triggerText_09_String))
				{
					if (triggerText_09_String != null && !triggerText_09_String.isEmpty() && trigger_09_Activated == false)
					{
						lblTrigger_09.setIcon(triggerIcon);
						triggerText_01.setBackground(Color.WHITE);
						triggerText_02.setBackground(Color.WHITE);
						triggerText_03.setBackground(Color.WHITE);
						triggerText_04.setBackground(Color.WHITE);
						triggerText_05.setBackground(Color.WHITE);
						triggerText_06.setBackground(Color.WHITE);
						triggerText_07.setBackground(Color.WHITE);
						triggerText_08.setBackground(Color.WHITE);
						triggerText_09.setBackground(new Color(144, 238, 144));
						if (chckbxPlayTriggerSounds.isSelected())
						{
							Sound.Play();
						}
						trigger_09_Activated = true;
					}
				}
			}
		}
	}
	
	// PARSING THREAD 2
	
	public static class ParsingThreadTwo extends Thread {
		public void run() {
			while (parsingThreadTwoIsRunning == true)
			{
				try {
					Thread.sleep(startParsingdelay);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				String currentLine = FileTail.tail(selectedFile);

				if (currentLine.contains(stringTriggerLanded[0][comboGroup_01.getSelectedIndex()]))
				{
					comboGroup_01_SpellCounter = spellTimers[0][comboGroup_01.getSelectedIndex()];
					killParsingThreadTwo();
					if (spellTimer_01_IsRunning == false) {
						CounterThread counterThread = new CounterThread();
						counterThread.start();
					}
					
				}
				if (currentLine.contains(stringTriggerLanded[1][comboGroup_02.getSelectedIndex()]))
				{
					comboGroup_02_SpellCounter = spellTimers[1][comboGroup_02.getSelectedIndex()];
					killParsingThreadTwo();
					if (spellTimer_02_IsRunning == false) {
						CounterThread counterThread = new CounterThread();
						counterThread.start();
					}
					
				}
				if (currentLine.contains(stringTriggerLanded[2][comboGroup_03.getSelectedIndex()]))
				{
					comboGroup_03_SpellCounter = spellTimers[2][comboGroup_03.getSelectedIndex()];
					killParsingThreadTwo();
					if (spellTimer_03_IsRunning == false) {
						CounterThread counterThread = new CounterThread();
						counterThread.start();
					}
					
				}
				if (currentLine.contains(stringTriggerLanded[3][comboGroup_04.getSelectedIndex()]))
				{
					comboGroup_04_SpellCounter = spellTimers[3][comboGroup_04.getSelectedIndex()];
					killParsingThreadTwo();
					if (spellTimer_04_IsRunning == false) {
						CounterThread counterThread = new CounterThread();
						counterThread.start();
					}
					
				}
				if (currentLine.contains(stringTriggerLanded[4][comboGroup_05.getSelectedIndex()]))
				{
					comboGroup_05_SpellCounter = spellTimers[4][comboGroup_05.getSelectedIndex()];
					killParsingThreadTwo();
					if (spellTimer_05_IsRunning == false) {
						CounterThread counterThread = new CounterThread();
						counterThread.start();
					}
					
				}
				if (currentLine.contains(stringTriggerLanded[5][comboGroup_06.getSelectedIndex()]))
				{
					comboGroup_06_SpellCounter = spellTimers[5][comboGroup_06.getSelectedIndex()];
					killParsingThreadTwo();
					if (spellTimer_06_IsRunning == false) {
						CounterThread counterThread = new CounterThread();
						counterThread.start();
					}
					
				}
				if (currentLine.contains(stringTriggerLanded[6][comboGroup_07.getSelectedIndex()]))
				{
					comboGroup_07_SpellCounter = spellTimers[6][comboGroup_07.getSelectedIndex()];
					killParsingThreadTwo();
					if (spellTimer_07_IsRunning == false) {
						CounterThread counterThread = new CounterThread();
						counterThread.start();
					}
					
				}
				if (currentLine.contains(stringTriggerLanded[7][comboGroup_08.getSelectedIndex()]))
				{
					comboGroup_08_SpellCounter = spellTimers[7][comboGroup_08.getSelectedIndex()];
					killParsingThreadTwo();
					if (spellTimer_08_IsRunning == false) {
						CounterThread counterThread = new CounterThread();
						counterThread.start();
					}
					
				}
				if (currentLine.contains(stringTriggerLanded[8][comboGroup_09.getSelectedIndex()]))
				{
					comboGroup_09_SpellCounter = spellTimers[8][comboGroup_09.getSelectedIndex()];
					killParsingThreadTwo();
					if (spellTimer_09_IsRunning == false) {
						CounterThread counterThread = new CounterThread();
						counterThread.start();
					}
					
				}
				if (currentLine.contains(stringTriggerLanded[9][comboGroup_10.getSelectedIndex()]))
				{
					comboGroup_10_SpellCounter = spellTimers[9][comboGroup_10.getSelectedIndex()];
					killParsingThreadTwo();
					if (spellTimer_10_IsRunning == false) {
						CounterThread counterThread = new CounterThread();
						counterThread.start();
					}
					
				}
				if (currentLine.contains(stringTriggerLanded[10][comboGroup_11.getSelectedIndex()]))
				{
					comboGroup_11_SpellCounter = spellTimers[10][comboGroup_11.getSelectedIndex()];
					killParsingThreadTwo();
					if (spellTimer_11_IsRunning == false) {
						CounterThread counterThread = new CounterThread();
						counterThread.start();
					}
					
				}
				if (currentLine.contains(stringTriggerLanded[11][comboGroup_12.getSelectedIndex()]))
				{
					comboGroup_12_SpellCounter = spellTimers[11][comboGroup_12.getSelectedIndex()];
					killParsingThreadTwo();
					if (spellTimer_12_IsRunning == false) {
						CounterThread counterThread = new CounterThread();
						counterThread.start();
					}
					
				}
				if (currentLine.contains(stringTriggerLanded[12][comboGroup_13.getSelectedIndex()]))
				{
					comboGroup_13_SpellCounter = spellTimers[12][comboGroup_13.getSelectedIndex()];
					killParsingThreadTwo();
					if (spellTimer_13_IsRunning == false) {
						CounterThread counterThread = new CounterThread();
						counterThread.start();
					}
					
				}
				if (currentLine.contains(stringTriggerLanded[13][comboGroup_14.getSelectedIndex()]))
				{
					comboGroup_14_SpellCounter = spellTimers[13][comboGroup_14.getSelectedIndex()];
					killParsingThreadTwo();
					if (spellTimer_14_IsRunning == false) {
						CounterThread counterThread = new CounterThread();
						counterThread.start();
					}
					
				}
				if (currentLine.contains(stringTriggerLanded[14][comboGroup_15.getSelectedIndex()]))
				{
					comboGroup_15_SpellCounter = spellTimers[14][comboGroup_15.getSelectedIndex()];
					killParsingThreadTwo();
					if (spellTimer_15_IsRunning == false) {
						CounterThread counterThread = new CounterThread();
						counterThread.start();
					}
					
				}
				if (currentLine.contains(stringTriggerLanded[15][comboGroup_16.getSelectedIndex()]))
				{
					comboGroup_16_SpellCounter = spellTimers[15][comboGroup_16.getSelectedIndex()];
					killParsingThreadTwo();
					if (spellTimer_16_IsRunning == false) {
						CounterThread counterThread = new CounterThread();
						counterThread.start();
					}
					
				}
				if (currentLine.contains(stringTriggerLanded[16][comboGroup_17.getSelectedIndex()]))
				{
					comboGroup_17_SpellCounter = spellTimers[16][comboGroup_17.getSelectedIndex()];
					killParsingThreadTwo();
					if (spellTimer_17_IsRunning == false) {
						CounterThread counterThread = new CounterThread();
						counterThread.start();
					}
					
				}
				if (currentLine.contains(stringTriggerLanded[17][comboGroup_18.getSelectedIndex()]))
				{
					comboGroup_18_SpellCounter = spellTimers[17][comboGroup_18.getSelectedIndex()];
					killParsingThreadTwo();
					if (spellTimer_18_IsRunning == false) {
						CounterThread counterThread = new CounterThread();
						counterThread.start();
					}
					
				}
			}
		}
	}
	
	// PARSING THREAD 3
	
	public static class ParsingThreadThree extends Thread {
		public void run() {
			while (parsingThreadThreeIsRunning == true)
			{
				try {
					Thread.sleep(startParsingdelay);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				String currentLine = FileTail.tail(selectedFile);

				if (currentLine.contains("Your spell is interrupted."))
				{
					stoppedCasting = true;
					killParsingThreadThree();
				}
			}
		}
	}
	

	// SPELL COUNTER THREAD
	private static class CounterThread extends Thread
	{
		public void run()
		{
			if (whichSpellCounter == 1) {
				spellTimer_01_IsRunning = true;
				int combo_01_CurrentSelectionCounting = combo_01_CurrentSelection;
				while (spellTimer_01_IsRunning) {
					comboGroup_01_SpellCounterString = comboGroup_01_SpellCounterString.valueOf(comboGroup_01_SpellCounter);
					if (comboGroup_01_SpellCounter > 0) {
						spellTimer_01.setText(comboGroup_01_SpellCounterString);
						comboGroup_01_SpellCounter--; }
					try {
						Thread.sleep(counterSleepDelay);
					} catch (InterruptedException e) {
						e.printStackTrace(); }
					if (comboGroup_01_SpellCounter == 0) {
						spellTimer_01.setText(""); }
					if (combo_01_CurrentSelectionCounting != combo_01_CurrentSelection) {
						comboGroup_01_SpellCounter = 0;
						spellTimer_01.setText("");
						combo_01_CurrentSelectionCounting = combo_01_CurrentSelection; } } }
			
			if (whichSpellCounter == 2) {
				spellTimer_02_IsRunning = true;
				int combo_02_CurrentSelectionCounting = combo_02_CurrentSelection;
				while (spellTimer_02_IsRunning) {
					comboGroup_02_SpellCounterString = comboGroup_02_SpellCounterString.valueOf(comboGroup_02_SpellCounter);
					if (comboGroup_02_SpellCounter > 0) {
						spellTimer_02.setText(comboGroup_02_SpellCounterString);
						comboGroup_02_SpellCounter--; }
					try {
						Thread.sleep(counterSleepDelay);
					} catch (InterruptedException e) {
						e.printStackTrace(); }
					if (comboGroup_02_SpellCounter == 0) {
						spellTimer_02.setText(""); }
					if (combo_02_CurrentSelectionCounting != combo_02_CurrentSelection) {
						comboGroup_02_SpellCounter = 0;
						spellTimer_02.setText("");
						combo_02_CurrentSelectionCounting = combo_02_CurrentSelection; } } }
			
			if (whichSpellCounter == 3) {
				spellTimer_03_IsRunning = true;
				int combo_03_CurrentSelectionCounting = combo_03_CurrentSelection;
				while (spellTimer_03_IsRunning) {
					comboGroup_03_SpellCounterString = comboGroup_03_SpellCounterString.valueOf(comboGroup_03_SpellCounter);
					if (comboGroup_03_SpellCounter > 0) {
						spellTimer_03.setText(comboGroup_03_SpellCounterString);
						comboGroup_03_SpellCounter--; }
					try {
						Thread.sleep(counterSleepDelay);
					} catch (InterruptedException e) {
						e.printStackTrace(); }
					if (comboGroup_03_SpellCounter == 0) {
						spellTimer_03.setText(""); }
					if (combo_03_CurrentSelectionCounting != combo_03_CurrentSelection) {
						comboGroup_03_SpellCounter = 0;
						spellTimer_03.setText("");
						combo_03_CurrentSelectionCounting = combo_03_CurrentSelection; } } }
			
			if (whichSpellCounter == 4) {
				spellTimer_04_IsRunning = true;
				int combo_04_CurrentSelectionCounting = combo_04_CurrentSelection;
				while (spellTimer_04_IsRunning) {
					comboGroup_04_SpellCounterString = comboGroup_04_SpellCounterString.valueOf(comboGroup_04_SpellCounter);
					if (comboGroup_04_SpellCounter > 0) {
						spellTimer_04.setText(comboGroup_04_SpellCounterString);
						comboGroup_04_SpellCounter--; }
					try {
						Thread.sleep(counterSleepDelay);
					} catch (InterruptedException e) {
						e.printStackTrace(); }
					if (comboGroup_04_SpellCounter == 0) {
						spellTimer_04.setText(""); }
					if (combo_04_CurrentSelectionCounting != combo_04_CurrentSelection) {
						comboGroup_04_SpellCounter = 0;
						spellTimer_04.setText("");
						combo_04_CurrentSelectionCounting = combo_04_CurrentSelection; } } }
			
			if (whichSpellCounter == 5) {
				spellTimer_05_IsRunning = true;
				int combo_05_CurrentSelectionCounting = combo_05_CurrentSelection;
				while (spellTimer_05_IsRunning) {
					comboGroup_05_SpellCounterString = comboGroup_05_SpellCounterString.valueOf(comboGroup_05_SpellCounter);
					if (comboGroup_05_SpellCounter > 0) {
						spellTimer_05.setText(comboGroup_05_SpellCounterString);
						comboGroup_05_SpellCounter--; }
					try {
						Thread.sleep(counterSleepDelay);
					} catch (InterruptedException e) {
						e.printStackTrace(); }
					if (comboGroup_05_SpellCounter == 0) {
						spellTimer_05.setText(""); }
					if (combo_05_CurrentSelectionCounting != combo_05_CurrentSelection) {
						comboGroup_05_SpellCounter = 0;
						spellTimer_05.setText("");
						combo_05_CurrentSelectionCounting = combo_05_CurrentSelection; } } }
			
			if (whichSpellCounter == 6) {
				spellTimer_06_IsRunning = true;
				int combo_06_CurrentSelectionCounting = combo_06_CurrentSelection;
				while (spellTimer_06_IsRunning) {
					comboGroup_06_SpellCounterString = comboGroup_06_SpellCounterString.valueOf(comboGroup_06_SpellCounter);
					if (comboGroup_06_SpellCounter > 0) {
						spellTimer_06.setText(comboGroup_06_SpellCounterString);
						comboGroup_06_SpellCounter--; }
					try {
						Thread.sleep(counterSleepDelay);
					} catch (InterruptedException e) {
						e.printStackTrace(); }
					if (comboGroup_06_SpellCounter == 0) {
						spellTimer_06.setText(""); }
					if (combo_06_CurrentSelectionCounting != combo_06_CurrentSelection) {
						comboGroup_06_SpellCounter = 0;
						spellTimer_06.setText("");
						combo_06_CurrentSelectionCounting = combo_06_CurrentSelection; } } }
			
			if (whichSpellCounter == 7) {
				spellTimer_07_IsRunning = true;
				int combo_07_CurrentSelectionCounting = combo_07_CurrentSelection;
				while (spellTimer_07_IsRunning) {
					comboGroup_07_SpellCounterString = comboGroup_07_SpellCounterString.valueOf(comboGroup_07_SpellCounter);
					if (comboGroup_07_SpellCounter > 0) {
						spellTimer_07.setText(comboGroup_07_SpellCounterString);
						comboGroup_07_SpellCounter--; }
					try {
						Thread.sleep(counterSleepDelay);
					} catch (InterruptedException e) {
						e.printStackTrace(); }
					if (comboGroup_07_SpellCounter == 0) {
						spellTimer_07.setText(""); }
					if (combo_07_CurrentSelectionCounting != combo_07_CurrentSelection) {
						comboGroup_07_SpellCounter = 0;
						spellTimer_07.setText("");
						combo_07_CurrentSelectionCounting = combo_07_CurrentSelection; } } }
			
			if (whichSpellCounter == 8) {
				spellTimer_08_IsRunning = true;
				int combo_08_CurrentSelectionCounting = combo_08_CurrentSelection;
				while (spellTimer_08_IsRunning) {
					comboGroup_08_SpellCounterString = comboGroup_08_SpellCounterString.valueOf(comboGroup_08_SpellCounter);
					if (comboGroup_08_SpellCounter > 0) {
						spellTimer_08.setText(comboGroup_08_SpellCounterString);
						comboGroup_08_SpellCounter--; }
					try {
						Thread.sleep(counterSleepDelay);
					} catch (InterruptedException e) {
						e.printStackTrace(); }
					if (comboGroup_08_SpellCounter == 0) {
						spellTimer_08.setText(""); }
					if (combo_08_CurrentSelectionCounting != combo_08_CurrentSelection) {
						comboGroup_08_SpellCounter = 0;
						spellTimer_08.setText("");
						combo_08_CurrentSelectionCounting = combo_08_CurrentSelection; } } }
			
			if (whichSpellCounter == 9) {
				spellTimer_09_IsRunning = true;
				int combo_09_CurrentSelectionCounting = combo_09_CurrentSelection;
				while (spellTimer_09_IsRunning) {
					comboGroup_09_SpellCounterString = comboGroup_09_SpellCounterString.valueOf(comboGroup_09_SpellCounter);
					if (comboGroup_09_SpellCounter > 0) {
						spellTimer_09.setText(comboGroup_09_SpellCounterString);
						comboGroup_09_SpellCounter--; }
					try {
						Thread.sleep(counterSleepDelay);
					} catch (InterruptedException e) {
						e.printStackTrace(); }
					if (comboGroup_09_SpellCounter == 0) {
						spellTimer_09.setText(""); }
					if (combo_09_CurrentSelectionCounting != combo_09_CurrentSelection) {
						comboGroup_09_SpellCounter = 0;
						spellTimer_09.setText("");
						combo_09_CurrentSelectionCounting = combo_09_CurrentSelection; } } }
			
			if (whichSpellCounter == 10) {
				spellTimer_10_IsRunning = true;
				int combo_10_CurrentSelectionCounting = combo_10_CurrentSelection;
				while (spellTimer_10_IsRunning) {
					comboGroup_10_SpellCounterString = comboGroup_10_SpellCounterString.valueOf(comboGroup_10_SpellCounter);
					if (comboGroup_10_SpellCounter > 0) {
						spellTimer_10.setText(comboGroup_10_SpellCounterString);
						comboGroup_10_SpellCounter--; }
					try {
						Thread.sleep(counterSleepDelay);
					} catch (InterruptedException e) {
						e.printStackTrace(); }
					if (comboGroup_10_SpellCounter == 0) {
						spellTimer_10.setText(""); }
					if (combo_10_CurrentSelectionCounting != combo_10_CurrentSelection) {
						comboGroup_10_SpellCounter = 0;
						spellTimer_10.setText("");
						combo_10_CurrentSelectionCounting = combo_10_CurrentSelection; } } }
			
			if (whichSpellCounter == 11) {
				spellTimer_11_IsRunning = true;
				int combo_11_CurrentSelectionCounting = combo_11_CurrentSelection;
				while (spellTimer_11_IsRunning) {
					comboGroup_11_SpellCounterString = comboGroup_11_SpellCounterString.valueOf(comboGroup_11_SpellCounter);
					if (comboGroup_11_SpellCounter > 0) {
						spellTimer_11.setText(comboGroup_11_SpellCounterString);
						comboGroup_11_SpellCounter--; }
					try {
						Thread.sleep(counterSleepDelay);
					} catch (InterruptedException e) {
						e.printStackTrace(); }
					if (comboGroup_11_SpellCounter == 0) {
						spellTimer_11.setText(""); }
					if (combo_11_CurrentSelectionCounting != combo_11_CurrentSelection) {
						comboGroup_11_SpellCounter = 0;
						spellTimer_11.setText("");
						combo_11_CurrentSelectionCounting = combo_11_CurrentSelection; } } }
			
			if (whichSpellCounter == 12) {
				spellTimer_12_IsRunning = true;
				int combo_12_CurrentSelectionCounting = combo_12_CurrentSelection;
				while (spellTimer_12_IsRunning) {
					comboGroup_12_SpellCounterString = comboGroup_12_SpellCounterString.valueOf(comboGroup_12_SpellCounter);
					if (comboGroup_12_SpellCounter > 0) {
						spellTimer_12.setText(comboGroup_12_SpellCounterString);
						comboGroup_12_SpellCounter--; }
					try {
						Thread.sleep(counterSleepDelay);
					} catch (InterruptedException e) {
						e.printStackTrace(); }
					if (comboGroup_12_SpellCounter == 0) {
						spellTimer_12.setText(""); }
					if (combo_12_CurrentSelectionCounting != combo_12_CurrentSelection) {
						comboGroup_12_SpellCounter = 0;
						spellTimer_12.setText("");
						combo_12_CurrentSelectionCounting = combo_12_CurrentSelection; } } }
			
			if (whichSpellCounter == 13) {
				spellTimer_13_IsRunning = true;
				int combo_13_CurrentSelectionCounting = combo_13_CurrentSelection;
				while (spellTimer_13_IsRunning) {
					comboGroup_13_SpellCounterString = comboGroup_13_SpellCounterString.valueOf(comboGroup_13_SpellCounter);
					if (comboGroup_13_SpellCounter > 0) {
						spellTimer_13.setText(comboGroup_13_SpellCounterString);
						comboGroup_13_SpellCounter--; }
					try {
						Thread.sleep(counterSleepDelay);
					} catch (InterruptedException e) {
						e.printStackTrace(); }
					if (comboGroup_13_SpellCounter == 0) {
						spellTimer_13.setText(""); }
					if (combo_13_CurrentSelectionCounting != combo_13_CurrentSelection) {
						comboGroup_13_SpellCounter = 0;
						spellTimer_13.setText("");
						combo_13_CurrentSelectionCounting = combo_13_CurrentSelection; } } }
			
			if (whichSpellCounter == 14) {
				spellTimer_14_IsRunning = true;
				int combo_14_CurrentSelectionCounting = combo_14_CurrentSelection;
				while (spellTimer_14_IsRunning) {
					comboGroup_14_SpellCounterString = comboGroup_14_SpellCounterString.valueOf(comboGroup_14_SpellCounter);
					if (comboGroup_14_SpellCounter > 0) {
						spellTimer_14.setText(comboGroup_14_SpellCounterString);
						comboGroup_14_SpellCounter--; }
					try {
						Thread.sleep(counterSleepDelay);
					} catch (InterruptedException e) {
						e.printStackTrace(); }
					if (comboGroup_14_SpellCounter == 0) {
						spellTimer_14.setText(""); }
					if (combo_14_CurrentSelectionCounting != combo_14_CurrentSelection) {
						comboGroup_14_SpellCounter = 0;
						spellTimer_14.setText("");
						combo_14_CurrentSelectionCounting = combo_14_CurrentSelection; } } }
			
			if (whichSpellCounter == 15) {
				spellTimer_15_IsRunning = true;
				int combo_15_CurrentSelectionCounting = combo_15_CurrentSelection;
				while (spellTimer_15_IsRunning) {
					comboGroup_15_SpellCounterString = comboGroup_15_SpellCounterString.valueOf(comboGroup_15_SpellCounter);
					if (comboGroup_15_SpellCounter > 0) {
						spellTimer_15.setText(comboGroup_15_SpellCounterString);
						comboGroup_15_SpellCounter--; }
					try {
						Thread.sleep(counterSleepDelay);
					} catch (InterruptedException e) {
						e.printStackTrace(); }
					if (comboGroup_15_SpellCounter == 0) {
						spellTimer_15.setText(""); }
					if (combo_15_CurrentSelectionCounting != combo_15_CurrentSelection) {
						comboGroup_15_SpellCounter = 0;
						spellTimer_15.setText("");
						combo_15_CurrentSelectionCounting = combo_15_CurrentSelection; } } }
			
			if (whichSpellCounter == 16) {
				spellTimer_16_IsRunning = true;
				int combo_16_CurrentSelectionCounting = combo_16_CurrentSelection;
				while (spellTimer_16_IsRunning) {
					comboGroup_16_SpellCounterString = comboGroup_16_SpellCounterString.valueOf(comboGroup_16_SpellCounter);
					if (comboGroup_16_SpellCounter > 0) {
						spellTimer_16.setText(comboGroup_16_SpellCounterString);
						comboGroup_16_SpellCounter--; }
					try {
						Thread.sleep(counterSleepDelay);
					} catch (InterruptedException e) {
						e.printStackTrace(); }
					if (comboGroup_16_SpellCounter == 0) {
						spellTimer_16.setText(""); }
					if (combo_16_CurrentSelectionCounting != combo_16_CurrentSelection) {
						comboGroup_16_SpellCounter = 0;
						spellTimer_16.setText("");
						combo_16_CurrentSelectionCounting = combo_16_CurrentSelection; } } }
			
			if (whichSpellCounter == 17) {
				spellTimer_17_IsRunning = true;
				int combo_17_CurrentSelectionCounting = combo_17_CurrentSelection;
				while (spellTimer_17_IsRunning) {
					comboGroup_17_SpellCounterString = comboGroup_17_SpellCounterString.valueOf(comboGroup_17_SpellCounter);
					if (comboGroup_17_SpellCounter > 0) {
						spellTimer_17.setText(comboGroup_17_SpellCounterString);
						comboGroup_17_SpellCounter--; }
					try {
						Thread.sleep(counterSleepDelay);
					} catch (InterruptedException e) {
						e.printStackTrace(); }
					if (comboGroup_17_SpellCounter == 0) {
						spellTimer_17.setText(""); }
					if (combo_17_CurrentSelectionCounting != combo_17_CurrentSelection) {
						comboGroup_17_SpellCounter = 0;
						spellTimer_17.setText("");
						combo_17_CurrentSelectionCounting = combo_17_CurrentSelection; } } }
			
			if (whichSpellCounter == 18) {
				spellTimer_18_IsRunning = true;
				int combo_18_CurrentSelectionCounting = combo_18_CurrentSelection;
				while (spellTimer_18_IsRunning) {
					comboGroup_18_SpellCounterString = comboGroup_18_SpellCounterString.valueOf(comboGroup_18_SpellCounter);
					if (comboGroup_18_SpellCounter > 0) {
						spellTimer_18.setText(comboGroup_18_SpellCounterString);
						comboGroup_18_SpellCounter--; }
					try {
						Thread.sleep(counterSleepDelay);
					} catch (InterruptedException e) {
						e.printStackTrace(); }
					if (comboGroup_18_SpellCounter == 0) {
						spellTimer_18.setText(""); }
					if (combo_18_CurrentSelectionCounting != combo_18_CurrentSelection) {
						comboGroup_18_SpellCounter = 0;
						spellTimer_18.setText("");
						combo_18_CurrentSelectionCounting = combo_18_CurrentSelection; } } }
		}
	}
	
	public static void calculateCounters(String pickedClass, String pickedSpell)
	{
		if (pickedClass == "Bard")
		{
			
		}
		
		if (pickedClass == "Cleric")
		{
			SpellDurationsCleric.startCalc_Cleric_Lull();
			SpellDurationsCleric.startCalc_Cleric_Soothe();
			SpellDurationsCleric.startCalc_Cleric_Calm();
			SpellDurationsCleric.startCalc_Cleric_Pacify();
			SpellDurationsCleric.startCalc_Cleric_Courage();
			SpellDurationsCleric.startCalc_Cleric_Center();
			SpellDurationsCleric.startCalc_Cleric_Daring();
			SpellDurationsCleric.startCalc_Cleric_Bravery();
			SpellDurationsCleric.startCalc_Cleric_ArmorOfProtection();
			SpellDurationsCleric.startCalc_Cleric_Valor();
			SpellDurationsCleric.startCalc_Cleric_Resolution();
			SpellDurationsCleric.startCalc_Cleric_HeroicBond();
			SpellDurationsCleric.startCalc_Cleric_Heroism();
			SpellDurationsCleric.startCalc_Cleric_Fortitude();
			SpellDurationsCleric.startCalc_Cleric_Aegolism();
			SpellDurationsCleric.startCalc_Cleric_SymbolOfTransal();
			SpellDurationsCleric.startCalc_Cleric_SymbolOfRyltan();
			SpellDurationsCleric.startCalc_Cleric_SymbolOfPinzarn();
			SpellDurationsCleric.startCalc_Cleric_SymbolOfNaltron();
			SpellDurationsCleric.startCalc_Cleric_SymbolOfMarzin();
			SpellDurationsCleric.startCalc_Cleric_NaltronsMark();
			SpellDurationsCleric.startCalc_Cleric_HolyArmor();
			SpellDurationsCleric.startCalc_Cleric_SpiritArmor();
			SpellDurationsCleric.startCalc_Cleric_Guard();
			SpellDurationsCleric.startCalc_Cleric_ArmorOfFaith();
			SpellDurationsCleric.startCalc_Cleric_ShieldOfWords();
			SpellDurationsCleric.startCalc_Cleric_Aegis();
			SpellDurationsCleric.startCalc_Cleric_BulwarkOfFaith();
			SpellDurationsCleric.startCalc_Cleric_DivineAura();
			SpellDurationsCleric.startCalc_Cleric_DivineBarrier();
			SpellDurationsCleric.startCalc_Cleric_EndureFire();
			SpellDurationsCleric.startCalc_Cleric_EndurePoison();
			SpellDurationsCleric.startCalc_Cleric_EndureCold();
			SpellDurationsCleric.startCalc_Cleric_EndureDisease();
			SpellDurationsCleric.startCalc_Cleric_EndureMagic();
			SpellDurationsCleric.startCalc_Cleric_ResistFire();
			SpellDurationsCleric.startCalc_Cleric_ResistPoison();
			SpellDurationsCleric.startCalc_Cleric_ResistCold();
			SpellDurationsCleric.startCalc_Cleric_ResistDisease();
			SpellDurationsCleric.startCalc_Cleric_ResistMagic();
			SpellDurationsCleric.startCalc_Cleric_CelestialHealing();
			SpellDurationsCleric.startCalc_Cleric_CelestialElixir();
			SpellDurationsCleric.startCalc_Cleric_RecklessStrength();
			SpellDurationsCleric.startCalc_Cleric_FrenziedStrength();
			SpellDurationsCleric.startCalc_Cleric_MarkOfKarn();
			SpellDurationsCleric.startCalc_Cleric_DivineIntervention();
			SpellDurationsCleric.startCalc_Cleric_ImprovedInvisibilityToUndead();
		}
		
		if (pickedClass == "Druid")
		{
			SpellDurationsDruid.startCalc_Druid_Snare();
			SpellDurationsDruid.startCalc_Druid_Ensnare();
			SpellDurationsDruid.startCalc_Druid_BondsOfTunare();
			SpellDurationsDruid.startCalc_Druid_FlameLick();
			SpellDurationsDruid.startCalc_Druid_Immolate();
			SpellDurationsDruid.startCalc_Druid_BreathOfRo();
			SpellDurationsDruid.startCalc_Druid_StingingSwarm();
			SpellDurationsDruid.startCalc_Druid_CreepingCrud();
			SpellDurationsDruid.startCalc_Druid_DronesOfDoom();
			SpellDurationsDruid.startCalc_Druid_DriftingDeath();
			SpellDurationsDruid.startCalc_Druid_WingedDeath();
			SpellDurationsDruid.startCalc_Druid_SpiritOfWolf();
			SpellDurationsDruid.startCalc_Druid_WolfForm();
			SpellDurationsDruid.startCalc_Druid_GreaterWolfForm();
			SpellDurationsDruid.startCalc_Druid_PackSpirit();
			SpellDurationsDruid.startCalc_Druid_ShareWolfForm();
			SpellDurationsDruid.startCalc_Druid_FormOfTheGreatWolf();
			SpellDurationsDruid.startCalc_Druid_FormOfTheHowler();
			SpellDurationsDruid.startCalc_Druid_FormOfTheHunter();
			SpellDurationsDruid.startCalc_Druid_ScaleOfWolf();
			SpellDurationsDruid.startCalc_Druid_SpiritOfCheetah();
			SpellDurationsDruid.startCalc_Druid_SpiritOfScale();
			SpellDurationsDruid.startCalc_Druid_ShieldOfThistles();
			SpellDurationsDruid.startCalc_Druid_ShieldOfThistles();
			SpellDurationsDruid.startCalc_Druid_ShieldOfBarbs();
			SpellDurationsDruid.startCalc_Druid_ShieldOfBrambles();
			SpellDurationsDruid.startCalc_Druid_ShieldOfSpikes();
			SpellDurationsDruid.startCalc_Druid_ShieldOfThorns();
			SpellDurationsDruid.startCalc_Druid_LegacyOfSpike();
			SpellDurationsDruid.startCalc_Druid_ShieldOfBlades();
			SpellDurationsDruid.startCalc_Druid_LegacyOfThorn();
			SpellDurationsDruid.startCalc_Druid_SkinLikeWood();
			SpellDurationsDruid.startCalc_Druid_SkinLikeRock();
			SpellDurationsDruid.startCalc_Druid_SkinLikeSteel();
			SpellDurationsDruid.startCalc_Druid_SkinLikeDiamond();
			SpellDurationsDruid.startCalc_Druid_SkinLikeNature();
			SpellDurationsDruid.startCalc_Druid_Natureskin();
			SpellDurationsDruid.startCalc_Druid_ProtectionOfTheGlades();
			SpellDurationsDruid.startCalc_Druid_Thistlecoat();
			SpellDurationsDruid.startCalc_Druid_Barbcoat();
			SpellDurationsDruid.startCalc_Druid_Bramblecoat();
			SpellDurationsDruid.startCalc_Druid_Spikecoat();
			SpellDurationsDruid.startCalc_Druid_Thorncoat();
			SpellDurationsDruid.startCalc_Druid_Bladecoat();
			SpellDurationsDruid.startCalc_Druid_Regeneration();
			SpellDurationsDruid.startCalc_Druid_PackRegeneration();
			SpellDurationsDruid.startCalc_Druid_Chloroplast();
			SpellDurationsDruid.startCalc_Druid_PackChloroplast();
			SpellDurationsDruid.startCalc_Druid_Regrowth();
			SpellDurationsDruid.startCalc_Druid_RegrowthOfTheGrove();
			SpellDurationsDruid.startCalc_Druid_EndureFire();
			SpellDurationsDruid.startCalc_Druid_EndureCold();
			SpellDurationsDruid.startCalc_Druid_EndureDisease();
			SpellDurationsDruid.startCalc_Druid_EndurePoison();
			SpellDurationsDruid.startCalc_Druid_ResistFire();
			SpellDurationsDruid.startCalc_Druid_EndureMagic();
			SpellDurationsDruid.startCalc_Druid_ResistCold();
			SpellDurationsDruid.startCalc_Druid_ResistDisease();
			SpellDurationsDruid.startCalc_Druid_ResistPoison();
			SpellDurationsDruid.startCalc_Druid_ResistMagic();
			SpellDurationsDruid.startCalc_Druid_CircleOfWinter();
			SpellDurationsDruid.startCalc_Druid_CircleOfSummer();
			SpellDurationsDruid.startCalc_Druid_FeralSpirit();
			SpellDurationsDruid.startCalc_Druid_SavageSpirit();
			SpellDurationsDruid.startCalc_Druid_Harmony();
			SpellDurationsDruid.startCalc_Druid_RosFierySundering();
			SpellDurationsDruid.startCalc_Druid_FixationOfRo();
			SpellDurationsDruid.startCalc_Druid_GlamourofTunare();
			SpellDurationsDruid.startCalc_Druid_InvisibilityVersusAnimals();
			SpellDurationsDruid.startCalc_Druid_ImprovedSuperiorCamouflage();
			SpellDurationsDruid.startCalc_Druid_Treeform();
			SpellDurationsDruid.startCalc_Druid_Levitate();
			SpellDurationsDruid.startCalc_Druid_SpiritOfOak();
			SpellDurationsDruid.startCalc_Druid_SeeInvisible();
			SpellDurationsDruid.startCalc_Druid_MaskOfTheHunter();
			SpellDurationsDruid.startCalc_Druid_WrathOfNature();
		}
		
		if (pickedClass == "Enchanter")
		{
			SpellDurationsEnchanter.startCalc_Enchanter_Mesmerize();
			SpellDurationsEnchanter.startCalc_Enchanter_Enthrall();
			SpellDurationsEnchanter.startCalc_Enchanter_Entrance();
			SpellDurationsEnchanter.startCalc_Enchanter_Dazzle();
			SpellDurationsEnchanter.startCalc_Enchanter_GlamourOfKintaz();
			SpellDurationsEnchanter.startCalc_Enchanter_Rapture();
			SpellDurationsEnchanter.startCalc_Enchanter_Mesmerization();
			SpellDurationsEnchanter.startCalc_Enchanter_Fascination();
			SpellDurationsEnchanter.startCalc_Enchanter_WhirlTillYouHurl();
			SpellDurationsEnchanter.startCalc_Enchanter_DynsDizzyingDraught();
			SpellDurationsEnchanter.startCalc_Enchanter_LargarnsLamentation();
			SpellDurationsEnchanter.startCalc_Enchanter_ColorFlux();
			SpellDurationsEnchanter.startCalc_Enchanter_ColorShift();
			SpellDurationsEnchanter.startCalc_Enchanter_ColorSkew();
			SpellDurationsEnchanter.startCalc_Enchanter_ColorSlant();
			SpellDurationsEnchanter.startCalc_Enchanter_Tashan();
			SpellDurationsEnchanter.startCalc_Enchanter_Tashani();
			SpellDurationsEnchanter.startCalc_Enchanter_Tashania();
			SpellDurationsEnchanter.startCalc_Enchanter_WindOfTashani();
			SpellDurationsEnchanter.startCalc_Enchanter_Tashanian();
			SpellDurationsEnchanter.startCalc_Enchanter_WindOfTashanian();
			SpellDurationsEnchanter.startCalc_Enchanter_Lull();
			SpellDurationsEnchanter.startCalc_Enchanter_Soothe();
			SpellDurationsEnchanter.startCalc_Enchanter_Calm();
			SpellDurationsEnchanter.startCalc_Enchanter_Pacify();
			SpellDurationsEnchanter.startCalc_Enchanter_WakeOfTranquility();
			SpellDurationsEnchanter.startCalc_Enchanter_Weaken();
			SpellDurationsEnchanter.startCalc_Enchanter_Enfeeblement();
			SpellDurationsEnchanter.startCalc_Enchanter_EbbingStrength();
			SpellDurationsEnchanter.startCalc_Enchanter_FecklessMight();
			SpellDurationsEnchanter.startCalc_Enchanter_InsipidWeakness();
			SpellDurationsEnchanter.startCalc_Enchanter_Incapacitate();
			SpellDurationsEnchanter.startCalc_Enchanter_Weakness();
			SpellDurationsEnchanter.startCalc_Enchanter_Cripple();
			SpellDurationsEnchanter.startCalc_Enchanter_Disempower();
			SpellDurationsEnchanter.startCalc_Enchanter_ListlessPower();
			SpellDurationsEnchanter.startCalc_Enchanter_SuffocatingSphere();
			SpellDurationsEnchanter.startCalc_Enchanter_Choke();
			SpellDurationsEnchanter.startCalc_Enchanter_Suffocate();
			SpellDurationsEnchanter.startCalc_Enchanter_GaspingEmbrace();
			SpellDurationsEnchanter.startCalc_Enchanter_Asphyxiate();
			SpellDurationsEnchanter.startCalc_Enchanter_TormentOfArgli();
			SpellDurationsEnchanter.startCalc_Enchanter_LanguidPace();
			SpellDurationsEnchanter.startCalc_Enchanter_TepidDeeds();
			SpellDurationsEnchanter.startCalc_Enchanter_ShiftlessDeeds();
			SpellDurationsEnchanter.startCalc_Enchanter_ForlornDeeds();
			SpellDurationsEnchanter.startCalc_Enchanter_Charm();
			SpellDurationsEnchanter.startCalc_Enchanter_Beguile();
			SpellDurationsEnchanter.startCalc_Enchanter_CajolingWhispers();
			SpellDurationsEnchanter.startCalc_Enchanter_Allure();
			SpellDurationsEnchanter.startCalc_Enchanter_BoltransAgacerie();
			SpellDurationsEnchanter.startCalc_Enchanter_Dictate();
			SpellDurationsEnchanter.startCalc_Enchanter_Quickness();
			SpellDurationsEnchanter.startCalc_Enchanter_Alacrity();
			SpellDurationsEnchanter.startCalc_Enchanter_Celerity();
			SpellDurationsEnchanter.startCalc_Enchanter_SwiftLikeTheWind();
			SpellDurationsEnchanter.startCalc_Enchanter_AanyasQuickening();
			SpellDurationsEnchanter.startCalc_Enchanter_Augment();
			SpellDurationsEnchanter.startCalc_Enchanter_WonderousRapidity();
			SpellDurationsEnchanter.startCalc_Enchanter_VisionsOfGrandeur();
			SpellDurationsEnchanter.startCalc_Enchanter_SpeedOfTheShissar();
			SpellDurationsEnchanter.startCalc_Enchanter_MinorShielding();
			SpellDurationsEnchanter.startCalc_Enchanter_LesserShielding();
			SpellDurationsEnchanter.startCalc_Enchanter_Shielding();
			SpellDurationsEnchanter.startCalc_Enchanter_MajorShielding();
			SpellDurationsEnchanter.startCalc_Enchanter_GreaterShielding();
			SpellDurationsEnchanter.startCalc_Enchanter_ArchShielding();
			SpellDurationsEnchanter.startCalc_Enchanter_ShieldOfTheMagi();
			SpellDurationsEnchanter.startCalc_Enchanter_Haze();
			SpellDurationsEnchanter.startCalc_Enchanter_Mist();
			SpellDurationsEnchanter.startCalc_Enchanter_Cloud();
			SpellDurationsEnchanter.startCalc_Enchanter_Obscure();
			SpellDurationsEnchanter.startCalc_Enchanter_Shade();
			SpellDurationsEnchanter.startCalc_Enchanter_Shadow();
			SpellDurationsEnchanter.startCalc_Enchanter_Umbra();
			SpellDurationsEnchanter.startCalc_Enchanter_Breeze();
			SpellDurationsEnchanter.startCalc_Enchanter_Clarity();
			SpellDurationsEnchanter.startCalc_Enchanter_BoonOfTheClearMind();
			SpellDurationsEnchanter.startCalc_Enchanter_ClarityII();
			SpellDurationsEnchanter.startCalc_Enchanter_GiftOfInsight();
			SpellDurationsEnchanter.startCalc_Enchanter_GiftOfPureThought();
			SpellDurationsEnchanter.startCalc_Enchanter_GiftOfBrilliance();
			SpellDurationsEnchanter.startCalc_Enchanter_Strengthen();
			SpellDurationsEnchanter.startCalc_Enchanter_BerserkerStrength();
			SpellDurationsEnchanter.startCalc_Enchanter_Rampage();
			SpellDurationsEnchanter.startCalc_Enchanter_BerserkerSpirit();
			SpellDurationsEnchanter.startCalc_Enchanter_Bedlam();
			SpellDurationsEnchanter.startCalc_Enchanter_RuneI();
			SpellDurationsEnchanter.startCalc_Enchanter_RuneII();
			SpellDurationsEnchanter.startCalc_Enchanter_RuneIII();
			SpellDurationsEnchanter.startCalc_Enchanter_RuneIV();
			SpellDurationsEnchanter.startCalc_Enchanter_RuneV();
			SpellDurationsEnchanter.startCalc_Enchanter_EndureMagic();
			SpellDurationsEnchanter.startCalc_Enchanter_ResistMagic();
			SpellDurationsEnchanter.startCalc_Enchanter_GroupResistMagic();
			SpellDurationsEnchanter.startCalc_Enchanter_Insight();
			SpellDurationsEnchanter.startCalc_Enchanter_Brilliance();
			SpellDurationsEnchanter.startCalc_Enchanter_Enlightenment();
			SpellDurationsEnchanter.startCalc_Enchanter_EnduringBreath();
			SpellDurationsEnchanter.startCalc_Enchanter_SerpentSight();
			SpellDurationsEnchanter.startCalc_Enchanter_Ultravision();
			SpellDurationsEnchanter.startCalc_Enchanter_Levitate();
			SpellDurationsEnchanter.startCalc_Enchanter_Feedback();
			SpellDurationsEnchanter.startCalc_Enchanter_SympatheticAura();
			SpellDurationsEnchanter.startCalc_Enchanter_RadiantVisage();
			SpellDurationsEnchanter.startCalc_Enchanter_AdorningGrace();
			SpellDurationsEnchanter.startCalc_Enchanter_OverwhelmingSplendor();
		}
		
		if (pickedClass == "Magician")
		{
			SpellDurationsMagician.startCalc_Magician_Malaise();
			SpellDurationsMagician.startCalc_Magician_Malaisement();
			SpellDurationsMagician.startCalc_Magician_Malosi();
			SpellDurationsMagician.startCalc_Magician_Malosini();
			SpellDurationsMagician.startCalc_Magician_Mala();
			SpellDurationsMagician.startCalc_Magician_ShieldOfFire();
			SpellDurationsMagician.startCalc_Magician_ShieldOfFlame();
			SpellDurationsMagician.startCalc_Magician_InfernoShield();
			SpellDurationsMagician.startCalc_Magician_BarrierOfCombustion();
			SpellDurationsMagician.startCalc_Magician_ShieldOfLava();
			SpellDurationsMagician.startCalc_Magician_BoonOfImmolation();
			SpellDurationsMagician.startCalc_Magician_CadeauOfFlame();
			SpellDurationsMagician.startCalc_Magician_AegisOfRo();
			SpellDurationsMagician.startCalc_Magician_MinorShielding();
			SpellDurationsMagician.startCalc_Magician_LesserShielding();
			SpellDurationsMagician.startCalc_Magician_Shielding();
			SpellDurationsMagician.startCalc_Magician_MajorShielding();
			SpellDurationsMagician.startCalc_Magician_GreaterShielding();
			SpellDurationsMagician.startCalc_Magician_ArchShielding();
			SpellDurationsMagician.startCalc_Magician_ShieldOfTheMagi();
			SpellDurationsMagician.startCalc_Magician_Burnout();
			SpellDurationsMagician.startCalc_Magician_BurnoutII();
			SpellDurationsMagician.startCalc_Magician_BurnoutIII();
			SpellDurationsMagician.startCalc_Magician_BurnoutIV();
			SpellDurationsMagician.startCalc_Magician_Expedience();
			SpellDurationsMagician.startCalc_Magician_Velocity();
			SpellDurationsMagician.startCalc_Magician_PhantomLeather();
			SpellDurationsMagician.startCalc_Magician_PhantomChain();
			SpellDurationsMagician.startCalc_Magician_PhantomPlate();
			SpellDurationsMagician.startCalc_Magician_PhantomArmor();
			SpellDurationsMagician.startCalc_Magician_SeeInvisible();
			SpellDurationsMagician.startCalc_Magician_ElementalShield();
			SpellDurationsMagician.startCalc_Magician_ElementalMaelstrom();
			SpellDurationsMagician.startCalc_Magician_WrathOfTheElements();
		}
		
		if (pickedClass == "Monk")
		{
			SpellDurationsMonk.startCalc_Monk_ResistantDiscipline();
			SpellDurationsMonk.startCalc_Monk_FearlessDiscipline();
			SpellDurationsMonk.startCalc_Monk_StonestanceDiscipline();
			SpellDurationsMonk.startCalc_Monk_WhirlwindDiscipline();
			SpellDurationsMonk.startCalc_Monk_VoiddanceDiscipline();
			SpellDurationsMonk.startCalc_Monk_InnerFlameDiscipline();
			SpellDurationsMonk.startCalc_Monk_HundredFistsDiscipline();
		}
		
		if (pickedClass == "Necromancer")
		{
			SpellDurationsNecromancer.startCalc_Necromancer_ClingingDarkness();
			SpellDurationsNecromancer.startCalc_Necromancer_EngulfingDarkness();
			SpellDurationsNecromancer.startCalc_Necromancer_DoomingDarkness();
			SpellDurationsNecromancer.startCalc_Necromancer_CascadingDarkness();
			SpellDurationsNecromancer.startCalc_Necromancer_DevouringDarkness();
			SpellDurationsNecromancer.startCalc_Necromancer_TormentOfShadows();
			SpellDurationsNecromancer.startCalc_Necromancer_HeatBlood();
			SpellDurationsNecromancer.startCalc_Necromancer_BoilBlood();
			SpellDurationsNecromancer.startCalc_Necromancer_IgniteBlood();
			SpellDurationsNecromancer.startCalc_Necromancer_Pyrocruor();
			SpellDurationsNecromancer.startCalc_Necromancer_PoisonBolt();
			SpellDurationsNecromancer.startCalc_Necromancer_VenomOfTheSnake();
			SpellDurationsNecromancer.startCalc_Necromancer_ChillingEmbrace();
			SpellDurationsNecromancer.startCalc_Necromancer_EnvenomedBolt();
			SpellDurationsNecromancer.startCalc_Necromancer_HeartFlutter();
			SpellDurationsNecromancer.startCalc_Necromancer_Asystole();
			SpellDurationsNecromancer.startCalc_Necromancer_CessationOfCor();
			SpellDurationsNecromancer.startCalc_Necromancer_Leach();
			SpellDurationsNecromancer.startCalc_Necromancer_VampiricCurse();
			SpellDurationsNecromancer.startCalc_Necromancer_BondOfDeath();
			SpellDurationsNecromancer.startCalc_Necromancer_VexingMordinia();
			SpellDurationsNecromancer.startCalc_Necromancer_Splurt();
			SpellDurationsNecromancer.startCalc_Necromancer_DiseaseCloud();
			SpellDurationsNecromancer.startCalc_Necromancer_InfectiousCloud();
			SpellDurationsNecromancer.startCalc_Necromancer_Scourge();
			SpellDurationsNecromancer.startCalc_Necromancer_Plague();
			SpellDurationsNecromancer.startCalc_Necromancer_ScreamingTerror();
			SpellDurationsNecromancer.startCalc_Necromancer_DarkPact();
			SpellDurationsNecromancer.startCalc_Necromancer_AllureOfDeath();
			SpellDurationsNecromancer.startCalc_Necromancer_CallOfBones();
			SpellDurationsNecromancer.startCalc_Necromancer_Lich();
			SpellDurationsNecromancer.startCalc_Necromancer_DemiLich();
			SpellDurationsNecromancer.startCalc_Necromancer_ArchLich();
			SpellDurationsNecromancer.startCalc_Necromancer_IntensifyDeath();
			SpellDurationsNecromancer.startCalc_Necromancer_AugmentDeath();
			SpellDurationsNecromancer.startCalc_Necromancer_AugmentationOfDeath();
			SpellDurationsNecromancer.startCalc_Necromancer_MinorShielding();
			SpellDurationsNecromancer.startCalc_Necromancer_LesserShielding();
			SpellDurationsNecromancer.startCalc_Necromancer_Shielding();
			SpellDurationsNecromancer.startCalc_Necromancer_MajorShielding();
			SpellDurationsNecromancer.startCalc_Necromancer_GreaterShielding();
			SpellDurationsNecromancer.startCalc_Necromancer_ArchShielding();
			SpellDurationsNecromancer.startCalc_Necromancer_ShieldOfTheMagi();
			SpellDurationsNecromancer.startCalc_Necromancer_BreathOfTheDead();
			SpellDurationsNecromancer.startCalc_Necromancer_DeadManFloating();
			SpellDurationsNecromancer.startCalc_Necromancer_DeadMenFloating();
			SpellDurationsNecromancer.startCalc_Necromancer_Harmshield();
			SpellDurationsNecromancer.startCalc_Necromancer_QuiveringVeilOfXarn();
			SpellDurationsNecromancer.startCalc_Necromancer_EndureCold();
			SpellDurationsNecromancer.startCalc_Necromancer_EndureDisease();
			SpellDurationsNecromancer.startCalc_Necromancer_ResistCold();
			SpellDurationsNecromancer.startCalc_Necromancer_ResistDisease();
			SpellDurationsNecromancer.startCalc_Necromancer_SpiritArmor();
			SpellDurationsNecromancer.startCalc_Necromancer_Shieldskin();
			SpellDurationsNecromancer.startCalc_Necromancer_Leatherskin();
			SpellDurationsNecromancer.startCalc_Necromancer_Steelskin();
			SpellDurationsNecromancer.startCalc_Necromancer_Diamondskin();
			SpellDurationsNecromancer.startCalc_Necromancer_Manaskin();
			SpellDurationsNecromancer.startCalc_Necromancer_SkinOfTheShadow();
			SpellDurationsNecromancer.startCalc_Necromancer_ShadowSight();
			SpellDurationsNecromancer.startCalc_Necromancer_Deadeye();
			SpellDurationsNecromancer.startCalc_Necromancer_BansheeAura();
			SpellDurationsNecromancer.startCalc_Necromancer_ShadowCompact();
			SpellDurationsNecromancer.startCalc_Necromancer_PactOfShadow();
			SpellDurationsNecromancer.startCalc_Necromancer_Shadowbond();
			SpellDurationsNecromancer.startCalc_Necromancer_NumbTheDead();
			SpellDurationsNecromancer.startCalc_Necromancer_RestTheDead();
		}
		
		if (pickedClass == "Paladin")
		{
			SpellDurationsPaladin.startCalc_Paladin_Lull();
			SpellDurationsPaladin.startCalc_Paladin_Soothe();
			SpellDurationsPaladin.startCalc_Paladin_Calm();
			SpellDurationsPaladin.startCalc_Paladin_Pacify();
			SpellDurationsPaladin.startCalc_Paladin_Courage();
			SpellDurationsPaladin.startCalc_Paladin_Center();
			SpellDurationsPaladin.startCalc_Paladin_Daring();
			SpellDurationsPaladin.startCalc_Paladin_Valor();
			SpellDurationsPaladin.startCalc_Paladin_Resolution();
			SpellDurationsPaladin.startCalc_Paladin_SymbolOfTransal();
			SpellDurationsPaladin.startCalc_Paladin_SymbolOfRyltan();
			SpellDurationsPaladin.startCalc_Paladin_SymbolOfPinzarn();
			SpellDurationsPaladin.startCalc_Paladin_SymbolOfNaltron();
			SpellDurationsPaladin.startCalc_Paladin_HolyArmor();
			SpellDurationsPaladin.startCalc_Paladin_SpiritArmor();
			SpellDurationsPaladin.startCalc_Paladin_Guard();
			SpellDurationsPaladin.startCalc_Paladin_ArmorOfFaith();
			SpellDurationsPaladin.startCalc_Paladin_ShieldOfWords();
			SpellDurationsPaladin.startCalc_Paladin_EndurePoison();
			SpellDurationsPaladin.startCalc_Paladin_EndureDisease();
			SpellDurationsPaladin.startCalc_Paladin_RecklessStrength();
			SpellDurationsPaladin.startCalc_Paladin_FrenziedStrength();
			SpellDurationsPaladin.startCalc_Paladin_Yaulp();
			SpellDurationsPaladin.startCalc_Paladin_YaulpII();
			SpellDurationsPaladin.startCalc_Paladin_YaulpIII();
			SpellDurationsPaladin.startCalc_Paladin_YaulpIV();
			SpellDurationsPaladin.startCalc_Paladin_InvisibilityVersusUndead();
			SpellDurationsPaladin.startCalc_Paladin_DivineAura();
			SpellDurationsPaladin.startCalc_Paladin_DivineMight();
			SpellDurationsPaladin.startCalc_Paladin_DivineFavor();
			SpellDurationsPaladin.startCalc_Paladin_DivineStrength();
			SpellDurationsPaladin.startCalc_Paladin_DivinePurpose();
			SpellDurationsPaladin.startCalc_Paladin_CelestialCleansing();
		}
		
		if (pickedClass == "Ranger")
		{
			SpellDurationsRanger.startCalc_Ranger_Snare();
			SpellDurationsRanger.startCalc_Ranger_Ensnare();
			SpellDurationsRanger.startCalc_Ranger_FlameLick();
			SpellDurationsRanger.startCalc_Ranger_StingingSwarm();
			SpellDurationsRanger.startCalc_Ranger_Immolate();
			SpellDurationsRanger.startCalc_Ranger_DronesOfDoom();
			SpellDurationsRanger.startCalc_Ranger_LullAnimal();
			SpellDurationsRanger.startCalc_Ranger_CalmAnimal();
			SpellDurationsRanger.startCalc_Ranger_SkinLikeWood();
			SpellDurationsRanger.startCalc_Ranger_SkinLikeRock();
			SpellDurationsRanger.startCalc_Ranger_SkinLikeSteel();
			SpellDurationsRanger.startCalc_Ranger_SkinLikeDiamond();
			SpellDurationsRanger.startCalc_Ranger_SkinLikeNature();
			SpellDurationsRanger.startCalc_Ranger_Thistlecoat();
			SpellDurationsRanger.startCalc_Ranger_Barbcoat();
			SpellDurationsRanger.startCalc_Ranger_Bramblecoat();
			SpellDurationsRanger.startCalc_Ranger_Spikecoat();
			SpellDurationsRanger.startCalc_Ranger_Thorncoat();
			SpellDurationsRanger.startCalc_Ranger_ShieldOfThistles();
			SpellDurationsRanger.startCalc_Ranger_ShieldOfBrambles();
			SpellDurationsRanger.startCalc_Ranger_ShieldOfSpikes();
			SpellDurationsRanger.startCalc_Ranger_EndureFire();
			SpellDurationsRanger.startCalc_Ranger_EndureCold();
			SpellDurationsRanger.startCalc_Ranger_ResistFire();
			SpellDurationsRanger.startCalc_Ranger_ResistCold();
			SpellDurationsRanger.startCalc_Ranger_Firefist();
			SpellDurationsRanger.startCalc_Ranger_StrengthOfNature();
			SpellDurationsRanger.startCalc_Ranger_CallOfThePredator();
			SpellDurationsRanger.startCalc_Ranger_SpiritOfWolf();
			SpellDurationsRanger.startCalc_Ranger_WolfForm();
			SpellDurationsRanger.startCalc_Ranger_GreaterWolfForm();
			SpellDurationsRanger.startCalc_Ranger_StrengthOfEarth();
			SpellDurationsRanger.startCalc_Ranger_StormStrength();
			SpellDurationsRanger.startCalc_Ranger_CallOfSky();
			SpellDurationsRanger.startCalc_Ranger_CallOfFire();
			SpellDurationsRanger.startCalc_Ranger_CallOfEarth();
			SpellDurationsRanger.startCalc_Ranger_Chloroplast();
			SpellDurationsRanger.startCalc_Ranger_Levitate();
			SpellDurationsRanger.startCalc_Ranger_EnduringBreath();
			SpellDurationsRanger.startCalc_Ranger_EyesOfTheCat();
			SpellDurationsRanger.startCalc_Ranger_ChillSight();
			SpellDurationsRanger.startCalc_Ranger_PanicAnimal();
		}
		
		if (pickedClass == "Rogue")
		{
			SpellDurationsRogue.startCalc_Rogue_ResistantDiscipline();
			SpellDurationsRogue.startCalc_Rogue_FearlessDiscipline();
			SpellDurationsRogue.startCalc_Rogue_CounterattackDiscipline();
			SpellDurationsRogue.startCalc_Rogue_DeadeyeDiscipline();
			SpellDurationsRogue.startCalc_Rogue_NimbleDiscipline();
			SpellDurationsRogue.startCalc_Rogue_KinestheticsDiscipline();
			SpellDurationsRogue.startCalc_Rogue_BlindingSpeedDiscipline();
			SpellDurationsRogue.startCalc_Rogue_DuelistDiscipline();
		}
		
		if (pickedClass == "Shadow Knight")
		{
			SpellDurationsShadowKnight.startCalc_ShadowKnight_ClingingDarkness();
			SpellDurationsShadowKnight.startCalc_ShadowKnight_EngulfingDarkness();
			SpellDurationsShadowKnight.startCalc_ShadowKnight_DoomingDarkness();
			SpellDurationsShadowKnight.startCalc_ShadowKnight_CascadingDarkness();
			SpellDurationsShadowKnight.startCalc_ShadowKnight_HeatBlood();
			SpellDurationsShadowKnight.startCalc_ShadowKnight_BoilBlood();
			SpellDurationsShadowKnight.startCalc_ShadowKnight_DiseaseCloud();
			SpellDurationsShadowKnight.startCalc_ShadowKnight_Asystole();
			SpellDurationsShadowKnight.startCalc_ShadowKnight_VampiricEmbrace();
			SpellDurationsShadowKnight.startCalc_ShadowKnight_VampiricCurse();
			SpellDurationsShadowKnight.startCalc_ShadowKnight_NumbTheDead();
			SpellDurationsShadowKnight.startCalc_ShadowKnight_RestTheDead();
			SpellDurationsShadowKnight.startCalc_ShadowKnight_ShadowVortex();
			SpellDurationsShadowKnight.startCalc_ShadowKnight_ShadowVortex();
			SpellDurationsShadowKnight.startCalc_ShadowKnight_SiphonStrength();
			SpellDurationsShadowKnight.startCalc_ShadowKnight_WaveOfEnfeeblement();
			SpellDurationsShadowKnight.startCalc_ShadowKnight_ShroudOfHate();
			SpellDurationsShadowKnight.startCalc_ShadowKnight_EndureCold();
			SpellDurationsShadowKnight.startCalc_ShadowKnight_EndureDisease();
			SpellDurationsShadowKnight.startCalc_ShadowKnight_ResistCold();
			SpellDurationsShadowKnight.startCalc_ShadowKnight_InvisibilityVersusUndead();
			SpellDurationsShadowKnight.startCalc_ShadowKnight_BreathOfTheDead();
			SpellDurationsShadowKnight.startCalc_ShadowKnight_Deadeye();
			SpellDurationsShadowKnight.startCalc_ShadowKnight_ShadowSight();
			SpellDurationsShadowKnight.startCalc_ShadowKnight_BobbingCorpse();
			SpellDurationsShadowKnight.startCalc_ShadowKnight_GrimAura();
			SpellDurationsShadowKnight.startCalc_ShadowKnight_BansheeAura();
			SpellDurationsShadowKnight.startCalc_ShadowKnight_Shieldskin();
			SpellDurationsShadowKnight.startCalc_ShadowKnight_Steelskin();
			SpellDurationsShadowKnight.startCalc_ShadowKnight_Diamondskin();
			SpellDurationsShadowKnight.startCalc_ShadowKnight_ShroudOfDeath();
			SpellDurationsShadowKnight.startCalc_ShadowKnight_ShroudOfUndeath();
			SpellDurationsShadowKnight.startCalc_ShadowKnight_StrengthenDeath();
		}
		
		if (pickedClass == "Shaman")
		{
			SpellDurationsShaman.startCalc_Shaman_Drowsy();
			SpellDurationsShaman.startCalc_Shaman_WalkingSleep();
			SpellDurationsShaman.startCalc_Shaman_TagarsInsects();
			SpellDurationsShaman.startCalc_Shaman_TogorsInsects();
			SpellDurationsShaman.startCalc_Shaman_TurgursInsects();
			SpellDurationsShaman.startCalc_Shaman_TigirsInsects();
			SpellDurationsShaman.startCalc_Shaman_Sicken();
			SpellDurationsShaman.startCalc_Shaman_Affliction();
			SpellDurationsShaman.startCalc_Shaman_InfectiousCloud();
			SpellDurationsShaman.startCalc_Shaman_Scourge();
			SpellDurationsShaman.startCalc_Shaman_Plague();
			SpellDurationsShaman.startCalc_Shaman_PoxOfBertoxxulous();
			SpellDurationsShaman.startCalc_Shaman_TaintedBreath();
			SpellDurationsShaman.startCalc_Shaman_EnvenomedBreath();
			SpellDurationsShaman.startCalc_Shaman_VenomOfTheSnake();
			SpellDurationsShaman.startCalc_Shaman_EnvenomedBolt();
			SpellDurationsShaman.startCalc_Shaman_BaneOfNife();
			SpellDurationsShaman.startCalc_Shaman_Disempower();
			SpellDurationsShaman.startCalc_Shaman_ListlessPower();
			SpellDurationsShaman.startCalc_Shaman_Incapacitate();
			SpellDurationsShaman.startCalc_Shaman_Cripple();
			SpellDurationsShaman.startCalc_Shaman_InsidiousFever();
			SpellDurationsShaman.startCalc_Shaman_InsidiousMalady();
			SpellDurationsShaman.startCalc_Shaman_InsidiousDecay();
			SpellDurationsShaman.startCalc_Shaman_Malaise();
			SpellDurationsShaman.startCalc_Shaman_Malaisement();
			SpellDurationsShaman.startCalc_Shaman_Malosi();
			SpellDurationsShaman.startCalc_Shaman_Malosini();
			SpellDurationsShaman.startCalc_Shaman_Malo();
			SpellDurationsShaman.startCalc_Shaman_Quickness();
			SpellDurationsShaman.startCalc_Shaman_Alacrity();
			SpellDurationsShaman.startCalc_Shaman_Celerity();
			SpellDurationsShaman.startCalc_Shaman_SpiritOfWolf();
			SpellDurationsShaman.startCalc_Shaman_SpiritOfCheetah();
			SpellDurationsShaman.startCalc_Shaman_ScaleOfWolf();
			SpellDurationsShaman.startCalc_Shaman_SpiritOfScale();
			SpellDurationsShaman.startCalc_Shaman_BurstOfStrength();
			SpellDurationsShaman.startCalc_Shaman_Frenzy();
			SpellDurationsShaman.startCalc_Shaman_Fury();
			SpellDurationsShaman.startCalc_Shaman_Rage();
			SpellDurationsShaman.startCalc_Shaman_VoiceOfTheBerserker();
			SpellDurationsShaman.startCalc_Shaman_Avatar();
			SpellDurationsShaman.startCalc_Shaman_PrimalAvatar();
			SpellDurationsShaman.startCalc_Shaman_Strengthen();
			SpellDurationsShaman.startCalc_Shaman_SpiritStrength();
			SpellDurationsShaman.startCalc_Shaman_RagingStrength();
			SpellDurationsShaman.startCalc_Shaman_FuriousStrength();
			SpellDurationsShaman.startCalc_Shaman_TumultuousStrength();
			SpellDurationsShaman.startCalc_Shaman_Strength();
			SpellDurationsShaman.startCalc_Shaman_ManiacalStrength();
			SpellDurationsShaman.startCalc_Shaman_TalismanOfTheRhino();
			SpellDurationsShaman.startCalc_Shaman_FeetLikeCat();
			SpellDurationsShaman.startCalc_Shaman_SpiritOfCat();
			SpellDurationsShaman.startCalc_Shaman_Nimble();
			SpellDurationsShaman.startCalc_Shaman_Agility();
			SpellDurationsShaman.startCalc_Shaman_DeliriouslyNimble();
			SpellDurationsShaman.startCalc_Shaman_TalismanOfTheCat();
			SpellDurationsShaman.startCalc_Shaman_DexterousAura();
			SpellDurationsShaman.startCalc_Shaman_SpiritOfMonkey();
			SpellDurationsShaman.startCalc_Shaman_RisingDexterity();
			SpellDurationsShaman.startCalc_Shaman_Deftness();
			SpellDurationsShaman.startCalc_Shaman_Dexterity();
			SpellDurationsShaman.startCalc_Shaman_MortalDeftness();
			SpellDurationsShaman.startCalc_Shaman_TalismanOfTheRaptor();
			SpellDurationsShaman.startCalc_Shaman_SpiritOfBear();
			SpellDurationsShaman.startCalc_Shaman_SpiritOfOx();
			SpellDurationsShaman.startCalc_Shaman_Health();
			SpellDurationsShaman.startCalc_Shaman_Stamina();
			SpellDurationsShaman.startCalc_Shaman_RiotousHealth();
			SpellDurationsShaman.startCalc_Shaman_TalismanOfTheBrute();
			SpellDurationsShaman.startCalc_Shaman_EndureCold();
			SpellDurationsShaman.startCalc_Shaman_EndureFire();
			SpellDurationsShaman.startCalc_Shaman_EndureDisease();
			SpellDurationsShaman.startCalc_Shaman_EndurePoison();
			SpellDurationsShaman.startCalc_Shaman_EndureMagic();
			SpellDurationsShaman.startCalc_Shaman_ResistCold();
			SpellDurationsShaman.startCalc_Shaman_ResistFire();
			SpellDurationsShaman.startCalc_Shaman_ResistDisease();
			SpellDurationsShaman.startCalc_Shaman_ResistPoison();
			SpellDurationsShaman.startCalc_Shaman_ResistMagic();
			SpellDurationsShaman.startCalc_Shaman_TalismanOfJasinth();
			SpellDurationsShaman.startCalc_Shaman_TalismanOfShadoo();
			SpellDurationsShaman.startCalc_Shaman_Regeneration();
			SpellDurationsShaman.startCalc_Shaman_Chloroplast();
			SpellDurationsShaman.startCalc_Shaman_Regrowth();
			SpellDurationsShaman.startCalc_Shaman_FormOfTheGreatBear();
			SpellDurationsShaman.startCalc_Shaman_InnerFire();
			SpellDurationsShaman.startCalc_Shaman_TalismanOfTnarg();
			SpellDurationsShaman.startCalc_Shaman_TalismanOfAltuna();
			SpellDurationsShaman.startCalc_Shaman_TalismanOfKragg();
			SpellDurationsShaman.startCalc_Shaman_FocusOfSpirit();
			SpellDurationsShaman.startCalc_Shaman_ScaleSkin();
			SpellDurationsShaman.startCalc_Shaman_TurtleSkin();
			SpellDurationsShaman.startCalc_Shaman_Protect();
			SpellDurationsShaman.startCalc_Shaman_ShiftingShield();
			SpellDurationsShaman.startCalc_Shaman_Guardian();
			SpellDurationsShaman.startCalc_Shaman_ShroudOfTheSpirits();
			SpellDurationsShaman.startCalc_Shaman_SpiritOfSnake();
			SpellDurationsShaman.startCalc_Shaman_AlluringAura();
			SpellDurationsShaman.startCalc_Shaman_Glamour();
			SpellDurationsShaman.startCalc_Shaman_Charisma();
			SpellDurationsShaman.startCalc_Shaman_TalismanOfTheSerpent();
			SpellDurationsShaman.startCalc_Shaman_UnfailingReverence();
			SpellDurationsShaman.startCalc_Shaman_Ultravision();
			SpellDurationsShaman.startCalc_Shaman_Acumen();
			SpellDurationsShaman.startCalc_Shaman_Levitate();
			SpellDurationsShaman.startCalc_Shaman_EnduringBreath();
			SpellDurationsShaman.startCalc_Shaman_SpiritQuickening();
			SpellDurationsShaman.startCalc_Shaman_CurseOfTheSpirits();
		}
		
		if (pickedClass == "Warrior")
		{
			SpellDurationsWarrior.startCalc_Warrior_ResistantDiscipline();
			SpellDurationsWarrior.startCalc_Warrior_FearlessDiscipline();
			SpellDurationsWarrior.startCalc_Warrior_EvasiveDiscipline();
			SpellDurationsWarrior.startCalc_Warrior_ChargeDiscipline();
			SpellDurationsWarrior.startCalc_Warrior_MightyStrikeDiscipline();
			SpellDurationsWarrior.startCalc_Warrior_DefensiveDiscipline();
			SpellDurationsWarrior.startCalc_Warrior_FuriousDiscipline();
			SpellDurationsWarrior.startCalc_Warrior_PrecisionDiscipline();
			SpellDurationsWarrior.startCalc_Warrior_FellstrikeDiscipline();
			SpellDurationsWarrior.startCalc_Warrior_FortitudeDiscipline();
			SpellDurationsWarrior.startCalc_Warrior_AggressiveDiscipline();
		}
		
		if (pickedClass == "Wizard")
		{
			SpellDurationsWizard.startCalc_Wizard_BondsOfForce();
			SpellDurationsWizard.startCalc_Wizard_AtolsSpectralShackles();
			SpellDurationsWizard.startCalc_Wizard_TishansClash();
			SpellDurationsWizard.startCalc_Wizard_MarkarsClash();
			SpellDurationsWizard.startCalc_Wizard_TishansDiscord();
			SpellDurationsWizard.startCalc_Wizard_Thunderbold();
			SpellDurationsWizard.startCalc_Wizard_MarkarsDiscord();
			SpellDurationsWizard.startCalc_Wizard_MinorShielding();
			SpellDurationsWizard.startCalc_Wizard_LesserShielding();
			SpellDurationsWizard.startCalc_Wizard_Shielding();
			SpellDurationsWizard.startCalc_Wizard_MajorShielding();
			SpellDurationsWizard.startCalc_Wizard_GreaterShielding();
			SpellDurationsWizard.startCalc_Wizard_ArchShielding();
			SpellDurationsWizard.startCalc_Wizard_ShieldOfTheMagi();
			SpellDurationsWizard.startCalc_Wizard_Shieldskin();
			SpellDurationsWizard.startCalc_Wizard_Leatherskin();
			SpellDurationsWizard.startCalc_Wizard_Steelskin();
			SpellDurationsWizard.startCalc_Wizard_Diamondskin();
			SpellDurationsWizard.startCalc_Wizard_Manaskin();
			SpellDurationsWizard.startCalc_Wizard_BarrierOfForce();
			SpellDurationsWizard.startCalc_Wizard_Manasink();
			SpellDurationsWizard.startCalc_Wizard_OKeilsFlickeringFlame();
			SpellDurationsWizard.startCalc_Wizard_ResistantSkin();
			SpellDurationsWizard.startCalc_Wizard_ElementalShield();
			SpellDurationsWizard.startCalc_Wizard_ElementalArmor();
			SpellDurationsWizard.startCalc_Wizard_EyeOfZomm();
			SpellDurationsWizard.startCalc_Wizard_EyeOfTallon();
			SpellDurationsWizard.startCalc_Wizard_ImprovedInvisibility();
			SpellDurationsWizard.startCalc_Wizard_Levitate();
			SpellDurationsWizard.startCalc_Wizard_SeeInvisible();
			SpellDurationsWizard.startCalc_Wizard_ChillSight();
			SpellDurationsWizard.startCalc_Wizard_ShiftingSight();
			SpellDurationsWizard.startCalc_Wizard_Plainsight();
			SpellDurationsWizard.startCalc_Wizard_HeatSight();
		}
	}
	
	public static void calculateCountersAll()
	{
		calculateCounters("Bard", ""); calculateCounters("Cleric", "");
		calculateCounters("Druid", ""); calculateCounters("Enchanter", "");
		calculateCounters("Magician", ""); calculateCounters("Monk", "");
		calculateCounters("Necromancer", ""); calculateCounters("Paladin", "");
		calculateCounters("Ranger", ""); calculateCounters("Rogue", "");
		calculateCounters("Shadow Knight", ""); calculateCounters("Shaman", "");
		calculateCounters("Warrior", ""); calculateCounters("Wizard", ""); 
	}
	
	public static void clearCounters()
	{
		comboGroup_01_SpellCounter = 0;
		comboGroup_02_SpellCounter = 0;
		comboGroup_03_SpellCounter = 0;
		comboGroup_04_SpellCounter = 0;
		comboGroup_05_SpellCounter = 0;
		comboGroup_06_SpellCounter = 0;
		comboGroup_07_SpellCounter = 0;
		comboGroup_08_SpellCounter = 0;
		comboGroup_09_SpellCounter = 0;
		comboGroup_10_SpellCounter = 0;
		comboGroup_11_SpellCounter = 0;
		comboGroup_12_SpellCounter = 0;
		comboGroup_13_SpellCounter = 0;
		comboGroup_14_SpellCounter = 0;
		comboGroup_15_SpellCounter = 0;
		comboGroup_16_SpellCounter = 0;
		comboGroup_17_SpellCounter = 0;
		comboGroup_18_SpellCounter = 0;
		spellTimer_01.setText("");
		spellTimer_02.setText("");
		spellTimer_03.setText("");
		spellTimer_04.setText("");
		spellTimer_05.setText("");
		spellTimer_06.setText("");
		spellTimer_07.setText("");
		spellTimer_08.setText("");
		spellTimer_09.setText("");
		spellTimer_10.setText("");
		spellTimer_11.setText("");
		spellTimer_12.setText("");
		spellTimer_13.setText("");
		spellTimer_14.setText("");
		spellTimer_15.setText("");
		spellTimer_16.setText("");
		spellTimer_17.setText("");
		spellTimer_18.setText("");
	}
	
	
	public static void main(String args[])
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					EQLogToolsGUI frame = new EQLogToolsGUI();
					frame.setVisible(true);
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}
}
