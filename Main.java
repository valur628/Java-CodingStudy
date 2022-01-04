//https://www.acmicpc.net/problem/1991
import java.util.*;
import java.io.*;


class Node {
	int left, right;
	public Node(int left, int right) {
		this.left = left;
		this.right = right;
	}
}
public class Main {
	
	static List<Node>[] list;
	static StringBuilder sbuilder = new StringBuilder();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		
		list = new ArrayList[N+1];
		for(int i = 1; i < N+1; i++) {
			list[i] = new ArrayList<>();
		}
		
		for(int i = 1; i < N + 1; i++) {
			String[] line = br.readLine().split(" ");
			int data = line[0].charAt(0)-'A'+1;
			int left = line[1].charAt(0)-'A'+1;
			int right = line[2].charAt(0)-'A'+1;
			list[data].add(new Node(left, right));
		}
		
		preorder(1);
		sbuilder.append("\n");
		inorder(1);
		sbuilder.append("\n");
		postorder(1);
		System.out.println(sbuilder.toString());
		
	}
	
	static void preorder(int n) {
		for(Node node:list[n]) {
			int l = node.left;
			int r = node.right;
			
			sbuilder.append((char)(n+'A'-1));
			if(l!=-18) preorder(l);
			if(r!=-18) preorder(r);
		}
	}
	
	static void inorder(int n) {
		for(Node node:list[n]) {
			int l = node.left;
			int r = node.right;
			
			if(l!=-18) inorder(l);
			sbuilder.append((char)(n+'A'-1));
			if(r!=-18) inorder(r);
		}
	}
	
	static void postorder(int n) {
		for(Node node:list[n]) {
			int l = node.left;
			int r = node.right;
			
			
			if(l!=-18) postorder(l);
			if(r!=-18) postorder(r);
			sbuilder.append((char)(n+'A'-1));
		}
	}
}

