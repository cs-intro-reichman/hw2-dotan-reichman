public class TimeCalc {
    public static void main(String[] args) {
        String time=args[0];
        int hours= time.charAt(0)*10+time.charAt(1);
        int minutes= time.charAt(3)*10+time.charAt(4);
        int minutesToAdd= Integer.parseInt(args[1]);
        int totalMinutes= hours * 60 + minutes + minutesToAdd;
        int totalHours= (totalMinutes / 60);
        int newHours=  totalHours % 24;
        int newminutes= totalMinutes -(totalHours * 60);
        if(newHours<10){
            if(minutes<10)
                System.out.println("0"+newHours+":0"+newminutes);
        else 
            System.out.println("0"+newHours+":0"+newminutes);
        }
        else   
            System.out.println(newHours + ":" + newminutes);
    }
}
