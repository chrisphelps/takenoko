package com.sutemi.takenoko;

import java.util.ArrayList;
import java.util.List;

import com.sutemi.takenoko.Grid;
import com.sutemi.takenoko.Tile;

import junit.framework.TestCase;

public class GridTest extends TestCase {
	
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
		
		assertEquals(0, g.getWidth());
		assertEquals(0, g.getHeight());
		assertEquals(0, g.getGrid().length);
	}
	
	public void testGridConstructorUnit() {
		Grid g = new Grid(1,1);
		
		assertEquals(1, g.getWidth());
		assertEquals(1, g.getHeight());
		assertEquals(1, g.getGrid().length);
		assertEquals(1, g.getGrid()[0].length);
		assertEquals("Empty", g.getGrid()[0][0].name);
		assertEquals(0, g.getEmptyx());
		assertEquals(0, g.getEmptyy());
	}
	
	public void testGridConstructorSmall() {
		Grid g = new Grid(2,2);
		
		assertEquals(2, g.getWidth());
		assertEquals(2, g.getHeight());
		assertEquals(2, g.getGrid().length);
		assertEquals(2, g.getGrid()[0].length);
		assertEquals("Empty", g.getGrid()[0][0].name);
		assertEquals("A", g.getGrid()[0][1].name);
		assertEquals("B", g.getGrid()[1][0].name);
		assertEquals("C", g.getGrid()[1][1].name);
	}
}
