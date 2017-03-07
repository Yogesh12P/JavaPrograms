import java.util.Date;
import java.util.Scanner;

public class stopwatch
{

	   long StartTime = 0 , StopTime= 0 , Elapsed = 0;

	   public void start()
	   {
	     StartTime = System.currentTimeMillis();
	   }

	    public void stop()
           { 
             StopTime = System.currentTimeMillis();
           }

	     public long getElapsedTime()
           { 
             Elapsed = (StopTime - StartTime);
	     return Elapsed;
           }

	    public static void main(String args[])
	     {
		Scanner sc = new Scanner(System.in);
		int startchoice , stopchoice;
		stopwatch w = new stopwatch();
		System.out.println("1.start\n2.stop");
		startchoice = sc.nextInt();
		w.start();
		stopchoice = sc.nextInt();
		w.stop();

		System.out.println("Elapsed Time :"+w.getElapsedTime()+"mili second");
	     }
}

