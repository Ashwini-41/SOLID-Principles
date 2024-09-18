package SOLIDPrinciples.ISP;

/*
interface Worker{
	void work();
	void eat();
}
class HumanWorker implements Worker{

	@Override
	public void work() {
		
	}

	@Override
	public void eat() {
		
	}
	
}

class RobotWorler implements Worker  {

	@Override
	public void work() {
	
	}

	@Override
	public void eat() {
	  // robot don't eat - voilets ISP
	}
   
}
*/

interface Workable{
	void work();
}

interface Eatable{
	void eat();
}

class HumanWorker implements Workable,Eatable{
	
	@Override
	public void work() {
		
	}

	@Override
	public void eat() {
	
	}
}

class RobotWorker implements Workable{

	@Override
	public void work() {
		
	}
	
}