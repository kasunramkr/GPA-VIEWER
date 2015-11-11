package gui;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Show_One_semester extends JPanel{
	private List<List<String>> resultList;
	
	public Show_One_semester(String sem) {
		// TODO Auto-generated constructor stub
		resultList=GuiController.v.viewSemesterResult(sem);
		String[] columnNames = {"Module Code","Result", "Title", "Credits","GPA/NGPA"};
		String[][] data = new String[resultList.size()][];
		for (int i = 0; i < resultList.size(); i++) {
		    ArrayList<String> row = (ArrayList<String>) resultList.get(i);
		    data[i] = row.toArray(new String[row.size()]);
		}
		JTable result=new JTable(data,columnNames);
		this.add(result);
		
	}

}
