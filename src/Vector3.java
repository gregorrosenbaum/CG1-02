
public class Vector3 {
	
	final double x;
	final double y;
	final double z;
	final double magnitude;
	
	public Vector3(double x, double y, double z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
		magnitude = Math.sqrt((Math.pow(x, 2))+(Math.pow(y, 2))+(Math.pow(z, 2)));
	}
	
	public Vector3 add (Vector3 v){
		return new Vector3(x + v.x,y+v.y,z+v.z);
	}
	
	public Vector3 add (Normal3 n){
		return new Vector3(x + n.x,y+n.y,z+n.z);
	}
	
	public Vector3 sub (Normal3 n){
		return new Vector3(x + n.x,y+n.y,z+n.z);
	}
	
	public Vector3 mul (double c){
		return new Vector3(x * c,y * c,z* c);
	}
	
	public double dot (Vector3 v){
		return x * v.x + y * v.y + z * v.z;		
	}
	
	public double dot (Normal3 n){
		return x * n.x + y * n.y + z * n.z;				
	}
	
	public Vector3 normalized (){
		return mul(1 / Math.sqrt(x*x + y*y + z*z));		
	}
	
	public Normal3 asNormal(){
		Vector3 v = normalized();
		return new Normal3(v.x, v.y, v.z);
		
	}
	
	public Vector3 reflectedOn (Normal3 n){
		// vnew = -2*(V dot n) * n + v
		return this.add(n.mul((this.dot(n) * -2.0)));
	}
	
	public Vector3 x (Vector3 v){
		return new Vector3(y*v.y - z * v.y,z*v.x-x*v.z,x*v.y-y*v.x);
		
	}
}
