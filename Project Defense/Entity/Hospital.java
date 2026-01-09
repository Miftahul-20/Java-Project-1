package Entity;
import java.lang.*;
import java.io.*;
import javax.swing.*; 
public class Hospital{
    private String s1, s2, s3, s4, s5, s6, s7, s8, s9;
	private File file;
	private FileWriter fwriter; 
	
	public Hospital() { }
	public Hospital(String s1, String s2, String s3, String s4, String s5, String s6, String s7, String s8, String s9){
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
		this.s4 = s4;
		this.s5 = s5;
		this.s6 = s6;
        this.s7 = s7;
		this.s8 = s8;
		this.s9 = s9;
	}	

	public void insertInfo(){
		try{
			file = new File("./Data/userdata.txt");
			
			if(!file.exists()){
				file.getParentFile().mkdirs();
				file.createNewFile();
			}
			
			fwriter = new FileWriter(file, true); 
			fwriter.write("==========================================================="+"\n");
			fwriter.write(" Name: "+s1+"\n");
			fwriter.write(" Gender: "+s2+"\n");
			fwriter.write(" Address: "+s3+"\n");
			fwriter.write(" Doctor Type: "+s4+"\n");
			fwriter.write(" Medical History: "+s5+"\n");
			fwriter.write(" Payment Method: "+s6+"\n");
			fwriter.write(" Phone: "+s7+"\n");
			fwriter.write(" PIN: "+s8+"\n");
			fwriter.write(" Consulting Fees: "+s9+"\n");
			fwriter.write("==========================================================="+"\n");
			
			fwriter.flush();  
			fwriter.close(); 
		}
		catch(IOException ioe){
			ioe.printStackTrace();
			JOptionPane.showMessageDialog(null,"Error occcurs");
		}
	}
}