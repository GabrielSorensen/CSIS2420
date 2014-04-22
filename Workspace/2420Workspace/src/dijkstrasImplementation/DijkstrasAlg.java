package dijkstrasImplementation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
//credit to algolist.com for the outline on making the custon graph and alg classes.



import BaseClasses.Edge;
import BaseClasses.SimpleStack;
import BaseClasses.Vertex;

public class DijkstrasAlg {

	public static void computePaths (Vertex source) {
		source.minDistance = 0;
		PriorityQueue<Vertex> vertexQueue = new PriorityQueue<Vertex>();
		vertexQueue.add(source);

		while (!vertexQueue.isEmpty()) {
			Vertex x = vertexQueue.poll();

			//visit the edges
			for (Edge e : x.adjacencies) {
				Vertex v = e.target;
				double weight = e.weight;
				double distanceThroughVertex = x.minDistance + weight;
				if (distanceThroughVertex < v.minDistance) {
					vertexQueue.remove(v);
					v.minDistance = distanceThroughVertex;
					v.previous = x;
					vertexQueue.add(v);
				}
			}
		}
	}

	public static List<Vertex> getShortestPathTo (Vertex target) {
		List<Vertex> path = new ArrayList<Vertex>();
		for (Vertex vertex = target; vertex != null; vertex = vertex.previous) {
			path.add(vertex);
		}
		Collections.reverse(path);
		return path;
	}
	
	public static void depthFirst (Vertex [] VA, Vertex v) {
		SimpleStack stack = new SimpleStack("stack");
		ArrayList<Vertex> visited = new ArrayList<Vertex>();
		stack.push(v);
		while (!stack.isEmpty()) {
			Vertex x = (Vertex) stack.pop();
			if (!visited.contains(x)) {
				visited.add(x);
				System.out.println(x.name + " was visited.");
//				for (Edge e : ) {
//					
//				}
			}
		}
	}
}
