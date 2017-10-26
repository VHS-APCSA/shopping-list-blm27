import java.awt.ItemSelectable;

public class Item 
{
	private String item;
	private double cost;
	private int quantity;
	public Item()
	{
		this.item = "";
		this.cost = 0.0;
		this.quantity = 0;
	}
	public Item(String item, double cost, int quantity)
	{
		this.item = item;
		this.cost = cost;
		this.quantity = quantity;
	}
	public void setItem(String item)
	{
		this.item = item;
	}
	public String getItem()
	{
		return item;
	}
	public void setCost(double cost)
	{
		this.cost = cost;
	}
	public double getCost()
	{
		return cost;
	}
	public void setQuantity(int quantity)
	{
		this.quantity = quantity;
	}
	public int getQuantity()
	{
		return quantity;
	}
	@Override
    public String toString() 
    {
      String str = "";
     
      String item = getItem();
      double cost = getCost();
      int quantity = getQuantity();

      str = item + ": " + quantity + " @" + cost + "= " + (quantity*cost);
      return str;
	}
	public void increaseQuantity(int incQuantity)
	{
		quantity += incQuantity;
	}
	
}
