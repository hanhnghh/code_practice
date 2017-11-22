public class main {

    public static void main(String args[]){
        //Job Sequencing start
        Job[] jobs = new Job[5];
        jobs[0] = new Job('a', 2, 100);
        jobs[1] = new Job('b', 1, 19);
        jobs[2] = new Job('c', 2, 27);
        jobs[3] = new Job('d', 1, 25);
        jobs[4] = new Job('e', 3, 15);

        JobSequencing jobSequencing = new JobSequencing(jobs);
        jobSequencing.orderJob();
        jobSequencing.printJob();
        //Job Sequencing end
    }
}
