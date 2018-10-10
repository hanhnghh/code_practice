package Line;

public class Taks2 {

    public static int solution(int n)
    {
        int count = 0;

        for (int i = 1; i <= n; i++)
            count += count1InEachNumber(i);

        return count;
    }

    private static int count1InEachNumber(int n)
    {
        int count = 0;
        while (n > 0)
        {
            if (n % 10 == 1)
                count++;

            n = n / 10;
        }
        return count;
    }
}
