
package com.fileupload;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "fileUploadService", targetNamespace = "fileupload.com")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface FileUploadService {


    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "upload", targetNamespace = "fileupload.com", className = "com.fileupload.Upload")
    @ResponseWrapper(localName = "uploadResponse", targetNamespace = "fileupload.com", className = "com.fileupload.UploadResponse")
    @Action(input = "fileupload.com/fileUploadService/uploadRequest", output = "fileupload.com/fileUploadService/uploadResponse")
    public void upload(
        @WebParam(name = "arg0", targetNamespace = "")
        byte[] arg0);

}