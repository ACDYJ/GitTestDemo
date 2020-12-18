package sample;

public class Solution3 {
    public static void main(String[] args) {
        System.out.println("This is Solution3");
        System.out.println("add new  something");
        System.out.println("This is Solution3");
        System.out.println("This is Solution3");
        System.out.println("This is Solution3");

        String usertask="ding_11";
        int taskId=Integer.valueOf(usertask.split("_")[1]);
        String username=usertask.split("_")[0];
        System.out.println(taskId);
        System.out.println(username);
    }
}
