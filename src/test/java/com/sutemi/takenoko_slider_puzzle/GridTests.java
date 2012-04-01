package com.sutemi.takenoko_slider_puzzle;

import java.util.List;

import junit.framework.TestCase;

public class GridTests extends TestCase {

	public void testSetupDegenrateTiles() {
		Grid g = new Grid();
		
		List<Tile> setupTiles = g.setupTiles(0);
		assertEquals(1, setupTiles.size());
		assertEquals("Empty",setupTiles.get(0).name);
	}
	
	public void testSetup3Tiles() {
		Grid g = new Grid();
		
		List<Tile> setupTiles = g.setupTiles(3);
		assertEquals(4,setupTiles.size());
		assertEquals("Empty", setupTiles.get(0).name);
		assertEquals("A", setupTiles.get(1).name);
		assertEquals("B", setupTiles.get(2).name);
		assertEquals("C", setupTiles.get(3).name);
	}
}
