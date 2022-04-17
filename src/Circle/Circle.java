/* Timothy Leung
B-Band
AP CSA */
class Circle
{
	private double radius;
	private double diameter;
	private double area;

	public void setRadius(double radius)
{
	this.radius = radius;
}
	public double getRadius()
{
	return radius;
}
public void setDiameter(double diameter)
{
	this.diameter = 2*radius;
}
public double computeDiameter()
{
	diameter = radius * 2;
	return diameter;
}
public void setArea(double area)
{
	this.area = area;
}
public double computeArea()
{
	area = 3.14*(radius*radius);
	return area;
}
}