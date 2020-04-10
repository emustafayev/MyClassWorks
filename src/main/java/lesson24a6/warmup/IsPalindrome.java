package lesson24a6.warmup;

public class IsPalindrome {
  public boolean check(int n) {
    char[] number = (String.valueOf(n)).toCharArray();
    int index = number.length-1;
    int i=0;
    boolean flag=true;
    while (index>0){
      if(number[i]!=number[index]){
        flag=false;
      }
      i++;
      index--;
      if(index==i)break;
    }
    return flag;
  }
}
