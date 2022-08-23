public class Q7 {
    public static void main(String[] args) {
        StringBuilder Text = new StringBuilder("Text");
        //للحصول على الحرف الاول من سلسلة
        System.out.println(Text.charAt(0));
        //الحرف الاخر من سلسلة
        System.out.println(Text.charAt(3));
        //ازلة الحرف الاول من سلسلة
        Text.deleteCharAt(0);
        //ازالة الحرف الاخر من سلسلة
        Text.deleteCharAt(2);
        System.out.println(Text);
    }
}
