package gym;

public class Workoutimplementation implements IWorkout{
	Workout workouts[];
	Workoutimplementation(){
		workouts = new Workout[2];// creates a new array that can store 2 Workout objects
	}

	@Override
	public void addworkout(Workout workout, int index) {
		workouts[index] = workout;
		
	}

	@Override
	public Workout[] displayworkouts() {
		
		return workouts;
		
	}

	
}
