public class User {
   String username;
   String email;
   int age;

   User(String username){
       this.username = username;
       this.email = "not provided!";
       this.age= 0;
   }

   User(String username , String email){
        this.username = username;
        this.email = email;
        this.age= 0;
   }

   User(String username , String email , int age){
        this.username = username;
        this.email = email;
        this.age= age;
   }

    User(){  //default va;ue for object passing no arguments
        this.username = "guest";
        this.email = "not provided!";
        this.age= 0;
    }
}
