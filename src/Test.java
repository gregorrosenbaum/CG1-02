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
		testnorm = new Normal3(1, 2, 3);
		testnorm2 = new Normal3(3, 2, 1);
		System.out.println(testnorm.add(testnorm2));

		// AK4
		System.out.println("\nAK4:");
		testnorm = new Normal3(1, 0, 0);
		testnorm2 = new Normal3(0, 1, 0);
		testvec = new Vector3(1, 0, 0);
		System.out.println(testvec.dot(testnorm));
		System.out.println(testvec.dot(testnorm2));

		// AK5
		System.out.println("\nAK5:");
		testpoint = new Point3(1, 1, 1);
		testpoint2 = new Point3(2, 2, 0);
		System.out.println(testpoint.sub(testpoint2));
		
		// AK6
		System.out.println("\nAK6:");
		testpoint = new Point3(1, 1, 1);
		testpoint2 = new Point3(2, 2, 0);
		System.out.println(testpoint.sub(testpoint2));

		// AK7
		System.out.println("\nAK7:");
		testpoint = new Point3(1, 1, 1);
		testvec = new Vector3(4, 3, 2);
		System.out.println(testpoint.sub(testvec));

		// AK8
		System.out.println("\nAK8:");
		testpoint = new Point3(1, 1, 1);
		testvec = new Vector3(4, 3, 2);
		System.out.println(testpoint.add(testvec));

		// AK9
		System.out.println("\nAK9:");
		testvec = new Vector3(1, 1, 1);
		System.out.println(Math.sqrt(3) + " == " + testvec.magnitude);
		System.out.println(Math.sqrt(3) == testvec.magnitude);
		
		// AK10
		System.out.println("\nAK10:");
		testvec = new Vector3 (1, 1, 1);
		testnorm = new Normal3(1, 1, 1);
		System.out.println(testvec.add(testvec));
		System.out.println("");
		System.out.println(testvec.add(testnorm));
		System.out.println("");
		System.out.println("FEHLER?????!???? SUBBBBBBB");
		System.out.println(testvec.sub(testnorm));
		System.out.println("");
		System.out.println(testvec.mul(3));

		// AK11
		System.out.println("\nAK11: ACHTUNG FEHLER!!!!!!BEHOBEN??");
		testnorm = new Normal3(0, 1, 0);
		testvec = new Vector3(-1, 1, 0);
		System.out.println(testvec.reflectedOn(testnorm));

		// AK12
		System.out.println("\nAK12:");
		testmat = new Mat3x3(1, 0, 0, 0, 1, 0, 0, 0, 1);
		testpoint = new Point3(3, 2, 1);
		testvec = new Vector3(3, 2, 1);
		System.out.println(testmat.mul(testvec) + "\n==\n" + testmat.mul(testpoint));

		// AK13
		System.out.println("\nAK13:");
		testmat = new Mat3x3(1, 0, 0, 0, 1, 0, 0, 0, 1);
		testmat2 = new Mat3x3(1, 2, 3, 4, 5, 6, 7, 8, 9);
		System.out.println(testmat2.mul(testmat));

		// AK14
		System.out.println("\nAK14:");
		testmat = new Mat3x3(0, 0, 1, 0, 1, 0, 1, 0, 0);
		testmat2 = new Mat3x3(1, 2, 3, 4, 5, 6, 7, 8, 9);
		System.out.println(testmat2.mul(testmat));
		
		// AK15
		System.out.println("\nAK15:");
		testmat = new Mat3x3(1, 2, 3, 4, 5, 6, 7, 8, 9);
		testvec = new Vector3(8, 8, 8);
		System.out.println(testmat.changeCol1(testvec));
		System.out.println("");
		System.out.println(testmat.changeCol2(testvec));
		System.out.println("");
		System.out.println(testmat.changeCol3(testvec));
	

	}
}
