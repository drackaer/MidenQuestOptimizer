
public class Optimizer {
	
	
	public static void main(String args[]) {
		//System.out.println(relicAmountCalc(26, 40));
		//System.out.println(gemAmountCalc(26, 150));
		//amountOptimizer();
		expeditionOptimizer();
	}
	
	public static void amountOptimizer() {
		double level, efficiency, relics, kingdom, gem;
		int global;
		
		level = 5.34;
		efficiency = 0.68;
		relics = 1.00;
		kingdom = 1.0;
		gem = 1.18;
		global = 1;
		
		int relicCost = 200000;
		int gemCost = 12000000;
		
		int numSteps = 1;
		
		AmountOptimizer opt = new AmountOptimizer(level, efficiency, kingdom, global);
		for (double i = 1.0; i < numSteps+1; i++) { //Note the cost needs to be fixed for more than 1 step and formatting!
			System.out.print(opt.amountCalc(relics+(i*0.15), gem) + " at cost: " + relicAmountCalc(68,10)*relicCost + "\t");
			System.out.println(opt.amountCalc(relics, gem+(i/100)) + " at cost: " + gemAmountCalc(18,19)*gemCost);
		}
	}
	
	public static int relicAmountCalc(int startCost, int numSteps) {
		return relicAmountCalc(startCost, startCost, numSteps);
	}
	
	private static int relicAmountCalc(int startCost, int curCost, int numSteps) {
		if (numSteps == 1) {
			return curCost;
		} else {
			return relicAmountCalc(startCost+1,curCost+startCost+1,numSteps-1);
		}
	}
	
	public static int gemAmountCalc(int startAmount, int targetAmount) {
		int cost = 5 + (startAmount/5);
		int totalCost = 0;
		int curAmount = startAmount;
		while (curAmount != targetAmount) {
			curAmount++;
			totalCost += cost;
			if (curAmount%5 == 0) { cost++; }
		}
		return totalCost;
	}
	
	public static void expeditionOptimizer() {
		int warrior = 3;
		int hunter = 3;
		int mage = 3;
		int healer = 3;
		
		double gemBoost = 0.032;
		double relicBoost = 0.645;
		double keyBoost = 0.0;
		double orbBoost = 0.0;
		double scrollBoost = 0.0;
		
		ExpeditionLevels levels = new ExpeditionLevels(warrior, hunter, mage, healer);
		ExpeditionBoosts boosts = new ExpeditionBoosts(gemBoost, relicBoost, keyBoost, orbBoost, scrollBoost);
		Expedition exp = new Expedition(levels, boosts);
		
		ExpeditionRange relicRange, gemRange, keyRange, orbRange, scrollRange;
		relicRange = new ExpeditionRange(ResourceType.RELIC, exp);
		gemRange = new ExpeditionRange(ResourceType.GEM, exp); 
		keyRange = new ExpeditionRange(ResourceType.KEY, exp);
		orbRange = new ExpeditionRange(ResourceType.ORB, exp);
		scrollRange = new ExpeditionRange(ResourceType.SCROLL, exp);
		
		System.out.println(gemRange.getRangeString());
		System.out.println(relicRange.getRangeString());
		System.out.println(keyRange.getRangeString());
		System.out.println(orbRange.getRangeString());
		System.out.println(scrollRange.getRangeString());
	}
	
	public static void chanceOptimizer() {
			
	}
}
