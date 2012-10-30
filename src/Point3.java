
public class Point3 {
	
	final double x;
	final double y;
	final double z;
	
	public Point3(double x, double y, double z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public Vector3 sub (Point3 p){
		return new Vector3(x - p.x,y-p.y,z-p.z);
	}
	
	public Point3 sub (Vector3 v){
		return new Point3(x - v.x,y-v.y,z-v.z)
		
	}
	public Point3 add (Vector3 v){
		return new Point3(x + v.x,y+v.y,z+v.z)
	}
}
