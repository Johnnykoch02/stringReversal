// Problem solve("codewars",1,5) = "cawedors" -- elements at index 1 to 5 inclusive are "odewa". So we reverse them.

class bt {

    public static void main(String[] args) {
        String i = "codewars";
        int s = 1, e = 5;
        String newString = solve(i, s, e);

        System.out.println(newString);
        System.out.println(solve("impeachment", 2, 6));
        
    }

    public static String solve(String i, int s, int e) {
        
        char[] strChars = new char[i.length()];
        int strt = s;
        int end = e;

        String solve = "";

        for(int q = 0; q <i.length(); q++) {
            strChars[q] = i.charAt(q);
        }
            int count = end;
        for(int q = 0; q < i.length(); q++) {
            if(q>=strt && q<=end && count >= strt)
             {
                solve = (solve + strChars[count]); 
                count--;
            }
        else {
                solve = (solve +strChars[q]);
        }
    }

        return solve;
    }
}