public class Practice2{
  public static void main(String[] args){
    System.out.println("私の好きな記号は二重引用符(\")です");
    int a;
    a=100;
    a++;
    System.out.println(a);
    float f=3;
    double d=f;
    System.out.println(f);
    System.out.println(d);
    int age = (int)3.2;
    System.out.println(age);
    double g =8.5/2;
    long h = 5+2L;
    System.out.println(g);
    System.out.println(h);
    String msg ="私の年齢は"+23;
    System.out.println(msg);
    int i =5;
    int j =10;
    int m = Math.max(i,j);
    System.out.println(m);
    String ageplus="31";
    int n =Integer.parseInt(ageplus);
    System.out.println(ageplus+2);
    // int r=new java.util.Random().nextInt(90);
    // System.out.println("あなたはたぶん、"+r+"歳ですね?");
    // System.out.println("あなたの名前を入力してください。");
    // String name= new java.util.Scanner(System.in).nextLine();
    // System.out.println("あなたの年齢を入力してください。");
    // int s= new java.util.Scanner(System.in).nextInt();
    // System.out.println("ようこそ"+s+"歳の"+name+"さん");
    int x=5;
    int y=10;
    String ans ="x+yは"+(x+y);
    System.out.println(ans);
    System.out.println("ようこそ占いの館へ");
    System.out.println("あなたの名前を入力してください");
    String name=new java.util.Scanner(System.in).nextLine();
    System.out.println("あなたの年齢を入力してください。");
    String ageString=new java.util.Scanner(System.in).nextLine();
    int v =Integer.parseInt(ageString);
    int fortune=new java.util.Random().nextInt(4);
    fortune++;
    System.out.println("占いの結果が出ました！");
    System.out.println(v+"歳の"+name+"さん、あなたの運気番号は"+fortune+"です");
    System.out.println("1:大吉　2:中吉 3:吉 4:凶");
  }
}