package team34.event.budget;



public class BudgetItem implements Comparable<BudgetItem>,Cloneable {

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
	public void setType(String type)
	{
		this.type=type;
	}
	public String getType()
	{
		return this.type;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setPrice(double price)
	{
		this.price=price;
	}
	public double getPrice()
	{
		return price;
	}
	public void setSatisfaction(int satisfaction)
	{
		this.satisfaction=satisfaction;
	}
	public int getSatisfaction()
	{
		return satisfaction;
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
	public Object clone()
	{
		try {
			return super.clone();
			
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
		System.out.println("Cloning not allowed."); 
			return null;
		}
	}
	
}
