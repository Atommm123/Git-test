import java.util.Scanner;         //��� ������������� ������ �������!!!
import java.io.File;             // � ������ openFile � ������� ����� ������ ������� ����� �� ������ ������������  ������ � �� �� �� �����������, ��� ��� ����� ������, ���� �� �� ���� ������ � �������, �������� ���������� ������������� ���� ������ new File  � ������ openFile!!!

import javax.swing.JOptionPane;

public class ������������������������� {
	static String[][] m = new String[5][3];
	static Scanner scn;           // ���� ����� ������������� �� java.until.Scanner. � ��� ��� ���������� ����� ���� ����� � ������ ������, �� ���� ������!!!
	
	public static void main(String args[]){
		openFile();               //����� � ������ ������ ���� ��������� ������� ����� ��� ������!!!
		readFile();
		
		out();
	}
	
	

	private static void out() {
		 
		
			for(int row = 0; row<m.length;row++){                     //����� ��������� csn.hasNext ������ row<m.length  � ����� ������� �� �����
				for(int col = 0;col<m[row].length;col++){
					System.out.print(m[row][col] + "  ");
					                                                  //������ �� ������� scn.next(); , � �� ����� ������ ���� ��� o�����
					}
				System.out.println();
					
			
			
						
				
		}
		
	 }		
	

	private static void readFile() {
		while(scn.hasNext()){        //���� ���� ��������� �� �������� ���� �� ��������� ��������!!! � ����� hasNext ����� ��������� ���� �� ��� ��� ���� �� �� �����������, � ����� �� ����������� ���� ����� ��������� ����!!!
			for(int row = 0; row<m.length;row++){                      //����� ��������� csn.hasNext ������ row<m.length  � ����� ������� �� �����
				for(int col = 0;col<m[row].length;col++){              //��� ��������� ������� ������� �������� ���� �� ����
					m[row][col] = scn.next();                          //scn.nex() ������� � ���������� ��������� � �����. 
				}
			}
		}
		
		
	}

	private static void openFile() {                  //����� � ������ ������ ���� ���������!!!
		try{
		scn = new Scanner(new File("res//1.txt"));
		}catch(Exception e){JOptionPane.showMessageDialog(null, "��� ���� �����?");}
	}

}
