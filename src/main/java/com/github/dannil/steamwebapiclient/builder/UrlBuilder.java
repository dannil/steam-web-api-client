package com.github.dannil.steamwebapiclient.builder;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;

public class UrlBuilder {

	private UrlBuilder() {

	}

	public static String build(String interfaceUrl, Map<String, String> parameters) {
		parameters.put("format", "json");

		StringBuilder builder = new StringBuilder(interfaceUrl);
		builder.append('?');
		int i = 0;
		for (Entry<String, String> entry : parameters.entrySet()) {
			if (!Objects.equals(entry.getValue(), "null")) {
				builder.append(entry.getKey());
				builder.append('=');
				builder.append(entry.getValue());
				if (i < parameters.size() - 1) {
					builder.append('&');
				}
			}
			i++;
		}
		// System.out.println(builder.toString());
		return builder.toString();
	}

}
