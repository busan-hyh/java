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

//하둡 맵리듀스 단어 카운트 실습
public class WordCountMain {
	public static void main(String[] args) {
		Configuration conf = new Configuration();
		
		try {
			Job job = new Job(conf, "WordCount");//잡 설정, "이름"
			
			job.setJarByClass(WordCountMain.class);
			job.setMapperClass(WCMapper.class);
			job.setReducerClass(WCReducer.class);
			
			job.setInputFormatClass(TextInputFormat.class);//joq설정중. 텍스트이다.
			job.setOutputFormatClass(TextOutputFormat.class);//텍스트이다.
			
			job.setOutputKeyClass(Text.class);//결과물은 텍스트이다.
			job.setOutputValueClass(IntWritable.class);
			
			FileInputFormat.addInputPath(job, new Path(args[0]));//경로는 지정하겠다
			FileOutputFormat.setOutputPath(job, new Path(args[1]));//아웃풋 경로도 지정하겠다.
			job.waitForCompletion(true);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("맵리듀스 종료...");
	}
}
