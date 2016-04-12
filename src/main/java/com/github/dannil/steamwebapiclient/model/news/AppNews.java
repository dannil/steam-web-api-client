package com.github.dannil.steamwebapiclient.model.news;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppNews {

	@JsonProperty("appid")
	private int appId;

	@JsonProperty("newsitems")
	private List<NewsItem> newsItem;

	public AppNews() {
		this.newsItem = new ArrayList<NewsItem>();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AppNews [appId=");
		builder.append(this.appId);
		builder.append(", newsItem=");
		builder.append(this.newsItem);
		builder.append("]");
		return builder.toString();
	}

}
