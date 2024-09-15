package Pizzas;

import java.util.Scanner;

public class App 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		try 
		{
			String Base_Delux = "";
			boolean extracheese = false;
			boolean extratopings = false;
		    boolean takeaways = false;
			String pizza_veg_nonveg = "";
			
			System.out.println(" - - - - - - - - - - - - - - - - - - - - ");
			System.out.println("Which Type of Pizza do you want ? ");
			System.out.println("1. Base");
			System.out.println("2. Delux");
			Base_Delux = sc.next();
			System.out.println();
			System.out.println("Do you want a Veg or a Non-veg pizza (Please Reply in veg/nonveg) : ");
			pizza_veg_nonveg = sc.next();
			System.out.println();
			System.out.println("Do you want add extra cheese on your Pizza? (true/false): ");
			extracheese = sc.nextBoolean();
			System.out.println();
			System.out.println("Do you want add extra topings on your Pizza? (true/false): ");
			extratopings = sc.nextBoolean();
			System.out.println();
			System.out.println("Do you want  your Pizza? (true/false): ");
			takeaways = sc.nextBoolean();
			
			switch(Base_Delux)
			{
				case "Base" : 
							System.out.println("Base Pizza Selected !");
							Abstract_Pizza base = new Base_Pizza(pizza_veg_nonveg,extracheese,extratopings,takeaways);
							base.generate_bill();
							break;
					
				case "Delux" : 
							System.out.println("Base Pizza Selected !");
							Abstract_Pizza delux = new Delux_Pizza(pizza_veg_nonveg,extracheese,extratopings,takeaways);
							delux.generate_bill();
							break;
			}
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			sc.close();
			System.out.println("Thank You!!");
		}
	}

}
