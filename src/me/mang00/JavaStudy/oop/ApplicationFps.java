package me.mang00.JavaStudy.oop;

class Player {
    String name;
    int hp = 100;
    int damage; //전역변수 -> 초깃값이 0이다.

    //alt + insert -> constructor 생성자
    public Player(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    // this 는 전역변수를 가리킨다.
    // 전역변수와 매개변수의 변수명이 같을 경우 this.hp = hp; 를 한다.
    // 만약 전역변수와 매개변수의 변수명이 다를 경우 hp1 = hp; 를 해도 무관하다.
    // set 을 쓰는 이유는 필드를 초기화 하기 위해서 set 을 많이 쓴다. -> setter
    public void setHp(int hp) { //매개변수(지역변수) int hp
        this.hp = hp;
        //스코프에 대한 차이를 두기 위해 this 를 쓴다. -> 변수명이 같을 때
        // a = b; 일 경우 (int b) 이고 this 를 쓰든 안쓰든 상관 없다.
    } // 외부에서 초기 hp 값이 달라질 때 필요

    public void setDamage(int damage) {
        //변경전의 this.damage = 0 (ar 기준)
        //damage = 20 (ar 기준)
        this.damage = damage;
        //변경후의 this.damage = 20 (ar 기준)
        //damage = 20 (ar 기준)
    }

    public String getName() {
        return name;
    }

    //alt + insert -> getter
    public int getHp() {
        return hp;
    }

    public int getDamage() {
        return damage;
    }

    //클래스 타입 = Player -> 레퍼런스 타입
    public void attack(Player player) {
        System.out.println(this.name + " attack " + player.getName());
        player.setHp(player.getHp() - this.damage); // 맞은 사람
    }

//    public void totalHp() {
//        System.out.println(this.hp - this.damage);
//        //여기서 this 는 있든 없든 결과값은 동일하다
//        //파라미터를 받아오면 this 를 쓰고 안쓰고에 따라 지역변수 , 전역변수가 달라짐
//    }

}

public class ApplicationFps {

    public static void main(String[] args) {

        Player ar = new Player("AR", 20);
//        ar.setHp(100);
//        ar.setDamage(20);
//        ar.totalHp();

        Player smg = new Player("SMG", 10);
//        smg.setHp(100);
//        smg.setDamage(10);
//        smg.totalHp();

        Player sr = new Player("SR", 50);
//        sr.setHp(100);
//        sr.setDamage(50);
        System.out.println(sr.getHp());

        ar.attack(sr);
        System.out.println(sr.getHp());
//        sr.totalHp();
    }

}