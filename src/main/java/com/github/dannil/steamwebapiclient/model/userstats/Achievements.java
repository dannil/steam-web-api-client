package com.github.dannil.steamwebapiclient.model.userstats;

public class Achievements {

	private String name;
	private double percent;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPercent() {
		return this.percent;
	}

	public void setPercent(double percent) {
		this.percent = percent;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder(128);
		builder.append("Achievements [name=");
		builder.append(this.name);
		builder.append(", percent=");
		builder.append(this.percent);
		builder.append(']');
		return builder.toString();
	}

}
