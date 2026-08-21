package prob2;

public class Prob2 {
	public static int countVowelSequences(String str) {
		int lastVowel = 0;
		int seqCount = 0;
		String[] vowels = { "a","e","i","o","u"};
		
		for(int i = 0; i < str.length(); i++) {
			String temp = str.charAt(i) +"";
			for(int j = 0; j < vowels.length; j++) {
				if(temp.equals(vowels[j])) {
					if(lastVowel == 1) {
						seqCount++;
						lastVowel = 0;
					}
					else {
						lastVowel = 0;
					}
					
				}
			}	
		}
		return seqCount;
	}

	public static void main(String[] args) {
		String str = "Steam engine in heavy rain";
		System.out.println("There are " + countVowelSequences(str) + " Vowels in sequence");
		// couldnt complete :(

	}

}
