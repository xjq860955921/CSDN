package c_work;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

/*
按照⽃地主的规则，完成洗牌 发牌的动作。
具体规则：
  使⽤54张牌打乱顺序，三个玩家参与游戏，
  三⼈交替摸牌，每⼈17张牌，最后三张留作底牌。
  ♠ ♥ ♦ ♣   1-13 A J Q K 2-10 fori()
  跟数组相关的工具类 -> Arrays
  跟Collection集合相关的工具类 ->
        Collections.shuffle() - 打乱顺序
 */
public class Poker {
    public static void main(String[] args) {
        //存花色的集合
        ArrayList<String>  flowerColor = new ArrayList<>();
        flowerColor.add("♠");
        flowerColor.add("♥");
        flowerColor.add("♦");
        flowerColor.add("♣");
        System.out.println(flowerColor);

        //存数字的集合
        ArrayList<String> number = new ArrayList<>();
        for (int i = 2; i <= 10 ; i++) {
            number.add(i + "");
        }
        number.add("A");
        number.add("J");
        number.add("Q");
        number.add("K");
        System.out.println(number);

        ArrayList<String> pokerBox = new ArrayList<>();
        //制作牌
        for (String color :flowerColor) {
            for (String num : number) {
                String card = color + num;
                pokerBox.add(card);
            }
        }
        pokerBox.add("大王");
        pokerBox.add("小王");
        //打乱牌的序号
        Collections.shuffle(pokerBox);
        System.out.println(pokerBox);
        /*for (int i = 0; i < flowerColor.size(); i++) {
            for (int j = 0; j < number.size(); j++) {

            }
        }*/

        //给三个玩家发牌 , 留3张作为底牌
        ArrayList<String> player1 = new ArrayList<>();
        ArrayList<String> player2 = new ArrayList<>();
        ArrayList<String> player3 = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();

        //获得pokerBox中所有的元素
        for (int i = 0; i < pokerBox.size(); i++) {
            //Collection -> 迭代器
            String card = pokerBox.get(i);
            //分牌
            if(i >= pokerBox.size() - 3){
                //将最后三张牌添加到底牌集合中
                dipai.add(card);
            }else{
                //取余 -> %
                if(i % 3 == 0){
                    player1.add(card);
                }else if (i % 3 == 1){
                    player2.add(card);
                }else {
                    player3.add(card);
                }
            }
        }

        //打印分牌
        System.out.println("底牌" + dipai);
        System.out.println("玩家1" + player1);
        System.out.println("玩家2" + player2);
        System.out.println("玩家3" + player3);
    }
}
