package com.github.dannil.steamwebapiclient.builder;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;

public class UrlBuilder {

	public static String build(String interfaceUrl, Map<String, String> parameters) {
		StringBuilder builder = new StringBuilder(interfaceUrl);
		for (Entry<String, String> entry : parameters.entrySet()) {
			if (!Objects.equals(entry.getValue(), "null")) {
				builder.append(entry.getKey() + "=" + entry.getValue() + "&");
			}
		}
		builder.append("format=json");
		return builder.toString();
	}

}
