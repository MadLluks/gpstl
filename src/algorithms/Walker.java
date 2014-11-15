package algorithms;

import java.util.ArrayList;

import characteristics.IRadarResult;
import characteristics.IRadarResult.Types;
import characteristics.Parameters.Direction;
import robotsimulator.Brain;

public class Walker extends Brain {
	private static final double HEADINGPRECISION = 0.01;
	private double endTaskDirection;
	//0155656615
	//Random Team 30
	//Fuyards 30
	//Berzercks 40
	//Campers
	//Secondary : 25%
	//Main : 75%
	private IRadarResult mainTarget;
	private IRadarResult secondaryTarget;
	
	private int x;
	private int y;
	
	ArrayList<IRadarResult> teamList;
	
	public void activate() {
		this.mainTarget = this.secondaryTarget = null;
		this.x = this.y = -1;
		this.endTaskDirection = this.getHeading();
		this.teamList = this.detectRadar();
		defineCoord();
		this.sendLogMessage(this.x + "//" + this.y);
	}

	public void step() {
		if(x == -1){
			
		}
	}
	
	private boolean isHeading(double dir){
		return Math.abs(Math.sin(getHeading()-dir))<HEADINGPRECISION;
	}
	
	private void defineCoord() {
		double val = Math.floor(Math.abs(teamList.get(0).getObjectDirection()));

		if( val >=2) {
			this.x = 500;
		}
		else {
			this.x = 2500;
		}
		
		if( teamList.get(1).getObjectDirection() < 0) {
			this.y = 800;
		}
		else {
			this.y = 1200;
		}
		
		
	}
}
