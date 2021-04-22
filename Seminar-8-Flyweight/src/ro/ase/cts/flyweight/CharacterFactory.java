package ro.ase.cts.flyweight;

import java.util.HashMap;
import java.util.Map;

public class CharacterFactory {
	private static Map<Character, CustomCharacter> map = new HashMap<>();

	public static CustomCharacter getCharacter(Character ch) {
		if (!map.containsKey(ch)) {
			System.out.println("Created new character");
			map.put(ch, new CustomFontCharacter("Arial", 12, ch));

		} else {
			System.out.println("Character reused");
		}

		return map.get(ch);

	}
}
