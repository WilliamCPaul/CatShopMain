package catalogue;

import java.io.Serializable;
import java.util.Collections;

/**
 * Write a description of class BetterBasket here.
 * 
 * @author  Your Name 
 * @version 1.0
 */
public class BetterBasket extends Basket implements Serializable
{
  private static final long serialVersionUID = 1L;
  
  @Override
  public boolean add( Product pr )
  {  
	  for(int i=0;i<this.size();i++) {
		  if(this.get(i).getProductNum().equals(pr.getProductNum())) {
			  this.get(i).setQuantity(this.get(i).getQuantity()+pr.getQuantity());
			  return true;
		  }
	  }
	  super.add(pr);
	  return true;
  };
  
  public boolean remove(Product pr) {
	  for(int i=0;i<this.size();i++) {
		  if(this.get(i).getProductNum().equals(pr.getProductNum())) {
			  this.get(i).setQuantity(this.get(i).getQuantity()-pr.getQuantity());
			  if(this.get(i).getQuantity() < 1) {
				  this.remove(i);
				  return true;
			  }
		  }
	  }
	return false;
  }
};