package com.techlab.testcsv;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TestCsvWriter {

	public static void main(String[] args) throws IOException {
		File file = new File(
				"D:\\SwabhavRepository\\oop-crash\\csv_app\\csvfile.csv");
		FileWriter outputfile = new FileWriter(file);
		BufferedWriter bf = new BufferedWriter(outputfile);
		bf.append("name");
		bf.append(",");
		bf.append("balance");
		bf.append("\n");

		bf.append("saving account");
		bf.append(",");
		bf.append("1000");
		bf.append("\n");
		outputfile.write(bf.toString());
		bf.close();

		System.out.println("done!");

	}

}
