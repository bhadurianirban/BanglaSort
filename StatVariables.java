package SortBanglaWindow;

public class StatVariables {
	public static final int LINE_SIZE=100;
	public static final String UTF8_BOM = "\uFEFF";
	public static final String NOINPUT_FILE = "Select Input File";
	public static final String NOOUTPUT_PATH = "Select Output Directory";
	public static final String NOOUTPUT_FILE = "Provide Output File Name";
	public static final String OUTPUT_FILE_EXIST = "Specified File Exist. Do you want to overwrite?";
	public static final String SORTING_DONE = "Sort Complete";
	public static String InputFileName="";
	public static String OutputDirName="";
	public static String ErrorMessage;
	public static final String HELP_MESG = 
			"To sort Bangla text : \n"+
			"Open Notapad(windows) Gedit(Linux)\n"+
			"Paste the Bangla text in the notepad\n"+
			"Save with UTF-8 encoding\n" +
			"Use the saved file as an Input file to this application\n"+
			"Each line in the text file will be sorted in the output file.";
	public static final String ABOUT_MSG = 
			"Developed by \n"+
			"Anirban Bhaduri\n"+
			"bhaduri_anirban@yahoo.com\n\n"+
			"Kolkata\n\n"+
			"Evolved from the concept of \n"
			+ "Md. Ruhul Amin,"
			+ "Asif Mohammed Samir,"
			+"Madhusodan  Chakraborty,"
			+ "Md. Mahfuzur Rahaman\n\n"
			+ "Shahjalal University,"
			+ "Sylhet, Bangladesh\n";
			
			
}
