package patterns.behaviour.chainofresponsibility;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Date: 11/27/13
 * Time: 9:56 AM
 */

/**
 * 2 implementation of chain :
 * - all elements are processed
 * - processed all elements until one breaks
 * - only one is processed
 */
public abstract class HttpRequestProcessor {
    private static final Logger LOGGER = LoggerFactory.getLogger(HttpRequestProcessor.class);

    private HttpRequestProcessor next;

    public void executeFirstWorkingFilter(HttpRequest request){
        if(canProcess(request) || next==null){
            processRequest(request);
        }else{
            next.executeFirstWorkingFilter(request);
        }
    }

    public void executeAllFilters(HttpRequest request){
        if(canProcess(request)){
            processRequest(request);
        }
        if(next != null){
            next.executeAllFilters(request);
        }
    }

    public void executeUntilOneBreaks(HttpRequest request){
        if(!canProcess(request)){
            LOGGER.info("Chain is broken({})", this.getClass());
            return;
        }
        processRequest(request);
        if(next != null){
            next.executeUntilOneBreaks(request);
        }
    }


    public HttpRequestProcessor setNext(HttpRequestProcessor httpRequestProcessor){
        next = httpRequestProcessor;
        return httpRequestProcessor;
    }

    protected boolean canProcess(HttpRequest request) {
        return StringUtils.isNotEmpty(getValue(request));
    }

    protected abstract void processRequest(HttpRequest request);

    protected abstract String getValue(HttpRequest request);

}
