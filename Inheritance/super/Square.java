public class Square {
    public class Square extends Shape{
        int side;
        public Square(int side){
            super("Square");
            this.side =side;
            System.out.println(name+"   "+side)
        }
    }
}
