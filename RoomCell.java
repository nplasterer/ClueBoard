//Naomi and Brandon
public class RoomCell extends BoardCell {
	public enum DoorDirection { UP, DOWN, LEFT, RIGHT, NONE };
	private DoorDirection doorDirection;
	private char roomInitial;
	
	@Override
	public Boolean isRoom(){
		return true;
	}
	
	public RoomCell() {
		// TODO Auto-generated constructor stub
	}
	
	//Override draw when we add GUI

}
