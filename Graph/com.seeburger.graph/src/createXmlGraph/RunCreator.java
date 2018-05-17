package createXmlGraph;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import java.util.ArrayList;
import java.util.Scanner;

import graphWithGenerics.Edge;
import graphWithGenerics.Graph;

public class RunCreator {


	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Graph<String> myGraph = new Graph<String>(true);
		ArrayList<Edge<String>> connected = new ArrayList<Edge<String>>();
		
		connected.add(new Edge<String>("B", 2));
		connected.add(new Edge<String>("C", 12));
		connected.add(new Edge<String>("D", 7));
		
		myGraph.add("A", connected);

		myGraph.addArc("C", "B", 1);

		myGraph.addArc("Z", "F", 4);

		myGraph.addArc("Z", "R", 5);

		myGraph.addArc("D", "Z", 1);

		myGraph.addArc("F", "D", 1);

		myGraph.addArc("W", "L", 1);

		
		
		  try {

		        File file = new File("graphInfo.txt");
				JAXBContext jaxbContext = JAXBContext.newInstance(Graph.class);
		        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
		
		        // output pretty printed
		        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		        jaxbMarshaller.marshal(myGraph, file);
		        jaxbMarshaller.marshal(myGraph, System.out);

		  } catch (JAXBException e) 
		  {
		        e.printStackTrace();
		  }

	}

}
