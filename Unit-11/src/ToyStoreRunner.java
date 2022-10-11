import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStoreRunner
{
	public static void main( String args[] )
	{
		//ArrayList testList = new ArrayList<String>();
		ToyStore yuqian = new ToyStore();
		yuqian.loadToys("sorry bat sorry sorry sorry train train teddy teddy ball ball");
		System.out.println(yuqian);
	}

}
