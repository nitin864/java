//implemnetiation of thread and runnable interface

class networksniffer extends Thread{
    public void run(){
        System.out.println("Thread is running");
    }
}

class portscanner implements Runnable{
    public void run(){
        System.out.println("Thread is running");
    }
}
