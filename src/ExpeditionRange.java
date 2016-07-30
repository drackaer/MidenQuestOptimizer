
public class ExpeditionRange {
	private Double min,max;
	private ResourceType type;
	private Expedition exp;
	public static final double MIN_MULTIPLIER = 0.3;

	public ExpeditionRange(ResourceType type, Expedition exp) {
		this.type = type;
		this.exp = exp;
	}

	public double getMin() { 
		if (min == null) { min = getMax() * MIN_MULTIPLIER; }
		return min;
	}
	
	public double getMax() {
		if (max == null) { max = Math.round(exp.getBaseAmount(type)) + exp.getBoostAmount(type); }
		return max;
	}
	
	public ResourceType getType() { return type; }
	
	public String getRangeString() {
		return type + ":\t" + ((int) Math.floor(getMin())) + "-" + Math.round(getMax());
	}
}
