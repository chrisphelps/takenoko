package com.sutemi.takenoko_slider_puzzle;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

public class GridTests extends TestCase {
	
	public void testBuildUnitGrid()
    {
        List<Tile> tiles = new ArrayList<Tile>(4);
        tiles.add(new Tile("1"));
        
        Grid g = new Grid();
        Tile[][] grid = g.buildGrid(1,1,tiles);
        
        assertEquals(1,grid.length);
        assertEquals(1,grid[0].length);
        assertEquals("1",grid[0][0].name);
    }
	
	public void testBuildDegenerateGrid() {
		Grid g = new Grid();
		Tile[][] grid = g.buildGrid(0, 0, null);

		assertEquals(0,grid.length);
	}
	
	public void testBuildSmallGrid() {
		List<Tile> tiles = new ArrayList<Tile>(4);
        tiles.add(new Tile("1"));
        tiles.add(new Tile("2"));
        tiles.add(new Tile("3"));
        tiles.add(new Tile("4"));
        
        Grid g = new Grid();
        Tile[][] grid = g.buildGrid(2,2,tiles);
        
        assertEquals(2, grid.length);
        assertEquals(2, grid[0].length);
        assertEquals("1", grid[0][0].name);
        assertEquals("2", grid[0][1].name);
        assertEquals("3", grid[1][0].name);
        assertEquals("4", grid[1][1].name);
	}
	
	public void testGridConstructorDegenerate() {
		Grid g = new Grid(0,0);
		
		assertEquals(0, g.width);
		assertEquals(0, g.height);
		assertEquals(0, g.grid.length);
	}
	
	public void testGridConstructorUnit() {
		Grid g = new Grid(1,1);
		
		assertEquals(1, g.width);
		assertEquals(1, g.height);
		assertEquals(1, g.grid.length);
		assertEquals(1, g.grid[0].length);
		assertEquals("Empty", g.grid[0][0].name);
		assertEquals(0, g.emptyx);
		assertEquals(0, g.emptyy);
	}
	
	public void testGridConstructorSmall() {
		Grid g = new Grid(2,2);
		
		assertEquals(2, g.width);
		assertEquals(2, g.height);
		assertEquals(2, g.grid.length);
		assertEquals(2, g.grid[0].length);
		assertEquals("Empty", g.grid[0][0].name);
		assertEquals("A", g.grid[0][1].name);
		assertEquals("B", g.grid[1][0].name);
		assertEquals("C", g.grid[1][1].name);
	}
}
