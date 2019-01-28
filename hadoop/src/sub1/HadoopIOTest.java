package sub1;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FSDataOutputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

//하둡 파일 입출력 테스트
public class HadoopIOTest {
	public static void main(String[] args) throws IOException{
		Configuration conf = new Configuration();
		
		FileSystem hdfs = FileSystem.get(conf);
		Path path = new Path(args[0]);//main실행할때 받는 String[] args의 첫번째. 경로 매개변수를 함께 던진다
		
		//HDFS 파일쓰기
		FSDataOutputStream out = hdfs.create(path);
		out.writeUTF(args[1]);//내용매개변수를 실행할때 함께 던진다.
		out.close();
		
		//HDFS 파일읽기
		FSDataInputStream in = hdfs.open(path);
		String txt = in.readUTF();
		in.close();
		
		System.out.println("내용출력 : " + txt);
		
	}
}
