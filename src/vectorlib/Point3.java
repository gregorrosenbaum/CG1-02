package vectorlib;
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

public final class Point3 {

	/**
	 * x-value of the point
	 */
	public final double x;
	/**
	 * y-value of the point
	 */
	public final double y;
	/**
	 * z-value of the point
	 */
	public final double z;

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(x);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(y);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(z);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point3 other = (Point3) obj;
		if (Double.doubleToLongBits(x) != Double.doubleToLongBits(other.x))
			return false;
		if (Double.doubleToLongBits(y) != Double.doubleToLongBits(other.y))
			return false;
		if (Double.doubleToLongBits(z) != Double.doubleToLongBits(other.z))
			return false;
		return true;
	}
}
