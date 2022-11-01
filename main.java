import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        char[] tab = new char[10];
        int size=0;
        Scanner in = new Scanner(System.in);
        String expression = in.next();
        char[] tab2=expression.toCharArray();
        int size2=tab2.length;
        for(int i=0;i<size2;i++){
            if(tab2[i]=='('||tab2[i]=='{'||tab2[i]=='['){
                tab[size]=tab2[i];
                size++;
            }
            else{
                if(tab2[i]==')'){
                    if (size!=0&&tab[size-1]!='('){
                        System.out.println("false");
                        return;
                    }
                    else{
                        if(size==0){
                            System.out.println("false");
                        return;
                        }else{
                            size--;
                        }
                    }
                }else{
                    if(tab2[i]=='}'){
                        if (size!=0&&tab[size-1]!='{'){
                            System.out.println("false");
                            return;
                        }
                        else{
                           if(size==0){
                            System.out.println("false");
                        return;
                        }else{
                            size--;
                        }
                        }
                    }else{
                        if(tab2[i]==']'){
                            if (size!=0&&tab[size-1]!='['){
                                System.out.println("false");
                                return;
                            }
                            else{
                                if(size==0){
                                System.out.println("false");
                                return;
                                }
                                else{
                                    size--;
                                }
                            }
                        }
                    }
                }
            }
        }
        if(size!=0){
            System.out.println("false");
                                return;
        }
        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println("true");
    }
}
