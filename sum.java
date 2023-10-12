class Sum{
    public static void main(String[] args)
    {
        int a=10;
        int b=20;
        int sum=a+b;
        int diff=b-a;
        int mul =a*b;
        int div = b/a;
        System.out.println(sum);
        System.out.println(diff);
        System.out.println(mul);
        System.out.println(div);

    }

    @Override
    public String toString() {
        return "Sum []";
    }
}