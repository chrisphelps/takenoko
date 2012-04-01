package com.sutemi.takenoko_slider_puzzle;

import java.util.ArrayList;
import java.util.List;

public class Grid {
	public int width;
	public int height;
	public int emptyx;
	public int emptyy;
	public Tile[][] grid;
	
	public Grid(int width, int height) {
		this.width = width;
		this.height = height;
		
		List<Tile> tiles = setupTiles(height*width);
		this.grid = buildGrid(height, width, tiles);
		
		this.emptyx = 0;
		this.emptyy = 0;
		
	}

	protected Grid() {
		// empty object, default values okay
	}

	public List<Tile> setupTiles(int numtiles) {
		List<Tile> tiles = new ArrayList<Tile>(numtiles);
		
		tiles.add(new Tile("Empty"));
		
		assert numtiles < 26;
		for(int i = 0; i < numtiles; i++) {
			tiles.add(new Tile(Character.toString((char)('A'+i))));
		}
		
		return tiles;
	}

	public Tile[][] buildGrid(int height, int width, List<Tile> tiles) {
		Tile[][] grid = new Tile[height][width];

		for (int i = 0; i < height; i++) {
			for (int j = 0; j < height; j++) {
				grid[i][j] = tiles.get(i*width + j);
			}
		}
		return grid;
	}
}