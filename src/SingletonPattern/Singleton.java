package SingletonPattern;

import java.util.LinkedList;

public class Singleton {

    static int instanceCount;
    public static final Singleton singleton = new Singleton();


    public static void main(String[] args){

            Singleton testSingleton = Singleton.singleton;

            LinkedList<Singleton> list = new LinkedList<>();

            Singleton s1 = getInstance();
            list.add(s1);
            Singleton s2 = getInstance();
            list.add(s2);
            Singleton s3 = getInstance();
            list.add(s3);


        System.out.println("The instance has been initiated "+instanceCount+" time"+"");
            for(int i = 0; i < list.size(); i++){

                if(singleton == list.get(i))
                    System.out.println("The testSingleton Object = s"+(i+1)+" "+(testSingleton == list.get(i)));
            }

    }

    public static Singleton getInstance(){

        return singleton;
    }


    private Singleton(){
        instanceCount++;
    }


}
