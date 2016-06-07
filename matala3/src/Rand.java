import java.util.ArrayList;
import java.util.Collections;


public class Rand {
	public static int randome(int size)
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i=1; i<size; i++)
		{
			list.add(new Integer(i));
		}
		Collections.shuffle(list);
		return(list.get(0));

	}
	public static String s(int n, String str){
		String s="";
		String[] ans = new String[9];
		for (int i = 0; i < ans.length-1; i++) {
			if(i%2 !=0) ans[i]= " ";
			else ans[i] = ""+randome(20);
		}

		ans[ans.length-1]=str;

		for (int i = 0; i < ans.length; i++)
		{
			s=s+ans[i];
		}
		return s;

	}
}