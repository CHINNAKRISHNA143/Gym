package gym;

public class UserImplementation implements IUser {//Implements IUser: The class implements the IUser interface, meaning it provides the actual code (implementation) for the methods defined in the IUser interface (register and login).


  private User users[];
  UserImplementation(){
	  users = new User[5];// creates a new array that can hold 5 User objects.
  }
@Override
public String register(User user, int index) {
   System.out.println("user info is : "+user);
   users[index] = user;// Stores the user at the specified index in the array.
	return "Thank you your details are with us ";
}
@Override
public boolean login(String username, String password) {
	System.out.println("username  is : = " +username);
	System.out.println("password is : = "+password);
	for(User user:users)//check if the provided username and password match any registered user
	{
		if(user!=null)
		{
			if(user.getUserName().equals(username) && user.getPassword().equals(password))
			{
				return true;
			}
		}
			
			
	}
	return false;
}
  
 
}

