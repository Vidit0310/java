// Extending thread class
class threading extends Thread {
    String name = "";

    threading(String name) {
        this.name = name;

    }

    public void run() {
        if (name.equals("t1") == true) {
            for (int i = 0; i < 10; i += 2) {
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        if (name.equals("t2") == true) {
            for (int i = 1; i < 10; i += 2) {
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        threading t1 = new threading("t1");
        threading t2 = new threading("t2");
        t1.start();
        t2.start();

    }

}

// // Implementing Runnable interface
// class threading implements Runnable{
// String name = "";
// threading(String name){
// this.name =name;

// }
// public void run() {
// if(name.equals("t1")==true){
// for(int i = 0; i <10; i+=2) {
// System.out.println(i);
// try {
// Thread.sleep(1000);

// } catch (InterruptedException e)
// {
// e.printStackTrace();
// }
// }
// }
// if(name.equals("t2")==true){
// for(int i = 1; i <10; i+=2) {
// System.out.println(i);
// try {
// Thread.sleep(1000);
// } catch (InterruptedException e)
// {
// e.printStackTrace();
// }
// }
// }
// }
// public static void main(String[] args){
// threading t1 = new threading("t1");
// threading t2 = new threading("t2");
// Thread o1 = new Thread(t1);
// Thread o2 = new Thread(t2);

// // o1.setPriority(Thread.MAX_PRIORITY);
// o1.start();
// o2.start();
// // System.out.println("/////"+o1.getPriority()+o2.getPriority());

// }

// }
