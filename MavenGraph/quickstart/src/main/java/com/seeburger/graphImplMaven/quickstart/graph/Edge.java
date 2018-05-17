package com.seeburger.graphImplMaven.quickstart.graph;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement (name="edge")
@XmlAccessorType(XmlAccessType.FIELD)
public class Edge<V> {
	
	@XmlElement(name = "vertex")
	private V vertex;
	@XmlElement(name = "weight")
	private int weight;
	
	public Edge(V vert, int w) {
		this.vertex = vert;
		this.weight = w;
	}

	public V getVertex() {
		return this.vertex;
	}

	public void setVertex(V vertex) {
		this.vertex = vertex;
	}

	public int getWeight() {
		return this.weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public String toString(){
		
		return "( "+ vertex + ", " + weight + " )";
	}

}

