//Kevin Pasricha
//July 15,2024
//Collaborative Lab 1

//The file will be named PineTree
public class PineTree {

    //We define how many parts and how tall the tree will be (3,3), and then draw it
    public static void main(String[] args) {
        int segments = 3;  // Total number of segments
        int segmentHeight = 3;  // Height of each segment
        drawTree(segments, segmentHeight);
    }

    //We look at how many parts we want (total), and we use a function to draw this part
    public static void drawTree(int totalSegments, int segmentHeight) {
        for (int currentSegment = 0; currentSegment < totalSegments; currentSegment++) {
            drawSegment(segmentHeight, totalSegments, currentSegment);
        }
    }

    // Drawing one segment of the tree using loops and widths
    public static void drawSegment(int height, int totalSegments, int currentSegment) {
        int maxWidth = 1 + 2 * (height + currentSegment);
        for (int row = 0; row < height; row++) {
            int numStars = 1 + 2 * (row + currentSegment);
            int numSpaces = (maxWidth - numStars) / 2; 
            // Print spaces
            for (int s = 0; s < numSpaces; s++) {
                System.out.print(" ");
            }
            // Print the stars
            for (int s = 0; s < numStars; s++) {
                System.out.print("*");
            }
            // Print newline character
            System.out.println();
        }
    }
}
