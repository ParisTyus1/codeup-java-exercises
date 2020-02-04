import java.util.Scanner;

public class AdventureGame {


        Scanner myScanner = new Scanner(System.in);
        Scanner enterScanner = new Scanner(System.in);
        int playerHP;
        String playerName;
        String playerWeapon;
        int choice;
        int pimpHP;
        int razor;



        public static void main(String[] args) {


            AdventureGame pimpWars = new AdventureGame();

            pimpWars.playerSetUp();
            pimpWars.theStroll();
            pimpWars.west();
            pimpWars.ending();
            pimpWars.winAsst();
            pimpWars.lady();
            pimpWars.east();
            pimpWars.winBoss();
        

        }





        public void playerSetUp(){


            playerHP = 10;
            pimpHP = 15;

            playerWeapon = "Razor Blade";
            playerWeapon = "Pimp sword";
            System.out.println("Welcome to Pimp Wars Enter Start to proceed");
            enterScanner.next();
            System.out.println("Your HP: "+ playerHP);
            System.out.println("Your Weapon: "+ playerWeapon);

            System.out.println("Create your pimp name:");

            playerName = myScanner.nextLine();

            System.out.println("Hello " + playerName + ", let's start the game!");


        }

        public void theStroll(){

            System.out.println("\n------------------------------------------------------------------\n");
            System.out.println("You pull up on the scene.");
            System.out.println("your ladies are coming to pay you.");
            System.out.println("...");
            System.out.println("One of your ladies named Hot pepper just told you that cinnamon left you for another pimp named Sugar Foot?");
            System.out.println("What do you want to do?");
            System.out.println("");
            System.out.println("1: find the pimp and your lady");
            System.out.println("2: Attack the pimp");
            System.out.println("3: Leave");
            System.out.println("\n------------------------------------------------------------------\n");

            choice = myScanner.nextInt();

            if(choice==1){
                System.out.println("Time to find the pimp and your lady!.");
                enterScanner.nextLine();
                west();

                }else{
                System.out.println("You found Sugar Foot and cinnamon!");

            }
             if(choice==2){
                playerHP = playerHP-1;
                System.out.println("Slick back!: Say MFr!. My name is " + playerName + "? \nWhy is my horse in your stable?!.");
                System.out.println("Sugar Foot: Say pimpin, you're girl choose me! Run up and get knocked down!.\n\nSugar Foot slapped you so hard and you gave up.\n(You receive 1 damage)\n");
                System.out.println("Your HP: " + playerHP);
                enterScanner.nextLine();
                theStroll();
            }
            else if(choice==3){
                west();
            }
            else{
                theStroll();
            }
        }

        public void crossRoad(){
            System.out.println("\n------------------------------------------------------------------\n");
            System.out.println("1: power up for the pimp battle ");
            System.out.println("2: find your missing lady");
            System.out.println("3: Go back to the Stroll");
            System.out.println("4: Go east");
            System.out.println("5: fight");
            System.out.println("\n------------------------------------------------------------------\n");

            choice = myScanner.nextInt();

            if(choice==1){
                west();
            }
            else if(choice==2){
                lady();
            }
            else if(choice==3){
                theStroll();
            }
            else if(choice==4){
                east();
            }else if(choice==5){
               fight();
            }
            else{
                crossRoad();
            }
        }

        public void lady(){
            System.out.println("\n------------------------------------------------------------------\n");
            System.out.println("There you are. who told you to leave with another pimp! you gonna learn today!");
            System.out.println("You gave her the legendary baby powder pimp slap!Your HP is recovered.");
            playerHP = playerHP + 1;
            System.out.println("Your HP: " + playerHP);
            System.out.println("\n\n1: Now go fight Sugar Foot");
            System.out.println("\n------------------------------------------------------------------\n");

            choice = myScanner.nextInt();

            if(choice==1){
                fight();
            }
            else{
                theStroll();
            }
        }

        public void east(){
            System.out.println("\n------------------------------------------------------------------\n");
            System.out.println("You checking your ladies on the stroll and found a Super Blade!");
            playerWeapon = "Super Razor blade";
            System.out.println("Your Weapon has been upgraded to: "+ playerWeapon);
            System.out.println("\n\n1: continue finding your lady and Sugar Foot");
            System.out.println("\n------------------------------------------------------------------\n");

            choice = myScanner.nextInt();

            if(choice==1){
                crossRoad();
            }
            else if(choice == 2){
                west();
            }
        }

        public void west(){
            System.out.println("\n------------------------------------------------------------------\n");
            System.out.println("You encounter an assistant pimp name shorty do wop!\n");
            System.out.println("1: Fight");
            System.out.println("Your Weapon has been upgraded to: "+ playerWeapon);
            System.out.println("Your HP: " + playerHP);
            System.out.println("2: Run");
            System.out.println("\n------------------------------------------------------------------\n");

            choice = myScanner.nextInt();

            if(choice==1){
                playerHP = playerHP +1;
                winAsst();
            }
            else if(choice==2){
                crossRoad();
            }else{
                east();
            }
        }

        public void fight(){
            System.out.println("\n------------------------------------------------------------------\n");
            System.out.println("\n-You messing with the wrong pimp. you cut Sugar Foot with you're razor -\n");
            System.out.println("Your HP: "+ playerHP);
            System.out.println("pimp HP: " + pimpHP);
            System.out.println("\n1: Attack");
            System.out.println("2: Run");
            System.out.println("\n------------------------------------------------------------------\n");

            choice = myScanner.nextInt();

            if(choice==1){
                attack();
            }
            else if(choice==2){
                crossRoad();
            }
            else{
                fight();
            }
        }

        public void attack() {
            int playerDamage = 0;


            if (playerWeapon.equals("Super blade")) {
                playerDamage = new java.util.Random().nextInt(6);
            } else if (playerWeapon.equals("Pimp Sword")) {
                playerDamage = new java.util.Random().nextInt(8);
            }

            System.out.println("You attacked the Pimp and gave " + playerDamage + " damage!");

            pimpHP = pimpHP - playerDamage;

            System.out.println("Monster HP: " + pimpHP);

            if (pimpHP < 1) {
                winAsst();
            } else if (pimpHP > 0) {
                int pimpDamage = 0;


                pimpDamage = new java.util.Random().nextInt(3);

                System.out.println("The pimp attacked you and gave " + pimpDamage + " damage!");

                playerHP = playerHP - pimpDamage;

                System.out.println("Player HP: " + playerHP);

                if (playerHP < 1) {
                    dead();
                } else if (playerHP > 0) {
                    fight();
                }

                if (pimpHP < 1) {
                    winBoss();
                } else if (pimpHP > 0) {
                }else {
                    fight();
                }


                pimpDamage = new java.util.Random().nextInt(3);

                System.out.println("The pimp attacked you and gave " + pimpDamage + " damage!");

                playerHP = playerHP - pimpDamage;

                System.out.println("Player HP: " + playerHP);

                if (playerHP < 1) {
                    dead();
                } else if (playerHP > 0) {
                    fight();
                }

            }
        }




            public void dead () {
                System.out.println("\n------------------------------------------------------------------\n");
                System.out.println("You are dead!!!");
                System.out.println("\n\nGAME OVER");
                System.out.println("\n------------------------------------------------------------------\n");

            }

            public void winBoss () {
                System.out.println("\n------------------------------------------------------------------\n");
                System.out.println(playerName + ": Im gonna see you later Playa Hata");
                System.out.println("You beat Sugar foot!");
                System.out.println("1: Go east");
                System.out.println("\n------------------------------------------------------------------\n");

                razor = 1;

                choice = myScanner.nextInt();
                if (choice == 1) {
                    ending();
                } else {
                    winBoss();
                }
            }

            public void winAsst () {
                System.out.println("\n------------------------------------------------------------------\n");
                System.out.println("You beat shorty do wop !");
                System.out.println("Your HP: "+ playerHP);
                System.out.println("Shorty do wop dropped a knife!");
                System.out.println("You obtained a super blade!\n\n");
                System.out.println("1: Go to crossroad");
                System.out.println("\n------------------------------------------------------------------\n");

                razor = 1;

                choice = myScanner.nextInt();
                if (choice == 1) {
                    crossRoad();
                } else {
                    winAsst();

                }
            }

                public void ending () {
                        System.out.println("\n------------------------------------------------------------------\n");
                        System.out.println("Sugar Foot: Oh you killed my assistant pimp!?? Great!");
                        System.out.println("Sugar Foot: You the Coldest pimp in the land. If any of your ladies try to leave I will slap them and send them back!");
                        System.out.println("\n\n           THE END                    ");
                        System.out.println("\n------------------------------------------------------------------\n");
                    }
                }



