import java.util.Scanner;
public class ItemRunner 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		ItemList list = new ItemList();
		String item = "";
		double cost = 0.0;
		int quantity = 0;
		while(quantity >=0)
		{
			System.out.println("First, input your item, then cost, and finally quantity." + " Enter -1 when finished");
			item = input.next();
			cost = input.nextDouble();
			quantity = input.nextInt();
			if(quantity >= 0)
			{
				list.addItem(new Item(item, cost, quantity));
			}
		}
		Item expensive = list.mostExpensive();
		System.out.println(expensive);
		
		
	}
}
