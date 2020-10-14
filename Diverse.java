public class Diverse {
    public String solution(int A, int B, int C) {
        // write your code in Java SE 8
        int[] lengths = new int[6];
        String[] strings = new String[6];

        String s1 = constructDiverse(new Pair("a", A), new Pair("b", B),new Pair("c", C));
        lengths[0] = s1.length();
        strings[0] = s1;

        String s2 = constructDiverse(new Pair("a", A), new Pair("c", C),new Pair("b", B));
        lengths[1] = s2.length();
        strings[1] = s2;

        String s3 = constructDiverse(new Pair("b", B), new Pair("c", C),new Pair("a", A));
        lengths[2] = s3.length();
        strings[2] = s3;

        String s4 = constructDiverse(new Pair("b", B), new Pair("a", A),new Pair("c", C));
        lengths[3] = s4.length();
        strings[3] = s4;

        String s5 = constructDiverse(new Pair("c", C), new Pair("a", A),new Pair("b", B));
        lengths[4] = s5.length();
        strings[4] = s5;

        String s6 = constructDiverse(new Pair("c", C), new Pair("b", B),new Pair("a", A));
        lengths[5] = s6.length();
        strings[5] = s6;

        int maxIndex = 0;
        int max = 0;

        for (int i = 0 ; i < lengths.length; i++){


            if (lengths[i] > max) {
                maxIndex = i;
                max = lengths[i];
            }
        }

        return strings[maxIndex];
    }

    public String constructDiverse(Pair pair1, Pair pair2, Pair pair3){

        StringBuilder sb = new StringBuilder();
        boolean diverse = true;

        while (diverse) {

            if((pair2.count == 0 && pair3.count == 0) || (pair2.count == 0 && pair1.count == 0)
                    || (pair1.count == 0 && pair3.count == 0) ) {
                diverse = false;
            }else {

                for (int i = 0; i < 2; i++){
                    if(pair1.count > 0) {
                        sb.append(pair1.letter);
                        pair1.count = pair1.count - 1;
                    }
                }

                for (int i = 0; i < 2; i++){

                    if(pair2.count > 0) {
                        sb.append(pair2.letter);
                        pair2.count = pair2.count - 1;
                    }

                }

                for (int i = 0; i < 2; i++){

                    if(pair3.count > 0){
                        sb.append(pair3.letter);
                        pair3.count = pair3.count - 1;
                    }
                }
            }

        }
        if (sb.toString() == null){
            return "";
        }
        else {
            return sb.toString();
        }
    }

    public static void main(String ...args){
        Diverse d = new Diverse();
        String s = d.solution(6,1,1);
        System.out.println(s);

        Diverse d2 = new Diverse();
        String s2 = d2.solution(6,1,5);
        System.out.println(s2);
    }
}

class Pair {

    Pair(String letter, int count){
        this.count = count;
        this.letter = letter;
    }

    String letter;
    int count;
}

