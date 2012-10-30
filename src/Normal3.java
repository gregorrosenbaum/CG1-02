
public class Normal3 {
	
	final double x;
	final double y;
	final double z;
	
	public Normal3(double x, double y, double z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public Normal3 mul(double n){
		return new Normal3(x * n,y * n,z* n);
	}
	
	public Normal3 add(Vector3 v){
		return new Normal3(x + v.x,y+v.y,z+v.z);
	}
	
	public double dot(Vector3 v){
		return x * v.x + y * v.y + z * v.z;		
	}
}
