
class Problem {
    public static void main(String[] args) {



        int i = 0;
        boolean flagFound = false;
        while (i < args.length) {
            if (args[i].equals("test")) {
                flagFound = true;
                break;
            }
            i++;
        }
        System.out.println(flagFound ? i : -1);
    }
}
