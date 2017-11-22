import java.util.*;

public class JobSequencing {

    List<Job> jobs;
    int[] result;
    boolean[] slots;
    int n;

    public JobSequencing(Job[] j){
        jobs = new ArrayList<>();
        for(Job i : j){
            jobs.add(i);
        }
        Collections.sort(jobs);
        n = j.length;;
        result = new int[n];
        slots = new boolean[n];
        for(int i = 0; i < n; i++){
            slots[i] = false;
        }
    }

    public void orderJob(){
        for(int i = 0; i < n; i++){
            for(int j = Math.min(n, jobs.get(i).deadline) - 1; j >= 0; j--){
                if(!slots[j]){
                    result[j] = i;
                    slots[j] = true;
                    break;
                }
            }
        }
    }

    public void printJob(){
        for(int i = 0; i < n; i++)
            if(slots[i])
                System.out.println(jobs.get(result[i]).jobName);
    }
}

class Job implements Comparable<Job>{
    public char jobName;
    public int deadline;
    public int profit;

    public Job(char name, int dl, int pro){
        jobName = name;
        deadline = dl;
        profit = pro;
    }

    @Override
    public int compareTo(Job o1) {
        return o1.profit - this.profit;
    }
}
