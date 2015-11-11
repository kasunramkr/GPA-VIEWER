package gui;

import javax.swing.JPanel;
import databaseAccses.Edit;
import databaseAccses.View;

public class GuiController {
	public static View v=new View();
	public static Edit e=new Edit();
	public static Main_Frame main_window;
	public static JPanel semesters;
	
	public void start(){
		main_window=new Main_Frame();
		semesters=new Show_All_Semesters();
		main_window.add(semesters);
		main_window.setVisible(true);
	}
}