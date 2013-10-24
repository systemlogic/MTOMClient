import java.io.File;
import java.io.FileInputStream;

import com.fileupload.FileUploadService;
import com.fileupload.FileUploadService_Service;


public class FileUpload {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		System.out.println("Please select file of size 500MB");
		File f = new File("/media/Harsh/VMware-Player-4.0.0-471780.x86_64.bundle");
		byte[] data = new byte[(int)f.length()];
		FileInputStream fis = new FileInputStream(f);
		fis.read(data);
		FileUploadService_Service fuss = new FileUploadService_Service();
		FileUploadService fus = fuss.getFileuploadPort();
		fus.upload(data);
		
	}

}
