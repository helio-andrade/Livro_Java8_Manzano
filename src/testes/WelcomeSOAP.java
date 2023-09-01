package testes;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(name = "WelcomeSOAP", serviceName = "WelcomeSOAPService")
public class WelcomeSOAP {

    @WebMethod(operationName = "welcome")
    public String welcome(@WebParam(name = "name") String name) {
        return "Welcome to JAX-WS web services with SOAP, " + name + "!";
    } 

}
