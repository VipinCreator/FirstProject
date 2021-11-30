
public class Week {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[] week = {"Sunday","Monday","tuesday","wednesday","Thursday","Friday","Saturday"};

String max="Sunday";
    for(String day:week)
    {
    	if(max.length()<day.length())
    	{
    		max=day;
    	}
    }
System.out.println(max);
	}

}
