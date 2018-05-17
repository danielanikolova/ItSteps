package createXmlGraph;


import java.io.File;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;


import org.w3c.dom.Document;
import org.w3c.dom.Element;

import graphWithGenerics.Edge;
import graphWithGenerics.Graph;

public class RunDomXML {

	public static void main(String[] args) throws ParserConfigurationException {
		
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
		
		
		parsObjectToXml(myGraph);
		
		File file = new File("graphParameters.xml");
		
		
		
		
	}



	private static void parsObjectToXml(Graph<String> myGraph) {
		try
		{
		  DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
		  DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
		  
		  

		  //root elements
		  Document doc = docBuilder.newDocument();
		  
		 

		  Element rootElement = doc.createElement("graph");
		  doc.appendChild(rootElement);

		  //staff elements
		  Element adjacencyList = doc.createElement("adjacencyList");
		  rootElement.appendChild(adjacencyList);
		  
		for (String entryVertex : myGraph.getAdjacencyList().keySet() ) {
			
			Element vertex = doc.createElement("vertex");
			vertex.setAttribute("name", entryVertex);
			adjacencyList.appendChild(vertex);
			
			for (Edge<String> entryEdge : myGraph.getAdjacencyList().get(entryVertex)) {
				
				Element edge = doc.createElement("edge");
				edge.setAttribute("vertex", entryEdge.getVertex());
				vertex.appendChild(edge);
				
			}
			
		}
		
		 TransformerFactory transformerFactory = TransformerFactory.newInstance();
		  Transformer transformer = transformerFactory.newTransformer();
		  DOMSource source = new DOMSource(doc);
		  
		  StreamResult result =  new StreamResult(new File("graphParameters.xml"));
		  transformer.transform(source, result);
		  
		  


		}catch(ParserConfigurationException pce){
		  pce.printStackTrace();
		}catch(TransformerException tfe){
		  tfe.printStackTrace();
		}

		
	}

	
	
}
