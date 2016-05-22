import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;                   //������������ - ��� ���������� ������� ������, ��� ������ ���� �� ������ �����.

import javax.swing.JOptionPane;


public class Main {
	private static ArrayList<Profile> profiles = new ArrayList<Profile>();

	@SuppressWarnings("unchecked")  //��� ����� ��� ����. �� ������������ �������� ��������������� �� �����������.
	public static void main(String[] args) {
		profiles =  (ArrayList<Profile>) deserData("profiles");                            //����� ��������� ���� � ����� � ���������� �� � ���������. ��������� ������� ����� ���������, ���� ��������� �� ���� �������� ������� ���������� � ������ ����
		System.out.println(profiles.size());    //���������� ������� ������� ��������� � ��������� �� ��������� ������
		Profile profile = new Profile();
		profile.setName(JOptionPane.showInputDialog(null, "Vvedite um9"));
		profile.setSurname(JOptionPane.showInputDialog(null, "Vvedite famili|-o"));
		profiles.add(profile);
		for(Profile p: profiles){
			System.out.println(p.getName()+" "+p.getSurname());
		}
		System.out.println(profiles.size());      //���������� ������� ������� ��������� � ��������� ����� ��������� ������
        serData("profiles",profiles);                                //����� ���������� ������ � ����         
	}

	private static void serData(String file_name, Object obj) {   //�������, ����� ���, ��������� ��� �������
      try {
			
			FileOutputStream fileOut = new FileOutputStream(file_name+".ser");   //ser(����������) ���  ����������� ���� �������������, �� ����� ���������� ���� ���, ����� ����� ��� �������, �������������� ������� ������ � �������� � ������ ������
		    ObjectOutputStream out = new ObjectOutputStream(fileOut);           //����� ���������� ��� ������� ������ � ���� � �������, ������� � ��������������� ����� ��� �������� ��� ��� � ��������, �.�. � ��������.
			out.writeObject(obj);                       //���������� � ��� �� ��� ������ � ������� �� serData(�.�. �� ����) 
			fileOut.close();
			out.close();
			   
			} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("no file");
			System.exit(1);                                          //����� �� ���� �� ��������� ������������\�������� ���� ��������� ��� ���������� ������! ����� � ������� ��� ��� ������������ ������ ������.
			
			} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Error entry/out");
			System.exit(2);
			} 
		
	}

	private static Object deserData(String file_name) {     
		 
		Object retObject = null;  //retObject ����� ���� �������� ���� �� ��� �������  �� ����� � ������ � desData, � ��� � ���� ������� ������� � ��������� ��� ���
		
		try {
			
			FileInputStream fileIn = new FileInputStream(file_name+".ser");   //��������� �� ��� � ����� � ����������  ������� � ���� ������� ����
		    ObjectInputStream In = new ObjectInputStream(fileIn);          //����������� ������ ���� �� ������ � ������� � ���������� � �� 
			
			retObject = In.readObject();  //���������� � ���������� �� 
			
			                       
			fileIn.close();
			In.close();
			   
			} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("no file");
			System.exit(1);                                       
			
			} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Error entry/out");
			System.exit(2);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				System.out.println("Class's not found");
				System.exit(3);
			} 
            
		    return retObject;  //���������� ���������� ���� �������.
}
}