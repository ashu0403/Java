class test {
    // This method builds the character maze from the given integer maze
    public int[][] maze() {

        int[][] maze = {
                { 1, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
                { 1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 1 },
                { 1, 0, 1, 0, 0, 0, 1, 0, 1, 1, 1, 0, 1 },
                { 1, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 1 },
                { 1, 0, 1, 0, 0, 0, 0, 0, 1, 1, 1, 0, 1 },
                { 1, 0, 1, 0, 1, 1, 1, 0, 1, 0, 0, 0, 1 },
                { 1, 0, 1, 0, 1, 0, 0, 0, 1, 1, 1, 0, 1 },
                { 1, 0, 1, 0, 1, 1, 1, 0, 1, 0, 1, 0, 1 },
                { 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 4, 1 },
                { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 } };

        return maze;
    }

    public boolean findWay(int[][] maze) {
        int i = 1;
        int j = 1;
        int key = 5;
        int k = i;
        int t = j;
        boolean cond = false;
        System.out.println("27");

        while (i < (maze.length - 1) && j < (maze[0].length - 1) || cond == true) {
            if (maze[i - 1][j] == 4 || maze[i + 1][j] == 4 || maze[i][j - 1] == 4 || maze[i][j + 1] == 4) {
                cond = true;
                System.out.println("32");
                break;
            }

            if (maze[i - 1][j] == 0 && maze[i + 1][j] == 0 && maze[i][j - 1] == 0 && maze[i][j + 1] == 0) {
                key++;
                k = i;
                t = j;
                System.out.println("40");
            } else if (maze[i - 1][j] == 0 && maze[i + 1][j] == 0 && maze[i][j - 1] == 0) {
                key++;
                k = i;
                t = j;
                System.out.println("46");
            } else if (maze[i - 1][j] == 0 && maze[i + 1][j] == 0 && maze[i][j + 1] == 0) {
                key++;
                k = i;
                t = j;
                System.out.println("52");
            } else if (maze[i - 1][j] == 0 && maze[i][j - 1] == 0 && maze[i][j + 1] == 0) {
                key++;
                k = i;
                t = j;
                System.out.println("58");
            } else if (maze[i + 1][j] == 0 && maze[i][j - 1] == 0 && maze[i][j + 1] == 0) {
                key++;
                k = i;
                t = j;
                System.out.println("64");
            } else if (maze[i - 1][j] == 0 && maze[i + 1][j] == 0) {
                key++;
                k = i;
                t = j;
                System.out.println("70");
            } else if (maze[i - 1][j] == 0 && maze[i][j + 1] == 0) {
                key++;
                k = i;
                t = j;
                System.out.println(k + "kkkkkkk");
                System.out.println(t + "ttttt");
                System.out.println(i + "iii");
                System.out.println(j + "jj");
                System.out.println("76");
            } else if (maze[i - 1][j] == 0 && maze[i][j - 1] == 0) {
                key++;
                k = i;
                t = j;
                System.out.println("82");
            } else if (maze[i + 1][j] == 0 && maze[i][j + 1] == 0) {
                key++;
                k = i;
                t = j;
                System.out.println("88");
            } else if (maze[i + 1][j] == 0 && maze[i + 1][j - 1] == 0) {
                key++;
                k = i;
                t = j;
                System.out.println("94");
            } else if (maze[i][j + 1] == 0 && maze[i][j - 1] == 0) {
                key++;
                k = i;
                t = j;
                System.out.println("100");
            }
            if (maze[i + 1][j] == 0) {
                maze[i][j] = key;
                i++;
                System.out.println(key);
                System.out.println("105");
            } else if (maze[i][j + 1] == 0) {
                maze[i][j] = key;
                j++;
                System.out.println(k + "$$$");
                System.out.println(t + "$$");
                System.out.println(key);
                System.out.println("110");
            } else if (maze[i - 1][j] == 0) {
                maze[i][j] = key;
                System.out.println(i);
                System.out.println(j);
                System.out.println(k + "~~~");
                System.out.println(t + "~~");
                i--;
                System.out.println(key);
                System.out.println("115");
            } else if (maze[i][j - 1] == 0) {
                maze[i][j] = key;
                j--;
                System.out.println(key);
                System.out.println("120");
            } else {
                System.out.println(i + "===");
                System.out.println(j + "==");
                System.out.println(k + "@@@");
                System.out.println(t + "@@");
                i = k;
                j = t;
                System.out.println(key);
                System.out.println("125");
                System.out.println(i);
                System.out.println(j);
                continue;
            }
        }
        return cond;
    }

    public static void main(String[] args) {
        test Obj = new test();
        boolean result = Obj.findWay(Obj.maze());
        System.out.println(result);
    }
}