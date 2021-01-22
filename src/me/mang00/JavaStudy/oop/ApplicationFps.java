package me.mang00.JavaStudy.oop;

class Total {
    int hp, damage; //전역변수 -> 초깃값이 0이다.

//    public void print() {
//        System.out.println(this);
//    }

    // this 는 전역변수를 가리킨다.
    // 전역변수와 매개변수의 변수명이 같을 경우 this.hp = hp; 를 한다.
    // 만약 전역변수와 매개변수의 변수명이 다를 경우 hp1 = hp; 를 해도 무관하다.
    public void setHp(int hp) { //매개변수 int hp
        this.hp = hp;
    }

    public void setDamage(int damage) {
        //변경전의 this.damage = 0 (ar기준)
        //damage = 20 (ar기준)
        this.damage = damage;
        //변경후의 this.damage = 20 (ar기준)
        //damage = 20 (ar기준)
    }

    public void totalHp() {
        System.out.println(this.hp - this.damage);
    }
}

public class ApplicationFps {

    public static void main(String[] args) {

        Total ar = new Total();
        ar.setHp(100);
        ar.setDamage(20);
        ar.totalHp();

//        ar.print();
//        // me.miniky04.oop.Total@54bedef2
//        // @뒤는 고유주소 !

        Total smg = new Total();
        smg.setHp(100);
        smg.setDamage(10);
        smg.totalHp();

        Total sr = new Total();
        sr.setHp(100);
        sr.setDamage(50);
        sr.totalHp();
    }

}