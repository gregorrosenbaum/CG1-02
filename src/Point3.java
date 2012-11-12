final class Point3 {

	final double x;
	final double y;
	final double z;
	/**
	 * 
	 * @param x x-value for a 3 dimensional system
	 * @param y y-value for a 3 dimensional system
	 * @param z z-value for a 3 dimensional system
	 */
	public Point3(final double x, final double y, final double z) {
		this.x = x;
		this.y = y;
		this.z = z;
		/**
		 * Point 3 gives us a point with our values x,y,z
		 */
	}

	public final Vector3 sub(Point3 p) {
		return new Vector3(x - p.x, y - p.y, z - p.z);
		/**
		 *  Vector3 sub(Point3 p) gives us the result of a subtraction 
		 *  between a vector and the point
		 */
	}

	public final Point3 sub(Vector3 v) {
		return new Point3(x - v.x, y - v.y, z - v.z);
		/**
		 *  Point3 sub(Vector3 v) gives us the result of a subtraction
		 *  between the point and a vector
		 */

	}

	public final Point3 add(Vector3 v) {
		return new Point3(x + v.x, y + v.y, z + v.z);
		/**
		 * Point3 add(Vector3 v) gives us the result of an addition
		 * between the point and a vector
		 */
	}

	@Override
	public String toString() {
		return x + "\n" + y + "\n" + z;
		/**
		 * return result of a point to correct output
		 */
	}
}
