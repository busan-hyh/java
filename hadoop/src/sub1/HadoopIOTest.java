package sub1;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

//하둡 파일 입출력 테스트
public class HadoopIOTest {
	public static void main(String[] args) throws IOException{
		Configuration conf = new Configuration();
		
		FileSystem hdfs = FileSystem.get(conf);
		Path path = new Path(args[0]);//main실행할때 받는 String[] args의 첫번째. 패스는 여기서 받는다??
		
		//HDFS 파일쓰기
		
		//HDFS 파일읽기
	}
}
