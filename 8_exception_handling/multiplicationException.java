public class multiplicationException {
    public static void main(String[] args) {
        try {
            System.out.println(Integer.parseInt(args[0])*Integer.parseInt(args[1]));
        }catch (Exception e){
            System.out.println("error");
        }

    }
}
