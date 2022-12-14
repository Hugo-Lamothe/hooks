public class Hook{

    public static void main(String[] args) {
        if("test".equals(args[1])){
            System.out.println("Bonjour " + args[0]);
            System.exit(0);
        }
        System.out.println(args[0]);
        System.exit(1);
    }
}