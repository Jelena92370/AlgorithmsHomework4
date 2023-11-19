public class Main {
    public static void main(String[] args) {
        int[][] costs = new int[][]{
                {0, 1, 4, 4},
                {4, 1, 1, 1},
                {4, 4, 4, 1},
                {4, 4, 4, 0}
        };

        int cheapestCost = CheapestSequence.minCost(costs);
        System.out.println("minCost(costs) = " + cheapestCost);
    }
}