package SOLIDPrinciples.LSP;

/*
class Bird {
  public void fly() {
	  
  }
}

class Ostrich extends Bird{
	
	@Override
	public void fly() {
		throw new UnsupportedOperationException("Ostrich can't fly");
	}
}
 */


class Bird{
	
}

class FlyingBird {
	public void fly() {
		
	}
}

class Parrot extends FlyingBird{
	
	@Override
	public void fly() {
		System.out.println("Parrot is flying");
	}
}

class Ostrich extends Bird{
	
}

