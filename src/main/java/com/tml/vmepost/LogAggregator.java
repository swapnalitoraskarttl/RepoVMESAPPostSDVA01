package com.tml.vmepost;

import org.apache.camel.Exchange;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import static net.logstash.logback.argument.StructuredArguments.*;

public class LogAggregator {

	private static final Logger logger = LoggerFactory.getLogger(LogAggregator.class);

	  public void sourceIp(String message, Exchange exchange){
	    String sourceIp = exchange.getIn().getHeader("X-Forwarded-For", String.class);
	    logger.info("source-ip", value("source-ip",message + sourceIp));
	  }

	  public void request(String message, Exchange exchange){
		  logger.info("request", value("request","pROW_ID-->"+exchange.getIn().getBody(String.class) ));
	  }

	  public void response(String message, Exchange exchange) {
		  logger.info("response", value("response","pROW_ID-->"+(String)exchange.getIn().getHeader("pROW_ID",String.class)+","+message +  "pDOC_TYPE-->"+(String)exchange.getIn().getHeader("pDOC_TYPE",String.class)+"," + exchange.getIn().getBody(String.class)));
	  }
	  
	  public void marshal(String message, Exchange exchange) {
		  logger.info("marshal", value("marshal","pROW_ID-->"+(String)exchange.getIn().getHeader("pROW_ID",String.class)+","+message + "pDOC_TYPE-->"+(String)exchange.getIn().getHeader("pDOC_TYPE",String.class)+"," + exchange.getIn().getBody(String.class)));
	  }
	  
	  public void unmarshal(String message, Exchange exchange) {
		  logger.info("unmarshal", value("unmarshal",exchange.getIn().getBody(String.class)));
	  }
	  
	  public void exception(String message, Exchange exchange) {
		  logger.info("exception", value("exception","pROW_ID-->"+(String)exchange.getIn().getHeader("pROW_ID",String.class)+","+message +  "pDOC_TYPE-->"+(String)exchange.getIn().getHeader("pDOC_TYPE",String.class)+"," + exchange.getIn().getBody(String.class)));
	  }
	
	
}
