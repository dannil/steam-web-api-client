package com.github.dannil.steamwebapiclient.model.news;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppNews {

	@JsonProperty("appid")
	private int appId;

	@JsonProperty("newsitems")
	private List<NewsItems> newsItems;

	public AppNews() {
		this.newsItems = new ArrayList<NewsItems>();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AppNews [appId=");
		builder.append(this.appId);
		builder.append(", newsItems=");
		builder.append(this.newsItems);
		builder.append("]");
		return builder.toString();
	}

}
