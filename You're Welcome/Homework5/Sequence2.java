import java.util.*;

public class Sequence2 {
  
  private ArrayList<Integer> values;
  public Sequence2() { values = new ArrayList<Integer>(); }
  public void add(int n) { values.add(n); }
  public String toString() {return values.toString(); }
  public int size() { return values.size(); }
  public int get(int i) { return values.get(i); }
  
  public Sequence2 append(Sequence2 other) {
    
    Sequence2 output = new Sequence2();
    
    for (int i = 0; i < values.size(); i++){
      
      output.add(values.get(i));
      
    }
    for (int i = 0; i < other.size(); i++){
      
      output.add(other.get(i));
      
    }
    return output;
  }
  public Sequence2 merge(Sequence2 other) {
    
    Sequence2 output = new Sequence2();
    
    int size;
    if (values.size() > other.size()) {
      size = other.size();
    } else {
      size = values.size();
    }
    
    for (int i = 0; i < size * 2; i++){
      
      if ((i % 2) == 0) {
        output.add(values.get(i/2));
      } else {
        output.add(other.get(i/2));
      }
    }
    if (values.size() > other.size()) {
      for (int j = size; j < values.size(); j++) {
        output.add(values.get(j));
      }
    } else {
      for (int j = size; j < other.size(); j++) {
        output.add(other.get(j));
      }
    }
    return output;
  }
  public Sequence2 mergeSorted(Sequence2 other) {
    
	  Sequence2 output = new Sequence2();
	  
	  int valuesIndex = 0;
	  int otherIndex = 0;
	  int lowest = values.get(0);
	  int valuesSize = values.size();
	  int otherSize = other.size();
	    
	  while (valuesIndex < valuesSize || otherIndex < otherSize) {
		  
		  if (valuesIndex == valuesSize) {
			  
			  if (other.get(otherIndex) > lowest) {
				  
				  output.add(other.get(otherIndex));
				  lowest = other.get(otherIndex);
				  otherIndex++;
				  
			  } else {
				  
				  return output;
				  
			  }
			  
		  } else if (otherIndex == otherSize) {
			  
			  if (values.get(valuesIndex) > lowest) {
				  
				  output.add(values.get(valuesIndex));
				  lowest = values.get(valuesIndex);
				  valuesIndex++;
				  
			  } else {
				  
				  return output;
				  
			  }
			  
		  } else {
			  
			  if (other.get(otherIndex) > values.get(valuesIndex)) {
				  
				if (values.get(valuesIndex) < lowest) {
					
					return output;
					
				} else {
					
					output.add(values.get(valuesIndex));
					valuesIndex++;
					
				}
			  } else {
				  
				  if (other.get(otherIndex) < lowest) {
						
						return output;
						
				  } else {
						
					  output.add(other.get(otherIndex));
					  otherIndex++;
						
				  }
			  }
		  }
	  }
	  
/*	  if (values.size() > other.size()) {
	      for (int j = size; j < values.size(); j++) {
	        output.add(values.get(j));
	      }
	    } else {
	      for (int j = size; j < other.size(); j++) {
	        output.add(other.get(j));
	      }
	    }*/
	  
	  return output;
    
  }
  
  public static void main(String[] args) {
    
    Sequence2 s1 = new Sequence2();
    
    s1.add(1);
    s1.add(4);
    s1.add(9);
    s1.add(16);
    
    Sequence2 s2 = new Sequence2();
    
    s2.add(4);
    s2.add(7);
    s2.add(9);
    s2.add(9);
    s2.add(11);
    
    
    Sequence2 s3 = new Sequence2();
    
    s3.add(1);
    s3.add(1);
    s3.add(3);
    
//    System.out.println(s1.append(s2).toString());
    System.out.println(s1.mergeSorted(s2).toString());
    
  }
}

