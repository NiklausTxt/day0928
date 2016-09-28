package LearnJunit;

public class ShouldSleep {
	public boolean ShouldSleep(boolean isWeekday, boolean isVacation) {
		return !isWeekday || isVacation;
	}
}
