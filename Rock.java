package fuchimi;

public class Rock extends Hand {
	@Override
	public Boolean beats(Hand hand) {
		return hand.loseAgainst(this);
	}
	
	@Override
	protected Boolean loseAgainst(Rock rock) {
		return false;
	}
	
	@Override	
	protected Boolean loseAgainst(Scissors scissors) {
		return false;
	}
	
	@Override	
	protected Boolean loseAgainst(Paper paper) {
		return true;
	}

	public String toString() {
		return "Rock";
	}
}
