public class Kmp {
    /*
    * KMP
    * 获取next数组
    * @ p为模式串，s为目标串
    * */
    static int[] getNext(char[] p){
        int plen = p.length;
        int[] next = new int[plen];
        int k = -1; //next对应的位置
        int j = 0; //模式串下标
        next[0] = -1;
        while (j < plen - 1){
            if (k == -1 || p[j] == p[k]){ //在启始的位置，或者模式串与目标串相等
                k++;
                j++;

                if (p[j] != p[k]){
                    next[j] = k;
                }else {
                    next[j] = next[k];
                }
            }else {
                k = next[k];
            }

        }

        return next;
    }

    /*
    * kmp search,返回匹配的初始位置，不匹配则返回-1
    * */
    public static int kmpSearch(char[] s, char[] p){
        int i = 0; //s串下标
        int j = 0; //p串下标
        int slen = s.length;
        int plen = p.length;
        int[] next = getNext(p); //获取next数组值
        while (i < slen && j < plen){
            if (j == -1 || p[j] == s[i]){
                i++;
                j++;
            }else {
                j = next[j]; //及根据next数组右移
            }
        }
        if (j == plen){
            return i - j; //查找成功，返回匹配的初始位置
        }
        return -1;
    }

    public static void main(String[] args) {

        char[] s = {'a','b','c','d','e','f','c','d'};
        char[] p = {'c','d','g'};
        int position = kmpSearch(s,p);
        System.out.println("The position from " + "**" + position + "**");
    }
}
