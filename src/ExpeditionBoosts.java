
public class ExpeditionBoosts {
	private double gemBoost, relicBoost, keyBoost, orbBoost, scrollBoost;

	public ExpeditionBoosts(double gemBoost, double relicBoost,
			double keyBoost, double orbBoost, double scrollBoost) {
		this.gemBoost = gemBoost;
		this.relicBoost = relicBoost;
		this.keyBoost = keyBoost;
		this.orbBoost = orbBoost;
		this.scrollBoost = scrollBoost;
	}

	public double getGemBoost() {
		return gemBoost;
	}

	public double getRelicBoost() {
		return relicBoost;
	}

	public double getKeyBoost() {
		return keyBoost;
	}

	public double getOrbBoost() {
		return orbBoost;
	}

	public double getScrollBoost() {
		return scrollBoost;
	}
}
