import java.util.*;
abstract class GeometricShape{ 
	protected GeometricShape(){

	}

	abstract public void getArea(); 
	abstract public void getPerimeter();
}

class Oval extends GeometricShape{ 
	public int MajorAxis;
	public int MinorAxis;

	public int getMajorAxis() { 
		return MajorAxis;

	}
	public void setMajorAxis(int MajorAxis) { 
		this.MajorAxis = MajorAxis;
	}
	public int getMinorAxis() {
		return MinorAxis;
	}
	public void setMinorAxis(int MinorAxis) { 
		this.MinorAxis = MinorAxis;
	}
	@Override
	public String toString(){
		return " "+MajorAxis+" "+MinorAxis+" ";

	}
	@Override
	public void getArea(){
		double getArea = Math.PI*(MajorAxis/2)*(MinorAxis/2); 
		System.out.println("Area of an Oval:"+getArea);
}
	@Override
	public void getPerimeter(){

		double getPer=2*Math.PI*Math.sqrt((MajorAxis+MinorAxis)/2); 
		System.out.println("Circumference of an Oval:"+getPer);

	}
}
class Circle extends Oval {


	protected Circle(int radius){ 
		double getCir = Math.PI*radius*radius;
		System.out.println("Circle area:"+getCir);
}
}
public class TEST04 {

	public static void main(String[] args) {
		Oval oval1 =new Oval(); 
		oval1.setMajorAxis(8); 
		oval1.setMinorAxis(5);
		System.out.println("Oval major axis: "+oval1.getMajorAxis());
		System.out.println("Oval minor axis: "+oval1.getMinorAxis()); 
		oval1.getArea();
		oval1.getPerimeter();
		System.out.println();
		Circle circle1=new Circle(7);


    }	
}

