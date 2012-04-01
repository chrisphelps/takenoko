package com.sutemi.takenoko;

import java.util.ArrayList;
import java.util.List;

public class TileUtil {
	
	public static List<Tile> setupTiles(int numtiles) {
		List<Tile> tiles = new ArrayList<Tile>(numtiles);
		
		if (numtiles <= 0) {
			return tiles;
		}
		
		tiles.add(new Tile("Empty"));
		
		// for now only work with single letter space
		//assert numtiles < 26;
		if (numtiles > 25) {
			throw new IllegalArgumentException("Limit exceeded");
		}
		
		for(int i = 0; i < numtiles - 1; i++) {
			tiles.add(new Tile(Character.toString((char)('A'+i))));
		}
		
		return tiles;
	}
}
