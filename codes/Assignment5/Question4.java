public class Question4 {
    public static void main(String[] args) {
        Quuu q = new Quuu() {
            public void show() {
                System.out.println("SHowing");
            }
        };
        q.show();

        SHO s = new SHO() {
            void display() {
                super.display();
                System.out.println("Showing 2");
            }

            void d2() {
                System.out.println("SHOWING CUSTOM");
            }
        };
        s.display();
        // new Question4$2().d2();
    }
}

interface Quuu {
    void show();
}

class SHO {
    void display() {
        System.out.println("Showing 1");
    }
}