import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;


public class read {
	// public static void readTxtFile(String filePath) {
	// try {
	// String encoding = "GBK";
	// File file = new File(filePath);
	// if (file.isFile() && file.exists()) { // �ж��ļ��Ƿ����
	// InputStreamReader read = new InputStreamReader(new FileInputStream(file),
	// encoding);
	// // ���ǵ������ʽ
	// BufferedReader bufferedReader = new BufferedReader(read);
	// String lineTxt = null;
	// while ((lineTxt = bufferedReader.readLine()) != null) {
	// System.out.println(lineTxt);
	// }
	// read.close();
	// } else {
	// System.out.println("�Ҳ���ָ�����ļ�");
	// }
	// } catch (Exception e) {
	// System.out.println("��ȡ�ļ����ݳ���");
	// e.printStackTrace();
	// }
	// }
	//
	// public static void main(String argv[]){
	// String filePath = "F:\\QQPCmgr\\Desktop\\2.txt";
	// // "res/";
	//
	// readTxtFile(filePath);
	// }

	public static void main(String[] args) throws IOException {
//		StringBuffer sb = new StringBuffer();
//		System.out.println("�������ļ�����λ��");
//		char ch;
//		while((ch=(char)System.in.read())!='\r')
//			sb.append(ch);
//			File dri=new File(sb.toString());
//			System.out.println("�������ļ���");
//			StringBuffer sbt = new StringBuffer();
//			char cha;
//			while((cha=(char)System.in.read())!='\r')
//				sbt.append(cha);
//				sbt.replace(0, 1, "");
//				File readFrom=new File(dri,sbt.toString());
//				if(readFrom.isFile() && readFrom.canRead() && readFrom.canWrite()){
//					RandomAccessFile rafFile=new RandomAccessFile(readFrom, "rw");
//					while(rafFile.getFilePointer()<rafFile.length())
//						System.out.println(rafFile.readLine());
//						rafFile.close();
//					}
//				else
//					System.out.println("�ļ����ɶ�");
//				
//			
//			
//		
	}

}
