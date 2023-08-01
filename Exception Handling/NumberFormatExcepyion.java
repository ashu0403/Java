class NumberFormatExcepyion {
    void Stringtoint() {
        try {
            String str = "100";
            int num = Integer.parseInt(str);
            System.out.println(num);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    void inttostring() {
        try {
            int var = 100;
            String str = String.valueOf(var);
            System.out.println(str);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void main(String[] args) {
        NumberFormatExcepyion obj = new NumberFormatExcepyion();
        obj.Stringtoint();
        obj.inttostring();
    }
}