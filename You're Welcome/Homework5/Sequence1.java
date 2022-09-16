public class Sequence1 {
  
  private int[] values;
  
  public Sequence1(int size) { values = new int[size]; }
  public void set(int i, int n) {values[i] = n; }
  public int get(int i) { return values[i]; }
  public int size() { return values.length; }
  public boolean equals( Sequence1 other ) {
   
    for (int i = 0; i < other.size(); i++) {

      if (values[i] != other.get(i)) {
      
        return false;
        
      }
    }
    return true;
  }
  
  public boolean sameValues(Sequence1 other) {

     for (int i = 0; i < other.size(); i++) {
       
       if (!other.inSequence(values[i])) {
         
         return false;
         
       }
     }
     return true;
  }
  public boolean inSequence(int value) {
    
    for (int i = 0; i < values.length; i++) {
      
      if (value == values[i]) {
        
        return true;
        
      }
    }
    return false;
  }
  
  public static void main(String[] args) {
   
    Sequence1 s1 = new Sequence1(3);
    
    s1.set(0,1);
    s1.set(1,2);
    s1.set(2,3);
    
    Sequence1 s2 = new Sequence1(3);
    
    s2.set(0,1);
    s2.set(1,2);
    s2.set(2,3);
    
    Sequence1 s3 = new Sequence1(3);
    
    s3.set(0,1);
    s3.set(1,1);
    s3.set(2,3);
    
    System.out.println(s1.equals(s2));
    System.out.println(s1.equals(s3));
    System.out.println(s3.sameValues(s1));
    
  }
}

