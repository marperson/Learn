package Exercise_8_10;

public enum TrafficLight {
	RED(5),
	Yellow(10),
	GREEN(15);
	
	int time;
	
	/**
	 * @return the time
	 */
	public int getTime() {
		return time;
	}

	/**
	 * @param time the time to set
	 */
	public void setTime(int time) {
		this.time = time;
	}

	TrafficLight(int time){
		setTime(time);
	}
}
