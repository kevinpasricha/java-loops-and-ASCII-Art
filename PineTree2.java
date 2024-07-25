public class PineTree2 {
    // Printing a primitive tree
    public static void main(String[] args) {
        // Use the method drawTree that will print using 11 lines
        drawTree(11);
    }

    // drawTree() - Print a tree with n lines
    public static void drawTree(int numLines) {
        int segments = 3;  // Total number of segments
        int segmentHeight = 3;  // Height of each segment
        for (int currentSegment = 0; currentSegment < segments; currentSegment++) {
            drawSegment(segmentHeight, segments, currentSegment);
        }
    }

    // drawSegment() - Print a segment of the tree
    public static void drawSegment(int height, int totalSegments, int currentSegment) {
        int maxWidth = 1 + 2 * (height + currentSegment);  // Calculate the maximum width of the current segment
        for (int row = 0; row < height; row++) {
            int numStars = 1 + 2 * (row + currentSegment);  // Calculate the number of stars for the current row
            int numSpaces = (maxWidth - numStars) / 2;  // Calculate the number of spaces on each side

            // Print the spaces
            for (int s = 0; s < numSpaces; s++) {
                System.out.print(" ");
            }
            // Print the stars
            for (int s = 0; s < numStars; s++) {
                System.out.print("*");
            }
            // Print a newline character
            System.out.println();
        }
    }
}
