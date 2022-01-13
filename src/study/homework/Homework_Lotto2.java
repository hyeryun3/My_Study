package study.homework;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Homework_Lotto2 {

   public static void main(String[] args) {
      Set<Integer> lotto = new HashSet<Integer>();
      Random random = new Random();
      while(lotto.size() < 7) {
    	  lotto.add(random.nextInt(45));
      }
      System.out.println(lotto);
   }
}
