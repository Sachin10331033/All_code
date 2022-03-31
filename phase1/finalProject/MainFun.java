package com.project.phase1;

public class MainFun {
public static void main(String[] args) {
		
		// Create "main" folder if not present in current folder structure
	FileOpr.createMainFolderIfNotPresent("main");
		
	FileOpr.printWelcomeScreen("LockedMe", "Sachin shelake");
		
	FileOpr.handleWelcomeScreenInput();
	}





}
