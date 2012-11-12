final class Normal3 {

	final double x;
	final double y;
	final double z;
	
	/**
	 * 
	 * @param x x-value of a 3 dimensional normal.
	 * @param y y-value of a 3 dimensional normal.
	 * @param z z-value of a 3 dimensional normal.
	 */

	public Normal3(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
		
		/**
		 * Sets the values of the Normal3.
		 */
	}

	public Normal3 mul(double n) {
		return new Normal3(x * n, y * n, z * n);
		/**
		 * Multiplies the Normal3 with a floating-point number.
		 * Returns a Normal3.
		 */
	}

	public Normal3 add(Normal3 n) {
		return new Normal3(x + n.x, y + n.y, z + n.z);
		/**
		 * Adds another Normal3 to the existing one and returns result as Normal3.
		 */
	}

	public double dot(Vector3 v) {
		return x * v.x + y * v.y + z * v.z;
		/**
		 * 
		 */
	}

	@Override
	public String toString() {
		return x + "\n" + y + "\n" + z;
		/**
		 * Adds another Normal3 to the existing one and returns result as Normal3.
		 */
	}
}
