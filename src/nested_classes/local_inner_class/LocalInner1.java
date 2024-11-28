package nested_classes.local_inner_class;

public class LocalInner1 {

    public static void main(String[] args) {
        Math math = new Math();
        math.getResult(21,4);
    }

}

class Math {


    public void getResult(final int delimoe,final int delitel) {
//         int delimoe = 21;
        class Delenie {
//            private int delimoe;
//            private int delitel;

            public int getChastnoe() {
                return delimoe/delitel;
            }

            public int getOstatok() {
                return delimoe%delitel;
            }


//            public int getDelimoe() {
//                return delimoe;
//            }
//
//            public void setDelimoe(int delimoe) {
//                this.delimoe = delimoe;
//            }

//            public int getDelitel() {
//                return delitel;
//            }
//
//            public void setDelitel(int delitel) {
//                this.delitel = delitel;
//            }
        }
        Delenie d = new Delenie();
//        d.setDelimoe(21);
//        d.setDelitel(4);
        System.out.println("Delimoe = "+delimoe);
        System.out.println("Delitel = "+delitel);
        System.out.println("Chastnoe = "+d.getChastnoe());
        System.out.println("Ostatok = "+d.getOstatok());

    }
}
