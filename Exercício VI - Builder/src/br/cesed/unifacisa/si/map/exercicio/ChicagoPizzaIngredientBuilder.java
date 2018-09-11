package br.cesed.unifacisa.si.map.exercicio;

public class ChicagoPizzaIngredientBuilder extends PizzaBuilder 
{
	@Override
	public void createDough() 
	{
		pizza.Dough = "Thin Crust Dough";
	}

	@Override
	public void createSauce() 
	{
		pizza.Sauce = "Marinara Sauce";
	}

	@Override
	public void createCheese() 
	{
		pizza.Cheese = "Reggiano Cheese";
	}

	@Override
	public void createVeggies() 
	{
		pizza.Veggies.add("Black Olives");
		pizza.Veggies.add("Spinach Salad");
		pizza.Veggies.add("Eggplant Salad");	
	}

	@Override
	public void createPepperoni() 
	{
		pizza.Pepperoni = "Sliced Pepperoni";
	}

	@Override
	public void createClam() 
	{
		pizza.Clams = "Fresh Clams from Long Island Sound";
	}
}
