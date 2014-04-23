package BaseClasses;
//Write a file to a string // Usage: java fileToString filename import java.io.*; public class fileToString04 { public static void main(String[] args) throws IOException { String data = fileToString("./awmt.txt"); String str = cleanText(data); String[] wordArray = str.split(" "); for(String s : wordArray){ System.out.println(s); } System.out.println("The number of words in our collection = "+ wordArray.length); } public static String fileToString(String fileName){ String result = ""; try{ FileInputStream file = new FileInputStream(fileName); byte[] b = new byte[file.available()]; file.read(b); file.close(); result = new String(b); } catch(Exception e){ System.out.println("ERROR"); } return result; } public static String cleanText (String s){ s = s.replaceAll("\\p{Punct}", ""); s = s.replaceAll("\\s+", " "); return s; } }
//Write a file to a string
//Usage: java fileToString filename

import java.io.*;

public class Utilities {
	
	public static String[] fileToStringArray(String fileName) throws IOException {
		String data = fileToString(fileName);
		String str = cleanText(data);
		String[] wordArray = str.split(" ");
		return wordArray;
	}

	public static String fileToString(String fileName){
		String result = "";
		try{
			FileInputStream file = new FileInputStream(fileName);
			byte[] b = new byte[file.available()];
			file.read(b);
			file.close();
			result = new String(b);
		}
		catch(Exception e){
			System.err.println(e.getMessage());
			System.err.println("ERROR");
		}
		return result;
	}
	
	public static String cleanText (String s){
		s = s.replaceAll("\\p{Punct}", "");
		s = s.replaceAll("\\s+", " ");
		return s;
	}
}
