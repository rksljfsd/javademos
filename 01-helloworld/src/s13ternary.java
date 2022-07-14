
public class s13ternary {

	public static void main(String[] args) {
		
		int age = 19;
		boolean hasLicense = true;
		
		boolean canDrive = (age > 18) ? true : false;
			
		boolean canRentACar = canDrive ? (hasLicense ? true : false) : false;
		
		System.out.println("Age = " + age);
		System.out.println("Has License = " + hasLicense);
		System.out.println("Can Drive ? " + canDrive);
		System.out.println("Can Rent a car ? " + canRentACar);
		
		//
		
		System.out.println("");
		
		String result = canDrive ? (hasLicense ? "Has License Can drive" : "No license can't drive") : "Cannot drive";
		
		System.out.println(result);
		
		// (condition) ? true value : false value
		
	
//		(canDrive) ? System.out.println("candrive") : System.out.println("can not drive");
		
		System.out.println((canDrive) ? "canDrive" : "can not drive");
		
		
		
	}
	
}
 