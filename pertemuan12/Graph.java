 package pertemuan11;

public class Graph {

    private Vertex vertexList[]; // array of vertices
    private int adjMat[][]; // adjacency matrix
    private int nVerts; // current number of vertices

    public Graph(int maxVerts) { // constructor
        vertexList = new Vertex[maxVerts]; // initialize vertex list
        adjMat = new int[maxVerts][maxVerts]; // initialize adjacency matrix
        nVerts = 0; // initialize number of vertices to 0

        for(int i = 0; i < maxVerts; i++) { // set adjacency matrix to 0
            for(int j = 0; j < maxVerts; j++) {
                adjMat[i][j] = 0;
            }
        }
    } // end constructor
    
    public void addVertex(char lab) { // argument is label
	    vertexList[nVerts++] = new Vertex(lab);
	}

	public void addEdge(int start, int end) {
	    adjMat[start][end] = 1;
	    adjMat[end][start] = 1;
	}
	
	public void adjacencyMatrix() {
	    for (int i = 0; i < adjMat.length; i++) {
	        for (int j = 0; j < adjMat[0].length; j++) {
	            System.out.print(adjMat[i][j] + " ");
	        }
	        System.out.println();
	    }
	}

}
