package com.zhou.zn;


public class Maze_backtracking {
	int row =1;
	int col =1;
	int[][] maze = {
			{0,1,0,0,0,1,0,0},
			{0,1,0,1,0,1,0,0},
			{0,0,0,1,0,1,0,0},
			{1,1,1,0,0,0,1,0},
			{0,1,1,0,1,0,0,0},
			{0,0,1,0,0,0,0,0},
			{0,0,0,1,1,1,0,1},
			{0,0,0,0,1,1,0,0},			
	};
	final int[][] newMaze = new int[maze[1].length+1][maze.length+1];
	public void name() {
		for (int i = 0; i < newMaze.length; i++) {
			for (int j = 0; j < newMaze[i].length; j++) {
				if (i== 0 || i == newMaze.length - 1) {
					newMaze[i][j] = 1;
					continue;
				}
				if (j==0 || j==newMaze[i].length-1) {
					newMaze[i][j] = 1;
					continue;
				}
				newMaze[i][j] = maze[i-1][j-1];
			}
		}
		newMaze[newMaze.length - 2][newMaze[1].length-1] = 2;
		newMaze[newMaze.length - 1][newMaze[1].length-2] = 2;
		name2();
	}
	public void name2() {
		for (int i = 0; i < newMaze.length; i++) {
			for (int j = 0; j < newMaze[i].length; j++) {
				System.out.print(newMaze[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public void backtracking() {
		System.out.println("###############");
		newMaze[row][col]=6;
		if (newMaze[row+1][col] == 2) {
			System.out.println("-----------");
			name2();
		}	
		if (newMaze[row+1][col] == 0) {
			row = row+1;
			name2();
			backtracking();
		}
		if (newMaze[row][col+1] == 0) {
			col = col+1;
			name2();
			backtracking();
		}
		if (newMaze[row-1][col] == 0) {
			col = col+1;
			name2();
			backtracking();
		}
		if (newMaze[row][col-1] == 0) {
			col = col+1;
			name2();
			backtracking();
		}
	}
	
	
	public static void main(String[] args) {
		Maze_backtracking maze_backtracking = new Maze_backtracking();
		maze_backtracking.name();
		maze_backtracking.backtracking();
	}
}
