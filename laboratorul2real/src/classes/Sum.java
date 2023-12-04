package classes;

public class Sum implements Runnable{
     public int sum,start,end;

//    vizibilitate tip nume(parametru1, parametru2, ...){
//        instructiuni
//    }
    public Sum(int start,int end){
        sum=0;
        this.start= start;
        this.end=end;
    }

    @Override
    public void run() {
        for(int i=start;i<end;i++){
            sum= sum+i;
        }
    }
}
