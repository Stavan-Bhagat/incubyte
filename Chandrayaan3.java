/* import java.util.Arrays;

public class Chandrayaan3 {

    private static final String[] DIRECTIONS = {"N", "S", "E", "W", "Up", "Down"};
    private static final int[][] DIRECTION_OFFSETS = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}, {0, 0}, {0, 0}};

    public static void main(String[] args) {
        String[] commands = {"f", "r", "u", "b", "l"};
        int[] position = {0, 0, 0};
        int directionIndex = 0;

        for (String command : commands) {
            switch (command) {
                case "f":
                    position[0] += DIRECTION_OFFSETS[directionIndex][0];
                    position[1] += DIRECTION_OFFSETS[directionIndex][1];
                    break;
                case "b":
                    position[0] -= DIRECTION_OFFSETS[directionIndex][0];
                    position[1] -= DIRECTION_OFFSETS[directionIndex][1];
                    break;
                case "r":
                    directionIndex = (directionIndex + 1) % DIRECTIONS.length;
                    break;
                case "l":
                    directionIndex = (directionIndex - 1 + DIRECTIONS.length) % DIRECTIONS.length;
                    break;
            }
        }

        System.out.println("Final position: " + Arrays.toString(position));
        System.out.println("Final direction: " + DIRECTIONS[directionIndex]);
    }
}
*/


import java.util.Arrays;

public class Chandrayaan3 {

    private static final String[] DIRECTIONS = {"N", "S", "E", "W", "Up", "Down"};
    private static final int[][] DIRECTION_OFFSETS = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}, {0, 0}, {0, 0}};

    public static void main(String[] args) {
        String[] commands = {"f", "r", "u", "b", "l"};
        int[] position = {0, 0, 0};
        int directionIndex = 0;
       for (String command : commands) {
            switch (command) {
                case "f":
                    position[0] += DIRECTION_OFFSETS[directionIndex][0];
                    position[1] += DIRECTION_OFFSETS[directionIndex][1];
                    break;
                case "b":
                    position[0] -= DIRECTION_OFFSETS[directionIndex][0];
                    position[1] -= DIRECTION_OFFSETS[directionIndex][1];
                    break;
                case "r":
                    directionIndex = (directionIndex + 1) % DIRECTIONS.length;
                    break;
                case "l":
                    directionIndex = (directionIndex - 1 + DIRECTIONS.length) % DIRECTIONS.length;
                    break;
            }
        }

        System.out.println("Final position: " + Arrays.toString(position));
        System.out.println("Final direction: " + DIRECTIONS[directionIndex]);
    }
}


