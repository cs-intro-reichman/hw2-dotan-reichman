public class TimeCalc {
    public static void main(String[] args) {
        int hours= Integer.parseInt(args[0]);
        int minutes= Integer.parseInt(args[1]);
        int minutesToAdd= Integer.parseInt(args[2]);
        int totalMinutes= hours * 60 + minutes + minutesToAdd;
        int totalHours= (totalMinutes / 60);
        int newHours=  totalHours % 24;
        int newminutes= totalMinutes -(totalHours * 60);
        if(newHours<10){
            if(minutes<10)
                System.out.println("0"+newHours+":0"+newminutes);
        else 
            System.out.println("0"+newHours+":"+newminutes);
        }
        else   
            System.out.println(newHours + ":" + newminutes);
    }
}
