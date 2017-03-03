package application;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.JOptionPane;

public class Counter {

	public static void main(String[] args) throws IOException {
		@SuppressWarnings("resource")
		BufferedReader readFile = new BufferedReader(new FileReader("C:/Users/Matias/Desktop/1984.txt"));
		String line = null;
		Map<Character, Integer> numChars = new HashMap<Character, Integer>();
		while ((line = readFile.readLine()) != null) {
			String[] liner = line.split(" ");
			int len = liner.length;
			for (int i = 0; i <len; i++) {
				for (int j = 0; j < liner[i].length(); j++) {
					char characterAt = Character.toLowerCase(liner[i].charAt(j));

					if (!numChars.containsKey(characterAt)) {
						if(Character.isLetter(characterAt)){
							numChars.put(characterAt, 1);
						}
					} else {
						numChars.put(characterAt, (numChars.get(characterAt) + 1));
					}
				}

			}
		}
		System.out.println(numChars);
	}
}
