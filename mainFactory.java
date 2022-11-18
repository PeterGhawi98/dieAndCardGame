public abstract class mainFactory extends Run {
    public static GameFactory chooseGame(String ans){
        if (ans.equals("c")) {
            return new C_Factory();
        } else if (ans.equals("d")) {
            return new D_Factory();
        } else {
            //return null;
            throw new RuntimeException("Input not understood");
            //System.out.println("Input not understood");
        }
    }
}
