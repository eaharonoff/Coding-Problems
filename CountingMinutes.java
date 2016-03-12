public class CountingMinutes{

	public static int minutes(String theTime){
		String[] hourAndMin = theTime.split(":");
		char amOrPm = hourAndMin[1].charAt(2);
		int theHour= Integer.parseInt(hourAndMin[0]);
		int theMinute= 
		Integer.parseInt(hourAndMin[1].replaceAll("[^\\d]",""));
		int hour2Min = 0;
		int mins2Min = 0;
		boolean morning = amOrPm =='a';
		System.out.println(morning);
		if(theHour==12 && morning){
			hour2Min+= 0;
		}
		else if((theHour>0 && theHour<12) && morning){
			hour2Min+=(theHour*60);
		}
		else if(theHour==12 && !morning){
			hour2Min+=(12*60);
		}
		else if((theHour>0 && theHour<12) && !morning){
			hour2Min+=(12*60)+(theHour*60);
		}
		mins2Min+=theMinute;
		
		return hour2Min + mins2Min;

	}
	
	public static void main(String[] args){
		String theTime ="12:15pm-8:15pm";
		String[] times = theTime.split("-");
		String time1 = times[0];
		String time2 = times[1];
		int time1InMin = minutes(time1);
		int time2InMin = minutes(time2);
		int difference = 0;

		if(time1InMin>time2InMin){
			difference = ((1440-time1InMin)+time2InMin);
		}
		else {
			difference = time2InMin-time1InMin;
		}
		System.out.println(difference);

	}
}