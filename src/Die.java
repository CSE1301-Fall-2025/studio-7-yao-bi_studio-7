public class Die {
    private int n;

    public Die(int n){
        this.n = n;
    }

    public void ReturnValue(){
        int integer = (int) (Math.random()*n + 1);
        System.out.println(integer);
    }

    public static void main(String[]args){
        Die d = new Die(100);
        d.ReturnValue();
    }

}
