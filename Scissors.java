package fuchimi;

public class Scissors extends Hand {
	
	@Override
	public Boolean beats(Hand hand) {
		return hand.loseAgainst(this);
	}
	
	@Override
	protected Boolean loseAgainst(Rock rock) {
		return true;
	}
	
	@Override	
	protected Boolean loseAgainst(Scissors scissors) {
		return false;
	}
	
	@Override	
	protected Boolean loseAgainst(Paper paper) {
		return false;
	}

	public String toString() {
		return "Scissors";
	}
}
