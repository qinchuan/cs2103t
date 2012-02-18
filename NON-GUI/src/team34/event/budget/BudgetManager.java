package team34.event.budget;



import java.io.Serializable;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.LinkedList;

public class BudgetManager implements Serializable {

	
	private LinkedList<BudgetItem> studentInputBudgetItems;
	private double budget;
	private int highest_satisfaction;
	private byte [] currentKnapsack;
	private int numberOfItems;
	private LinkedList<BudgetPlan> budgetPlanPermutations;
	
	public BudgetManager()
	{
		studentInputBudgetItems=new LinkedList<BudgetItem>();
		budget=0.00;
		highest_satisfaction=0;
		budgetPlanPermutations=new LinkedList<BudgetPlan>();
	}
	
	public void resetSetting()
	{
		studentInputBudgetItems=new LinkedList<BudgetItem>();
		budget=0.00;
		highest_satisfaction=0;
		budgetPlanPermutations=new LinkedList<BudgetPlan>();
		numberOfItems=0;
		currentKnapsack=null;
	}
	public void setBudget(double budget)
	{
		this.budget=budget;
	}
	
	public void addBudgetItem(BudgetItem BI)
	{
		studentInputBudgetItems.add(BI);
	}
	
	public LinkedList<BudgetPlan> calculate()
	{	
		

		//initialize byte arrays for usage in computePermutation.
		initializeArrays();
		//optimize for later recursion
		Collections.sort( studentInputBudgetItems,Collections.reverseOrder());
		//compute the possibles permutation and send to includePermutationInStacks for filtering
		computePermutation(0,0.00,0);

		//print results and return to main function
		return getOutPut();


	}
	private void initializeArrays()
	{
		numberOfItems = studentInputBudgetItems.size();

		//initialize the knapsack arrays
		currentKnapsack = new byte[numberOfItems];
		for (int i=0; i<numberOfItems; i++)
		{

			currentKnapsack[i]=0;
		}
	}
	
	private void computePermutation(int depth, double currentPrice, int currentSat){
		if (currentPrice>budget) return;    


		if (currentPrice<=budget && currentSat>=highest_satisfaction)
		{
			highest_satisfaction=currentSat;

			includeToFinalPermutation();
		}
		if (depth<numberOfItems)
		{
			if (!checkType(depth))
			{
				currentKnapsack[depth]=1; // take, go left

				double newPrice=currentPrice+studentInputBudgetItems.get(depth).getPrice();
				int newSat=currentSat+studentInputBudgetItems.get(depth).getSatisfaction();

				computePermutation(depth+1, newPrice,newSat);
			}
			currentKnapsack[depth]=0; // don't take, go right

			computePermutation(depth+1, currentPrice, currentSat);
		}
	}
	
	private void includeToFinalPermutation()
	{
		BudgetPlan temp= new BudgetPlan();
		double price=0.00;
		int sat=0;


		//scan for the permutation for "1"..meaning it can be a possible choice and add to productList
		for (int i=0;i<numberOfItems;i++)
		{

			if (currentKnapsack[i]==1)
			{  
				temp.addProduct(studentInputBudgetItems.get(i));
				price+=studentInputBudgetItems.get(i).getPrice();
				sat+=studentInputBudgetItems.get(i).getSatisfaction();

			}
		}

		//set the total price and satisfaction for this permutation
		temp.setTotalPrice(price);
		temp.setTotalSat(sat);

		//add this permutation(productList) to the linkedlist while checking there are not duplicates. 
		//the equals is implemented in productlist.java
		if (budgetPlanPermutations.isEmpty())
		{

			budgetPlanPermutations.addFirst(temp);
		}
		else
		{

			boolean testDuplicate=false;
			for (BudgetPlan list:budgetPlanPermutations)
			{	
				if (list.equals(temp))
				{

					testDuplicate=true;
					break;
				}


			}
			if (!testDuplicate)
			{
				//System.out.println("b "+price);
				budgetPlanPermutations.addFirst(temp);
			}


		}
		temp=null;


	}
	

	private boolean checkType(int depth)
	{
		boolean check=false;
		for (int i=0; i<currentKnapsack.length; i++)
		{
			if (currentKnapsack[i]==1)
			{
				if (studentInputBudgetItems.get(depth).equals(studentInputBudgetItems.get(i)))
				{
					check=true;
					break;
				}
			}
		}
		return check;
	}
	
	private LinkedList<BudgetPlan> getOutPut()
	{
		
		DecimalFormat df = new DecimalFormat("#.##");
		Collections.sort(budgetPlanPermutations);
		
		double lowestPrice=Double.MAX_VALUE;
		LinkedList<BudgetPlan> recommended=new LinkedList<BudgetPlan>();

		for (BudgetPlan PLTemp: budgetPlanPermutations)
		{


			if (PLTemp.getTotalSat()==highest_satisfaction)
			{
				if (PLTemp.getTotalPrice()<=lowestPrice)
				{
					lowestPrice=PLTemp.getTotalPrice();
					recommended.add(PLTemp);

				}
				
			
			}

		}
		return recommended;
	}

	
}
