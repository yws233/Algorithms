public class BF {

    /*
    *   BF算法
    * */

    static int violentMatch(char[] s,char[] p){
        int slen = s.length;
        int plen = p.length;

        int i = 0;
        int j = 0;
        while (i < slen && j < plen){
            if (s[i] == p[j]){
                i++;
                j++;
            }else {
                i = i - j + 1;
                j = 0;
            }
        }
        if (j == plen){
            return i - j;
        }
            return -1;
    }

    public static void main(String[] args) {
        char[] s = {'a','b','c','d','e','f'};
        char[] p = {'c','d'};
        int a = violentMatch(s,p);
        System.out.println(a);
    }

}
