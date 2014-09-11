package com.jaywu.visge.scene;

import java.io.BufferedReader;
import java.net.URI;
import java.nio.file.Path;
import java.nio.file.Paths;


public class ScriptReader {
	
	private String fileName; // File name to script file
	private Path filePath;

	public ScriptReader(String fileName) {
		setFileName(fileName);
	}
	
	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
		this.filePath = Paths.get(URI.create(fileName));
	}
	
	private BufferedReader scriptStream;
	
	
}
