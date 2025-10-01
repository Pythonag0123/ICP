package DAY5;
import java.util.*;


public class ActivitySelection {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] start=new int[n];
        int[] end=new int[n];
        for(int i=0;i<n;i++){
            start[i]=sc.nextInt();
            end[i]=sc.nextInt();
        }
        sc.close();
        System.out.println(SelectActivity(start,end));
    }
    public static int SelectActivity(int[] start,int[] end){
        int n=start.length;
         if (n == 0) {
            return 0;
        }
        int[][] activities=new int[n][2];
        for(int i=0;i<n;i++){
            activities[i][0]=start[i];
            activities[i][1]=end[i];
        }
        Arrays.sort(activities,Comparator.comparingInt(a->a[1]));
        int count=1;
        int j=0;
        for(int i=1;i<n;i++){
            if(activities[i][0]>activities[j][1]){//overlap
                count++;
                j=i;

            }
            
        }
        return count;
    }
    
}
