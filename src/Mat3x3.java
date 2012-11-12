/**
 * 
 * A Class representing a 3x3 Matrix. This class is immutable, it can not be changed once created.
 * 
 * All methods return a new Matrix. <br>
 * <br>
 * The layout is the following: <br>
 * <br>
 * m11 m12 m13<br>
 * m21 m22 m23<br>
 * m31 m32 m33
 * 
 * @author Johann Hofmann
 * @author Anton Krebs
 * @author Gregor Rosenbaum
 * 
 */

final class Mat3x3 {

	/**
	 * Upper left value.
	 */
	final double m11;
	/**
	 * Upper center value.
	 */
	final double m12;
	/**
	 * Upper right value.
	 */
	final double m13;
	/**
	 * Middle left value.
	 */
	final double m21;
	/**
	 * Middle center value.
	 */
	final double m22;
	/**
	 * Middle right value.
	 */
	final double m23;
	/**
	 * Lower left value.
	 */
	final double m31;
	/**
	 * Lower center value.
	 */
	final double m32;
	/**
	 * Lower right value.
	 */
	final double m33;
	/**
	 * Determinant of the Matrix.
	 */
	final double determinant;

	/**
	 * 
	 * Creates a new Matrix that looks like this: <br>
	 * <br>
	 * m11 m12 m13<br>
	 * m21 m22 m23<br>
	 * m31 m32 m33
	 * 
	 * @param m11
	 *            Upper left value.
	 * @param m12
	 *            Upper center value.
	 * @param m13
	 *            Upper right value.
	 * @param m21
	 *            Middle left value.
	 * @param m22
	 *            Middle center value.
	 * @param m23
	 *            Middle right value.
	 * @param m31
	 *            Lower left value.
	 * @param m32
	 *            Lower center value.
	 * @param m33
	 *            Lower right value.
	 */

	public Mat3x3(final double m11, final double m12, final double m13, final double m21, final double m22, final double m23, final double m31,
			final double m32, final double m33) {
		this.m11 = m11;
		this.m12 = m12;
		this.m13 = m13;
		this.m21 = m21;
		this.m22 = m22;
		this.m23 = m23;
		this.m31 = m31;
		this.m32 = m32;
		this.m33 = m33;
		this.determinant = (m11 * m22 * m33) + (m12 * m23 * m31) + (m13 * m21 * m32) - (m31 * m22 * m13) - (m32 * m23 * m11) - (m33 * m21 * m12);
	}

	/**
	 * 
	 * Multiplication of the 3x3 Matrix with another 3x3 Matrix
	 * 
	 * @param m
	 *            the matrix to multiply with.
	 * @return the result of the calculation (a new Matrix).
	 */

	public Mat3x3 mul(final Mat3x3 m) {
		return new Mat3x3(m11 * m.m11 + m12 * m.m21 + m13 * m.m31, m11 * m.m12 + m12 * m.m22 + m13 * m.m32, m11 * m.m13 + m12 * m.m23 + m13 * m.m33,
				m21 * m.m11 + m22 * m.m21 + m23 * m.m31, m21 * m.m12 + m22 * m.m22 + m23 * m.m32, m21 * m.m13 + m22 * m.m23 + m23 * m.m33, m31
						* m.m11 + m32 * m.m21 + m33 * m.m31, m31 * m.m12 + m32 * m.m22 + m33 * m.m32, m31 * m.m13 + m32 * m.m23 + m33 * m.m33);
	}

	/**
	 * 
	 * Calculates the result of a multiplication between a vector and the 3x3 Matrix
	 * 
	 * @param p
	 *            the vector to multiply with.
	 * @return the result of the calculation (a new Vector).
	 */

	public Vector3 mul(final Vector3 v) {
		return new Vector3(m11 * v.x + m12 * v.y + m13 * v.z, m21 * v.x + m22 * v.y + m23 * v.z, m31 * v.x + m32 * v.y + m33 * v.z);
	}

	/**
	 * 
	 * Calculates the result of a multiplication between a point and the 3x3 Matrix
	 * 
	 * @param p
	 *            the point to multiply with.
	 * @return the result of the calculation (a new Point).
	 */

	public Point3 mul(final Point3 p) {
		return new Point3(m11 * p.x + m12 * p.y + m13 * p.z, m21 * p.x + m22 * p.y + m23 * p.z, m31 * p.x + m32 * p.y + m33 * p.z);
	}

	/**
	 * Switches the first column of the Matrix.
	 * 
	 * @param v
	 *            the Vector to change with.
	 * @return the changed Matrix.
	 */

	public Mat3x3 changeCol1(final Vector3 v) {
		return new Mat3x3(v.x, m12, m13, v.y, m22, m23, v.z, m32, m33);
	}

	/**
	 * Switches the second column of the Matrix.
	 * 
	 * @param v
	 *            the Vector to change with.
	 * @return the changed Matrix.
	 */

	public Mat3x3 changeCol2(final Vector3 v) {
		return new Mat3x3(m11, v.x, m13, m21, v.y, m23, m31, v.z, m33);
	}

	/**
	 * Switches the third column of the Matrix.
	 * 
	 * @param v
	 *            the Vector to change with.
	 * @return the changed Matrix.
	 */
	public Mat3x3 changeCol3(final Vector3 v) {
		return new Mat3x3(m11, m12, v.x, m21, m22, v.y, m31, m32, v.y);
	}

	@Override
	public String toString() {
		return m11 + " " + m12 + " " + m13 + "\n" + m21 + " " + m22 + " " + m23 + "\n" + m31 + " " + m32 + " " + m33;
	}

}
