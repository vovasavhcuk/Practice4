package com.company;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	   equality();
      square();
      System.out.println(findLenth());
      examples();
	}

	public static void equality() {
      double a, b, c, x1, x2;
      a = (Math.random() * 10) + 1;
      b = -(Math.random() * 10) + 1;
      c = (Math.random() * 10) + 1;
      double d = b * b - 4 * a * c;
      if (d > 0) {
         x1 = ((-b + Math.sqrt(d)) / 2 * a);
         x2 = ((-b - Math.sqrt(d)) / 2 * a);
         System.out.println("x1 = " + x1 + "\nx2 = " + x2);
      } else if (d==0){
         x1 = -b / 2 * a;

         System.out.println("x1 = " + x1);
      }
      else{
         System.out.println("D<0, уравнение не может быть решено!");
      }
   }
   public static void square(){
	   int height, width, s, p;
	   height = (int)((Math.random()*10)+1);
      width = (int)((Math.random()*10)+1);
      p = 2*height + 2*width;
      s = height*width;
      System.out.println("Периметр = "+ p + "\nПлощадь = " + s);
   }
   public static float findLenth(){
      Scanner scanner = new Scanner(System.in);
      float p, a;//p - периметр,a - длинна стороны
      System.out.println("Введите периметр квадрата: ");
      p = scanner.nextInt();
      if(p>0){
         a = p/4;
         return a;
      }
      else{
         System.out.println("Периметр не может быть 0 или меньше");
         return 0;
      }
   }
   public static void examples(){
	   double x, a, b, c, y;
      a = Math.random()*10-5;
	   b = Math.random()*10-5;
      c = Math.random()*10-5;
      if((b * b + 4 * a * c >= 0) && (a!=0)) {
         x = (b + Math.sqrt(b * b + 4 * a * c)) / 2 * a - a * a * a * c + 1 / (b * b);
         System.out.println("1) Ответ: " + x);
      }else {
         System.out.println("Решение не может быть найдено");
      }

      x = Math.random()*10-5;
      y = x - x*x*x / 3 + x*x*x*x*x / 5;
      System.out.println("\n2) Ответ: " + y);

      x = Math.random()*10-5;
      y = Math.random()*10-5;
      if(y!=-1||x!=-34){
         a = (x + y)/(y + 1) - (x*y - 12)/(34 + x);
         System.out.println("\n3) Ответ: " + a);
      }else {
         System.out.println("Решение не может быть найдено");
      }

      x = Math.random()*10-5;
      y = Math.sin(Math.sqrt(x-1))-Math.sin(Math.sqrt(x+1));
      if(x>1) {
         System.out.println("\n4) Ответ: " + y);
      }else {
         System.out.println("Решение не может быть найдено");
      }

   }

	}
