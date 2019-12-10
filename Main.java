import java.io.*;
import javax.swing.*;

import java.net.*;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.event.*;
public class Main  extends JFrame implements ActionListener{
 JMenu m1,m2,m3,m4,m5,m6;
 JMenuBar B1;
 JScrollPane s;
 JTextArea t1;

JComboBox c,c2,c3,c4;

 JMenuItem f1,f2,f3,f4,f5;
 
 JMenuItem ed1,ed2,ed3;
 
 JMenuItem h1,h2;
 
 JMenuItem font1;
 
 
 JFrame f;
 
 static Main m;
	
	Main()
	{
	setSize(500,500);
	setVisible(true);
	setLayout(null);
	
	
	B1=new JMenuBar();
	setJMenuBar(B1);
	
	m1=new JMenu("file");
	B1.add(m1);
	
	m2=new JMenu("Edit");
	B1.add(m2);
	
	m3=new JMenu("format");
	B1.add(m3);
	

	//m4=new JMenu("view");
	//B1.add(m4);
	

	m5=new JMenu("help");
	B1.add(m5);
	
	t1=new JTextArea();
	t1.setBounds(0,0,2000,2000);
    s=new JScrollPane(t1);
    add(s);
    s.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

    
	add(t1);
    
    
	//file JMenu//
	  
	f1=new JMenuItem("Save");
	f1.addActionListener(this);
	m1.add(f1);
	 
	f2=new JMenuItem("Save As");
	f2.addActionListener(this);
	m1.add(f2);
	

	f3=new JMenuItem("Open");
	f3.addActionListener(this);
	m1.add(f3);
	
	f4=new JMenuItem("new");
	f4.addActionListener(this);
	m1.add(f4);
	
	f5=new JMenuItem("Exit");
	f5.addActionListener(this);
	m1.add(f5);
	
	//edit
	
	ed1=new JMenuItem("copy");
	ed1.addActionListener(this);
	m2.add(ed1);
	
	
	

	ed2=new JMenuItem("Paste");
	ed2.addActionListener(this);
	m2.add(ed2);
	
	
	

	ed3=new JMenuItem("Cut");
	ed3.addActionListener(this);
	m2.add(ed3);
	
	
	
	
	
	//font//
   
	font1=new JMenuItem("Font");
	font1.addActionListener(this);
	m3.add(font1);
	
	
	

	//Help
   h1=new JMenuItem("view");
   h1.addActionListener(this);
   m5.add(h1);
   
	h2=new JMenuItem("notepad");
	h2.addActionListener(this);
	m5.add(h2);
	
	
	}

  public static void main(String args[])
  {
  m=new Main();
  }
  
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource()==f5)
		{
			dispose();
		}
		if(e.getSource()==f4)
		{
		new Main();
		}
		if(e.getSource()==f1)
		{
			JFileChooser jf=new JFileChooser();
			jf.showSaveDialog(this);
			File f=new File(jf.getSelectedFile().getAbsolutePath());
			try
			{
			FileWriter fw=new FileWriter(f);
			
			BufferedWriter bw=new BufferedWriter(fw);
			 bw.write(t1.getText());
			 bw.close();
		   	
		}catch(Exception e1)
			{
			
			}
		}
		
		if(e.getSource()==f3)
		{
			JFileChooser jf=new JFileChooser();
			jf.showSaveDialog(this);
			File f=new File(jf.getSelectedFile().getAbsolutePath());
			try
			{
			FileReader fw=new FileReader(f);
			
			BufferedReader bw=new BufferedReader(fw);
			 
			String s="";
			String data="";
			
			while((data=bw.readLine())!=null)
			{
				s=s+data;
			}
			t1.setText(s);
			fw.close();
			bw.close();
		}catch(Exception e1)
			{
			
			}
		}
		
			if(e.getSource()==ed1)
			{
				t1.copy();
				
			}
			
			
			if(e.getSource()==ed2)
			{
              t1.paste();
             
			}
			
			
			if(e.getSource()==ed3)
			{
              t1.cut();
             
			}
			
			
			if(e.getSource()==font1)
			{
				   f=new JFrame();
				   f.setVisible(true);
				   f.setLayout(null);
				   f.setSize(500,500);
				   JLabel l1,l2,l3;
				   l1=new JLabel("font style");
				   l1.setBounds(10,10,100,50);
				   f.add(l1);
				   
				   

				   l2=new JLabel("size");
				   l2.setBounds(140,10,100,50);
				   f.add(l2);

				   l3=new JLabel("font");
				   l3.setBounds(260,10,100,50);
				  f.add(l3);
				   
				   
				   c=new JComboBox();
				   c.addItem("BOLD");
				   c.addItem("ITALIC");
				   c.addItem("BOLD ITALIC");
				   c.setBounds(20,50,100,50);
				   f.add(c);
				   
				   
				    c2=new JComboBox();
				   c2.addItem(5);
				   c2.addItem(10);
				   c2.addItem(15);
				   c2.addItem(20);
				   c2.addItem(25);
				   c2.addItem(30);
				   c2.addItem(35);
				   c2.addItem(40);
				   c2.addItem(45);
                   c2.setBounds(140,50,100,50);
                   f.add(c2);
                   
                   
							       
				   c4=new JComboBox();
				   c4.addItem("Arial");
				   c4.addItem("Constantia");
				   c4.addItem("Consolas");
				   c4.addItem("Cooper");
				   c4.addItem("Copperplate Gothic");
				   c4.addItem("Courier New");
				   c4.addItem("Javanese Text");
				   c4.addItem("Franklin Gothic");
				   c4.addItem("Franklin Gothic Book");
				   c4.addItem("Freestyle Script");
				   c4.addItem("Microsoft JhengHei");
				   c4.addItem("Perpetua");
				   c4.addItem("Myanmar Text");
				   
				   c4.setBounds(260,50,100,50);
				   f.add(c4);
				   
				   
				   JButton b1=new JButton("OK");
				   b1.setBounds(140,350,100,50);
				   f.add(b1);
				   
				   
				   JButton b2=new JButton("CANCEL");
				   b2.setBounds(260,350,100,50);
				   f.add(b2);
				  
				   
				   b1.addActionListener(new ActionListener() {
					   public void actionPerformed(ActionEvent e)
					   {
						   
						   String s1,s3,s4;
						   s1=(String) c.getSelectedItem();
						 int s2=(int)c2.getSelectedItem();
						  //s3=(String) c3.getItemAt(c3.getSelectedIndex());
						   s4=(String) c4.getSelectedItem();
						  
						   Font ff1=new Font("Arial",38,Font.BOLD);
						   t1.setFont(ff1);
					if(s1=="BOLD")
					{
					Font ff=new Font(s4,Font.BOLD,s2);
					t1.setFont(ff);
		 
					}
					
					  
					if(s1=="ITALIC")
					{
						
		 t1.setFont(new Font(s4,Font.ITALIC,s2));
					}
					
					  
					if(s1=="BOLD ITALIC")
					{
						
		 t1.setFont(new Font(s4,Font.BOLD +Font.ITALIC,s2));
					}
						   
					
					f.dispose();
						  
					   }
				   });
				   
				   
				   b2.addActionListener(new ActionListener() {
					   public void actionPerformed(ActionEvent e)
					   {
						   
						  f.dispose();
						   
					   }
				   });
		
			}
			 
			if(e.getSource()==h1)
			
			{
				try {
					  Desktop desktop = java.awt.Desktop.getDesktop();
					  URI oURL = new URI("https://github.com/8390297034");
					  desktop.browse(oURL);
					} catch (Exception e11) {
					  e11.printStackTrace();
					}

			}
			
			if(e.getSource()==h2)
			{
				
			JFrame jf=new JFrame();
			jf.setSize(500,500);
			jf.setLayout(null);
			jf.setVisible(true);
			
			JLabel l1=new JLabel("This  is Developed By the Balram Kale Patil"
					+ " Email:-kalebalram43@gmail.com " + " mobile no:- 7349857104");
			l1.setBounds(20,20,400,400);
			jf.add(l1);
			}
		}
           
	} 
	
	



