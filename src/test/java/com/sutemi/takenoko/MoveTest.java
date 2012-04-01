package com.sutemi.takenoko;

import com.sutemi.takenoko.Move;

import junit.framework.TestCase;

public class MoveTest extends TestCase {

	public void testMoveCoordinatesMustBePositive() {
		try {
			Move m1 = new Move(0,0,-1,-1);
			fail();
		} catch (IllegalArgumentException expected) {
			assertTrue(true);
		}
		
	}
	
	public void testMovingOneUnitInAnyDirectionIsValid()
    {
        Move m1 = new Move(0,0,1,0);
        assertTrue(m1.isValid());
        
        Move m2 = new Move (0,0,0,1);
        assertTrue(m2.isValid());
        
        Move m3 = new Move(1,1,0,1);
        assertTrue(m3.isValid());
        
        Move m4 = new Move(1,1,1,0);
        assertTrue(m4.isValid());
    }
	
	public void testMovingMoreThanOneUnitInAnyDirectionIsNotValid() {
		Move m1 = new Move(0,0,2,0);
		assertFalse(m1.isValid());
		
		Move m2 = new Move(0,0,0,2);
		assertFalse(m2.isValid());
		
		Move m3 = new Move(2,2,0,2);
		assertFalse(m3.isValid());
		
		Move m4 = new Move(2,2,2,0);
		assertFalse(m4.isValid());
	}
	
	
	// move in both x and y is not valid
	public void testMovingInBothDirectionsIsNotValid() {
		Move m1 = new Move(0,0,1,1);
		assertFalse(m1.isValid());
		
		Move m2 = new Move(2,2,0,0);
		assertFalse(m2.isValid());
	}
	
	// move where source and dest the same is not valid
	public void testMovingSameSourceAndDestinationIsNotValid() {
		Move m1 = new Move(0,0,0,0);
		assertFalse(m1.isValid());
		
		Move m2 = new Move(0,0,0,0);
		assertFalse(m2.isValid());
	}
	
	
}
