    // define Pet Class
    
    public class Pet{
        
        //creating attributes
        private String name;
        private int age;
        private String location;
        private String type;

        //creating empty construtor
        public Pet(){
            this.name = "Pet";
            this.age = 2;
            this.location = "home";
            this.type = "Derp";
        }


        //creating all atributes constructor
        public Pet(String name, int age, String location, String type){
            this.name = name;
            this.age = age;
            this.location = location;
            this.type = type;
        }

        //creating get methods to access attributes
        public String getName(){
            return this.name;
        }

        public int getAge(){
            return this.age;
        }
        
        public String getType(){
            return this.type;
        }


        //set methods to change attributes. set attributes
        //passing in a new name and assigning it to the preset current object
        public void setName(String name){
            this.name = name;
        }
        public void setAge(int age){
            this.age = age;
        }
        public void setLocation(String location){
            this.location = location;
        }


    public static void main(String[] args) throws Exception {
        
        Pet myDog = new Pet();
        // test getters
        //this is how you call a method: myDog.getAge();
        System.out.println(myDog.getAge());
        System.out.println(myDog.getName());
        System.out.println(myDog.getType());
        // test setters
        myDog.setAge(6);
        myDog.setLocation("here");
        myDog.setName("Derp 2");
            // use getters to view
        System.out.println(myDog.getAge());
        System.out.println(myDog.getName());
        
    }

}
