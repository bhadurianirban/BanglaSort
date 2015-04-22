package SortBanglaWindow;

import java.io.File;

public class SortFileOperation {
	
	boolean checkFileExist (String FileName) {
		File file = new File(FileName);
		 
		if (file.exists()) {
			return true;
		}
		else {
			return false;
		}
	}

}
