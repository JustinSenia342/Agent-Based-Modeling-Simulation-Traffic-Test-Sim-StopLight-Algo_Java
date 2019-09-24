import java.io.*;

//Program tests traffic dynamics
public class TrafficTester
{
	public static void main(String[] args) throws IOException
	{
		//keeps track of outfile name
		String fileOutName = "fileOutputText00.txt";
		
		Traffic t;
		
		for (double i=0, j=0; i < .20; i=i+0.01, j=j+1)
		{
			//create a traffic object
			t = new Traffic(100, 5000, i, 46235);
			
			if (j < 10)
			{
				fileOutName = fileOutName.substring(0, 15) + (int)j + ".txt";
			}
			else
			{
				fileOutName = fileOutName.substring(0, 14) + (int)j + ".txt";
			}
			
			//System.out.println(fileOutName);
			
			//run simulation
			t.run(fileOutName);
			
		}
	}
}