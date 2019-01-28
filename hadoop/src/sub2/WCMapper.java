package sub2;

import java.io.IOException;
import java.util.StringTokenizer;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

//쪼개는거
public class WCMapper extends Mapper<LongWritable, Text, Text, IntWritable>{
	//매퍼를 상속받았으므로 맵상수를 쓴다(map쓰고 컨트롤+스페이스)
	//하둡의 인트 IntWritable
	private final static IntWritable one = new IntWritable(1);
	private Text word = new Text();
	//맵핑을 할때 {단어,몇개} 방식으로 쓰므로 Text,int 형식으로 세팅중
	
	@Override
	protected void map(LongWritable key, Text value, 
			Mapper<LongWritable, Text, Text, IntWritable>.Context context) 
					throws IOException, InterruptedException {
		//▼string을 자르는 역할. (String, StringBuilder, StringTokenizer가 스트링 삼총사..)
		StringTokenizer st = new StringTokenizer(value.toString());
		
		while(st.hasMoreTokens()) {
			word.set(st.nextToken());
			context.write(word, one);
		}
	}
}
