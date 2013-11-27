package patterns.behaviour.chainofresponsibility;

/**
 * Date: 11/27/13
 * Time: 9:46 AM
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Demo of chain of responsibility.
 * Few requests will be processed with security chain.
 */
public class Main {
    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {
        HttpRequestProcessor requestProcessor = new HttpMethodProcessor();
        HttpRequestProcessor requestProcessor1 =  requestProcessor.setNext(new HttpParamsProcessor());
        HttpRequestProcessor requestProcessor2 = requestProcessor1.setNext(new HttpHeadersProcessor());
        HttpRequestProcessor requestProcessor3 = requestProcessor2.setNext(new HttpCookiesProcessor());

        HttpRequest request = new HttpRequest("GET", "a=1&b=2", "", "cookie:123456");
        LOGGER.info("= = =executeFirstWorkingFilter= = =");
        requestProcessor.executeFirstWorkingFilter(request);
        LOGGER.info("= = =executeAllFilters= = =");
        requestProcessor.executeAllFilters(request);
        LOGGER.info("= = =executeUntilOneBreaks= = =");
        requestProcessor.executeUntilOneBreaks(request);
    }
}
