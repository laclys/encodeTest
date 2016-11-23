package encodeTest;

import java.io.UnsupportedEncodingException;

public class encodeDemo {

		public static void main(String[] args) throws Exception{
			String s = "最终幻想ABC";
			byte[] bytes1 = s.getBytes();//转换成字节序列用的是项目迷人的编码gbk
			for(byte b : bytes1){
				//把字节（转换成int）以16进制的方式显示
				System.out.print(Integer.toHexString(b & 0xff)+" ");
			}
			System.out.println();
			byte[] bytes2 = s.getBytes("gbk");
			//gbk编码中文占两个字节，英文占一个字节
			for(byte b : bytes2){
				//把字节（转换成int）以16进制的方式显示
				System.out.print(Integer.toHexString(b & 0xff)+" ");
			}
			System.out.println();
			byte[] bytes3 = s.getBytes("utf-8");
			//utf-8编码中文占3个字节，英文占一个字节
			for(byte b : bytes3){
				//把字节（转换成int）以16进制的方式显示
				System.out.print(Integer.toHexString(b & 0xff)+" ");
			}
			System.out.println();
			//java是双字节编码
			byte[] bytes4 = s.getBytes("utf-16be");
			//utf-16be编码中文占2个字节，英文占2个字节
			for(byte b : bytes4){
				//把字节（转换成int）以16进制的方式显示
				System.out.print(Integer.toHexString(b & 0xff)+" ");
			}
			System.out.println();
			String str1 = new String(bytes4,"utf-16be");
			System.out.println(str1);
		}
		/*
		 * 文本文件 就是字节序列
		 * 可以是任意编码的字节序列
		 * 如果我们在中文机器上直接创建文本文件，那么该文本文件只认识ansi编码
		 * 
		 * 
		 */
}