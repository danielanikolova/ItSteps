package dtoModels;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "edge")
@XmlAccessorType(XmlAccessType.FIELD)
public class EdgeView<V> {

	
	@XmlElement(name = "vertex")
	private V vertex;
	@XmlElement(name = "weight")
	private int weight;
	
	public EdgeView() {
		
	}
	
	public V getVertex() {
		return this.vertex;
	}
	
	public int getWeight() {
		return this.weight;
	}
	
	public void setVertex(V vertex) {
		this.vertex = vertex;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
}
