package com.github.dannil.steamwebapiclient;

import java.util.HashMap;
import java.util.Map;

import com.github.dannil.steamwebapiclient.builder.UrlBuilder;

public class SteamWebAPIClient {

	private String baseUrl;

	public SteamWebAPIClient() {
		this.baseUrl = "http://api.steampowered.com/";
	}

	public String getNewsForApp(Integer appId, Integer count, Integer maxLength) {
		String interfaceUrl = this.baseUrl + "ISteamNews/GetNewsForApp/v0002/?";

		Map<String, String> parameters = new HashMap<String, String>();
		parameters.put("appid", String.valueOf(appId));
		parameters.put("count", String.valueOf(count));
		parameters.put("maxlength", String.valueOf(maxLength));

		return UrlBuilder.build(interfaceUrl, parameters);
	}
}
