package com.tyss.practice;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONReaderArrayTest {

	public static void main(String[] args) throws IOException, ParseException {
		FileReader file = new FileReader(".\\src\\test\\resources\\JSONReaderArray.json");
		
		JSONParser jParser = new JSONParser();
		
		JSONArray jArray = (JSONArray)jParser.parse(file);
		
		Iterator<JSONObject> itr = jArray.iterator();
		while (itr.hasNext()) {
		JSONObject jObj = itr.next();
		System.out.println(jObj.get("username"));
		System.out.println(jObj.get("password"));	
		}
	}

}
