public class Practice3 {
  public static void main(String[] args){
    boolean tenki=true;
    if(tenki==true){
      System.out.println("洗濯をします");
      System.out.println("散歩に行きます");
    }else{
      System.out.println("DVDを見ます");
    }
    // int weight==60;
    // int age1=20;
    // int age2=30;
    // (age1+age2)*2>60;
    // age%2 == 1;
    // name.equals("湊");

    int isHungry =1;
    String food ="いちご";
    System.out.println("こんにちは");
    if(isHungry==0){
      System.out.println("お腹がいっぱいです");
    }else{
      System.out.println("はらぺこです");
      System.out.println(food+"をいただきます");
    }
    System.out.println("ごちそうさまでした");
    System.out.print("[メニュー]1:検索 2:登録 3:削除 4:変更>");
    int selected=new java.util.Scanner(System.in).nextInt();
    switch (selected){
      case 1:
      System.out.println("検索します");
      break;
      case 2:
      System.out.println("登録します");
      break;
      case 3:
      System.out.println("削除します");
      break;
      case 4:
      System.out.println("変更します");
      break;
    }
    System.out.println("数当てゲーム");
    int ans=new java.util.Random().nextInt(10);
    for(int i=0;i<5;i++){
      System.out.println("0から9の数字を入力してください");
      int num=new java.util.Scanner(System.in).nextInt();
      if(ans==num){
        System.out.println("あたり");
        break;
      }else{
        System.out.println("外れ");
      }
    }
    System.out.println("ゲーム終了");
  }
}
