public class Test {

	public static void main(final String[] args) {
		Mat3x3 testmat = new Mat3x3(1, 0, 0, 0, 1, 0, 0, 0, 1);
		Mat3x3 testmat2 = new Mat3x3(1, 2, 3, 4, 5, 6, 7, 8, 9);
		Normal3 testnorm = new Normal3(1, 2, 3);
		Normal3 testnorm2 = new Normal3(1, 2, 3);
		Vector3 testvec = new Vector3(1, 0, 0);
		Point3 testpoint = new Point3(1, 1, 1);
		Point3 testpoint2 = new Point3(2, 2, 0);

		// AK1
		System.out.println("\nAK1:");
		testnorm = new Normal3(1, 2, 3);
		System.out.println(testnorm.mul(0.5));

		// AK2
		System.out.println("\nAK2:");
		testnorm = new Normal3(1, 2, 3);
		testnorm2 = new Normal3(3, 2, 1);
		System.out.println(testnorm.add(testnorm2));

		// AK3
		System.out.println("\nAK3:");
		testnorm = new Normal3(1, 0, 0);
		testnorm2 = new Normal3(0, 1, 0);
		testvec = new Vector3(1, 0, 0);
		System.out.println(testvec.dot(testnorm));
		System.out.println(testvec.dot(testnorm2));

		// AK4
		System.out.println("\nAK4:");
		testpoint = new Point3(1, 1, 1);
		testpoint2 = new Point3(2, 2, 0);
		System.out.println(testpoint.sub(testpoint2));

		// AK5
		System.out.println("\nAK5:");
		testpoint = new Point3(1, 1, 1);
		testvec = new Vector3(4, 3, 2);
		System.out.println(testpoint.sub(testvec));

		// AK6
		System.out.println("\nAK6:");
		testpoint = new Point3(1, 1, 1);
		testvec = new Vector3(4, 3, 2);
		System.out.println(testpoint.add(testvec));

		// AK7
		System.out.println("\nAK7:");
		testvec = new Vector3(1, 1, 1);
		System.out.println(Math.sqrt(3) + " == " + testvec.magnitude);
		System.out.println(Math.sqrt(3) == testvec.magnitude);

		// AK8
		System.out.println("\nAK8: ACHTUNG FEHLER!!!!!!");
		testnorm = new Normal3(0, 1, 0);
		testvec = new Vector3(-1, 1, 0);
		System.out.println(testvec.reflectedOn(testnorm));

		// AK9
		System.out.println("\nAK9:");
		testmat = new Mat3x3(1, 0, 0, 0, 1, 0, 0, 0, 1);
		testpoint = new Point3(3, 2, 1);
		testvec = new Vector3(3, 2, 1);
		System.out.println(testmat.mul(testvec) + "\n==\n" + testmat.mul(testpoint));

		// AK10
		System.out.println("\nAK10:");
		testmat = new Mat3x3(1, 0, 0, 0, 1, 0, 0, 0, 1);
		testmat2 = new Mat3x3(1, 2, 3, 4, 5, 6, 7, 8, 9);
		System.out.println(testmat2.mul(testmat));

		// AK11
		System.out.println("\nAK11:");
		testmat = new Mat3x3(0, 0, 1, 0, 1, 0, 1, 0, 0);
		testmat2 = new Mat3x3(1, 2, 3, 4, 5, 6, 7, 8, 9);
		System.out.println(testmat2.mul(testmat));
		

	}
}
