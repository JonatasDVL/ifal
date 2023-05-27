package ScriptsJava;

public class ScriptJava11 {

	//Fiz um programa que imprimi os números múltiplos de 3, entre 1 e 100
    public static void main(String[] args) {


        //fazendo o loop
        for (int i = 1; i < 101; i = i + 1) {

        //Imprimindo os múltiplos

            if ( i % 3 == 0) {
                System.out.println(i);

        }
    }
}
}

/*

resultado do console:

3
6
9
12
15
18
21
24
27
30
33
36
39
42
45
48
51
54
57
60
63
66
69
72
75
78
81
84
87
90
93
96
99

*/

