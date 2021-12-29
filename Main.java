//https://www.acmicpc.net/problem/7576
import java.util.*;

class Main {
	static int[] dx = {0, 0, 1, -1};
	static int[] dy = {1, -1, 0, 0};
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt();
		int N = sc.nextInt();
			
		int[][] arr = new int[N][M];
		
		Queue <xy> queue = new LinkedList<xy>();
				
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				arr[i][j] = sc.nextInt();
				if(arr[i][j]==1)
					queue.add(new xy(i, j));
			}
		}
		
		while(!queue.isEmpty()) {
			xy xys = queue.poll(); // 넵넵
			for(int i = 0; i < 4; i++) {
				int x = xys.x + dx[i]; 
				int y = xys.y + dy[i];
				if(x < 0 || x >= N || y < 0 || y >= M) 
					continue;
				if(arr[x][y] != 0)
					continue;
				arr[x][y] = arr[xys.x][xys.y] + 1;
				queue.add(new xy(x, y));
			}
		}
		
		int max = arr[0][0];
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				if(arr[i][j]==0){
					System.out.println("-1"); 
					return;}
				else if(max < arr[i][j])
					max = arr[i][j];
			}
		}
		
		System.out.println(max-1); 
	}
}

class xy {
	int x; 
	int y;
	xy(int x, int y){
		this.x = x;
		this.y = y;
	}
}