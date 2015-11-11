package gui;
import java.awt.FlowLayout;

import javax.swing.JFrame;

public class Main_Frame extends JFrame{
	// constructor
	Main_Frame(){
	    super("GPA Application");            // invoke the JFrame constructor
	    setSize( 600, 550 );
	    this.setLayout(new FlowLayout());
	    setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );                
	  }

}
