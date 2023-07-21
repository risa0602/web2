package model;

import java.util.List;

public class PostMoveLogic {
	public void execute(Move move,List<Move>moveList) {
		moveList.add(0,move);
	}

}
