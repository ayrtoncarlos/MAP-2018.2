package br.cesed.unifacisa.si.map.exercicio;

public class NewYorkIngredientBuilder extends PizzaBuilder 
{
	@Override
	public void createDough() 
	{
		pizza.Dough = "Thick Crust Dough";
	}

	@Override
	public void createSauce() 
	{
		pizza.Sauce = "Plum Tomato Sauce";
	}

	@Override
	public void createCheese() 
	{
		pizza.Cheese = "Mozzarella Cheese";
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
		pizza.Clams = "Frozen Clams from Long Island Sound";
	}
}
