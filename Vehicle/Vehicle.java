package Vehicle;

public class Vehicle {

	private int id;
	private String name;
	private String color;
	private double price;
	public static double discount;
	public Vehicle() {
		this.id=00;
		this.name="Car";
		this.color="Black";
		this.price=10000;
	}
	public Vehicle(int id,String name,String color,double price) {
		this.id=id;
		this.name=name;
		this.color=color;
		this.price=price;
	}
	static {
		discount=10000;
	}
	@Override
	public String toString() {
		return "Vehicle [Id=" + id + ", Name=" + name + ", Color=" + color + ", Price=" + price + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	

}
