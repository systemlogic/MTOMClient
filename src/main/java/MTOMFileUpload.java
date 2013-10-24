import java.io.File;
import java.util.Map;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.soap.MTOMFeature;

import com.mtomfileupload.FileUploadMTOMService;
import com.mtomfileupload.MTOMfileUploadService;


public class MTOMFileUpload {

	 @SuppressWarnings("restriction")
		public static void main( String[] args )
	    {
		 	System.out.println("Please select file of size 500MB");
			MTOMFeature featue = new MTOMFeature();
			FileUploadMTOMService fums = new FileUploadMTOMService();
			MTOMfileUploadService momfus= fums.getMTOMfileuploadPort(featue);
			
			Map<String, Object> ctxt = ((BindingProvider)momfus).getRequestContext();
			ctxt.put("size",1023);
			
			File f = new File("/media/Harsh/VMware-Player-4.0.0-471780.x86_64.bundle");
			FileDataSource fds = new FileDataSource(f);
			DataHandler dh = new DataHandler(fds);
			 momfus.uploadMTOMWay(dh);
			//byte[] data = new byte[(int)f.length()];
	    }

}
