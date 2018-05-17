package dtoModels;

import java.util.ArrayList;
import java.util.HashMap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name = "graph")
@XmlAccessorType (XmlAccessType.FIELD)
public class GraphView<V> {
	
	@XmlElement(name = "verteces with edges")
	private HashMap<V, ArrayList<EdgeView<V>>> adjacencyList;
	
	@XmlElement(name = "verteces list")
	private ArrayList<V> vertexList;

	@XmlElement(name = "is directed")
	private boolean directed;
	
	public HashMap<V, ArrayList<EdgeView<V>>> getAdjacencyList() {
		return this.adjacencyList;
	}
	
	public void setAdjacencyList(HashMap<V, ArrayList<EdgeView<V>>> adjacencyList) {
		this.adjacencyList = adjacencyList;
	}
	
	public ArrayList<V> getVertexList() {
		return vertexList;
	}
	
	public void setVertexList(ArrayList<V> vertexList) {
		this.vertexList = vertexList;
	}
	
	public boolean getIsdirected() {
		return this.directed;
	}
	
	public void setDirected(boolean directed) {
		this.directed = directed;
	}

}
