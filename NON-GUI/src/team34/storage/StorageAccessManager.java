package team34.storage;





import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Map;
import java.util.TreeMap;
import java.util.Hashtable;
import team34.login.*;
import team34.event.Event;

public class StorageAccessManager {
	private static Map<Integer, Event> eventDatabase;
	
	public StorageAccessManager(){
		eventDatabase = new TreeMap<Integer,Event>();
	}
	public static Event getEvent(int eventId){
		return eventDatabase.get(eventId);
	}
	public static void addEvent(Event newEvent){
		eventDatabase.put(newEvent.getEventID(), newEvent);
	}
	
	public static boolean saveUserAccount(Hashtable<String,UserAccount> list, String filename)
	{
		File f=new File(filename);
		if (f.exists())
		{
			try
			{
			  OutputStream file = new FileOutputStream( filename );
		      OutputStream buffer = new BufferedOutputStream( file );
		      ObjectOutput output = new ObjectOutputStream( buffer );
		      
		      try
		      	{
		          output.writeObject(list);
		        }
		        finally
		        {
		          output.close();
		        }
		      	return true;
			}
			
			catch(Exception e)
			{
				return false;
			}
		} else 
		{
			return false;
		}
	}
	
	public static Hashtable<String,UserAccount> InitializeUserAccount(String filename)
	{
		Hashtable<String,UserAccount> temp=null;
		
		try
		{
			File f=new File(filename);
			if (f.exists())
			{
				InputStream file = new FileInputStream( filename );
			      InputStream buffer = new BufferedInputStream( file );
			      ObjectInput input = new ObjectInputStream ( buffer );
			      try{
			        //deserialize the List
			        temp=(Hashtable<String,UserAccount>)input.readObject();
			      }
			      finally{
			        input.close();
			      }
			}
		}catch(Exception e)
		{
			
		}
		
		return temp;
		
		
	}

}
