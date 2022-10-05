package kz.zhelezyaka;

public class Static {
    public static int st;

    public void setSt(int st) {
        this.st = st;
    }

    public int getSt() {
        return st;
    }
}

class NotStatic {
    public void notMain(Static st) {
        st.setSt(7);
        System.out.println(st.getSt());
    }

}

class Main {
    public static void main(String[] args) {
        Static s = new Static();
        s.setSt(5);
        System.out.println(s.getSt());
        System.out.println("--------");

        NotStatic notStatic = new NotStatic();
        notStatic.notMain(s);
//        System.out.println(notStatic);
    }
}