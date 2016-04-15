package com.github.dannil.steamwebapiclient.model.news;

import java.util.ArrayList;
import java.util.List;

public class AppNews {

	private int appId;

	private List<NewsItem> newsItems;

	public AppNews() {
		this.newsItems = new ArrayList<NewsItem>();
	}

	public int getAppId() {
		return this.appId;
	}

	public void setAppId(int appId) {
		this.appId = appId;
	}

	public List<NewsItem> getNewsItems() {
		return this.newsItems;
	}

	public void setNewsItems(List<NewsItem> newsItems) {
		this.newsItems = newsItems;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder(128);
		builder.append("AppNews [appId=");
		builder.append(this.appId);
		builder.append(", newsItem=");
		builder.append(this.newsItems);
		builder.append(']');
		return builder.toString();
	}

}
