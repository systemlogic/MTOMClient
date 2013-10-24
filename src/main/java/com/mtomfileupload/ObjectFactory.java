
package com.mtomfileupload;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.mtomfileupload package. 
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

    private final static QName _UploadMTOMWayResponse_QNAME = new QName("MTOMfileupload.com", "uploadMTOMWayResponse");
    private final static QName _UploadMTOMWay_QNAME = new QName("MTOMfileupload.com", "uploadMTOMWay");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.mtomfileupload
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UploadMTOMWayResponse }
     * 
     */
    public UploadMTOMWayResponse createUploadMTOMWayResponse() {
        return new UploadMTOMWayResponse();
    }

    /**
     * Create an instance of {@link UploadMTOMWay }
     * 
     */
    public UploadMTOMWay createUploadMTOMWay() {
        return new UploadMTOMWay();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadMTOMWayResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "MTOMfileupload.com", name = "uploadMTOMWayResponse")
    public JAXBElement<UploadMTOMWayResponse> createUploadMTOMWayResponse(UploadMTOMWayResponse value) {
        return new JAXBElement<UploadMTOMWayResponse>(_UploadMTOMWayResponse_QNAME, UploadMTOMWayResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadMTOMWay }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "MTOMfileupload.com", name = "uploadMTOMWay")
    public JAXBElement<UploadMTOMWay> createUploadMTOMWay(UploadMTOMWay value) {
        return new JAXBElement<UploadMTOMWay>(_UploadMTOMWay_QNAME, UploadMTOMWay.class, null, value);
    }

}
