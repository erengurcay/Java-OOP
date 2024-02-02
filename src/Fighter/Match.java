package Fighter;

import java.util.SortedMap;

public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight){
        this.f1=f1;
        this.f2 =f2;
        this.minWeight = minWeight;
        this.maxWeight =maxWeight;

    }
     void run(){
        if(isCheck()){
            while (this.f1.hp > 0 && this.f2.hp > 0){
                System.out.println("********YENİ ROUND*********");
                if (firstToAttack() == true) {
                    this.f2.hp = this.f1.hit(this.f2);
                    System.out.println(this.f2.name + "'s Health = " + this.f2.hp);
                    System.out.println(this.f1.name + "'s Health =  " + this.f1.hp);
                    if (isWin()) {
                        break;
                    }
                }
                else {
                    this.f1.hp = this.f2.hit(this.f1);
                    System.out.println(this.f1.name + "'s Health =  " + this.f1.hp);
                    System.out.println(this.f2.name + "'s Health = " + this.f2.hp);
                    if (isWin()) {
                        break;
                    }

                }
            }

        }else{
            System.out.println("Sporcuların sikletleri uymuyor.");
        }
    }
    boolean isCheck(){
        return (this.f1.weight >=minWeight && this.f1.weight <= maxWeight ) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }

    boolean isWin(){
        if(this.f1.hp == 0 ){
            System.out.println(this.f2.name + " Kazandı ! ");
            return true;
        }
        if(this.f2.hp == 0 ){
            System.out.println(this.f1.name + " Kazandı !");
            return true;
        }
        return false;
    }
    public boolean firstToAttack () {
        int number = (int)(Math.random()*10);
        if (number <= 5) {
            return true; // f1 vurur.
        }
        return false;
    }


}
