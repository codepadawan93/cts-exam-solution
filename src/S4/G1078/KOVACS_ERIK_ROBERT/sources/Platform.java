package S4.G1078.KOVACS_ERIK_ROBERT.sources;

import java.util.ArrayList;

import S4.G1078.KOVACS_ERIK_ROBERT.tests.DurationException;

public class Platform {
	
	final private static int ONE_YEAR = 365;
	private int platformNo;
	private int daySinceLastInspection;
	private ArrayList<Integer> piecesCost;

	public Platform(int platformNo, int noDays) {
		this.platformNo = platformNo;
		this.daySinceLastInspection = noDays;
		piecesCost = new ArrayList<>();
	}

	public ArrayList<Integer> getPiecesCost() {
		return piecesCost;
	}

	public void setPiecesCost(ArrayList<Integer> piecesCost) {
		this.piecesCost = piecesCost;
	}

	public void setNoDays(int noDays) throws DurationException {
		if(noDays < 0 ) {
			throw new DurationException();
		}
		this.daySinceLastInspection = noDays;
	}

	public boolean isInspectionNecessary() {
		return this.daySinceLastInspection > ONE_YEAR;
	}
	
	
	public int totalCost() {
		int total = 0;
		for(int cost : piecesCost)
			total += cost;
		return total;
	}
	

	public int getVehicleTransportCost(IVehicle vehicle) {
		if(vehicle.getWeight() > 1000)
			return 150;
		else
			return 90;
	}

}
