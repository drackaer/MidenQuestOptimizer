
public class AmountOptimizer {
	private double level, efficiency, kingdom, global;
	
	public AmountOptimizer(double level, double efficiency, double kingdom, double global) {
		this.level = level;
		this.efficiency = efficiency;
		this.kingdom = kingdom;
		this.global = global;
	}
	
	public double amountCalc (double relics, double gem) {
		return (level + efficiency + relics) * kingdom * gem * global;
	}
}
