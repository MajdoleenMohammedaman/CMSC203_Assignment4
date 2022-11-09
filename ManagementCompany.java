import java.lang.Object;
import java.util.Arrays;

public class ManagementCompany extends Object {
	
	private String name;
	private String taxID;
	private double mgmtFee;
	public static final int MAX_PROPERTY = 5;
	public static final int MGMT_WIDTH = 10;
	public static final int MGMT_DEPTH = 10;
	private Property[] properties;
	private Plot plot;
	private int numberOfProperties;
	
	public ManagementCompany() {
		this.name = "";
		this.taxID = "";
		this.mgmtFee = 0.0;
		this.numberOfProperties = 0;
		this.properties = new Property[MAX_PROPERTY];
		this.plot = new Plot(0, 0, 1, 1);
	}
	
	public ManagementCompany(String name, String taxID, double mgmtFee) {
		this.name = name;
		this.taxID = taxID;
		this.mgmtFee = mgmtFee;
	}
	
	public ManagementCompany(String name, String taxID, double mgmtFee, int x, int y, int width, int depth) {
		this.name = name;
		this.taxID = taxID;
		this.mgmtFee = mgmtFee;
		this.plot = new Plot(x, y, width, depth);
	}
	
	public ManagementCompany(ManagementCompany otherCompany) {
		this.name = otherCompany.name;
		this.taxID = otherCompany.taxID;
		this.mgmtFee = otherCompany.mgmtFee;
		this.numberOfProperties = otherCompany.numberOfProperties;
		this.properties = otherCompany.properties;
		this.plot = otherCompany.plot;
	}
	
	public int addProperty(String propertyName, String city, double rentAmount, String owner) {
		
		Property place = new Property(propertyName, city, rentAmount, owner);
		int sum = 0;
		
		for (int i = 0; i < this.properties.length; i++) {
			if (place.equals(null)) {
				sum = -2;
			}
			else if (this.properties[0].getPlot().encompasses(this.properties[i].getPlot())) {
				sum = -3;
			}
			else if (properties[i].getPlot().overlaps(properties[0].getPlot())) {
				sum = -4;
			}
			else if (properties.length == MAX_PROPERTY) {
				sum = -1;
			}
			else if (!properties[i].equals(null)) {
				properties[i] = place;
				sum = i;
			}
		}
		
		return sum;
	}
	
	public int addProperty(String propertyName, String city, double rentAmount, String owner, int x, int y, int width, int depth) {
		Property place = new Property(propertyName, city, rentAmount, owner, x, y, width, depth);
		int sum = 0;
		
		for (int i = 0; i < this.properties.length; i++) {
			if (place.equals(null)) {
				sum = -2;
			}
			else if (this.properties[0].getPlot().encompasses(this.properties[i].getPlot())) {
				sum = -3;
			}
			else if (properties[i].getPlot().overlaps(properties[0].getPlot())) {
				sum = -4;
			}
			else if (properties.length == MAX_PROPERTY) {
				sum = -1;
			}
			else if (!properties[i].equals(null)) {
				properties[i] = place;
				sum = i;
			}
		}
		
		return sum;
	}
	
	public int addProperty(Property property) {
		Property place = new Property(property);
		int sum = 0;
		
		for (int i = 0; i < MAX_PROPERTY; i++) {
			
			properties[i] = property;			
			if (property.equals(null)) {
				sum = -2;
			}
			else if (this.properties[0].getPlot().encompasses(this.properties[i].getPlot())) {
				sum = -3;
			}
			else if (properties[i].getPlot().overlaps(properties[0].getPlot())) {
				sum = -4;
			}
			else if (properties.length == MAX_PROPERTY) {
				sum = -1;
			}
			else if (!place.equals(null)) {
				properties[i] = place;
				sum = i;
			}
		}
		
		return sum;
		
	}
	
	public void removerLastProperty() { 
		
		Property newProp[] = Arrays.copyOf(properties, properties.length - 1);
		
		for (int i = 0; i < newProp.length; i++) {
			properties[i] = newProp[i];
		}
		
	}
	
	public boolean isPropertiesFull() {
		Property place = new Property();
		
		for (int i = 0; i < properties.length; i++) {
			properties[i] = place;
			if (place == null) {
				return false;
			} 
		}
		return true;
	}
	
	public int getPropertiesCount() {
		int num = 0;
		for (int i = 0; i < properties.length; i++) {
			if (properties[i] == null) {
				num++;
			}
		}
		return num;
	}
	
	public double getTotalRent() {
		double sum = 0.0;
		
		for (int i = 0; i < properties.length; i++) {
			sum += properties[i].getRentAmount();
		}
		return sum;
	}
	
	public Property getHighestRentProperty() {
		Property highestRent = null;
		
		for (int i = 0; i < properties.length; i++) {
			if (properties[i].getRentAmount() > properties[0].getRentAmount()) {
				highestRent = properties[i];
			}
		}
		return highestRent;
	}
	
	public boolean isManagementFeeValid() {
		if (mgmtFee <= 100 && mgmtFee >= 0) {
			return true;
		}
		return false;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTaxID() {
		return taxID;
	}

	public void setTaxID(String taxID) {
		this.taxID = taxID;
	}

	public double getMgmtFee() {
		return mgmtFee;
	}

	public void setMgmtFee(double mgmtFee) {
		this.mgmtFee = mgmtFee;
	}

	public Property[] getProperties() {
		return properties;
	}

	public void setProperties(Property[] properties) {
		this.properties = properties;
	}

	public Plot getPlot() {
		return plot;
	}

	public void setPlot(Plot plot) {
		this.plot = plot;
	}

	@Override
	public String toString() {
		String str = "List of the properties for " + Property.getCity() + ", taxID: " + taxID + "\n ___________________________________________"
				+ Arrays.toString(properties) + "\n _____________________________________________" + "total management Fee: " + mgmtFee;
		return str;
	}
	
	
}
