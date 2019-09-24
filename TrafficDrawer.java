import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Color;

//Program draws array of two types of vehicles
public class TrafficDrawer extends JFrame
{
	private final int PLUS = 1;		//type one vehicle
	private final int MINUS = 2;	//type two vehicle
	
	private int[][] array;			//array of vehicles
	private int size;				//size of array
	
	/*******************************************************************/
	
	//constructor of trafficDrawer class
	public TrafficDrawer(int[][] array, int size)
	{
		setSize(5*size, 5*size);		//set window size to 5*size
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
										//standard window settings
		setVisible(true);
		
		this.array = array;				//set array to be drawn
		
		this.size = size;				//set array size
	}
	
	/*******************************************************************/
	
	//method paints window
	public void paint(Graphics g)
	{
		//go through array
		for (int i = 0; i < size; i++)
		{
			for (int j = 0; j < size; j++)
			{
				if (array[i][j] == PLUS)		//draw type one vehicle
				{
					g.setColor(Color.RED);
					g.fillRect(5*j, 5*i, 5, 5);
				}
				else if (array[i][j] == MINUS)	//draw type two vehicle
				{
					g.setColor(Color.GREEN);
					g.fillRect(5*j, 5*i, 5, 5);
				}
				else
				{
					g.setColor(Color.BLACK);	//draw empty location
					g.fillRect(5*j, 5*i, 5, 5);
				}
			}
		}
	}
	
	/*******************************************************************/
	
}
