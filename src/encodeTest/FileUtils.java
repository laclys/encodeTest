package encodeTest;

import java.io.File;
import java.util.Iterator;

import javax.imageio.IIOException;

//�г�File��һЩ��������
public class FileUtils {
	/*
	 * �г��ƶ�Ŀ¼�µ������ļ�
	 * @param dir
	 * @throw IOException 
	 */
public static void listDirectory(File dir)throws IIOException{
		if(!dir.exists()){
			throw new IllegalArgumentException("Ŀ¼" + dir + "������");
		}
/*		String[] filenames = dir.list();//�����ַ������� ֱ���ӵ����� ��������Ŀ¼�µ�����
		
		for(String string:filenames){
			System.out.println(dir +"\\"+string);
		}*/
		File[] files = dir.listFiles(); //���ص���ֱ����Ŀ¼�ĳ���
		if(files!= null &&files.length>0){
			for(File file:files){
				if(file.isDirectory()){
					//�ݹ�
					listDirectory(file);
				}else{
					System.out.println(file);
				}
			}

		}


	}

}
