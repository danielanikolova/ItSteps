package com.seeburger.collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;

public class CommandExecutor {

	private BufferedReader br;
	
	
	public CommandExecutor(BufferedReader reader)
	{
		this.br = reader;
	}
	

	public Collection<Student> fillCollectionFrom(int choise) throws IOException{
	
			String line = br.readLine();
			line = br.readLine();
			Student student;
			
			Collection<Student> collection = null ;
			Map<Integer,Student> map = null;
			
			switch(choise)
			{
			case 1: collection=new ArrayList<Student>();
			      break;
			case 2: collection=new LinkedList<Student>();
			      break;
			case 3: collection=new HashSet<Student>(); break;
			case 4: collection=new LinkedHashSet<Student>();
				break;
			case 5: map=new HashMap<Integer,Student>();
				break;
			case 6: map=new LinkedHashMap<Integer,Student>();
				break;
			case 7:	map=new TreeMap<Integer,Student>();
				break;
			}
			
			
			
			while((line=br.readLine())!=null)
			{
				
			String [] arr = line.split("\\s+");
				student = new Student(arr[0],arr[1],arr[2],arr[3],arr[4],
						arr[5],arr[6],arr[7],arr[8],arr[9],arr[10]);
				
				if(choise < 4)
				collection.add(student);
				
				else
					map.put(Integer.parseInt(arr[0]), student);
				
			}
			return collection;
			
	}


	public Map<Integer, Student> fillMapFromFile(int choise) throws IOException {
		String line = br.readLine();
		line = br.readLine();
		Student student;
		
		Map<Integer,Student> map = null;
		
		switch(choise)
		{
		case 5: map=new HashMap<Integer,Student>();
			break;
		case 6: map=new LinkedHashMap<Integer,Student>();
			break;
		case 7:	map=new TreeMap<Integer,Student>();
			break;
		}
		
		
		
		while((line=br.readLine())!=null)
		{
			
		String [] arr = line.split("\\s+");
			student = new Student(arr[0],arr[1],arr[2],arr[3],arr[4],
					arr[5],arr[6],arr[7],arr[8],arr[9],arr[10]);
			
				map.put(Integer.parseInt(arr[0]), student);
		}
				
		return map;
	}
		
	
}
