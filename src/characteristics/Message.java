package characteristics;

import java.io.Serializable;

public class Message implements Serializable {
	private static final long serialVersionUID = -4544509663339816146L;
	
	private IRadarResult target;
	
	public IRadarResult getTarget() {
		return this.target;
	}
	
	public void setTarget(IRadarResult target) {
		this.target = target;
	}
}
