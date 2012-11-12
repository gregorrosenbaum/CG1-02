/**
 * 
 * A simple Point in a 3-dimensional space. This class is immutable, it can not be changed once
 * created.<br>
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

final class Point3 {

	/**
	 * x-value of the point
	 */
	final double x;
	/**
	 * y-value of the point
	 */
	final double y;
	/**
	 * z-value of the point
	 */
	final double z;

	/**
	 * 
	 * Creates a new Point with the following layout:
	 * 
	 * <br>
	 * x<br>
	 * y<br>
	 * z<br>
	 * 
	 * @param x
	 *            x-value of the point
	 * @param y
	 *            y-value of the point
	 * @param z
	 *            z-value of the point
	 */
	public Point3(final double x, final double y, final double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	/**
	 * 
	 * Gives us the result of a substraction of another point from the point.
	 * 
	 * @param p
	 *            the point to substract.
	 * @return the result as a new Vector.
	 */
	public Vector3 sub(final Point3 p) {
		return new Vector3(x - p.x, y - p.y, z - p.z);
	}

	/**
	 * 
	 * Gives us the result of a substraction of a vector from the point.
	 * 
	 * @param v
	 *            the vector to substract.
	 * @return the result as a new Vector.
	 */

	public Point3 sub(final Vector3 v) {
		return new Point3(x - v.x, y - v.y, z - v.z);
	}

	/**
	 * 
	 * Gives us the result of the addition of a Vector to the Point.
	 * 
	 * @param v
	 *            the vector to add.
	 * @return the result as a new Point.
	 */

	public Point3 add(final Vector3 v) {
		return new Point3(x + v.x, y + v.y, z + v.z);
	}

	@Override
	public String toString() {
		return x + "\n" + y + "\n" + z;
	}
}
