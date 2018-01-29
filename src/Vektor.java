
public class Vektor implements IVektor{
	
	private double x=0;
	private double y=0;
	
	@Override
	public double[] getCoords() {
		double[] temp = new double[2];
		temp[0]=x;
		temp[1]=y;
		
		return temp;
	}
	
	Vektor(double newx, double newy){
		x=newx;
		y=newy;
	}
	
	@Override
	public String toString() {
		return "x: "+x+" y: "+y;
	}
	
	@Override
	public double times(IVektor vector2) {
		
		double skalar = (x*vector2.getCoords()[0])+(y*vector2.getCoords()[1]);
		
		return skalar;
	}

	@Override
	public IVektor add(IVektor vector2) {
		double addx = (x+vector2.getCoords()[0]);
		double addy = (y+vector2.getCoords()[1]);
		Vektor temp = new Vektor(addx,addy);
		
		return temp;
	}

	@Override
	public Boolean equals(IVektor vector2) {
		if (Double.compare(x, vector2.getCoords()[0]) != 0) {
			return false;
		} else if (Double.compare(y, vector2.getCoords()[1]) != 0) {
			return false;
		}else {
			return true;
		}
	}

	
}
