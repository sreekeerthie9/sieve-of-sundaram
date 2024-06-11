import java.util.*;
class sieve_sundaram{
    public static void main(String args[]){
        double startTime = System.currentTimeMillis();
        long range;
        long new_range;
        range = 1000000000;
        new_range=(range-1)/2;
        int count=1;
        boolean numbers[] = new boolean[(int)(new_range+1)];
        
        for(long i=1;i<new_range;i++){
            for(long j=i;(i+j+2*i*j)<=new_range;j++){
                numbers[(int)(i+j+2*i*j)]=true;
            }
        }

        for(long i=1;i<=new_range;i++){
            if(numbers[(int)i]==false){
                count++;
            }
        }

        double endTime = System.currentTimeMillis();
        System.out.println(count);
        System.out.println((endTime-startTime)/1000);
    }
}