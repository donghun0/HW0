import java.io.IOException;

public class BinaryCopyTimeEx {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryCopy bCopy = new BinaryCopy("c:\\Windows\\Web\\Wallpaper\\Windows\\img19.jpg");
		
		try {
			long endTime, startTime;
			long charCopyDuration, blockCopyDuration;
			
			startTime = System.nanoTime();
			bCopy.charCopy();
			endTime = System.nanoTime();
			charCopyDuration = endTime - startTime;
			
			startTime = System.nanoTime();
			bCopy.charCopy();
			endTime = System.nanoTime();
			blockCopyDuration = endTime - startTime;
			
			System.out.println("time for charCopy: " + charCopyDuration);
			System.out.println("time for blockCopy: " + blockCopyDuration);
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
