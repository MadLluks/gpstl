package algorithms;

import java.util.ArrayList;

import characteristics.IRadarResult;
import characteristics.IRadarResult.Types;
import robotsimulator.Brain;

public class Launcher extends Brain {
ArrayList<IRadarResult> teamList;
	
	public void activate() {
		this.teamList = this.detectRadar();
	}

	public void step() {
		defineCoord();
	}
	
	private void defineCoord() {
		String dir = "";
		for(int i=0; i<teamList.size(); i++){
			if(teamList.get(i).getObjectType() == Types.TeamSecondaryBot) {
				dir += Math.floor(teamList.get(i).getObjectDirection()) + "/";
			}
		}
		this.sendLogMessage(dir);
	}

}
