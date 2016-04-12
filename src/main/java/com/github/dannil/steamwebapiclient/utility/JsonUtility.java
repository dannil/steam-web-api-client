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

	public static <T> T convertValue(String json, Class<T> clazz) {
		try {
			JsonNode node = mapper.readTree(json);

			Iterator<String> it = node.fieldNames();
			String first = it.next();

			node = node.get(first);
			return mapper.convertValue(node, clazz);
		} catch (IOException e) {
			throw new SteamWebAPIClientException(e);
		}
	}

}
