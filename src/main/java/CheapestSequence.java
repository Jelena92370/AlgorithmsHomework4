public class CheapestSequence {
    public static int minCost(int[][] costs) {
        int rows = costs.length;
        int columns = costs[0].length;

        int[][] minCosts = new int[rows][columns];

        minCosts[0][0] = costs[0][0];
        for (int i = 1; i < rows; i++) {
            minCosts[i][0] = minCosts[i - 1][0] + costs[i][0];
        }
        for (int j = 1; j < columns; j++) {
            minCosts[0][j] = minCosts[0][j - 1] + costs[0][j];
        }

        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < columns; j++) {
                minCosts[i][j] = costs[i][j] + Math.min(minCosts[i - 1][j], minCosts[i][j - 1]);
            }
        }

        return minCosts[rows - 1][columns - 1];
    }

}
