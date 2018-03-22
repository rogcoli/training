package util;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateUtil {

	private DateUtil() {

	}

	public static java.sql.Date convert(Calendar data) {

		Long dataAsLong = data != null ? data.getTimeInMillis() : null;

		if (dataAsLong != null) {
			return new java.sql.Date(dataAsLong);
		}
		return null;
	}

	public static Calendar convert(java.sql.Date data) {

		if (data != null) {

			Calendar cal = new GregorianCalendar();

			cal.setTime(data);

			return cal;
		}

		return null;

	}

}
