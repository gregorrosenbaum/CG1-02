public class Point3 {

	final double x;
	final double y;
	final double z;

	public Point3(final double x, final double y, final double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public final Vector3 sub(Point3 p) {
		return new Vector3(x - p.x, y - p.y, z - p.z);
	}

	public final Point3 sub(Vector3 v) {
		return new Point3(x - v.x, y - v.y, z - v.z);

	}

	public final Point3 add(Vector3 v) {
		return new Point3(x + v.x, y + v.y, z + v.z);
	}

	@Override
	public String toString() {
		return x + "\n" + y + "\n" + z;
	}
}
