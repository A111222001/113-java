

public class Average {
    public static void main(String[] args) {  //args可命令的參數
        long sum = 0;
        for(String arg : args) {
            sum += Long.parseLong(arg);
        }
        System.out.println("平均：" + (double) sum / args.length);
    }
}
