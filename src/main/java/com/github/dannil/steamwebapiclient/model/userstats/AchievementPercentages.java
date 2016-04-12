package com.github.dannil.steamwebapiclient.model.userstats;

import java.util.ArrayList;
import java.util.List;

public class AchievementPercentages {

	private List<Achievement> achievements;

	public AchievementPercentages() {
		this.achievements = new ArrayList<Achievement>();
	}

	public List<Achievement> getAchievements() {
		return this.achievements;
	}

	public void setAchievements(List<Achievement> achievements) {
		this.achievements = achievements;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AchievementPercentages [achievements=");
		builder.append(this.achievements);
		builder.append("]");
		return builder.toString();
	}

}
