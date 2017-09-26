# ShoppingList
Create a class named Item with three instance variables
  a String named item
  a double named cost
  an int named quantity
Write a default constructor, a constructor that takes parameters and get and set methods.
Write a toString method that returns a String of the form
item: quantity @ cost = quantity * cost. An example string would look like this
"Apples: 5 @ $0.75 = $3.75"
Write an increaseQuantity() method that takes an int parameter and increases quantity by that amount.

Create a class name ItemList that has a single instance variable, an ArrayList that hold Item objects.
Write a constructor to initialize the list
Write an addItem() method that takes an Item object as a parameter and adds it to the list.
Write a mostExpensive() method that looks through the list and returns the most expensive item.

Write a Runner class that 
  uses a Scanner to take user input with a while() loop to add Items to the list.
  runs the mostExpensive() method on the List class and stores an Item object
  uses the toString method to print the item details
