/**
 * 
 * A Normal in a 3-dimensional space. This class is immutable, it can not be changed once created.<br>
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

final class Normal3 {

	/**
	 * x-value of the normal.
	 */
	final double x;
	/**
	 * y-value of the normal.
	 */
	final double y;
	/**
	 * z-value of the normal.
	 */
	final double z;

	/**
	 * 
	 * Creates a new Normal with the following layout:
	 * 
	 * <br>
	 * x<br>
	 * y<br>
	 * z<br>
	 * 
	 * @param x
	 *            x-value for a 3 dimensional normal.
	 * @param y
	 *            y-value for a 3 dimensional normal.
	 * @param z
	 *            z-value for a 3 dimensional normal.
	 */

	public Normal3(final double x, final double y, final double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	/**
	 * 
	 * Multiplies the normal with a double.
	 * 
	 * @param n
	 *            the double to multiply with.
	 * @return the result as a new normal.
	 */

	public Normal3 mul(final double n) {
		return new Normal3(x * n, y * n, z * n);
	}

	/**
	 * 
	 * Adds two normals.
	 * 
	 * @param n
	 *            the normal to add.
	 * @return the result as a new normal.
	 */
	public Normal3 add(final Normal3 n) {
		return new Normal3(x + n.x, y + n.y, z + n.z);
	}

	/**
	 * 
	 * Multiplies the normal with a vector.
	 * 
	 * @param v
	 *            the vector to multiply with.
	 * @return the result as a double.
	 */

	public double dot(final Vector3 v) {
		return x * v.x + y * v.y + z * v.z;
	}

	@Override
	public String toString() {
		return x + "\n" + y + "\n" + z;
	}
}
