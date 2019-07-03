import java.util.HashMap;

public class HashMapCalculator {

	public static int commonKeyValuePairs(HashMap<String, String> hashmap1, HashMap<String, String> hashmap2) {
		int matching = 0;
		for (String s : hashmap1.keySet())
		{
			if (hashmap2.containsKey(s))
			{
				if (hashmap2.get(s) == hashmap1.get(s))
				{
					matching++;
				}
			}
		}
		return matching;
	}

}
