package encodeTest;

import java.io.File;
import java.util.Iterator;

import javax.imageio.IIOException;

//列出File的一些常见操作
public class FileUtils {
	/*
	 * 列出制定目录下的所有文件
	 * @param dir
	 * @throw IOException 
	 */
public static void listDirectory(File dir)throws IIOException{
		if(!dir.exists()){
			throw new IllegalArgumentException("目录" + dir + "不存在");
		}
/*		String[] filenames = dir.list();//返回字符串数组 直接子的名称 不包含子目录下的内容
		
		for(String string:filenames){
			System.out.println(dir +"\\"+string);
		}*/
		File[] files = dir.listFiles(); //返回的是直接子目录的抽象
		if(files!= null &&files.length>0){
			for(File file:files){
				if(file.isDirectory()){
					//递归
					listDirectory(file);
				}else{
					System.out.println(file);
				}
			}

		}


	}

}
