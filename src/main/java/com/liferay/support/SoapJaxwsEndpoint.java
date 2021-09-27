package com.liferay.support;

import javax.jws.WebMethod;
import javax.jws.WebService;
import org.osgi.service.component.annotations.Component;

@WebService
@Component(immediate=true, property={
		"jaxws=true",
		"secure=off"
		}, service={SoapJaxwsEndpoint.class})
public class SoapJaxwsEndpoint
{
  @WebMethod
  public int divide(int a, int b)
  {
    return a / b;
  }
  
  @WebMethod
  public int multiply(int a, int b)
  {
    return a * b;
  }
  
  @WebMethod
  public int subtract(int a, int b)
  {
    return a - b;
  }
  
  @WebMethod
  public int sum(int a, int b)
  {
    return a + b;
  }
}