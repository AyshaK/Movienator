package utils;
import javax.swing.*;

/**
 * Feilh�ndteringsklasse. 
 * Gir feilmeldinger til bruker i eget vindu
 * @author Akh026
 *
 */
public class ErrorHandler {
	
	public static void getErrorMessage(String errorString){
		JOptionPane.showMessageDialog(null, errorString,"Warning", JOptionPane.ERROR_MESSAGE);
		
	}

}
