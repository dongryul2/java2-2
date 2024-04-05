public class Ja_03 {
        String title;
    String author;
    
    public Ja_03 () {
        title = "해리포터"; author = "잘 몰라"; 
    }
    public Ja_03(String t) { // 생성자
        title = t; author = "작자미상";
    }

    public Ja_03(String t, String a) { // 생성자
        title = t; author = a;
    }

    public static void main(String [] args) {
        Ja_03 foo = new Ja_03();
        Ja_03 lovestory = new Ja_03("춘향전");
        Ja_03 littlePrince = new Ja_03("어린왕자", "생택쥐페리");
        System.out.println(foo.title + " ");
    }
    
}
