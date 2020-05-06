package On_lai_java;

public class try_catch {
    public static void main(String[] args) {
        try {
            int x = 5;
            int y = 5 / 10;
            System.out.println("x=" + x);
            System.out.println("y=" + y);
            int z = x / y;
            System.out.println("z=" + z);
        } catch (ArithmeticException ex) {
            System.out.println("có lỗi rồi");
            ex.printStackTrace();
        } catch (Exception ex) {
            System.out.println("có lỗi chi tiết !!!");
            ex.printStackTrace();
        }
        System.out.println("cảm ơn bạn đã dùng phần mềm!!!");

    }
}
