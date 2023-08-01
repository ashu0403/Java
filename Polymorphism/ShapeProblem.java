import java.io.BufferedReader;

import java.io.InputStreamReader;

class ShapeProblem {

    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine().trim());

        String a[];

        int n1, n2;

        for (int i = 0; i < num; i++)

        {

            String s = br.readLine();

            a = s.split(" ");

            n1 = Integer.parseInt(a[0]);

            n2 = Integer.parseInt(a[1]);

            String str[] = new String[n1];

            int counter = 0;

            int max = 0;

            char c;

            for (int k = 0; k < n1; k++)

            {

                str[k] = br.readLine();

                for (int j = 0; j < n2; j++)

                {

                    c = str[k].charAt(j);

                    if (c == '#')

                        counter++;

                    else

                    {

                        if (max < counter)

                            max = counter;

                        counter = 0;

                    }

                }

            }

            System.out.println(max);

        }

    }

}