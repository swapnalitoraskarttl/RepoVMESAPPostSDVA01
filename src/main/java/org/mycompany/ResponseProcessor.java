package org.mycompany;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.apache.cxf.message.MessageContentsList;
import org.apache.log4j.Logger;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ResponseProcessor implements Processor {

	Logger log = Logger.getLogger(ResponseProcessor.class);

	@Override
	public void process(Exchange exchange) throws Exception {
		try {
			Message inMessage = exchange.getIn();

			// System.out.println("**************IN process*********");
			String ROUTE = null;
			String TCODE = null;

			ROUTE = (String) inMessage.getHeader("ROUTE", String.class);
			TCODE = (String) inMessage.getHeader("TCODE", String.class);

			String jsonString = null;
			String tentResponse = null;

			// System.out.println("api1_status---" + api1_status);
			// System.out.println("doc_type----" + doc_type);
			// System.out.println("statusCode----" + statusCode);
			ObjectMapper objectMapper = new ObjectMapper();

			// System.out.println("**************IN process******** 101 both API");
			HashMap<String, ArrayList<HashMap<String, String>>> map1 = new HashMap<>();
			map1 = (HashMap<String, ArrayList<HashMap<String, String>>>) inMessage.getHeader("responseBody");

			
			// System.out.println("rcBody : " + map2);

			// map1.putAll(map2);

			System.out.println("Combine Body : " + map1);

			jsonString = objectMapper.writeValueAsString(map1);

			System.out.println("JsonSTring : " + jsonString);

			tentResponse = "{\"ROUTE\":\"" + ROUTE + "\",\"ItOrder\":" + jsonString + ",\"TCODE\":\"" + TCODE + "\"}";

			 System.out.println("tentResponse : " + tentResponse);
			
			inMessage.setHeader(Exchange.CONTENT_TYPE, "application/json");
			MessageContentsList req = new MessageContentsList();
			req.add(tentResponse);
			System.out.println("bodyPara" + req);
			inMessage.setBody(req);

		} catch (Exception e) {
			log.error("Exception in process()", e);
		}

	}
}
