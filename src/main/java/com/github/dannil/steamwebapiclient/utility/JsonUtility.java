/*
 * Copyright 2016 Daniel Nilsson
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.dannil.steamwebapiclient.utility;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.github.dannil.steamwebapiclient.exception.SteamWebAPIClientException;

/**
 * Utility class for converting Steam WWeb API JSON responses to Java objects
 */
public class JsonUtility {

	private ObjectMapper mapper;

	public static JsonUtility newInstance(PropertyNamingStrategy s) {
		ObjectMapper objectMapper = new ObjectMapper().setPropertyNamingStrategy(s);
		return new JsonUtility(objectMapper);
	}

	private JsonUtility(ObjectMapper objectMapper) {
		this.mapper = objectMapper;
	}

	// static {
	// mapper = new ObjectMapper();
	// mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
	// }

	private JsonUtility() {

	}

	private JsonNode readTree(String json) {
		try {
			return this.mapper.readTree(json);
		} catch (IOException e) {
			throw new SteamWebAPIClientException(e);
		}
	}

	public <T> T convertValue(String json, Class<T> clazz) {
		JsonNode node = readTree(json);

		Iterator<String> it = node.fieldNames();
		String first = it.next();

		node = node.get(first);

		return this.mapper.convertValue(node, clazz);
	}

	public <T> List<T> convertValueToList(String json, int numberOfElementsToSkip, Class<T> clazz) {
		JsonNode node = readTree(json);

		for (int i = 0; i < numberOfElementsToSkip; i++) {
			Iterator<String> it = node.fieldNames();
			String first = it.next();
			node = node.get(first);
		}

		JavaType type = this.mapper.getTypeFactory().constructCollectionType(List.class, clazz);

		return this.mapper.convertValue(node, type);
	}

}
