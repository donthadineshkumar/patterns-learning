package patterns.behaviour.chainofresponsibility;

import org.apache.log4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Date: 11/27/13
 * Time: 10:01 AM
 */
public class HttpMethodProcessor extends HttpRequestProcessor {
    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(HttpMethodProcessor.class);
    @Override
    public void processRequest(HttpRequest request) {
        LOGGER.info("Method processor processRequest({})", getValue(request));
    }

    @Override
    public String getValue(HttpRequest request) {
        return request.getMethod();
    }
}
