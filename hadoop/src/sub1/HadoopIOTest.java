package sub1;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

//�ϵ� ���� ����� �׽�Ʈ
public class HadoopIOTest {
	public static void main(String[] args) throws IOException{
		Configuration conf = new Configuration();
		
		FileSystem hdfs = FileSystem.get(conf);
		Path path = new Path(args[0]);//main�����Ҷ� �޴� String[] args�� ù��°. �н��� ���⼭ �޴´�??
		
		//HDFS ���Ͼ���
		
		//HDFS �����б�
	}
}
