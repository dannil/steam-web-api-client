package com.github.dannil.steamwebapiclient.model.news;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AppNews {

	private int appId;

	@JsonProperty("newsitems")
	private List<NewsItems> newsItems;

	public AppNews() {
		this.newsItems = new ArrayList<NewsItems>();
	}

}
