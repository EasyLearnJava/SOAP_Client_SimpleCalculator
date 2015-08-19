
package com.easylearnjava.webserviceprovider;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.easylearnjava.webserviceprovider package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CalculatorException_QNAME = new QName("http://webserviceprovider.easylearnjava.com/", "CalculatorException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.easylearnjava.webserviceprovider
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CalculatorException }
     * 
     */
    public CalculatorException createCalculatorException() {
        return new CalculatorException();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalculatorException }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webserviceprovider.easylearnjava.com/", name = "CalculatorException")
    public JAXBElement<CalculatorException> createCalculatorException(CalculatorException value) {
        return new JAXBElement<CalculatorException>(_CalculatorException_QNAME, CalculatorException.class, null, value);
    }

}
