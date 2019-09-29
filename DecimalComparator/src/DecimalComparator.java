public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double one, double two) {

        boolean areEqualByThreeDecimalPlaces = false;

        int oneTimes1000 = (int) (one * 1000);
        int twoTimes1000 = (int) (two * 1000);

        if (oneTimes1000 == twoTimes1000) {
            areEqualByThreeDecimalPlaces = true;
        }

        return areEqualByThreeDecimalPlaces;

    }

}
