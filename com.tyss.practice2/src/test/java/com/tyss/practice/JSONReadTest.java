package com.tyss.practice;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Iterator;
import java.util.Map;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JSONReadTest {

	public static void main(String[] args) throws Exception {
		
		FileReader file = new FileReader(".\\src\\test\\resources\\JSONReader.json");
		
		JSONParser jParser = new JSONParser();
		
		Object obj = jParser.parse(file);
		
		Map map = (JSONObject)obj;

		System.out.println(map);
		System.out.println(map.get("browser"));
		System.out.println(map.get("url"));
		System.out.println(map.get("username"));
		System.out.println(map.get("password"));
	}
}
