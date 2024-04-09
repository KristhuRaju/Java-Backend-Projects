package BasicsProrames;

import java.util.LinkedHashMap;
import java.util.Map;

public class NonRepeatedCharacterFinder {
public static void main(String[] args) {
	String text="KrrRaju KrrRaju ww";
	char c = firstNonRepetedCharacter(text);
	if(c !=0) {
		System.out.println(c);
	}else {
		System.out.println(" all chars are repeted ");
	}
}

public static char firstNonRepetedCharacter(String kkk) {
Map<Character, Integer> charCount= new LinkedHashMap<>();
for(char ch: kkk.toCharArray()) {
	charCount.put(ch, charCount.getOrDefault(ch, 0)+1);
}
for(char ch:kkk.toCharArray()) {
	if(charCount.get(ch)==1) {
		return ch;
	}
}
	return 0;
}
}
