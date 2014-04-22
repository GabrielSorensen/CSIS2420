package Testers;

import java.util.List;

import dijkstrasImplementation.DijkstrasAlg;
import BaseClasses.*;

public class w7e9 {
	
	private static Vertex A;
	private static Vertex B;
	private static Vertex C;
	private static Vertex D;
	private static Vertex E;
	private static Vertex F;
	private static Vertex G;
	private static Vertex H;
	
	public static void main(String[] args) {
		A = new Vertex ("A");
		B = new Vertex ("B");
		C = new Vertex ("C");
		D = new Vertex ("D");
		E = new Vertex ("E");
		F = new Vertex ("F");
		G = new Vertex ("G");
		H = new Vertex ("H");
		
		A.adjacencies = new Edge [] {
				new Edge (C, 3),
				new Edge (B, 12),
				new Edge (E, 6),
		};
		B.adjacencies = new Edge [] {
				new Edge (C, 15),
				new Edge (A, 12),
				new Edge (E, 5),
				new Edge (D, 5),
		};
		C.adjacencies = new Edge [] {
				new Edge (A, 3),
				new Edge (B, 15),
				new Edge (F, 18),
		};
		D.adjacencies = new Edge [] {
				new Edge (B, 5),
				new Edge (F, 4),
				new Edge (H, 19),
		};
		E.adjacencies = new Edge [] {
				new Edge (A, 6),
				new Edge (B, 5),
				new Edge (G, 22),
		};
		F.adjacencies = new Edge [] {
				new Edge (C, 15),
				new Edge (D, 4),
				new Edge (H, 10),
		};
		G.adjacencies = new Edge [] {
				new Edge (E, 22),
				new Edge (H, 3),
		};
		H.adjacencies = new Edge [] {
				new Edge (F, 10),
				new Edge (D, 19),
				new Edge (G, 3),
		};
		
		Vertex [] verteci = {A,B,C,D,E,F,G,H};
		
//		DijkstrasAlg.computePaths(A);//compute the time to all the verticies from a central point
//		
//		for (Vertex v : verteci)
//		{
//			System.out.println("Distance to " + v + ": " + v.minDistance);
//			List<Vertex> path = DijkstrasAlg.getShortestPathTo(v);
//			System.out.println("Path: " + path);
//		}
	}

}
