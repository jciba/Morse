/**
 * Created by Kuba on 07/08/2017.
 */
import java.util.Scanner;
public class Main {
    static String in="";
    static String out ="";
    Scanner sc = new Scanner(System.in);
    private void in(){
    in = sc.nextLine();
    }
    private void code(){
        int i;
        for(i=0;i<in.length();i++){
            switch (in.charAt(i)){
                case ('a'): out=out+".-";break;
                case ('b'): out=out+"-...";break;
                case ('c'): out=out+"-.-.";break;
                case ('d'): out=out+"-..";break;
                case ('e'): out=out+".";break;
                case ('f'): out=out+"..-.";break;
                case ('g'): out=out+"--.";break;
                case ('h'): out=out+"....";break;
                case ('i'): out=out+"..";break;
                case ('j'): out=out+".---";break;
                case ('k'): out=out+"-.-";break;
                case ('l'): out=out+".-..";break;
                case ('m'): out=out+"--";break;
                case ('n'): out=out+"-.";break;
                case ('o'): out=out+"---";break;
                case ('p'): out=out+".--.";break;
                case ('q'): out=out+"--.-";break;
                case ('r'): out=out+".-.";break;
                case ('s'): out=out+"...";break;
                case ('t'): out=out+"-";break;
                case ('u'): out=out+"..-";break;
                case ('v'): out=out+"...-";break;
                case ('w'): out=out+".--";break;
                case ('x'): out=out+"-..-";break;
                case ('y'): out=out+"-.--";break;
                case ('z'): out=out+"--..";break;
                case (' '): out=out+" ";break;
            }

        }
    }
    private void out(){
        System.out.println(out);
    }
    public static void main(String[] args){
        Main mn = new Main();
        mn.in();
        mn.code();
        mn.out();

}
}
