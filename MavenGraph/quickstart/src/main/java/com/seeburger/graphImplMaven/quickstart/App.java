package com.seeburger.graphImplMaven.quickstart;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

import com.seeburger.graphImplMaven.quickstart.graph.Edge;
import com.seeburger.graphImplMaven.quickstart.graph.Graph;
import com.seeburger.graphImplMaven.quickstart.io.XmlParser;

/**
 * Hello world!
 *
 */
public class App 
{
    @SuppressWarnings("unchecked")
	public static void main( String[] args ) throws Exception
    {
    	Graph<String> graph = new Graph<String>(true);
		ArrayList<Edge<String>> connected = new ArrayList<Edge<String>>();
		
		connected.add(new Edge<String>("B", 2));
		connected.add(new Edge<String>("C", 12));
		connected.add(new Edge<String>("D", 7));
		
		graph.add("A", connected);

		graph.addArc("C", "B", 1);

		graph.addArc("Z", "F", 4);

		graph.addArc("Z", "R", 5);

		graph.addArc("D", "Z", 1);

		graph.addArc("F", "D", 1);

		graph.addArc("W", "L", 1);
		
		System.out.println(graph.toString());
		
		
//		Serializer serializer = new Persister();
//		File source = new File("Graph.xml");
//
//		graph = serializer.read(Graph.class, source);
		
	    JAXBContext jaxbContext = JAXBContext.newInstance(Graph.class);
	    Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
	 
	    jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
	 
	    jaxbMarshaller.marshal(graph, System.out);
	    File file = new File("XMLgraph.xml");
	    jaxbMarshaller.marshal(graph,file);
	    

//		XmlParser xmlParser = new XmlParser();
		
//		Graph<String> myNewGraph = new Graph<>();
		
	
//		 try {
//	            xmlParser.writeObject(graph, "GraphToXml.xml");
//	        } catch (JAXBException e) {
//	            e.printStackTrace();
//	        } catch (IOException e) {
//	            e.printStackTrace();
//	        }
//		
	
		
		
		
    }
}
