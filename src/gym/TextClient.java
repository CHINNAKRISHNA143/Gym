package gym;
import java.util.Scanner;
public class TextClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Colours Gym");
		System.out.println("Please register with your details");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first name");
		String firstName = sc.next();
		System.out.println("Enter last name");
		String lastName = sc.next();
		System.out.println("Enter user name");
		String userName = sc.next();
		System.out.println("Enter password");
		String password = sc.next();
		UserImplementation usi = new UserImplementation();
		User user1 =new User(firstName,lastName,userName,password);//This creates a new User object using the details provided by the user during registration (first name, last name, username, and password).
		
		String result = usi.register(user1,0);
		System.out.println(result);
		System.out.println("Please login with your details");
		System.out.println("Enter user name");
		String user11 = sc.next();
		System.out.println("Enter password");
		String Password = sc.next();
		
		boolean result1 = usi.login(user11,Password);
		Workoutimplementation wi = new Workoutimplementation();
		Workout workouts1 = new Workout("Cardio","ThreadMil",0,10,"Fitness");
		Workout workouts2 = new Workout("Muscle","Dumbel",20,10,"MassGain");
		wi.addworkout(workouts1,0);
		wi.addworkout(workouts2,1);
		
		if(result1 == true) {
			Workout display[] = wi.displayworkouts();
			for(Workout wo : display) {
				System.out.println(wo);
			}
		}
		else
		{
			System.out.println("Check your details");
		}
	}

}
