final class Vector3 {

	final double x;
	final double y;
	final double z;
	final double magnitude;

	/**
	 * 
	 * @param x
	 *            x-value for a 3 dimensional vector.
	 * @param y
	 *            y-value for a 3 dimensional vector.
	 * @param z
	 *            z-value for a 3 dimensional vector.
	 */

	public Vector3(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
		magnitude = Math.sqrt((Math.pow(x, 2)) + (Math.pow(y, 2)) + (Math.pow(z, 2)));
		/**
		 * Sets the length of the Vector3.
		 */
	}

	public Vector3 add(Vector3 v) {
		return new Vector3(x + v.x, y + v.y, z + v.z);
		/**
		 * Adds another Vector3 to the existing Vector3.
		 */
	}

	public Vector3 add(Normal3 n) {
		return new Vector3(x + n.x, y + n.y, z + n.z);
		/**
		 * Adds a Normal3 to the Vector3.
		 */
	}

	public Vector3 sub(Normal3 n) {
		return new Vector3(x - n.x, y - n.y, z - n.z);
		// Rechnung korrrekt?
		/**
		 * Subtracts a Normal3 from the Vector3.
		 */
	}

	public Vector3 mul(double c) {
		return new Vector3(x * c, y * c, z * c);
		/**
		 * Multiplies the Vector3 with a floating-point number.
		 */
	}

	public double dot(Vector3 v) {
		return x * v.x + y * v.y + z * v.z;
		// Aussage korrekt?
		/**
		 * Multiplies the Vector3 with another Vector3.
		 */
	}

	public double dot(Normal3 n) {
		return x * n.x + y * n.y + z * n.z;
		/**
		 * Multiplies the Vector3 with a Normal3.
		 */
	}

	public Vector3 normalized() {
		return mul(1 / Math.sqrt(x * x + y * y + z * z));
		/**
		 * Returns the normalized Vector3.
		 */
	}

	public Normal3 asNormal() {
		Vector3 v = normalized();
		return new Normal3(v.x, v.y, v.z);
		/**
		 * Creates a Normal3 from the normalized Vector3.
		 */

	}

	public Vector3 reflectedOn(Normal3 n) {
		// Vr=-(Vi-2*(Vi·N)*N)
		return this.add(n.mul((this.dot(n) * -2.0))).mul(-1);
		/**
		 * Returns the Vector3 as a result of the reflection of the Vector3 on a Normal3.
		 */
	}

	public Vector3 x(Vector3 v) {
		return new Vector3(y * v.y - z * v.y, z * v.x - x * v.z, x * v.y - y * v.x);
		/**
		 * Multiplies the Vector3 with another Vector3
		 */

	}

	@Override
	public String toString() {
		return x + "\n" + y + "\n" + z;
		/**
		 * Returns the Vector3 to correct output.
		 */
	}

}
