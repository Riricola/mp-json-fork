import java.io.PrintWriter;
import java.util.Comparator;

/**
 * JSON strings.
 */
public class JSONString implements JSONValue{

  // +--------+------------------------------------------------------
  // | Fields |
  // +--------+

  /**
   * The underlying string.
   */
  String value;




  // +--------------+------------------------------------------------
  // | Constructors |
  // +--------------+

  /**
   * Build a new JSON string for a particular string.
   */
  public JSONString(String value) {
    this.value = value;
  } // JSONString(String)

  // +-------------------------+-------------------------------------
  // | Standard object methods |
  // +-------------------------+

  /**
   * Convert to a string (e.g., for printing).
   */
  public String toString() {
    if (value == null) {
      return "null";
    } else {
      return this.value.toString();
    }
  } // toString()

  /**
   * Compare to another object.
   */
  public boolean equals(Object other) {

    return ( ( (other instanceof JSONString) 
               && (this.value == ((JSONString) other).value) )
             || (this.value == other) );
    
  } // equals(Object)

  /**
   * Compute the hash code.
   */
  public int hashCode() {
    if (this.value == null) {
      return 0;
    } else {
      return this.value.hashCode();
    }
  } // hashCode()

  // +--------------------+------------------------------------------
  // | Additional methods |
  // +--------------------+

  /**
   * Write the value as JSON.
   */
  public void writeJSON(PrintWriter pen) {
    String returnString = new String();
    for (int i = 0; i < this.value.length(); i++) {
      if (this.value.charAt(i) == 'c' ){
        returnString += null;



        if (this.value.charAt(i+1) == '"') {
          returnString += '"';
        }
      }
    }
  } // writeJSON(PrintWriter)

  /**
   * Get the underlying value.
   */
  public String getValue() {
    return this.value;
  } // getValue()

} // class JSONString
