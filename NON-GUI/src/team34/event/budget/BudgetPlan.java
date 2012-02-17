package team34.event.budget;

import java.util.LinkedList;

public class BudgetPlan implements Comparable<BudgetPlan>,Cloneable {

	private LinkedList<BudgetItem> budgetPlan;
	private double totalPrice;
	private int totalSatisfaction;
	
	public BudgetPlan()
	{
		budgetPlan=new LinkedList<BudgetItem>();
		totalPrice=0.00;
		totalSatisfaction=0;
	}
	
	
	public void addProduct(BudgetItem BI)
	{
		budgetPlan.add(BI);
	}
	public void setTotalPrice(double totalPrice)
	{
		this.totalPrice=totalPrice;
	}
	public void setTotalSat(int totalSat)
	{
		this.totalSatisfaction=totalSat;
	}

	public LinkedList<BudgetItem> getProducts()
	{
		return budgetPlan;
	}
	public double getTotalPrice()
	{
		return totalPrice;
	}
	public int getTotalSat()
	{
		return totalSatisfaction;
	}
	
	//this one for qin chuan. to check if same type
		public boolean equals(BudgetPlan temp)
		{

			LinkedList<BudgetItem> tempBudgetPlan=temp.getProducts();
			if (budgetPlan.size()!= tempBudgetPlan.size())
			{
				return false;
			}
			else 
			{
				for (int i=0; i<budgetPlan.size(); i++)
				{
					if (!budgetPlan.get(i).getName().equals(tempBudgetPlan.get(i).getName()))
					{
						return false;
					}
				}
			}
			return true;
		}
		
		public int compareTo(BudgetPlan temp)
		{
			if (this.totalPrice>temp.getTotalPrice())
			{
				return 1;
			} else if (this.totalPrice==temp.getTotalPrice())
			{
				return 0; 
			} else 
			{
				return -1;
			}
		}
}
