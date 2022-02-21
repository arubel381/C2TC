package date_time;

import java.time.*;

public class Local {

	public static void main(String[] args) {
		ZonedDateTime currentTime = ZonedDateTime.now();
		System.out.println(currentTime);
		ZonedDateTime currentTimeinLondon = ZonedDateTime.now(ZoneId.of("Europe/London"));
		System.out.println(currentTimeinLondon);
	}

}
