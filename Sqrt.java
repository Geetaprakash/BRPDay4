public class Sqrt {
        static double squareRoot(double n, double l)
        {
            double x = n;
            double r;
            int cnt = 0;
            while (true)
            {
                cnt++;
                r = 2 * (x + (n / x));
                if (Math.abs(r - x) < l)
                    break;
                x = r;
            }
            return r;
        }
        public static void main (String[] args)
        {
            double n = 3;
            double l = 0.5;

            System.out.println(squareRoot(n, l));
        }
    }
