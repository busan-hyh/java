package sub2;

import java.io.IOException;
import java.util.StringTokenizer;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

//�ɰ��°�
public class WCMapper extends Mapper<LongWritable, Text, Text, IntWritable>{
	//���۸� ��ӹ޾����Ƿ� �ʻ���� ����(map���� ��Ʈ��+�����̽�)
	//�ϵ��� ��Ʈ IntWritable
	private final static IntWritable one = new IntWritable(1);
	private Text word = new Text();
	//������ �Ҷ� {�ܾ�,�} ������� ���Ƿ� Text,int �������� ������
	
	@Override
	protected void map(LongWritable key, Text value, 
			Mapper<LongWritable, Text, Text, IntWritable>.Context context) 
					throws IOException, InterruptedException {
		//��string�� �ڸ��� ����. (String, StringBuilder, StringTokenizer�� ��Ʈ�� ���ѻ�..)
		StringTokenizer st = new StringTokenizer(value.toString());
		
		while(st.hasMoreTokens()) {
			word.set(st.nextToken());
			context.write(word, one);
		}
	}
}
