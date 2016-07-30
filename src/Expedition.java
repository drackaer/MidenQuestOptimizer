
public class Expedition {
	private ExpeditionLevels levels;
	private ExpeditionBoosts boosts;
	public static final double RELIC_BASE_ADDITION = 1.86;
	public static final double RELIC_MAX_MULTIPLIER = 1.3;
	public static final double GEM_MAX_MULTIPLIER = 1.0/5.0;
	public static final double KEY_ORB_SCROLL_MAX_MULTIPLIER = 1.0/15.0;

	public Expedition(ExpeditionLevels levels, ExpeditionBoosts boosts) {
		this.levels = levels;
		this.boosts = boosts;
	}
	
	public int getExpeditionLevel() { return levels.getTotalExpeditionLevel(); }
	
	public double getBoostAmount(ResourceType type) {
		double retVal = 0;
		switch (type) {
			case RELIC:
				retVal = boosts.getRelicBoost()*(levels.getWarriorLevel()+levels.getHunterLevel());
				break;
			case KEY:
				retVal = boosts.getKeyBoost()*(levels.getHealerLevel()+levels.getHunterLevel());
				break;
			case GEM:
				retVal = boosts.getGemBoost()*(levels.getWarriorLevel()+levels.getMageLevel());
				break;
			case ORB:
				retVal = boosts.getOrbBoost()*(levels.getMageLevel()+levels.getHealerLevel());
				break;
			case SCROLL:
				retVal = boosts.getScrollBoost()*(levels.getMageLevel()+levels.getHunterLevel());
				break;
		}
		return retVal;
	}
	
	public double getBaseAmount(ResourceType type) {
		double retVal = 0;
		
		switch (type) {
			case RELIC:
				retVal = (levels.getTotalExpeditionLevel()+RELIC_BASE_ADDITION)*RELIC_MAX_MULTIPLIER;
				break;
			case GEM:
				retVal = levels.getTotalExpeditionLevel()*GEM_MAX_MULTIPLIER;
				break;
			case KEY:
			case ORB:
			case SCROLL:
				retVal = levels.getTotalExpeditionLevel()*KEY_ORB_SCROLL_MAX_MULTIPLIER;
				break;
		}
		
		return retVal;
	}
	
}
