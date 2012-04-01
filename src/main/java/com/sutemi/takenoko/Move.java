package com.sutemi.takenoko;

public class Move {
	private int sourcex;
	private int sourcey;
	private int destx;
	private int desty;
	
	public Move(int sourcex, int sourcey, int destx, int desty) {
		if (sourcex < 0 || sourcey < 0 || destx < 0 || desty < 0) {
			throw new IllegalArgumentException("Coordinate values must be positive");
		}
		
		this.sourcex = sourcex;
		this.sourcey = sourcey;
		this.destx = destx;
		this.desty = desty;
	}
	
	public boolean isValid() {
		int deltax = Math.abs(getSourcex() - getDestx());
		int deltay = Math.abs(getSourcey() - getDesty());
		
		// can't stay in place
		if (deltax == 0 && deltay == 0) {
			return false;
		}
		
		// can't move more than one unit
		if (deltax > 1) {
			return false;
		}
		if (deltay > 1) {
			return false;
		}
		
		// can't move both directions at once
		if (deltax + deltay > 1) {
			return false;
		}
		
		return true;
	}

	public int getSourcex() {
		return sourcex;
	}

	public void setSourcex(int sourcex) {
		this.sourcex = sourcex;
	}

	public int getSourcey() {
		return sourcey;
	}

	public void setSourcey(int sourcey) {
		this.sourcey = sourcey;
	}

	public int getDestx() {
		return destx;
	}

	public void setDestx(int destx) {
		this.destx = destx;
	}

	public int getDesty() {
		return desty;
	}

	public void setDesty(int desty) {
		this.desty = desty;
	}
	
	
}
