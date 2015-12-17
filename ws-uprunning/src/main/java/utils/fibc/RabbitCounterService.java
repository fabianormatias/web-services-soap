package utils.fibc;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "RabbitCounterService", targetNamespace = "http://ch03.fib", wsdlLocation = "http://localhost:9876/fib?wsdl")
//@HandlerChain(file = "fibcclient/handler-chain.xml")
public class RabbitCounterService
    extends Service
{

    private final static URL RABBITCOUNTERSERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(utils.fibc.RabbitCounterService.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = utils.fibc.RabbitCounterService.class.getResource(".");
            url = new URL(baseUrl, "http://localhost:8080/fib?wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'http://localhost:9876/fib?wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        RABBITCOUNTERSERVICE_WSDL_LOCATION = url;
    }

    public RabbitCounterService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public RabbitCounterService() {
        super(RABBITCOUNTERSERVICE_WSDL_LOCATION, new QName("http://ch03.fib", "RabbitCounterService"));
    }

    /**
     * 
     * @return
     *     returns RabbitCounter
     */
    @WebEndpoint(name = "RabbitCounterPort")
    public RabbitCounter getRabbitCounterPort() {
        return super.getPort(new QName("http://ch03.fib", "RabbitCounterPort"), RabbitCounter.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns RabbitCounter
     */
    @WebEndpoint(name = "RabbitCounterPort")
    public RabbitCounter getRabbitCounterPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ch03.fib", "RabbitCounterPort"), RabbitCounter.class, features);
    }

}