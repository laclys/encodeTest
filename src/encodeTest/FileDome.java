package encodeTest;

import java.io.File;
import java.io.IOException;

public class FileDome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file =new File("D:\\javaio");
		System.out.println(file.exists());
//		file.mkdir()����Ŀ¼
//		file.delete()ɾ��Ŀ¼
		System.out.println(file.isDirectory());//�Ƿ���һ��Ŀ¼
		System.out.println(file.isFile());//�Ƿ����ļ�
		
//		File file2 = new File("D:\\javaio\\file123.txt");
		File file2 = new File("D:\\javaio,file123.txt");
		if(! file2.exists()){
			try {
				file2.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}else{
			file2.delete();
		}
		System.out.println(file2);
		System.out.println(file.getName());
		System.out.println(file.getParent());
	}

}
