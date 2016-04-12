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
import com.github.dannil.steamwebapiclient.exception.SteamWebAPIClientException;

/**
 * Utility class for converting JSON to Java objects
 */
public class JsonUtility {

	private static ObjectMapper mapper;

	static {
		mapper = new ObjectMapper();
	}

	private JsonUtility() {

	}

	private static JsonNode readTree(String json) {
		try {
			return mapper.readTree(json);
		} catch (IOException e) {
			throw new SteamWebAPIClientException(e);
		}
	}

	public static <T> T convertValue(String json, Class<T> clazz) {
		JsonNode node = readTree(json);

		Iterator<String> it = node.fieldNames();
		String first = it.next();

		node = node.get(first);

		return mapper.convertValue(node, clazz);
	}

	public static <T> List<T> convertValueToList(String json, Class<T> clazz) {
		JsonNode node = readTree(json);

		Iterator<String> it = node.fieldNames();
		String first = it.next();
		node = node.get(first);

		it = node.fieldNames();
		String second = it.next();
		node = node.get(second);

		JavaType type = mapper.getTypeFactory().constructCollectionType(List.class, clazz);

		return mapper.convertValue(node, type);
	}

}
