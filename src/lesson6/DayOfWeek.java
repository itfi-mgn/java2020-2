package lesson6;

public /*final */ enum DayOfWeek /* extends java.lang.Enum */ {
	/* public static final */ MONDAY(12) /* = new DayOfWeek("MONDAY",0)*/,	
	TUESDAY(34),
	WEDNESDAY(56),
	THURSDAY(76),		// -- " --
	FRIDAY(-2),
	SATURDAY(0),
	/* public static final */ SUNDAY(12) /* = new DayOfWeek("SUNDAY",6)*/;
	
	private int	 myField;
	
	DayOfWeek(/*String name, int ordinal, */final int value) {
		// super(name,ordinal);
		myField = value;
	}
	
	public int getMyField() {
		return myField;
	}
}
