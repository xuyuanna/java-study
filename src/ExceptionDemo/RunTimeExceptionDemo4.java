package ExceptionDemo;

class Chufa1 {
    int div(int a, int b) {
        if (b <= 0) {
            //手动通过throw关键字抛出一个自定义异常对象
            throw new RuntimeException("错误信息！" + b);

        }
        return a / b;
    }
}

class RunTimeExceptionDemo4 {
    public static void main(String[] args) {
        Chufa1 chufa1 = new Chufa1();

        try {
            int x = chufa1.div(51, 0);
            System.out.println("x= " + x);
        } catch (java.lang.RuntimeException e) {
            System.out.println(e.toString());
            System.out.println("除数等于0了：" + e.getMessage());
        }


        System.out.println("over");
    }
}
