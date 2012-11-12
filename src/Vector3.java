/**
 * 
 * A Vector in a 3-dimensional space. This class is immutable, it can not be changed once created.<br>
 * <br>
 * Layout is:<br>
 * <br>
 * x<br>
 * y<br>
 * z<br>
 * 
 * @author Johann Hofmann
 * @author Anton Krebs
 * @author Gregor Rosenbaum
 * 
 */

final class Vector3 {

	/**
	 * x-value of the vector.
	 */
	final double x;
	/**
	 * y-value of the vector.
	 */
	final double y;
	/**
	 * z-value of the vector.
	 */
	final double z;
	/**
	 * the length of the vector.
	 */
	final double magnitude;

	/**
	 * 
	 * Creates a new Vector with the following layout:
	 * 
	 * <br>
	 * x<br>
	 * y<br>
	 * z<br>
	 * 
	 * @param x
	 *            x-value for a 3 dimensional vector.
	 * @param y
	 *            y-value for a 3 dimensional vector.
	 * @param z
	 *            z-value for a 3 dimensional vector.
	 */

	public Vector3(final double x, final double y, final double z) {
		this.x = x;
		this.y = y;
		this.z = z;
		magnitude = Math.sqrt((Math.pow(x, 2)) + (Math.pow(y, 2)) + (Math.pow(z, 2)));
	}

	/**
	 * 
	 * Adds two vectors.
	 * 
	 * @param v
	 *            the vector to add.
	 * @return the result as a new vector.
	 */
	public Vector3 add(final Vector3 v) {
		return new Vector3(x + v.x, y + v.y, z + v.z);
	}

	/**
	 * 
	 * Adds a normal to the vector.
	 * 
	 * @param n
	 *            the normal to add.
	 * @return the result as a new vector.
	 */

	public Vector3 add(final Normal3 n) {
		return new Vector3(x + n.x, y + n.y, z + n.z);
	}

	/**
	 * 
	 * Substracts a normal from the vector.
	 * 
	 * @param n
	 *            the normal to substract.
	 * @return the result as a new vector.
	 */

	public Vector3 sub(final Normal3 n) {
		return new Vector3(x - n.x, y - n.y, z - n.z);
	}

	/**
	 * 
	 * Multiplies the vector with a double.
	 * 
	 * @param c
	 *            the double to multiply with.
	 * @return the result as a new vector.
	 */

	public Vector3 mul(final double c) {
		return new Vector3(x * c, y * c, z * c);
	}

	/**
	 * 
	 * Multiplies two vectors.
	 * 
	 * @param v
	 *            the vector to multiply with.
	 * @return the result as a double.
	 */

	public double dot(final Vector3 v) {
		return x * v.x + y * v.y + z * v.z;
	}

	/**
	 * 
	 * Multiplies a normal with the vector.
	 * 
	 * @param n
	 *            the normal to multiply with.
	 * @return the result as a double.
	 */
	public double dot(final Normal3 n) {
		return x * n.x + y * n.y + z * n.z;
	}

	/**
	 * 
	 * Normalizes the vector.
	 * 
	 * @return the normal to the vector as a vector.
	 */

	public Vector3 normalized() {
		return mul(1 / Math.sqrt(x * x + y * y + z * z));
	}

	/**
	 * 
	 * Normalizes the vector and returns it as a normal
	 * 
	 * @return the normal to the vector.
	 */

	public Normal3 asNormal() {
		Vector3 v = normalized();
		return new Normal3(v.x, v.y, v.z);
	}

	/**
	 * 
	 * Reflects the vector on a normal.
	 * 
	 * @param n
	 *            the normal to reflect on.
	 * @return the result as a new vector.
	 */

	public Vector3 reflectedOn(final Normal3 n) {
		// Vr=-(Vi-2*(Vi·N)*N)
		return this.add(n.mul((this.dot(n) * -2.0))).mul(-1);
	}

	/**
	 * 
	 * Calculates the cross product of two vectors.
	 * 
	 * @param v
	 *            the second vector.
	 * @return the result as a new vector.
	 */

	public Vector3 x(final Vector3 v) {
		return new Vector3(y * v.y - z * v.y, z * v.x - x * v.z, x * v.y - y * v.x);
	}

	@Override
	public String toString() {
		return x + "\n" + y + "\n" + z;
	}

}
