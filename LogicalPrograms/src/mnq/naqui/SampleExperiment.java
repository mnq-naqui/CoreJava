package mnq.naqui;

public class SampleExperiment {
	public static void main(String[] args) {

		String categoryValue = "YES";
		String defaultValue = " ";
		updateManualFlag(categoryValue, defaultValue);

	}

	public static boolean isEmpty(String str) {
		return str == null || str.trim().isEmpty();
	}

	public static boolean updateManualFlag(String categoryValue, String defaultValue) {

		if (!isEmpty(categoryValue) && !isEmpty(defaultValue)) {
			return !categoryValue.equals(defaultValue);
		} else {
			if (isEmpty(defaultValue)) {
				if (isEmpty(categoryValue)) {
					return false;
				}else {
					return true;
				}
			}else {
				if (isEmpty(categoryValue)) {
					return true;
				}else {
					return false;
				}
			}
		}
	}

}
