
public class Mat3x3 {
	
	final double m11;
	final double m12;
	final double m13;
	final double m21;
	final double m22;
	final double m23;
	final double m31;
	final double m32;
	final double m33;
	final double determinant;
	
	public Mat3x3(double m11, double m12, double m13, double m21, double m22,
			double m23, double m31, double m32, double m33, double determinant) {
		super();
		this.m11 = m11;
		this.m12 = m12;
		this.m13 = m13;
		this.m21 = m21;
		this.m22 = m22;
		this.m23 = m23;
		this.m31 = m31;
		this.m32 = m32;
		this.m33 = m33;
		this.determinant = (m11 * m22* m33) + (m12 * m23 * m31) + (m13 * m21 * m32) - (m31 * m22 * m13) - (m32 * m23 *m11 ) - (m33 * m21 * m12);
	}
	public Mat3x3 mul (Mat3x3 m){
		
		
	}
	public Vector3 mul (Vector3 v){
		
	}
	
	public Point3 mul (Point3 p){
		
	}
	
	public Mat3x3 changeCol1(Vector3 v){
		
	}
	
	public Mat3x3 changeCol2(Vector3 v){
		
	}
	
	public Mat3x3 changeCol3(Vector3 v){
		
	}
	
	


}




