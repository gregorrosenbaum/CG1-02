public class Normal3 {

	final double x;
	final double y;
	final double z;
	
	/**
	 * 
	 * @param x
	 * @param y
	 * @param z
	 */

	public Normal3(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
		
		/**
		 * 
		 */
	}

	public Normal3 mul(double n) {
		return new Normal3(x * n, y * n, z * n);
		/**
		 * 
		 */
	}

	public Normal3 add(Normal3 n) {
		return new Normal3(x + n.x, y + n.y, z + n.z);
		/**
		 * 
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
		 * 
		 */
	}
}
