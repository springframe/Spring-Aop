package com.aa.util;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.omg.Messaging.SyncScopeHelper;

public class Cache {
	public static Cache instance;
	private Map<String,Object> map;
	private Cache()
	{
		map=new ConcurrentHashMap<String, Object>();
	}
	 public static synchronized Cache getInstance()
	 {
		 if(instance==null)
		 {
			 instance=new Cache();
		 }
		 return instance;
	 }
	 
	 public void put(String key,Object value) 
	 {
		 
		map.put(key, value);
	}
	 public Object get(String key) 
	 {
		 return map.get(key);
		
	}
	 public boolean containsKey(String key)
	 {
		 return map.containsKey(key);
	 }
	
}
