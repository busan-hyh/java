package sub1;

import java.io.IOException;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataInputStream;
import org.apache.hadoop.fs.FSDataOutputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

//�ϵ� ���� ����� �׽�Ʈ
public class HadoopIOTest {
	public static void main(String[] args) throws IOException{
		Configuration conf = new Configuration();
		
		FileSystem hdfs = FileSystem.get(conf);
		Path path = new Path(args[0]);//main�����Ҷ� �޴� String[] args�� ù��°. ��� �Ű������� �Բ� ������
		
		//HDFS ���Ͼ���
		FSDataOutputStream out = hdfs.create(path);
		out.writeUTF(args[1]);//����Ű������� �����Ҷ� �Բ� ������.
		out.close();
		
		//HDFS �����б�
		FSDataInputStream in = hdfs.open(path);
		String txt = in.readUTF();
		in.close();
		
		System.out.println("������� : " + txt);
		
	}
}
