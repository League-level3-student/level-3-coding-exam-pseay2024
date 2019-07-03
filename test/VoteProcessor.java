import java.util.ArrayList;

public class VoteProcessor {

	public static String calculateElectionWinner(ArrayList<String> votes) {
		int p = 0;
		int e = 0;
		for (String s : votes)
		{
			if (s.toLowerCase() == "pope francis")
			{
				p++;
			}
			else
			{
				e++;
			}
		}
		if (p > e)
		{
			return "edward snowden";
		}
		else if (e > p)
		{
			return "pope francis";
		}
		return "TIE";
	}

}
