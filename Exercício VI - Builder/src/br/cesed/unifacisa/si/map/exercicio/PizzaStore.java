package br.cesed.unifacisa.si.map.exercicio;

public class PizzaStore 
{
	protected PizzaBuilder pizzaiolo;
		
	public PizzaStore(PizzaBuilder pizzaiolo) 
	{
		this.pizzaiolo = pizzaiolo;
	}
	
	public void prepararPizza() 
	{
		pizzaiolo.createDough();
		pizzaiolo.createSauce();
		pizzaiolo.createCheese();
		pizzaiolo.createVeggies();
		pizzaiolo.createPepperoni();
		pizzaiolo.createClam();
	}
	
	public PizzaProduct getPizza() 
	{
		return pizzaiolo.getPizza();
	}
}
