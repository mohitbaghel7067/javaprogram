
class myt extends Thread {
    public void run(){
        System.out.println("hello");
        for(int i=0;i<5;i++){
            System.out.println("downloading file..."+(i*20)+"%");
            try {
                Thread.sleep(100);
            } catch (Exception e) {
        
            }
        }
    }
} class time {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        myt t3=new myt();
        t3.start();
        try {
        Thread.sleep(2000);
        } catch (Exception e) {
            
        }
        for( int i=0;i<5;i++){
            System.out.println(i+"main");
        }
    }
}
