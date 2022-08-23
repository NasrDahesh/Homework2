public class Q6 {
    public static void main(String[] args) {
        String S="Hellow", B, C, D, E;
        String T="World";
        int A=S.length() +T.length();
        B=S.substring(0,2);
        C=S.substring(S.length()/2,S.length());
        D=S+T;
        E=T+S;
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        System.out.println(D);
        System.out.println(E);
    }
}
