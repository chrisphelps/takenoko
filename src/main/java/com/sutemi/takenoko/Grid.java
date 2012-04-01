package com.sutemi.takenoko;

import java.util.ArrayList;
import java.util.List;

public class Grid {
	private int width;
	private int height;
	
	// for now this is a stateful grid. Probably want to 
	// move towards a memento-like pattern
	private int emptyx;
	private int emptyy;
	private Tile[][] grid;
	
	// for testing
	protected Grid() {}
	
	public Grid(int width, int height) {
		this.width = width;
		this.height = height;
		
		List<Tile> tiles = TileUtil.setupTiles(height*width);
		this.grid = buildGrid(height, width, tiles);
		
		this.emptyx = 0;
		this.emptyy = 0;
		
	}

	protected Tile[][] buildGrid(int height, int width, List<Tile> tiles) {
		Tile[][] grid = new Tile[height][width];

		for (int i = 0; i < height; i++) {
			for (int j = 0; j < height; j++) {
				grid[i][j] = tiles.get(i*width + j);
			}
		}
		return grid;
	}
	
	public List<Move> getAvailableMoves() {
		return null;
	}
	
	protected int getEmptyx() {
		return emptyx;
	}

	protected int getEmptyy() {
		return emptyy;
	}

	protected Tile[][] getGrid() {
		return grid;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}
}
