import java.util.ArrayList;
public class ItemList 
{
	private ArrayList<Item> items;
	public ItemList()
	{
		items = new ArrayList<Item>();
	}
	public void addItem(Item item)
	{
		items.add(item);
	}
	public Item mostExpensive()
	{
		Item expensive = items.get(0);
		for(Item item : items)
		{
			if(item.getCost() > expensive.getCost())
			{
				expensive = item;
			}
		}
		return expensive;
	}
}
