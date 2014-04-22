package BaseClasses;

import java.util.ArrayList;
import java.util.Stack;

public class Graph01 {
	private ArrayList<Vertex> graph = new ArrayList<Vertex>();
	private String name;

	public Graph01 () {
		this.name = "Default Graph";

	}
	public Graph01 (Vertex [] v) {
		for (Vertex x : v) {
			this.graph.add(x);
		}
	}
	public void addVertex(Vertex v) {
		this.graph.add(v);
	}
	public void removeVertex(Vertex v) {
		this.graph.remove(v);
	}
	public ArrayList<Vertex> getGraph() {
		return graph;
	}
	public void setGraph(ArrayList<Vertex> graph) {
		this.graph = graph;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setVertexAdjacencies(Vertex v, Edge [] e) {
		v.adjacencies = e;
	}
	public void depthFirstSearch() {
		Stack<Vertex> s = new Stack<Vertex>();
		ArrayList<Vertex> checked = new ArrayList<Vertex>();
		System.out.println("pushing first vertex on the stack");
		try {
			s.push(this.graph.get(0));
			while (!s.isEmpty()) {
				Vertex v = s.pop();
				System.out.println(v.name);
				for (Vertex b : checked) {
					System.out.println("checked: " + b.name);
				}
				if (!checked.contains(v)) {
					checked.add(v);
					for (Edge e : v.adjacencies) {
						System.out.println(v.name + "-->" + e.target);
						s.push(e.target);
					}
				}
			}
		} catch (NullPointerException e) {
			System.err.println("Null pointer error when pusing or popping from stack");
		}
	}
	public void breadthFirstSearch() {
		SimpleQueue s = new SimpleQueue();
		ArrayList<Vertex> checked = new ArrayList<Vertex>();
		System.out.println("pushing first vertex on the stack");
		try {
			s.enqueue(this.graph.get(0));
			while (!s.isEmpty()) {
				Vertex v = (Vertex) s.dequeue();
				System.out.println(v.name);
				for (Vertex b : checked) {
					System.out.println("checked: " + b.name);
				}
				if (!checked.contains(v)) {
					checked.add(v);
					for (Edge e : v.adjacencies) {
						System.out.println(v.name + "-->" + e.target);
						if (checked.contains(e.target)) {
						} else {
							s.enqueue(e.target);
						}
					}
				}
			}
		} catch (NullPointerException e) {
			System.err.println("Null pointer error when pusing or popping from stack");
		}
	}
}
