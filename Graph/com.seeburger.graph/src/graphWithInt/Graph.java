package graphWithInt;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class Graph {
	
	private Map<Integer, List<Integer>> adjacencyList;
	private List<Integer> verteces;
	
	public Graph() {
		this.adjacencyList = new HashMap<>();
		this.verteces = new LinkedList<>();
	}
	
	public void addVertex(int vertexValue, List<Integer> currentVertexList) {
			
		this.adjacencyList.put(vertexValue, currentVertexList);
		this.verteces.add(vertexValue);
		
	}
	
	public void BFSTraverse(int gate) {
		
		Queue<Integer> toVisit = new ArrayDeque<>();
		List<Integer> resultList = new ArrayList<>();
		
		
		resultList.add(gate);
		
		toVisit.addAll(adjacencyList.get(gate));
		
		
		while (!toVisit.isEmpty()) 
		{
			
			if (!resultList.contains(toVisit.peek())) 
			{
				toVisit.addAll(adjacencyList.get(toVisit.peek()));
				resultList.add(toVisit.poll());
			}else {
				toVisit.poll();
			}
			
		}
		
		System.out.println(resultList.toString());
		
		
	}
	
	public void DFSTraversal(int gate) {
		
		
		List<Integer> resutList = new LinkedList<>();
		
		getChildren(resutList, gate);		
		
		System.out.println(resutList.toString());
		
	}
	
	
	private void getChildren(List<Integer> resutList, int gate) {
		
		resutList.add(gate);
		Queue<Integer> toVisit = new ArrayDeque<>();
		toVisit.addAll(adjacencyList.get(gate));
		
		while (!toVisit.isEmpty()) {
		
				if (!resutList.contains(toVisit.peek())) {
					
					getChildren(resutList, toVisit.poll());
				
				}else {
					toVisit.poll();
				}
			
			
		}
		
	}

	public String mapInfo() {
		return adjacencyList.toString();
	}
	

}
