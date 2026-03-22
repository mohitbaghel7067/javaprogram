class thread2 extends Thread {
    public void run(){
        System.out.println("hello");
        for(int i=0;i<5;i++){
            System.out.println(i+"ti");
        }
    }
}
 class sleeptread {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        thread2 t2=new thread2();
        t2.start();
        try {
        Thread.sleep(20000);
        } catch (Exception e) {
            
        }
        for( int i=0;i<5;i++){
            System.out.println(i+"main");
        }
    }
    
}

