package programPrac;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class ProgramPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=100,pre=0,cur=1;
		ArrayList<Integer> fibo=new ArrayList<>();
		fibo.add(pre);
		fibo.add(cur);
		while(cur<=n) {
			cur=cur+pre;
			pre=cur-pre;
			fibo.add(cur);
		}
		System.out.println(Arrays.toString(fibo.toArray()));
	}
}
