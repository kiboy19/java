package pertemuan11;

public class Vertex {
	  private char label; // label (e.g. 'A')
	  private boolean wasVisited;
	  
	  public Vertex(char lab) { // constructor
	    this.label = lab;
	    this.wasVisited = false;
	  }
	  
	  /**
	   * Getter label.
	   */
	  public char getLabel() {
	    return this.label;
	  }
	  
	  /**
	   * Setter label.
	   */
	  public void setLabel(char lab) {
	    this.label = lab;
	  }
	  
	  /**
	   * Getter visited status.
	   */
	  public boolean wasVisited() {
	    return this.wasVisited;
	  }
	  
	  /**
	   * Setter visited status.
	   */
	  public void visit(boolean visited) {
	    this.wasVisited = visited;
	  }

	}
