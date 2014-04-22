package dijkstrasImplementation;

import BaseClasses.Edge;
import BaseClasses.Graph01;
import BaseClasses.Vertex;

public class dijkstraTester {

	public static void main(String[] args) {
		Vertex a = new Vertex("A");
		Vertex b = new Vertex("B");
		Vertex c = new Vertex("C");
		Vertex d = new Vertex("D");
		Vertex e = new Vertex("E");
		Vertex f = new Vertex("F");
		Vertex g = new Vertex("G");
		Vertex h = new Vertex("h");

		a.adjacencies = new Edge[]{ 
				new Edge(b, 12),
				new Edge(c, 3),
				new Edge(e, 6)
		};
		b.adjacencies = new Edge[]{
				new Edge(c, 15),
				new Edge(d, 5),
				new Edge(e, 5)
		};
		c.adjacencies = new Edge[] {
				new Edge(f, 18),
		};
		d.adjacencies = new Edge[] {
				new Edge(f, 4),
				new Edge(h, 19),
		};
		e.adjacencies = new Edge[] {
				new Edge(g, 22),
		};
		f.adjacencies = new Edge[] {
				new Edge(h, 10),
		};
		g.adjacencies = new Edge[] {
				new Edge(h, 3),
		};
		h.adjacencies = new Edge[] {

		};


		Vertex[] vertices = { a,b,c,d,e,f,g,h };
		//		DijkstrasAlg.computePaths(v0);
		//		for (Vertex v : vertices)
		//		{
		//			System.out.println("Distance to " + v + ": " + v.minDistance);
		//			List<Vertex> path = DijkstrasAlg.getShortestPathTo(v);
		//			System.out.println("Path: " + path);
		//		}
		Graph01 gra = new Graph01(vertices);
		gra.breadthFirstSearch();
	}

}
