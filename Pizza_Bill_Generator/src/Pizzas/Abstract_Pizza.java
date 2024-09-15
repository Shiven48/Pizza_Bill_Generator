package Pizzas;

public abstract class Abstract_Pizza implements Pizza_Interface
{
	protected final int extracheese;
	protected final int extratopings;
	protected final int takeaways;
	protected final int pizza_type_price;
	
	
	public Abstract_Pizza(String type,boolean extracheese,boolean extratopings, boolean takeaways)
	{
		this.pizza_type_price = getType(type);
		this.extracheese = getCheese(extracheese);
		this.extratopings = getTopings(extratopings);
		this.takeaways = getTakeaways(takeaways);
	}
	
	
	private int getTakeaways(boolean takeaways) 
	{
		int takeaways_price = 0;
		if(takeaways)
		{
			takeaways_price += 20;
		}
		return takeaways_price;	}


	private int getTopings(boolean extratopings)
	{
		int topings_price = 0;
		if(extratopings)
		{
			topings_price += 50;
		}
		return topings_price;
	}


	private int getCheese(boolean extracheese) 
	{
		int cheese_price = 0;
		if(extracheese)
		{
			cheese_price += 50;
		}
		return cheese_price;
	}


	private int getType(String type)
	{
		String veg = Type.VEG.toString(); 
		int veg_nonveg_price = 0;
		if(!type.equals(veg))
		{
			veg_nonveg_price += 100;
		}
		return veg_nonveg_price;
	}


	abstract void generate_bill();

}
