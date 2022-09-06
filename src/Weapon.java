public class Weapon {
    public class Combat {
        final int chanceOfDrop = 3;
        static Weapon[] wepArray = {new M4(), new M16()};
        static boolean[] hasWeapon = {false, true};

        public static int  ranNumberGen(int chanceOfDrop) {
            return (int) (Math.random()*1);
        }

        private void enemyDead() {
            boolean canDrop = false;
            if(ranNumberGen(chanceOfDrop)==0){
                canDrop = true;

            }

            if(canDrop == true){
                givePlayerWeapon(Weapon[Combat.ranNumberGen(Weapon.
                        length)]);
            }
            private static void givePlayerWeapon(int w) {
                hasWeapon[w] = true;

                for. (w) <(Weapon.length-1) {
                    if =  has weapon[w] {
                        System.out.println(wepArray[w].getWeaponName);
                    }
                }
            }
        }

    }
}

