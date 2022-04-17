/* Timothy Leung
B-Band
AP CSA */
public class TestCircle
{
	public static void main(String args[])
	{

				Circle One=new Circle();
				One.setRadius(5);

				Circle Two=new Circle();
				Two.setRadius(10);

				Circle Three=new Circle();
				Three.setRadius(1);

				System.out.println("Circle One with a radius of " + One.getRadius() + " has a diameter of " + One.computeDiameter() + " and an area of " + One.computeArea());
				System.out.println("Circle Two with a radius of " + Two.getRadius() + " has a diameter of " + Two.computeDiameter() + " and an area of " + Two.computeArea());
				System.out.println("Circle Three with a radius of " + Three.getRadius() + " has a diameter of " + Three.computeDiameter() + " and an area of " + Three.computeArea());


			}
		}