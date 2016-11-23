package encodeTest;

import java.io.UnsupportedEncodingException;

public class encodeDemo {

		public static void main(String[] args) throws Exception{
			String s = "���ջ���ABC";
			byte[] bytes1 = s.getBytes();//ת�����ֽ������õ�����Ŀ���˵ı���gbk
			for(byte b : bytes1){
				//���ֽڣ�ת����int����16���Ƶķ�ʽ��ʾ
				System.out.print(Integer.toHexString(b & 0xff)+" ");
			}
			System.out.println();
			byte[] bytes2 = s.getBytes("gbk");
			//gbk��������ռ�����ֽڣ�Ӣ��ռһ���ֽ�
			for(byte b : bytes2){
				//���ֽڣ�ת����int����16���Ƶķ�ʽ��ʾ
				System.out.print(Integer.toHexString(b & 0xff)+" ");
			}
			System.out.println();
			byte[] bytes3 = s.getBytes("utf-8");
			//utf-8��������ռ3���ֽڣ�Ӣ��ռһ���ֽ�
			for(byte b : bytes3){
				//���ֽڣ�ת����int����16���Ƶķ�ʽ��ʾ
				System.out.print(Integer.toHexString(b & 0xff)+" ");
			}
			System.out.println();
			//java��˫�ֽڱ���
			byte[] bytes4 = s.getBytes("utf-16be");
			//utf-16be��������ռ2���ֽڣ�Ӣ��ռ2���ֽ�
			for(byte b : bytes4){
				//���ֽڣ�ת����int����16���Ƶķ�ʽ��ʾ
				System.out.print(Integer.toHexString(b & 0xff)+" ");
			}
			System.out.println();
			String str1 = new String(bytes4,"utf-16be");
			System.out.println(str1);
		}
		/*
		 * �ı��ļ� �����ֽ�����
		 * ���������������ֽ�����
		 * ������������Ļ�����ֱ�Ӵ����ı��ļ�����ô���ı��ļ�ֻ��ʶansi����
		 * 
		 * 
		 */
}