package Greedy_Algorithim;
import java.util.*;
public class Job_Sequencing_Problem {
    static class Job {
        int deadline;
        int profit;
        int id;

        public Job(int i, int d, int p) {
            id = i;
            deadline = d;
            profit = p;
        }
    }
    public static void main(String args []){
        int jobsInfo [][] = {{4,20}, {1,10},{1,40},{1,30}};
          ArrayList<Job> jobs = new ArrayList<>();

          for(int i =0 ; i< jobsInfo.length; i++){
              jobs.add(new Job(i,jobsInfo[i][0],jobsInfo[i][1]));
          }
          Collections.sort(jobs,(a,b) -> b.profit-a.profit);

          ArrayList<Integer> seqc = new ArrayList<>();
          int time = 0;
          for(int i = 0; i<jobs.size(); i++){
              Job curr  = jobs.get(i);
              if(curr.deadline > time){
                  seqc.add(curr.id);
                  time++;
              }
          }
          System.out.println("Max jobs = "+ seqc.size());
          for(int i = 0; i<seqc.size(); i++){
              System.out.print(seqc.get(i)+" ");
          }
        System.out.println();

    }
}
