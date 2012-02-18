package team34.event.budget;

import java.io.Serializable;



public class BudgetItem implements Comparable<BudgetItem>,Serializable {

	private String name ;
	private String type;
	
	
	private int quantity;
	private int satisfaction;
	private double price;
	
	public BudgetItem()
	{
		name="";
		type="";
		quantity=0;
		satisfaction=0;
		price=0.0;
	}
	public int getQuantity()
	{
		return this.quantity;
	}
	public String getName()
	{
		return this.name;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public String getType()
	{
		return this.type;
	}
	public int getSatisfaction()
	{
		return satisfaction;
	}
	
	protected void setType(String type)
	{
		this.type=type;
	}
	protected void setName(String name)
	{
		this.name=name;
	}
	
	protected void setPrice(double price)
	{
		this.price=price;
	}
	
	protected void setSatisfaction(int satisfaction)
	{
		this.satisfaction=satisfaction;
	}
	
	public void setQuantity(int quantity)
	{
		this.quantity=quantity;
	}
	
	public int compareTo(BudgetItem BI)
	{
		double sOverP1=this.price/(double)this.satisfaction;
		double sOverP2=BI.getPrice()/(double)BI.getSatisfaction();
		if (sOverP1>sOverP2)
		{
			return 1;
		}
		else if (sOverP1==sOverP2)
		{
			return 0;
		}
		else return -1;
	}
	
	
}
