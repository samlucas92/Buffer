import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToolBar;


public class Gui {
	private static JFrame frame;
	private static JToolBar toolbar;
	private static JTextField input;
	private static JTextArea output;
	private static JScrollPane scrollPane;
	private static JButton read, clear;
	public static ArrayList<String> Lines;
    private static final int HOR_SIZE = 400;
    private static final int VER_SIZE = 150;
    public static Buffer reader = new Buffer();
    private static File file;
	private static ArrayList<String> temp = new ArrayList<String>();
	public static Random rand = new Random();
	private static ArrayList<String> list = new ArrayList<String>();
	
	//Sets up the Gui
	public static void initComponents(){

		frame = new JFrame("CS-371 - File Reader");
		frame.setSize(400, 400);
		toolbar = new JToolBar();

    	read = new JButton("Generate Rooms");
    	clear = new JButton("Clear");
    	output = new JTextArea();
    	output.setSize(HOR_SIZE, VER_SIZE);
    	output.setLineWrap(true);
    	output.setEditable(false);
        scrollPane = new JScrollPane(output);			
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setMaximumSize(new java.awt.Dimension(HOR_SIZE, VER_SIZE));
		scrollPane.setMinimumSize(new java.awt.Dimension(HOR_SIZE, VER_SIZE));
		scrollPane.setPreferredSize(new java.awt.Dimension(HOR_SIZE, VER_SIZE));

		
        toolbar.add(read);
        frame.add(scrollPane, BorderLayout.CENTER );
        frame.add(toolbar,BorderLayout.NORTH);
        frame.add(clear, BorderLayout.SOUTH);
		toolbar.setFloatable(false);
        frame.setVisible(true);
	}
	
	public static void main(String[] args){
		//calls the method that sets up the GUI
		initComponents();
		//sets up a click listener
		
		list.add("Sam");
		list.add("Horganz");
		list.add("Tanko");
		list.add("Neaaaaaaaal");
		list.add("James M");
		list.add("Jacob");
		list.add("Chrissy B");
		list.add("Chram");
		list.add("Joe");
		list.add("Dyer");
		list.add("Deeeeeeeej");
		list.add("Jake");
		list.add("Liam");
		list.add("Rhys");
		list.add("Alex");
		list.add("Beth");
		list.add("Laura");
		list.add("Becca");
		list.add("Nessa");
		
		
		read.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
					output.append("\n ---------------- \n");
					output.append("Room 1 \n");
					output.append("---------------- \n");
				for(int i = 0; i<=5; i++){
					int random = rand.nextInt(list.size());

					output.append(list.get(random) + "\n");
					list.remove(random);
				}	
					output.append("\n ---------------- \n");
					output.append("Room 2 \n");
					output.append("---------------- \n");
				for(int i = 0; i<=5; i++){
					int random = rand.nextInt(list.size());

					output.append(list.get(random) + "\n");
					list.remove(random);
				}	
					output.append("\n ---------------- \n");
					output.append("Room 3 \n");
					output.append("---------------- \n");
				for(int i = 0; i<=3; i++){
					int random = rand.nextInt(list.size());

					output.append(list.get(random) + "\n");
					list.remove(random);
				}	
					output.append("\n ---------------- \n");
					output.append("Room 4 \n");
					output.append("---------------- \n");
				for(int i = 0; i<=3; i++){
					int random = rand.nextInt(list.size());

					output.append(list.get(random) + "\n");
					list.remove(random);
				}
			}
			
			
		});	
		//setting up a click listener
		clear.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				//set output box to empty string
				output.setText("");
			}
		});
	}
}
