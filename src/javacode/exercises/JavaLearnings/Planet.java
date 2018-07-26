package javacode.exercises.JavaLearnings;

public class Planet {

        private void revolve() {
            System.out.println("Revolve");
        }

        private void revolution(String[] args) {
            if (args.length > 0) {
                switch (args[0]) {
                    case "left":
                        System.out.println("Turn Left");
                        break;
                    case "right":
                        System.out.println("Turn Right");
                        break;
                                }
                                }
        }

        public static void main(String[] args) {
            Planet earth = new Planet();
            earth.revolve();
        }

        public static void mercury() {
            Planet mercury = new Planet();
//            mercury.revolution("left");
        }
    }

