
public class ExpeditionLevels {
	private int warriorLevel, hunterLevel, mageLevel, healerLevel;

	public ExpeditionLevels(int warrior, int hunter, int mage, int healer) {
		this.warriorLevel = warrior;
		this.hunterLevel = hunter;
		this.mageLevel = mage;
		this.healerLevel = healer;
	}

	public int getWarriorLevel() {
		return warriorLevel;
	}

	public int getHunterLevel() {
		return hunterLevel;
	}

	public int getMageLevel() {
		return mageLevel;
	}

	public int getHealerLevel() {
		return healerLevel;
	}
	
	public int getTotalExpeditionLevel() { return warriorLevel+mageLevel+healerLevel+hunterLevel; }
}
