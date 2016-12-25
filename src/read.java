import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;


public class read {
	// public static void readTxtFile(String filePath) {
	// try {
	// String encoding = "GBK";
	// File file = new File(filePath);
	// if (file.isFile() && file.exists()) { // 判断文件是否存在
	// InputStreamReader read = new InputStreamReader(new FileInputStream(file),
	// encoding);
	// // 考虑到编码格式
	// BufferedReader bufferedReader = new BufferedReader(read);
	// String lineTxt = null;
	// while ((lineTxt = bufferedReader.readLine()) != null) {
	// System.out.println(lineTxt);
	// }
	// read.close();
	// } else {
	// System.out.println("找不到指定的文件");
	// }
	// } catch (Exception e) {
	// System.out.println("读取文件内容出错");
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
//		System.out.println("请输入文件所在位置");
//		char ch;
//		while((ch=(char)System.in.read())!='\r')
//			sb.append(ch);
//			File dri=new File(sb.toString());
//			System.out.println("请输入文件名");
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
//					System.out.println("文件不可读");
//				
//			
//			
//		
	}

}
