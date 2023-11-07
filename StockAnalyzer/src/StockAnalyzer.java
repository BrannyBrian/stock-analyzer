	import java.util.ArrayList;
public class StockAnalyzer {
	
	    // Task 1: Calculate the Average Stock Price
	    public static float calculateAveragePrice(float[] stockPrices) {
	        if (stockPrices.length == 0) {
	            return 0.0f; // Return 0 if the array is empty to avoid division by zero.
	        }

	        float sum = 0;
	        for (float price : stockPrices) {
	            sum += price;
	        }

	        return sum / stockPrices.length;
	    }

	    // Task 2: Find the Maximum Stock Price
	    public static float findMaximumPrice(float[] stockPrices) {
	        if (stockPrices.length == 0) {
	            throw new IllegalArgumentException("Array is empty");
	        }

	        float maxPrice = stockPrices[0];
	        for (float price : stockPrices) {
	            if (price > maxPrice) {
	                maxPrice = price;
	            }
	        }

	        return maxPrice;
	    }

	    // Task 3: Determine the Occurrence Count of a Specific Price
	    public static int countOccurrences(float[] stockPrices, float targetPrice) {
	        int count = 0;
	        for (float price : stockPrices) {
	            if (price == targetPrice) {
	                count++;
	            }
	        }
	        return count;
	    }

	    // Task 4: Compute the Cumulative Sum of Stock Prices using ArrayList
	    public static ArrayList<Float> computeCumulativeSum(ArrayList<Float> stockPrices) {
	        ArrayList<Float> cumulativeSum = new ArrayList<>();
	        float sum = 0.0f;
	        for (Float price : stockPrices) {
	            sum += price;
	            cumulativeSum.add(sum);
	        }
	        return cumulativeSum;
	    }

	    public static void main(String[] args) {
	        // Example usage
	        float[] stockPricesArray = { 100.0f, 110.0f, 105.0f, 120.0f, 125.0f };
	        ArrayList<Float> stockPricesArrayList = new ArrayList<>();
	        stockPricesArrayList.add(100.0f);
	        stockPricesArrayList.add(110.0f);
	        stockPricesArrayList.add(105.0f);
	        stockPricesArrayList.add(120.0f);
	        stockPricesArrayList.add(125.0f);

	        // Task 1: Calculate the Average Stock Price
	        float averageArray = calculateAveragePrice(stockPricesArray);
	        float averageArrayList = calculateAveragePrice(convertArrayListToArray(stockPricesArrayList));
	        System.out.println("Average Stock Price (Array): " + averageArray);
	        System.out.println("Average Stock Price (ArrayList): " + averageArrayList);

	        // Task 2: Find the Maximum Stock Price
	        float maxArray = findMaximumPrice(stockPricesArray);
	        float maxArrayList = findMaximumPrice(convertArrayListToArray(stockPricesArrayList));
	        System.out.println("Maximum Stock Price (Array): " + maxArray);
	        System.out.println("Maximum Stock Price (ArrayList): " + maxArrayList);

	        // Task 3: Determine the Occurrence Count of a Specific Price
	        float targetPrice = 105.0f;
	        int countArray = countOccurrences(stockPricesArray, targetPrice);
	        int countArrayList = countOccurrences(convertArrayListToArray(stockPricesArrayList), targetPrice);
	        System.out.println("Occurrences of " + targetPrice + " (Array): " + countArray);
	        System.out.println("Occurrences of " + targetPrice + " (ArrayList): " + countArrayList);

	        // Task 4: Compute the Cumulative Sum of Stock Prices using ArrayList
	        ArrayList<Float> cumulativeSumArrayList = computeCumulativeSum(stockPricesArrayList);
	        System.out.println("Cumulative Sum of Stock Prices (ArrayList): " + cumulativeSumArrayList);
	    }

	    // Helper method to convert ArrayList<Float> to float[]
	    public static float[] convertArrayListToArray(ArrayList<Float> list) {
	        float[] array = new float[list.size()];
	        for (int i = 0; i < list.size(); i++) {
	            array[i] = list.get(i);
	        }
	        return array;
	    }
	}
