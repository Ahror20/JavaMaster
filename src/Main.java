public class Main {
    public static void main(String[] args) {
      Manager manager = new Manager();
      manager.addStudent("Ahror","Orzimurodov",20);
      manager.addStudent("Alik","Joniyev",19);
      manager.addStudent("Baxti","Shaxtiyev",23);

        System.out.println(manager.getStudent("Alik"));

        manager.addProfessor("Shopi","Amak",56,2000d);


    }
}