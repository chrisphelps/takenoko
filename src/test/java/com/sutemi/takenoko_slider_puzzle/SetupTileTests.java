package com.sutemi.takenoko_slider_puzzle;

import java.util.List;

import junit.framework.TestCase;

public class SetupTileTests extends TestCase {

	public void testSetupDegenrateCase() {
		List<Tile> setupTiles = TileUtil.setupTiles(0);

		assertEquals(0, setupTiles.size());
	}
	
	public void testSetupEmptyOnly() {
		List<Tile> setupTiles = TileUtil.setupTiles(1);

		assertEquals(1, setupTiles.size());
		assertEquals("Empty",setupTiles.get(0).name);
	}
	
	public void testSetup4Tiles() {
		List<Tile> setupTiles = TileUtil.setupTiles(4);
		
		assertEquals(4,setupTiles.size());
		assertEquals("Empty", setupTiles.get(0).name);
		assertEquals("A", setupTiles.get(1).name);
		assertEquals("B", setupTiles.get(2).name);
		assertEquals("C", setupTiles.get(3).name);
	}
	
	public void testSetupTooManyTiles() {
		try {
			List<Tile> setupTiles = TileUtil.setupTiles(32);
			fail();
		} catch (IllegalArgumentException expected) {
			assertTrue(true);
		}
	}
}
