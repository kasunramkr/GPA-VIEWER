package databaseAccses;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class View {
	Acsses a;
	public View() {
		// TODO Auto-generated constructor stub
		a=new Acsses();
	}

	public List<String> viewAllSemesters(){
		Statement s=a.GetStatement();
		String quary="SELECT table_name FROM information_schema.tables WHERE table_schema='gpa' ";
		List<String> tableNames =new ArrayList<String>();
		
		try {
			ResultSet myre=s.executeQuery(quary);

			while(myre.next()){
				tableNames.add(myre.getString("table_name"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			return tableNames ;
	}
	public List<List<String>> viewSemesterResult(String sem){
		Statement s=a.GetStatement();
		List<List<String>> resultList = new ArrayList<List<String>>();  
		
		java.lang.String quary="SELECT * FROM "+ sem +" INNER JOIN modules USING(module_code)";
		
		try {
			ResultSet myre=s.executeQuery(quary);

			while(myre.next()){
				int nCol=5;
				ArrayList<String> row = new ArrayList<String>();
				
			    for( int i = 1; i <= nCol; i++ ){
			        row.add(myre.getObject( i ).toString());
			    }
			    resultList.add(row);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return resultList;
		
	}
}
