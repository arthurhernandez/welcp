import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Profile {
	
	private int count;
	private String word;
	
	public Profile (String word, int count) {
		
		setCount(count);
		setWord(word);
		
	}
	public static ArrayList<Profile> sort(ArrayList<Profile> list) {
		
		ArrayList<Profile> output = new ArrayList<Profile>();
		int highest;
		int index = 0;
		
		while (list.size() != 0) {
			
			index = 0;
			highest = list.get(index).getCount();
			
			for (int j = 0; j < list.size(); j++) {
				
				if (list.get(j).getCount() > highest) {
					
					index = j;
					highest = list.get(j).getCount();
					
				}	
			}
			output.add(list.get(index));
			list.remove(index);
			
		}
		return output;
		
		/*for (int i = 0; i < list.size(); i++) {
			
			highest = list.get(i).getCount();
			
			for (int j = 0; j < list.size(); j++) {
				
				if (list.get(j).getCount() > highest) {
					
					index = j;
					highest = list.get(j).getCount();
					
				}
			}*/
	}
	
	public static void changeCount(String word, ArrayList<Profile> list) {
		
		for (int i = 0; i < list.size(); i++) {
			
			if (list.get(i).getWord().equals(word)) {
				
				Profile temp = new Profile(word, list.get(i).getCount() + 1);
				list.set(i, temp);
				
			}
		}
	}
	public static boolean inList(String word, ArrayList<Profile> list) {
		
		for (int i = 0; i < list.size(); i++) {
			
			if (word.equals(list.get(i).getWord())) {
				
				return true;
				
			}
		}
		return false;
	}
	
	
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.printf("Enter filename: ");
		String fileName = in.next();
		
		System.out.printf("Enter list size: ");
		int listSize = in.nextInt();
		
		File file = new File(fileName);
		
		ArrayList<Profile> words = new ArrayList<Profile>();
		
		try {
			
			in = new Scanner(file);
			
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		
		while (in.hasNext()) {
			
			String temp = in.next();
			Profile profile = new Profile(temp, 1);
			
			if (inList(temp, words)) {
				
				changeCount(temp, words);
				
			} else {
		
				words.add(profile);
				
			}
		}
		
		words = sort(words);
		
		for (int i = 0; i < listSize; i++) {
			
			System.out.println(words.get(i).getWord() + "=" + words.get(i).getCount());
			
		}
	}
}
