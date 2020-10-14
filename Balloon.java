public class Balloon {
    public int solution(String S) {
        // write your code in Java SE 8

        int balloonCounter = 0;
        StringBuilder sb = new StringBuilder(S);

        boolean balloonsAvailable = true;

        while (balloonsAvailable) {

            if (S.indexOf("B") != -1){
                sb.deleteCharAt(S.indexOf("B"));
            }
            else{
                balloonsAvailable = false;
                break;
            }

            S = sb.toString();

            if (S.indexOf("A") != -1){
                sb.deleteCharAt(S.indexOf("A"));
            }
            else{
                balloonsAvailable = false;
                break;
            }

            S = sb.toString();

            if (S.indexOf("L") != -1){
                sb.deleteCharAt(S.indexOf("L"));
            }
            else{
                balloonsAvailable = false;
                break;
            }

            S = sb.toString();

            if (S.indexOf("L") != -1){
                sb.deleteCharAt(S.indexOf("L"));
            }
            else{
                balloonsAvailable = false;
                break;
            }

            S = sb.toString();

            if (S.indexOf("O") != -1){
                sb.deleteCharAt(S.indexOf("O"));
            }
            else{
                balloonsAvailable = false;
                break;
            }

            S = sb.toString();

            if (S.indexOf("O") != -1){
                sb.deleteCharAt(S.indexOf("O"));
            }
            else{
                balloonsAvailable = false;
                break;
            }

            S = sb.toString();

            if (S.indexOf("N") != -1){
                sb.deleteCharAt(S.indexOf("N"));
            }
            else{
                balloonsAvailable = false;
                break;
            }

            S = sb.toString();

            balloonCounter++;
        }

        return balloonCounter;
    }
}
