package utils;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;

public class CopyFunction {

	public static void copyToClipboard(String filepath)
	{
		
		
				StringSelection stringSelection = new StringSelection(filepath);
				Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
				clipboard.setContents(stringSelection, null);
	}
}
