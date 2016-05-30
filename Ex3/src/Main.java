import java.awt.Color;
import java.util.Random;



public class Main {
	//public static Robot[] robots = new Robot[10];
	public static void main(String[] args) {
		RobotRoom room = null;
		room = new RobotRoom();
		Random rand = new Random();

		int  n = rand.nextInt(500) + 5;
		for (int i = 0; i < n; i++) 
		{
			room.setColor(Rand.randome(19), Rand.randome(19),Color.gray );
		}
		n = rand.nextInt(30) + 5;

		for(int i = 0 ; i < n ; i++ )
		{
			int colo = Rand.randome(19);
			int rows = Rand.randome(19);
			if(!((room.getColor(rows, colo).equals(Color.gray)))) room.setColor(rows, colo, Color.black);
			else i = i-1;

		}


		for (int i = 0; i < 20; i++) 
		{
			int colo = Rand.randome(19);
			int rows = Rand.randome(19);
			if(room.getColor(rows, colo).equals(Color.black)) i = i-1;
			else 
			{
				RobotRoom.robots.add(new Robot(rows, colo,Rand.randome(3),room));
				RobotRoom.robots.get(i).setIndex(i);
			}

			//room.addRobot(robots[i], Rand.randome(19,10),Rand.randome(19,10));
		}


		RobotRoom.UpdateRobots();

	}

}
