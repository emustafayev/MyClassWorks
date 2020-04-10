package lesson3;

public class FunctionFanc {

    //(Int, Int)->Int
    int add(int a, int b){
        return a+b;
    }
    int add(int a, int b, int c){
        return a+b+c;
    }
    int add(int a, int b, int c, int d){
        return add(a,b,c)+d;
    }
    int add(int... ints){
        throw new IllegalArgumentException("not impl");
    }
    ////////////////////////////////////////////////////////////
    int add1(int... vars){
        int total=0;
        for(int var:vars){
            total+=var;
        }
        return total;
    }

    int add2(int[] vars){
        return 1;
    }

    int add5(int a, int b){throw new IllegalArgumentException("not impl");}

    String combine(String... strings){
        throw new IllegalArgumentException("not impl");
        //TODO:should be inplemented by Afgan 2020.02.12
    }
    int implement(){
        add1(1,2,3,4,5,6);
        //add2(2,4,5,6,7);
        add2(new int[]{1,2,3,4,5,6,7});
        add(1,2,3,4,5,6);
            throw new IllegalArgumentException("not impl");
    }
}
