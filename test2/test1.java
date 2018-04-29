class test1{
    public static void main(String[] args) {
        String s = "s";
        try {
            String o = "sasd";
            int v = Integer.parseInt(o);
            System.out.print(v);
        } catch (NumberFormatException e) {
            System.out.println("Invalid!");
            //TODO: handle exception
        }
    }
}