package fuchimi;

public class Paper extends Hand {
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
		return true;
	}
	
	@Override	
	protected Boolean loseAgainst(Paper paper) {
		return false;
	}

	public String toString() {
		return "Paper";
	}
}
