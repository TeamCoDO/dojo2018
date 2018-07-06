package de.codingdojo.dojo3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Starter {

	public static void main(String[] args) throws IOException {
		Starter starter = new Starter();
		List<String[]> in = starter.convertInput(starter.read("input.txt"));
		int[] columnSizes = starter.getColumnnSizes(in);
		starter.print(in, columnSizes);
	}

	protected int[] getColumnnSizes(List<String[]> in) {
		int[] result = new int[in.get(0).length];
		for (String[] line : in) {
			for (int i = 0; i < line.length; i++){
				result[i] = Math.max(result[i], line[i].length());
			}
		}
		return result;
		
	}

	protected void print(List<String[]> in, int[] columnSizes) {
		int lineCount = 0;
		for (String[] strings : in) {
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < strings.length; i++) {
				String string = strings[i];
				int sizes = columnSizes[i];
				sb.append(string);
				for (int j = string.length(); j < sizes; j++) {
					sb.append(" ");
				}
				sb.append("|");
//				System.out.print(string + "|");
			}
			if(lineCount == 0) {
				System.out.println(sb);
				sb = new StringBuilder();
				for (int i = 0; i < strings.length; i++) {
					String string = strings[i];
					int sizes = columnSizes[i];
//					sb.append(string);
					for (int j = 0; j < sizes; j++) {
						sb.append("-");
					}
					sb.append("|");
//					System.out.print(string + "|");
				}
			}
			System.out.println(sb);
			lineCount++;
		}
	}

	protected List<String[]> convertInput(BufferedReader br) throws IOException {
		List<String[]> in = new ArrayList<String[]>();
	    String line = br.readLine();
	    while(line != null) {
		    String [] item = line.split(";");
	    	in.add(item);
	    	line = br.readLine();
	    }
	    br.close();
	    return in;
	}
	
	protected BufferedReader read(String string) throws FileNotFoundException {
		return new BufferedReader(new FileReader(string));
	}

}
