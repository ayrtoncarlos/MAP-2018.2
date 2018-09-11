package br.cesed.unifacisa.si.map.exercicio;

public class Client 
{
	public static void main(String[] args) 
	{
		PizzaStore pizzaria = new PizzaStore(new NewYorkIngredientBuilder());
		
		pizzaria.prepararPizza();
		
		PizzaProduct pizza = pizzaria.getPizza();
		
		System.out.println("Pizza NY\n");
		System.out.println("	Dough: " + pizza.Dough);
		System.out.println("	Sauce: " + pizza.Sauce);
		System.out.println("	Cheese: " + pizza.Cheese);
		System.out.println("	Pepperoni: " + pizza.Pepperoni);
		System.out.println("	Clams: " + pizza.Clams);
	}
}
