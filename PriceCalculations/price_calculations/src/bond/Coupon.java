package bond;

public class Coupon {
	private float rate;
	private Frequency frequency;
	
	public Coupon() {
		frequency = Frequency.YEARLY;
		rate = 0.0f;
	}

	public Coupon(float rate, Frequency frequency) {
		super();
		this.rate = rate;
		this.frequency = frequency;
	}

	public float getRate() {
		return rate;
	}

	public void setRate(float rate) {
		this.rate = rate;
	}

	public Frequency getFrequency() {
		return frequency;
	}

	public void setFrequency(Frequency frequency) {
		this.frequency = frequency;
	}
	
	
}
