public class haq5 {
    public static void main(String[] args) {
        int n=3;
        towerofhanoi(n, "A", "B", "C");
    }
    public static void towerofhanoi(int n,String src,String help,String dest){
        if(n==1){
            System.out.println("transfer disk "+n+" from tower "+src+" to tower"+dest);
            return;
        }
        towerofhanoi(n-1, src, dest, help);
        System.out.println("transfer disk "+n+" from tower "+src+" to tower"+dest);
        towerofhanoi(n-1, help, src, dest);
    }
}
