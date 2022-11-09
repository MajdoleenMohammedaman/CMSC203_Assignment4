import java.lang.Object;

public class Property extends Object {
	
	private static String propertyName;
	private static String city;
	private static double rentAmount;
	private static String owner;
	private static Plot plot;
	
	public Property() {
		this.propertyName = "";
		this.city = "";
		this.rentAmount = 0.0;
		this.owner = "";
		this.plot = new Plot(0, 0, 1, 1);
	}
	
	public Property(String propertyName, String city, double rentAmount, String owner) {
		this.propertyName = propertyName;
		this.city = city;
		this.rentAmount = rentAmount;
		this.owner = owner;
	}
	
	public Property(String propertyName, String city, double rentAmount, String owner, int x, int y, int width, int depth) {
		this.propertyName = propertyName;
		this.city = city;
		this.rentAmount = rentAmount;
		this.owner = owner;
		this.plot = new Plot(x, y, width, depth);
	}
	
	public Property(Property otherProperty) {
		this.propertyName = otherProperty.propertyName;
		this.city = otherProperty.city;
		this.rentAmount = otherProperty.rentAmount;
		this.owner = otherProperty.owner;
		this.plot = otherProperty.plot;
	}

	public String getPropertyName() {
		return this.propertyName;
	}

	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}

	public static String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getRentAmount() {
		return this.rentAmount;
	}

	public void setRentAmount(double rentAmount) {
		this.rentAmount = rentAmount;
	}

	public String getOwner() {
		return this.owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public Plot getPlot() {
		return this.plot;
	}

	public void setPlot(int x, int y, int width, int depth) {
		this.plot = new Plot(x, y, width, depth);
	}

	@Override
	public String toString() {
		return this.propertyName + "," + this.city + "," + this.owner + "," + this.rentAmount;
	}
	
	

}
