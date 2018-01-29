
public interface IVektor {
	String toString();
	double times(IVektor vector2);
	double[] getCoords();
	IVektor add(IVektor vector2);
	Boolean equals(IVektor vector2);
}
