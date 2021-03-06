public class Lasagna {

    private static final int EXPECTED_OVEN_TIME_IN_MINUTES = 40;
    private static final int TIME_FOR_ONE_LAYER_IN_MINUTES = 2;

    // define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven() {
        return EXPECTED_OVEN_TIME_IN_MINUTES;
    }

    // define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int actualMinutes) {
        return EXPECTED_OVEN_TIME_IN_MINUTES - actualMinutes;
    }

    // define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int numberOfLayers) {
        return numberOfLayers * TIME_FOR_ONE_LAYER_IN_MINUTES;
    }

    // define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int numberOfLayers, int actualMinutes) {
        return preparationTimeInMinutes(numberOfLayers) + actualMinutes;
    }
}
