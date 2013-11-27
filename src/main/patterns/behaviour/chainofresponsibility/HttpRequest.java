package patterns.behaviour.chainofresponsibility;

/**
 * Date: 11/27/13
 * Time: 9:48 AM
 */
public class HttpRequest {
    private final String method;
    private final String params;
    private final String headers;
    private final String cookies;

    public HttpRequest(String method, String params, String headers, String cookies) {
        this.method = method;
        this.params = params;
        this.headers = headers;
        this.cookies = cookies;
    }

    public String getParams() {
        return params;
    }

    public String getCookies() {
        return cookies;
    }

    public String getHeaders() {
        return headers;
    }

    public String getMethod() {
        return method;
    }
}
