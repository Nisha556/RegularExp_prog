package Nio;
import java.nio.*;
import java.io.*;
import java.nio.channels.*;
public class channelRead {
public static void main(String args[])
{
	FileInputStream Fin;
	FileChannel fChan;
	long fSize =100;
	ByteBuffer mBuf;
	try {
		Fin = new FileInputStream("test.txt");
		fChan = Fin.getChannel();
		fSize = fChan.size();
		mBuf = ByteBuffer.allocate((int)fSize);
		fChan.read(mBuf);
		mBuf.rewind();
		for(int  i = 0; i<fSize;i++)
		{
			System.out.println((long)mBuf.get());
			System.out.println();
			fChan.close();
			Fin.close();
			
		}
	}
	
		catch(IOException e){
			System.out.println(e);
			System.out.println();
			System.exit(1);
			
			
		}
		
	}
	
}

