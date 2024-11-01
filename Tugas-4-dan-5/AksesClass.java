public class AksesClass {
    class Person {
        // Atribut kelas
        private String name;
        private int age;

        // Konstruktor default
        public Person() {
            this.name = "Unknown";
            this.age = 0;
        }

        // Konstruktor dengan parameter (Overloading Constructor)
        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // Metode untuk mengakses anggota kelas
        public void displayInfo() {
            System.out.println("Name: " + name + ", Age: " + age);
        }

        // Metode untuk mengubah nama
        public void setName(String name) {
            this.name = name;
        }

        // Metode untuk mengubah umur
        public void setAge(int age) {
            this.age = age;
        }
    }
        public static void main(String[] args) {
            AksesClass outer = new AksesClass(); // Membuat objek dari AksesClass
            // Membuat objek dari kelas Person
            Person person1 = outer.new Person(); // Menggunakan konstruktor default
            person1.displayInfo(); // Menampilkan info person1

            Person person2 = outer.new Person("Alice", 30); // Menggunakan konstruktor overload
            person2.displayInfo(); // Menampilkan info person2

            // Mengakses dan mengubah atribut menggunakan metode
            person1.setName("Bob");
            person1.setAge(25);
            person1.displayInfo(); // Menampilkan info person1 yang diperbarui

            // String vs StringBuffer
            // Literal string
            String str1 = "Hello";
            String str2 = "World";

            // Menggabungkan string menggunakan + operator
            String greeting = str1 + " " + str2;
            System.out.println("Greeting: " + greeting);

            // Menggunakan StringBuffer untuk manipulasi string
            StringBuffer stringBuffer = new StringBuffer("Hello");
            stringBuffer.append(" World"); // Menggabungkan string
            System.out.println("StringBuffer Output: " + stringBuffer.toString());

            // Membandingkan String dan StringBuffer
            System.out.println("String is immutable: " + (str1 += " Test"));
            System.out.println("Original String remains unchanged: " + str1);

            stringBuffer.append(" Test"); // Menambah ke StringBuffer
            System.out.println("Modified StringBuffer: " + stringBuffer.toString());
        }
   
}
