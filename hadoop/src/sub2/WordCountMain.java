package sub2;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.input.TextInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.mapreduce.lib.output.TextOutputFormat;

//�ϵ� �ʸ��ེ �ܾ� ī��Ʈ �ǽ�
public class WordCountMain {
	public static void main(String[] args) {
		Configuration conf = new Configuration();
		
		try {
			Job job = new Job(conf, "WordCount");//�� ����, "�̸�"
			
			job.setJarByClass(WordCountMain.class);
			job.setMapperClass(WCMapper.class);
			job.setReducerClass(WCReducer.class);
			
			job.setInputFormatClass(TextInputFormat.class);//joq������. �ؽ�Ʈ�̴�.
			job.setOutputFormatClass(TextOutputFormat.class);//�ؽ�Ʈ�̴�.
			
			job.setOutputKeyClass(Text.class);//������� �ؽ�Ʈ�̴�.
			job.setOutputValueClass(IntWritable.class);
			
			FileInputFormat.addInputPath(job, new Path(args[0]));//��δ� �����ϰڴ�
			FileOutputFormat.setOutputPath(job, new Path(args[1]));//�ƿ�ǲ ��ε� �����ϰڴ�.
			job.waitForCompletion(true);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("�ʸ��ེ ����...");
	}
}
