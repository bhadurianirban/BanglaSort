package SortBanglaWindow;

import java.awt.EventQueue;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;



public class SortBanglaWindow {

	private JFrame frame;
	private JTextField inputPath;
	private JTextField OutputPath;
	private JTextField outFileName;
	private JMenuBar menuBar;
	private JMenu HelpMenu;
	private JMenuItem HelpMenuItem;
	private JMenuItem AboutMenuItem;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SortBanglaWindow window = new SortBanglaWindow();
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
	public SortBanglaWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Bangla Sort");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnBrowse = new JButton("Browse");
		btnBrowse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser showInputFileDialogue = new JFileChooser();
				FileNameExtensionFilter txtFilter = new FileNameExtensionFilter("Raw text File","txt");
				showInputFileDialogue.setFileFilter(txtFilter);
				int InFileSelReturnVal =  showInputFileDialogue.showOpenDialog(frame);
				if (InFileSelReturnVal == JFileChooser.APPROVE_OPTION) {
		               java.io.File inputFile = showInputFileDialogue.getSelectedFile();
		               
		               StatVariables.InputFileName = inputFile.getPath();
		               //System.out.println(StatVariables.InputFileName);
		               inputPath.setText(StatVariables.InputFileName);

		            }
		            
			}
		});
		btnBrowse.setFont(new Font("Tahoma", Font.PLAIN, 9));
		
		
		
		
		btnBrowse.setBounds(349, 49, 75, 23);
		frame.getContentPane().add(btnBrowse);
		
		inputPath = new JTextField();
		inputPath.setEditable(false);
		inputPath.setBounds(122, 49, 217, 23);
		
		frame.getContentPane().add(inputPath);
		inputPath.setColumns(10);
		
		JLabel lblInputFile = new JLabel("Input File");
		lblInputFile.setBounds(21, 53, 75, 14);
		frame.getContentPane().add(lblInputFile);
		
		OutputPath = new JTextField();
		OutputPath.setBounds(122, 105, 217, 23);
		frame.getContentPane().add(OutputPath);
		OutputPath.setColumns(10);
		OutputPath.setEditable(false);
		
		JLabel lblOutputFilePath = new JLabel("Output File Path");
		lblOutputFilePath.setBounds(21, 109, 98, 14);
		frame.getContentPane().add(lblOutputFilePath);
		
		JButton btnBrowseOutputPath = new JButton("Browse");
		btnBrowseOutputPath.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser showOutputFileDir = new JFileChooser();
				showOutputFileDir.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
				int OutFileSelReturnVal =  showOutputFileDir.showOpenDialog(null);
				if (OutFileSelReturnVal == JFileChooser.APPROVE_OPTION) {
		               java.io.File outputFile = showOutputFileDir.getSelectedFile();
		               
		               StatVariables.OutputDirName = outputFile.getPath();
		               OutputPath.setText(StatVariables.OutputDirName);
		               
		                
		            }
			}
		});
		btnBrowseOutputPath.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnBrowseOutputPath.setBounds(349, 105, 75, 23);
		frame.getContentPane().add(btnBrowseOutputPath);
		
		outFileName = new JTextField();
		outFileName.setBounds(122, 165, 115, 20);
		frame.getContentPane().add(outFileName);
		outFileName.setColumns(10);
		
		JLabel lblFileName = new JLabel("File Name");
		lblFileName.setBounds(21, 168, 75, 14);
		frame.getContentPane().add(lblFileName);
		
		JLabel lbltxt = new JLabel(".txt");
		lbltxt.setBounds(265, 168, 46, 14);
		frame.getContentPane().add(lbltxt);
		
		JButton btnStartSorting = new JButton("Start Sorting");
		btnStartSorting.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				        boolean InputOK=false;
				        InputOK = CheckInputFields();
				        if (InputOK) {
						String inFileName = inputPath.getText().toString();
						String OutFileName = OutputPath.getText().toString()+"/"+outFileName.getText().toString()+".txt";
						mainDriver md = new mainDriver();
						try {
								boolean SortDone = false;
								SortDone = md.StartSort(inFileName, OutFileName);
								if (!SortDone) {
									JOptionPane.showMessageDialog (frame,StatVariables.ErrorMessage,"Error",JOptionPane.ERROR_MESSAGE);
								}
								else {
									JOptionPane.showMessageDialog (frame,StatVariables.ErrorMessage,"Success",JOptionPane.INFORMATION_MESSAGE);
								}
								
							}
							catch (Exception e) {
								e.printStackTrace();
							}
							
						}
					}
		});
		btnStartSorting.setForeground(Color.WHITE);
		btnStartSorting.setBackground(Color.DARK_GRAY);
		btnStartSorting.setBounds(250, 208, 126, 23);
		frame.getContentPane().add(btnStartSorting);
		menuBar = new JMenuBar();
		HelpMenu = new JMenu("Help");
		HelpMenuItem = new JMenuItem("Help");
		AboutMenuItem = new JMenuItem("About");
		HelpMenu.add(HelpMenuItem);
		HelpMenu.add(AboutMenuItem);
		menuBar.add(HelpMenu);
		frame.setJMenuBar(menuBar);
		HelpMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				  JTextArea textArea = new JTextArea(20, 25);
			      textArea.setText(StatVariables.HELP_MESG);
			      textArea.setEditable(false);
			      JOptionPane.showMessageDialog(frame, textArea,"Help",JOptionPane.PLAIN_MESSAGE);
			}
		});
		AboutMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 JTextArea textArea = new JTextArea(20, 25);
			     textArea.setText(StatVariables.ABOUT_MSG);
			     textArea.setEditable(false);
			     JOptionPane.showMessageDialog(frame, textArea,"About",JOptionPane.PLAIN_MESSAGE);
			}
		});
	}
	public boolean CheckInputFields () {
		if (inputPath.getText().toString().equals("")) {
			StatVariables.ErrorMessage = StatVariables.NOINPUT_FILE;
			JOptionPane.showMessageDialog (frame,StatVariables.ErrorMessage,"Error",JOptionPane.ERROR_MESSAGE);
			return false;
		} 
		else 
		{
			if (OutputPath.getText().toString().equals("")) 
			{
				StatVariables.ErrorMessage = StatVariables.NOOUTPUT_PATH;
				JOptionPane.showMessageDialog (frame,StatVariables.ErrorMessage,"Error",JOptionPane.ERROR_MESSAGE);
				return false;
			} 
			else 
			{
				if (outFileName.getText().equals("")) 
				{
					StatVariables.ErrorMessage = StatVariables.NOOUTPUT_FILE;
					JOptionPane.showMessageDialog (frame,StatVariables.ErrorMessage,"Error",JOptionPane.ERROR_MESSAGE);
					return false;
				}
				else {
					SortFileOperation sfo = new SortFileOperation();
					boolean FileExist = false;
					FileExist = sfo.checkFileExist(OutputPath.getText().toString()+"/"+outFileName.getText().toString()+".txt");
					if (FileExist) {
						StatVariables.ErrorMessage = StatVariables.OUTPUT_FILE_EXIST;
						int OverWriteOption = JOptionPane.showConfirmDialog(frame,StatVariables.ErrorMessage,"Warning",JOptionPane.WARNING_MESSAGE);
						if (OverWriteOption == JOptionPane.YES_OPTION) {
							return true;
						}
						else {
							return false;
						}
					}
					else {
						return true;
					}
				}
			}
		}
	}
}
