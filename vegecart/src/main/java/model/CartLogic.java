package model;

public class CartLogic {
	public void execute(Cart cart,Vegetable vage){
	cart.getList().add(vage);
	cart.setTotal(cart.getTotal()+vage.getPrice());
	}	
}
