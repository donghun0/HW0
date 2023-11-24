import java.io.*;

class BinaryCopy {
	private File src;
	private File dst;
	
	public BinaryCopy(String srcPath) {
		src = new File(srcPath);
	}
	
	public void charCopy() throws IOException {
		dst = new File("c:\\Temp\\charCopyImg.jpg");
		
		FileInputStream fi = new FileInputStream(src);
		FileOutputStream fo = new FileOutputStream(dst);
		
		int c;
		
		while ((c = fi.read()) != -1) {
			fo.write((byte)c);
		}
		
		fi.close();
		fo.close();
	}
	public void blockCopy() throws IOException {
		dst = new File("c:\\Temp\\blockCopyImg.jpg");
		FileInputStream fi = new FileInputStream(src);
		FileOutputStream fo = new FileOutputStream(dst);
		
		byte[] buf = new byte [1024*10];
		
		while(true) {
			int n = fi.read(buf);
			
			fo.write(buf, 0, n);
			if (n < buf.length) break; 
		}
		
		fi.close();
		fo.close();

	}

}
