package Pizzas;

public class Delux_Pizza extends Abstract_Pizza
{
private int pizza_price = 200;
	
	public Delux_Pizza(String type, boolean extracheese, boolean extratopings, boolean takeaways) 
	{
		super(type, extracheese, extratopings, takeaways);
	}

	@Override
	public void generate_bill() 
	{
		System.out.println();
		System.out.println(" - - - - - - - - - - - - - - - - - - - - ");
		System.out.println("   Delux Pizza Price  - "+this.pizza_price);
		System.out.println("   Veg/Non-Veg Price  - "+pizza_type_price);
		System.out.println("   Extra Cheese       - "+extracheese);
		System.out.println("   Extra Topings      - "+extratopings);
		System.out.println("   TakeAways          - "+takeaways);
		System.out.println(" - - - - - - - - - - - - - - - - - - - - ");
		System.out.println();
		int bill = this.pizza_price+pizza_type_price+extracheese+extratopings+takeaways;
		System.out.println("The Bill is - "+bill);
	}

}
