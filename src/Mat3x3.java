final class Mat3x3 { 

	private final double m11; 
	private final double m12;
	private final double m13;
	private final double m21;
	private final double m22;
	private final double m23;
	private final double m31;
	private final double m32;
	private final double m33;
	final double determinant;
	/**
	 * 
	 * @param m11 Variable for 3x3 Matrix left up
	 * @param m12 Variable for 3x3 Matrix middle up
	 * @param m13 Variable for 3x3 Matrix right up
	 * @param m21 Variable for 3x3 Matrix left middle
	 * @param m22 Variable for 3x3 Matrix middle middle
	 * @param m23 Variable for 3x3 Matrix right middle
	 * @param m31 Variable for 3x3 Matrix left down
	 * @param m32 Variable for 3x3 Matrix middle down
	 * @param m33 Variable for 3x3 Matrix right down
	 * @param determinant gives the determinant
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
		/**
		 *  result for determinant
		 */
	}

	public final Mat3x3 mul(Mat3x3 m) {
		return new Mat3x3(m11 * m.m11 + m12 * m.m21 + m13 * m.m31, m11 * m.m12 + m12 * m.m22 + m13 * m.m32, m11 * m.m13 + m12 * m.m23 + m13 * m.m33,
				m21 * m.m11 + m22 * m.m21 + m23 * m.m31, m21 * m.m12 + m22 * m.m22 + m23 * m.m32, m21 * m.m13 + m22 * m.m23 + m23 * m.m33, m31
						* m.m11 + m32 * m.m21 + m33 * m.m31, m31 * m.m12 + m32 * m.m22 + m33 * m.m32, m31 * m.m13 + m32 * m.m23 + m33 * m.m33);
		/**
		 *  Mat3x3 mul gives us the result of multiplication of the 3x3 Matrix with another 3x3 Matrix
		 */
	}

	public final Vector3 mul(Vector3 v) {
		return new Vector3(m11 * v.x + m12 * v.y + m13 * v.z, m21 * v.x + m22 * v.y + m23 * v.z, m31 * v.x + m32 * v.y + m33 * v.z);
		/**
		 * Vector3 mul gives us the result of a multiplication between the 3x3 Matrix and a vector
		 */
	}

	public final Point3 mul(Point3 p) {
		return new Point3(m11 * p.x + m12 * p.y + m13 * p.z, m21 * p.x + m22 * p.y + m23 * p.z, m31 * p.x + m32 * p.y + m33 * p.z);
		/**
		 * Vector3 mul gives us the result of a multiplication between a point and the 3x3 Matrix
		 */
	}

	public final Mat3x3 changeCol1(Vector3 v) {
		return new Mat3x3(v.x, m12, m13, v.y, m22, m23, v.z, m32, m33);
		/**
		 * Change first column of Matrix
		 */
	}

	public final Mat3x3 changeCol2(Vector3 v) {
		return new Mat3x3(m11, v.x, m13, m21, v.y, m23, m31, v.z, m33);
		/**
		 * Change second column of Matrix
		 */
	}

	public final Mat3x3 changeCol3(Vector3 v) {
		return new Mat3x3(m11, m12, v.x, m21, m22, v.y, m31, m32, v.y);
		/**
		 * Change third column of Matrix
		 */
	}

	@Override
	public String toString() {
		return m11 + " " + m12 + " " + m13 + "\n" + m21 + " " + m22 + " " + m23 + "\n" + m31 + " " + m32 + " " + m33;
		/**
		 * return result of the matrix to correct output
		 */
	}

}
