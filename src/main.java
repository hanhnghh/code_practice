import HeapStackQueue.DecodeString;
import HeapStackQueue.MinOfStack;
import HeapStackQueue.NextLarger;

public class main {

    public static void main(String args[]){
        /*
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
        */
        /*
        String[] crypt =  {"SEND",
                "MORE",
                "MONEY"};
        char[][] solution =  {{'O','0'},
                                {'M','1'},
                                {'Y','2'},
                                {'E','5'},
                                {'N','6'},
                                {'D','7'},
                                {'R','8'},
                                {'S','9'}};

        Array.IsCryptSolution cryptSolution = new Array.IsCryptSolution(crypt, solution);
        System.out.println("result: " + cryptSolution.isCryptSolution());
        */

        //System.out.println(FindProfession.findProfession(10, 470));
        /*int[] arr = {-4, 5, -3, 4};
        System.out.println(ArrayMaxConsecutiveSum.arrayMaxConsecutiveSum2(arr));*/

        /*String s = "4[b3[a]]5[c]10[d]";
        System.out.println(DecodeString.decodeString(s));*/

        /*int[] arr = {6, 7, 8, 3};
        for(int i : NextLarger.nextLarger(arr)){
            System.out.println(i);
        }*/

        String[] operations = {"push 10", "min", "push 5", "min", "push 8", "min", "pop", "min", "pop", "min"};
        for(int i : MinOfStack.minimumOnStack(operations))
            System.out.println(i);
    }
}
