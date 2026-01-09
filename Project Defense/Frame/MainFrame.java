package Frame;
import Entity.*;
import java.lang.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class MainFrame extends JFrame implements ActionListener, MouseListener{
    private JPanel panel;
    private JLabel lb1, lb2, lb3, lb4, lb5, lb6, lb7, lb8, lb9, lb10, lb11;
    private JTextField tf1, tf2, tf3;
    private JPasswordField pf;
    private JRadioButton rb1, rb2;
    private ButtonGroup bg;
    private JCheckBox cb1, cb2, cb3;
    private JButton bt1, bt2, bt3;
    private JComboBox combo1, combo2;
    private JTextArea ta1;
    private ImageIcon img;
    private Color c1, c2, c3, c4;
    private Font f1;
    private JTable table;
    private DefaultTableModel model;

    public MainFrame() {
        super("Hospital Management System");
        super.setBounds(425, 110, 700, 610);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setLayout(null);
        c1 = new Color(154, 228, 240);
        panel.setBackground(c1);

        lb1 = new JLabel("Enter Your Details");
        lb1.setBounds(38, 17, 200, 50);
        f1 = new Font("Cambria", Font.BOLD, 20);
        lb1.setFont(f1);
        lb1.addMouseListener(this);
        panel.add(lb1);

        lb2 = new JLabel("Name");
        lb2.setBounds(30, 72, 100, 20);
        panel.add(lb2);

        tf1 = new JTextField();
        tf1.setBounds(100, 72, 110, 20);
        panel.add(tf1);

        lb3 = new JLabel("Gender");
        lb3.setBounds(30, 102, 80, 20);
        panel.add(lb3);

        rb1 = new JRadioButton("Male");
        rb1.setBounds(100, 102, 70, 20);
        panel.add(rb1);

        rb2 = new JRadioButton("Female");
        rb2.setBounds(170, 102, 70, 20);
        panel.add(rb2);

        bg = new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);

        lb4 = new JLabel("Address");
        lb4.setBounds(30, 132, 80, 20);
        panel.add(lb4);

        ta1 = new JTextArea();
        ta1.setBounds(100, 132, 130, 40);
        panel.add(ta1);

        lb5 = new JLabel("Doctor Type");
        lb5.setBounds(30, 182, 80, 20);
        panel.add(lb5);

        String types[] = new String[]
        {"--Select One--", "Cardiologist", "Eye Specialist", "Neurologist"};
        combo1 = new JComboBox(types);
        combo1.setBounds(132, 184, 110, 20);
        c2 = new Color(40, 50, 168);
        combo1.setForeground(c2);
        combo1.addActionListener(this);
        panel.add(combo1);

        lb6 = new JLabel("Medical History");
        lb6.setBounds(30, 214, 90, 20);
        panel.add(lb6);

        cb1 = new JCheckBox("High Blood Pressure");
        cb1.setBounds(130, 214, 150, 23);
        cb1.setBackground(c1);
        panel.add(cb1);

        cb2 = new JCheckBox("Diabetes");
        cb2.setBounds(130, 232, 150, 23);
        cb2.setBackground(c1);
        panel.add(cb2);

        cb3 = new JCheckBox("None");
        cb3.setBounds(130, 250, 150, 23);
        cb3.setBackground(c1);
        panel.add(cb3);

        lb7 = new JLabel("Consulting Fees");
        lb7.setBounds(30, 278, 94, 18);
        c4= new Color(245,126,93);
        lb7.setBackground(c4);
        lb7.setOpaque(true);
        panel.add(lb7);

        tf2 = new JTextField();
        tf2.setBounds(130, 278, 100, 20);
        panel.add(tf2);

        lb8 = new JLabel("Choose a payment method");
        lb8.setBounds(30, 306, 150, 30);
        panel.add(lb8);

        String payments[] = new String[]
        {"--Select One--", "Bkash", "Nagad", "Rocket"};
        combo2 = new JComboBox(payments);
        combo2.setBounds(190, 312, 110, 20);
        combo2.setForeground(c2);
        panel.add(combo2);

        lb9 = new JLabel("Phone");
        lb9.setBounds(30, 342, 100, 20);
        panel.add(lb9);

        tf3 = new JTextField();
        tf3.setBounds(90, 342, 100, 20);
        panel.add(tf3);

        lb10 = new JLabel("PIN");
        lb10.setBounds(30, 372, 100, 20);
        lb10.addMouseListener(this);
        panel.add(lb10);

        pf = new JPasswordField();
        pf.setBounds(90, 372, 100, 20);
        pf.setEchoChar('*');
        pf.addActionListener(this);
        panel.add(pf);

        bt1 = new JButton("EXIT");
        bt1.setBounds(192, 520, 80, 30);
        bt1.addActionListener(this);
        bt1.addMouseListener(this);
        panel.add(bt1);

        bt2 = new JButton("GET APPOINTMENT");
        bt2.setBounds(305, 520, 180, 30);
        bt2.addActionListener(this);
        bt2.addMouseListener(this);
        panel.add(bt2);

        bt3 = new JButton("SHOW");
        bt3.setBounds(200, 372, 80, 20);
        bt3.addActionListener(this);
        panel.add(bt3);

        img = new ImageIcon("Picture\\MedicalLogo.png");
        lb11 = new JLabel(img);
        lb11.setBounds(348,26,300,260);
        panel.add(lb11);

        model = new DefaultTableModel(new String[]{"Information", "Patient Details"}, 0);
        table = new JTable(model);
        table.setRowHeight(22);
        table.setShowGrid(true);
        table.setGridColor(Color.BLACK);
        JScrollPane scroll = new JScrollPane(table);
        scroll.setBounds(348, 330, 300, 156);
        panel.add(scroll);

        super.add(panel);

    }
    public void actionPerformed(ActionEvent ae){
		if(ae.getSource() == bt1){
		 System.exit(0);
		}
        else if(ae.getSource() == bt3){
			pf.setEchoChar((char)0);
		}

        else if(ae.getSource() == combo1){
            String type = combo1.getSelectedItem().toString();

            if(type.equals("Cardiologist")){
                tf2.setText("1200");
            }
            else if(type.equals("Eye Specialist")){
                tf2.setText("900");
            }
            else if(type.equals("Neurologist")){
                tf2.setText("1000");
            }
            else{
                tf2.setText("");
            }
        }   

        else if(ae.getSource() == bt2){
			String s1, s2, s3, s4, s5, s6, s7, s8, s9;
			s1 = tf1.getText(); 

            if(rb1.isSelected()){
				s2 = rb1.getText();
			}
			else if(rb2.isSelected()){
				s2 = rb2.getText();
			}
			else{
				s2 = "Others";
			}
        
            s3 = ta1.getText();
            s4 = combo1.getSelectedItem().toString();
			
			if(cb1.isSelected() && cb2.isSelected() && cb3.isSelected()){
				s5 = cb1.getText()+" "+cb2.getText()+" "+cb3.getText();
			}
			else if(cb1.isSelected() && cb2.isSelected()){
				s5 = cb1.getText()+" "+cb2.getText();
			}
			else if(cb1.isSelected() && cb3.isSelected()){
				s5 = cb1.getText()+" "+cb3.getText();
			}
			else if(cb2.isSelected() && cb3.isSelected()){
				s5 = cb2.getText()+" "+cb3.getText();
			}
			else if(cb1.isSelected()){
				s5 = cb1.getText();
			}
			else if(cb2.isSelected()){
				s5 = cb2.getText();
			}
			else if(cb3.isSelected()){
				s5 = cb3.getText();
			}
			else{ s5 = ""; }

            s6 = combo2.getSelectedItem().toString();
			s7 = tf3.getText();
            s8 = pf.getText();
            s9 = tf2.getText();
			
			if(s1.isEmpty() || s2.isEmpty() || s3.isEmpty() || s4.isEmpty() || s5.isEmpty() || s6.isEmpty()||s7.isEmpty()||s8.isEmpty()){
				JOptionPane.showMessageDialog(this,"Please fill up all the information");
			}
			else{
				Hospital obj1 = new Hospital(s1, s2, s3, s4, s5, s6, s7, s8, s9);
				obj1.insertInfo();
				JOptionPane.showMessageDialog(this,"Thanks for filling up the information");
				showInfo();
			}
		}
	}

    public void mouseClicked(MouseEvent me) {
		if(me.getSource() == lb1){
			lb1.setText("Patient Details");
		}
	}

    public void mousePressed(MouseEvent me){ 
		if(me.getSource() == lb10){
			lb10.setText("Password");
		}
	}
    
	public void mouseReleased(MouseEvent me){
		if(me.getSource() == lb10){
			lb10.setText("PIN");
		}
	}

    public void mouseEntered(MouseEvent me){
    c3 = new Color(153, 153, 153);
		if(me.getSource() == bt1){
		  bt1.setBackground(c3);
		}
        else if(me.getSource() == bt2){
          bt2.setBackground(c3);
        }
	}

	public void mouseExited(MouseEvent me){
		if(me.getSource() == bt1){
		  bt1.setBackground(Color.WHITE);
		}
        else if(me.getSource() == bt2){
          bt2.setBackground(Color.WHITE);
        }
	}

    private void showInfo(){
		try{
			File file = new File("./Data/userdata.txt");
			if(file.exists()){
                model.setRowCount(0);
				FileReader fr = new FileReader(file); 
				BufferedReader br = new BufferedReader(fr);
				
				String line;
				while((line = br.readLine()) != null){
                    if(line.startsWith("=")) 
                            continue; 
                    String p[] = line.split(":", 2); 

                        model.addRow(new Object[]{ p[0].trim(), p[1].trim() });
				}
				br.close();
			}
		}
		catch(IOException ioe){
			ioe.printStackTrace();
			JOptionPane.showMessageDialog(this,"Error occcurs");
		}
	}
}