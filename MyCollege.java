class CollAdmission implements Runnable{
    final String colName="Anudip";
    final int colid=3689;
    int noofvac=50;
    int fillseat=48;
    int vacancy;
    CollAdmission(int vacancy){
        this.vacancy=vacancy;
     }
     public void run(){
        synchronized(this){
            String name=Thread.currentThread().getName();
        if(fillseat<=noofvac){
            System.out.println(name+"Allowed vacancy");
            fillseat++;
            try{
                Thread.sleep(100);
            }catch(InterruptedException ie){
            }
          }else{
              System.out.println("Admission is full");
           }
           }
        }
    }
 class MyCollege{
    public static void main(String[]args){
       CollAdmission coll=new CollAdmission(1);
       Thread t1=new Thread(coll);
       Thread t2=new Thread(coll);
       Thread t3=new Thread(coll);
       Thread t4=new Thread(coll);
       t1.setName("Arun");
       t2.setName("Ravi");
       t3.setName("Kavi");
       t4.setName("Nandhini");
       t1.start();
       t2.start();
       t3.start();
       t4.start();
     }
  }
       