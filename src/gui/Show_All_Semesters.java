package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Show_All_Semesters extends JPanel{
	private List<String> tableNames;
	private JButton sem1=new JButton("Semester 1");
	private JButton sem2=new JButton("Semester 2");
	private JButton sem3=new JButton("Semester 3");
	private JButton sem4=new JButton("Semester 4");
	private JButton sem5=new JButton("Semester 5");
	private JButton sem6=new JButton("Semester 6");
	private JButton sem7=new JButton("Semester 7");
	private JButton sem8=new JButton("Semester 8");

	public Show_All_Semesters() {
		tableNames=GuiController.v.viewAllSemesters();
		for (String name : tableNames) {
            if(name.matches("sem1")){
                this.add(sem1);
                sem1.addActionListener(new ActionListener()
                {
                  public void actionPerformed(ActionEvent e)
                  {
                	JPanel s=new Show_One_semester("sem1");
      				GuiController.main_window.getContentPane().removeAll();   
      				GuiController.main_window.getContentPane().add(s);
      				GuiController.main_window.getContentPane().revalidate();
      				GuiController.main_window.getContentPane().repaint();
                  }
                });
            }
            if(name.matches("sem2")){
                this.add(sem2);
                sem2.addActionListener(new ActionListener()
                {
                  public void actionPerformed(ActionEvent e)
                  {
                	JPanel s=new Show_One_semester("sem1");
      				GuiController.main_window.getContentPane().removeAll();   
      				GuiController.main_window.getContentPane().add(s);
      				GuiController.main_window.getContentPane().revalidate();
      				GuiController.main_window.getContentPane().repaint();
                  }
                });
            }
            if(name.matches("sem3")){
                this.add(sem3);
                sem3.addActionListener(new ActionListener()
                {
                  public void actionPerformed(ActionEvent e)
                  {
                	JPanel s=new Show_One_semester("sem1");
      				GuiController.main_window.getContentPane().removeAll();   
      				GuiController.main_window.getContentPane().add(s);
      				GuiController.main_window.getContentPane().revalidate();
      				GuiController.main_window.getContentPane().repaint();
                  }
                });
            }
            if(name.matches("sem4")){
                this.add(sem4);
                sem4.addActionListener(new ActionListener()
                {
                  public void actionPerformed(ActionEvent e)
                  {
                	JPanel s=new Show_One_semester("sem1");
      				GuiController.main_window.getContentPane().removeAll();   
      				GuiController.main_window.getContentPane().add(s);
      				GuiController.main_window.getContentPane().revalidate();
      				GuiController.main_window.getContentPane().repaint();
                  }
                });
            }
            if(name.matches("sem5")){
                this.add(sem5);
                sem5.addActionListener(new ActionListener()
                {
                  public void actionPerformed(ActionEvent e)
                  {
                	JPanel s=new Show_One_semester("sem1");
      				GuiController.main_window.getContentPane().removeAll();   
      				GuiController.main_window.getContentPane().add(s);
      				GuiController.main_window.getContentPane().revalidate();
      				GuiController.main_window.getContentPane().repaint();
                  }
                });
            }
            if(name.matches("sem6")){
                this.add(sem6);
                sem6.addActionListener(new ActionListener()
                {
                  public void actionPerformed(ActionEvent e)
                  {
                	JPanel s=new Show_One_semester("sem1");
      				GuiController.main_window.getContentPane().removeAll();   
      				GuiController.main_window.getContentPane().add(s);
      				GuiController.main_window.getContentPane().revalidate();
      				GuiController.main_window.getContentPane().repaint();
                  }
                });
            }
            if(name.matches("sem7")){
                this.add(sem7);
                sem7.addActionListener(new ActionListener()
                {
                  public void actionPerformed(ActionEvent e)
                  {
                	JPanel s=new Show_One_semester("sem1");
      				GuiController.main_window.getContentPane().removeAll();   
      				GuiController.main_window.getContentPane().add(s);
      				GuiController.main_window.getContentPane().revalidate();
      				GuiController.main_window.getContentPane().repaint();
                  }
                });
            }
            if(name.matches("sem8")){
                this.add(sem8);
                sem8.addActionListener(new ActionListener()
                {
                  public void actionPerformed(ActionEvent e)
                  {
                	JPanel s=new Show_One_semester("sem1");
      				GuiController.main_window.getContentPane().removeAll();   
      				GuiController.main_window.getContentPane().add(s);
      				GuiController.main_window.getContentPane().revalidate();
      				GuiController.main_window.getContentPane().repaint();
                  }
                });
            }
        }
	}
}
