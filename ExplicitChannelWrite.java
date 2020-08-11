package Nio;
import java.io.*;
import java.nio.*;
import java.nio.channels.*;

public class ExplicitChannelWrite {
public static void main(String args[])
{
	FileOutputStream fOut;
	FileChannel fChan;
	ByteBuffer mBuf;
	try {
		fOut = new FileOutputStream("test.txt")
;
		fChan = fOut.getChannel();
		mBuf = ByteBuffer.allocateDirect(26);
		for(int i =0; i<26; i++)
		{
			mBuf.put((byte) ('A' +i));
			mBuf.rewind();
			fChan.write(mBuf);
			fChan.close();
			fOut.close();
			
			
		}
	}
		catch(IOException e)
		{
			System.out.println(e);
			
			
		}
	catch(BufferOverflowException e)
	{
		System.out.println(e);
		System.exit(1);
	}
		}
	
}

