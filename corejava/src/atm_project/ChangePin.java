package atm_project;

public class ChangePin extends WithdrawAmount {
	public int pin=1234;

	public int setPinn(int pin) {
		this.pin = pin;
		return pin;
	}

}
