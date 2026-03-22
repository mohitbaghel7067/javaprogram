 class Thread extends Thread {
    public void run(){
        System.out.println("hello");
        for(int i=0;i<5;i++){
            System.out.println(i+"ti");
        }
    }
}
 class Thread1 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        Thread1 t1=new Thread1();
        t1.start();
        

        try {
            t1.join();
        } catch (Exception e) {
            
        }
        for( int i=0;i<5;i++){
            System.out.println(i+"main");
        }
    }
    
}
