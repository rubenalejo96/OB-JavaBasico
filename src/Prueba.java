

public class Prueba {
    public static void main(String[] args) {
        String str = "Hola mundo";
        System.out.println(voltear(str));
        System.out.println(tobinary(1, 1));

    }
    public static String voltear (String asd){
        char[] chars = asd.toCharArray();
        char[] nuevo = new char[asd.length()];

        for(int i =0; i<chars.length; i++){
            int j = chars.length-(i+1);
            nuevo[i] = chars[j];
        }
        return new String(nuevo);
    }

    public static String tobinary (int a, int b){
        int resultado = a + b ;
        String binario = "";
        for (int i = resultado; i >= 1; i = i/2){
            if (i % 2 == 0){
                binario = "0" + binario;
            }else {
                binario = "1" + binario;
            }
        }return binario;
    }



    public static boolean  isIsogram(String str) {
        String strLower = str.toLowerCase();
        char[] chars = strLower.toCharArray();

        for(int i=0; i<chars.length; i++){
            for(int j=i+1; j<chars.length; j++){
                if (chars[i] == chars[j]){
                    return false;
                }
            }
        } return true;
    }


}

